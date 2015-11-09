package com.temperance2015.morsecode.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.temperance2015.morsecode.R;
import com.temperance2015.morsecode.model.Convert;

/**
 * Created by Isabel on 2015/11/7.
 */
public class EnglishActivity extends BaseActivity implements OnClickListener {

    private TextView inputMorseText;
    private TextView convertToEnglishText;
    private Button pasteMorse;
    private Button copyEnglish;
    private Button di;
    private Button dah;
    private Button anotherSpace;
    private Button anotherSlash;
    private Button anotherBackSpace;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_layout);
        inputMorseText = (TextView) findViewById(R.id.inputMorseText);
        convertToEnglishText = (TextView) findViewById(R.id.convertToEnglishText);
        pasteMorse = (Button) findViewById(R.id.paste_morse_button);
        copyEnglish = (Button) findViewById(R.id.copy_english_button);
        di = (Button) findViewById(R.id.di);
        dah = (Button) findViewById(R.id.dah);
        anotherSpace = (Button) findViewById(R.id.anotherSpace);
        anotherSlash = (Button) findViewById(R.id.anotherSlash);
        anotherBackSpace = (Button) findViewById(R.id.anotherBackSpace);
        pasteMorse.setOnClickListener(this);
        copyEnglish.setOnClickListener(this);
        di.setOnClickListener(this);
        dah.setOnClickListener(this);
        anotherSpace.setOnClickListener(this);
        anotherSlash.setOnClickListener(this);
        anotherBackSpace.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        ClipboardManager cbm = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        String strE = "";
        String strM = "";
        switch (v.getId()){
            case R.id.paste_morse_button:
                ClipData clipDataPaste = cbm.getPrimaryClip();
                int countPaste = clipDataPaste.getItemCount();
                int mark = 0;
                for(int i = 0;i < countPaste;i++){
                    ClipData.Item item = clipDataPaste.getItemAt(i);
                    CharSequence str = item.coerceToText(EnglishActivity.this);
                    strM += str;
                }
                strE = Convert.longCodeToEnglish(strM);
                inputMorseText.setText(strM);
                convertToEnglishText.setText(strE);
                break;
            case R.id.copy_english_button:
                ClipData clipData = ClipData.newPlainText("single text",convertToEnglishText.getText().toString());
                cbm.setPrimaryClip(clipData);
                break;
            case R.id.di:
                if (count < 5 && count >= 0){
                    inputMorseText.setText(inputMorseText.getText()+"·");
                    count ++;
                }else if (count == 5){
                    inputMorseText.setText(inputMorseText.getText().toString().substring(0,inputMorseText.getText().toString().length()-count));
                    Toast.makeText(EnglishActivity.this,"Too long",Toast.LENGTH_SHORT).show();
                    count = 0;
                }
                break;
            case R.id.dah:
                if (count < 5 && count >= 0){
                    inputMorseText.setText(inputMorseText.getText()+"-");
                    count ++;
                }else if (count == 5){
                    inputMorseText.setText(inputMorseText.getText().toString().substring(0,inputMorseText.getText().toString().length()-count));
                    Toast.makeText(EnglishActivity.this,"Too long",Toast.LENGTH_SHORT).show();
                    count = 0;
                }
                break;
            case R.id.anotherSpace:
                int j = inputMorseText.getText().toString().length();
                String str = inputMorseText.getText().toString();
                if (count == 0){
                    inputMorseText.setText(inputMorseText.getText().toString()+" ");
                }else if (!Convert.isMorseCode(str.substring(j - count))){
                    inputMorseText.setText(inputMorseText.getText().toString().substring(0,inputMorseText.getText().toString().length()-count));
                    Toast.makeText(EnglishActivity.this,"Wrong Code",Toast.LENGTH_SHORT).show();
                    count = 0;//如果輸入的code是錯誤的，清除掉錯誤的code
                } else if (count <= 5 && count > 0){
                    convertToEnglishText.setText(convertToEnglishText.getText().toString()+Convert.toEnglish(str.substring(j - count)));
                    inputMorseText.setText(str+" ");
                    count = 0;
                }
                break;
            case R.id.anotherSlash:
                int k = inputMorseText.getText().toString().length();
                String str1 = inputMorseText.getText().toString();
                if (count == 0){
                    inputMorseText.setText(inputMorseText.getText().toString()+"/");
                    convertToEnglishText.setText(convertToEnglishText.getText().toString()+" ");//区别于空格键，摩斯码输入/时下方应当加入一个空格。
                }else if (!Convert.isMorseCode(str1.substring(k - count))){
                    inputMorseText.setText(inputMorseText.getText().toString().substring(0,inputMorseText.getText().toString().length()-count));
                    Toast.makeText(EnglishActivity.this,"Wrong Code",Toast.LENGTH_SHORT).show();
                    count = 0;
                }else if (count <= 5 && count > 0){
                    convertToEnglishText.setText(convertToEnglishText.getText().toString()+Convert.toEnglish(str1.substring(k - count))+" ");
                    inputMorseText.setText(str1+"/");
                    count = 0;
                }
                break;
            case R.id.anotherBackSpace:
                strM = inputMorseText.getText().toString();
                strE = convertToEnglishText.getText().toString();
                if (count == 0){
                    if (strE.length() >= 1){
                        strE = strE.substring(0, strE.length() - 1);
                        strM = Convert.sentenceToMorse(strE);
                        convertToEnglishText.setText(strE);
                        inputMorseText.setText(strM);
                    }else if (strE.length() == 0 && strM.length() >=1){
                        strM = strM.substring(0,strM.length()-1);
                        inputMorseText.setText(strM);
                    }
                }else if (count < 6 && count > 0){
                    strM = strM.substring(0,strM.length()-1);
                    inputMorseText.setText(strM);
                    count --;
                }
                break;
            default:
                break;
        }
    }
}
