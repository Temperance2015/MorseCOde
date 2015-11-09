package com.temperance2015.morsecode.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.temperance2015.morsecode.R;
import com.temperance2015.morsecode.model.Convert;

/**
 * Created by Isabel on 2015/11/7.
 */
public class MorseActivity extends BaseActivity implements OnClickListener{

    private TextView inputEnglishText;
    private TextView convertToMorseText;
    private Button space;
    private Button backSpace;
    private Button slash;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button a;
    private Button b;
    private Button c;
    private Button d;
    private Button e;
    private Button f;
    private Button g;
    private Button h;
    private Button i;
    private Button j;
    private Button k;
    private Button l;
    private Button m;
    private Button n;
    private Button o;
    private Button p;
    private Button q;
    private Button r;
    private Button s;
    private Button t;
    private Button u;
    private Button v;
    private Button w;
    private Button x;
    private Button y;
    private Button z;
    private Button paste_english;
    private Button copy_morse;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.morse_layout);
        inputEnglishText = (TextView) findViewById(R.id.inputEnglishText);
        convertToMorseText = (TextView) findViewById(R.id.convertToMorseText);
        space = (Button) findViewById(R.id.space);
        backSpace = (Button) findViewById(R.id.back_space);
        slash = (Button) findViewById(R.id.slash);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        a = (Button) findViewById(R.id.a);
        b = (Button) findViewById(R.id.b);
        c = (Button) findViewById(R.id.c);
        d = (Button) findViewById(R.id.d);
        e = (Button) findViewById(R.id.e);
        f = (Button) findViewById(R.id.f);
        g = (Button) findViewById(R.id.g);
        h = (Button) findViewById(R.id.h);
        i = (Button) findViewById(R.id.i);
        j = (Button) findViewById(R.id.j);
        k = (Button) findViewById(R.id.k);
        l = (Button) findViewById(R.id.l);
        m = (Button) findViewById(R.id.m);
        n = (Button) findViewById(R.id.n);
        o = (Button) findViewById(R.id.o);
        p = (Button) findViewById(R.id.p);
        q = (Button) findViewById(R.id.q);
        r = (Button) findViewById(R.id.r);
        s = (Button) findViewById(R.id.s);
        t = (Button) findViewById(R.id.t);
        u = (Button) findViewById(R.id.u);
        v = (Button) findViewById(R.id.v);
        w = (Button) findViewById(R.id.w);
        x = (Button) findViewById(R.id.x);
        y = (Button) findViewById(R.id.y);
        z = (Button) findViewById(R.id.z);
        paste_english = (Button) findViewById(R.id.paste_english_button);
        copy_morse = (Button) findViewById(R.id.copy_morse_button);
        space.setOnClickListener(this);
        backSpace.setOnClickListener(this);
        slash.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
        paste_english.setOnClickListener(this);
        copy_morse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        ClipboardManager cbm = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);//系统剪贴板实例
        String strE = "";
        String strM;
        switch (v.getId()){
            case R.id.a:
                inputEnglishText.setText(inputEnglishText.getText()+"a");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("a")+" ");
                break;
            case R.id.b:
                inputEnglishText.setText(inputEnglishText.getText()+"b");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("b")+" ");
                break;
            case R.id.c:
                inputEnglishText.setText(inputEnglishText.getText()+"c");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("c")+" ");
                break;
            case R.id.d:
                inputEnglishText.setText(inputEnglishText.getText()+"d");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("d")+" ");
                break;
            case R.id.e:
                inputEnglishText.setText(inputEnglishText.getText()+"e");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("e")+" ");
                break;
            case R.id.f:
                inputEnglishText.setText(inputEnglishText.getText()+"f");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("f")+" ");
                break;
            case R.id.g:
                inputEnglishText.setText(inputEnglishText.getText()+"g");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("g")+" ");
                break;
            case R.id.h:
                inputEnglishText.setText(inputEnglishText.getText()+"h");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("h")+" ");
                break;
            case R.id.i:
                inputEnglishText.setText(inputEnglishText.getText()+"i");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("i")+" ");
                break;
            case R.id.j:
                inputEnglishText.setText(inputEnglishText.getText()+"j");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("j")+" ");
                break;
            case R.id.k:
                inputEnglishText.setText(inputEnglishText.getText()+"k");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("k")+" ");
                break;
            case R.id.l:
                inputEnglishText.setText(inputEnglishText.getText()+"l");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("l")+" ");
                break;
            case R.id.m:
                inputEnglishText.setText(inputEnglishText.getText()+"m");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("m")+" ");
                break;
            case R.id.n:
                inputEnglishText.setText(inputEnglishText.getText()+"n");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("n")+" ");
                break;
            case R.id.o:
                inputEnglishText.setText(inputEnglishText.getText()+"o");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("o")+" ");
                break;
            case R.id.p:
                inputEnglishText.setText(inputEnglishText.getText()+"p");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("p")+" ");
                break;
            case R.id.q:
                inputEnglishText.setText(inputEnglishText.getText()+"q");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("q")+" ");
                break;
            case R.id.r:
                inputEnglishText.setText(inputEnglishText.getText()+"r");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("r")+" ");
                break;
            case R.id.s:
                inputEnglishText.setText(inputEnglishText.getText()+"s");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("s")+" ");
                break;
            case R.id.t:
                inputEnglishText.setText(inputEnglishText.getText()+"t");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("t")+" ");
                break;
            case R.id.u:
                inputEnglishText.setText(inputEnglishText.getText()+"u");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("u")+" ");
                break;
            case R.id.v:
                inputEnglishText.setText(inputEnglishText.getText()+"v");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("v")+" ");
                break;
            case R.id.w:
                inputEnglishText.setText(inputEnglishText.getText()+"w");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("w")+" ");
                break;
            case R.id.x:
                inputEnglishText.setText(inputEnglishText.getText()+"x");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("x")+" ");
                break;
            case R.id.y:
                inputEnglishText.setText(inputEnglishText.getText()+"y");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("y")+" ");
                break;
            case R.id.z:
                inputEnglishText.setText(inputEnglishText.getText()+"z");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("z")+" ");
                break;
            case R.id.one:
                inputEnglishText.setText(inputEnglishText.getText()+"1");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("1")+" ");
                break;
            case R.id.two:
                inputEnglishText.setText(inputEnglishText.getText()+"2");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("2")+" ");
                break;
            case R.id.three:
                inputEnglishText.setText(inputEnglishText.getText()+"3");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("3")+" ");
                break;
            case R.id.four:
                inputEnglishText.setText(inputEnglishText.getText()+"4");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("4")+" ");
                break;
            case R.id.five:
                inputEnglishText.setText(inputEnglishText.getText()+"5");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("5")+" ");
                break;
            case R.id.six:
                inputEnglishText.setText(inputEnglishText.getText()+"6");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("6")+" ");
                break;
            case R.id.seven:
                inputEnglishText.setText(inputEnglishText.getText()+"7");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("7")+" ");
                break;
            case R.id.eight:
                inputEnglishText.setText(inputEnglishText.getText()+"8");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("8")+" ");
                break;
            case R.id.nine:
                inputEnglishText.setText(inputEnglishText.getText()+"9");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("9")+" ");
                break;
            case R.id.zero:
                inputEnglishText.setText(inputEnglishText.getText()+"0");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("0")+" ");
                break;
            case R.id.slash:
                inputEnglishText.setText(inputEnglishText.getText()+"/");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse("/")+" ");
                break;
            case R.id.space:
                inputEnglishText.setText(inputEnglishText.getText()+" ");
                convertToMorseText.setText(convertToMorseText.getText()+Convert.toMorse(" ")+" ");
                break;
            case R.id.back_space:
                strE = inputEnglishText.getText().toString();
                strM = convertToMorseText.getText().toString();
                if (strE.length() >= 1 && strM.length() >= 1)
                {
                    String lastChar = String.valueOf(strE.charAt(strE.length()-1));
                    strM = strM.substring(0,strM.length()-1-Convert.toMorse(String.valueOf(lastChar)).length());
                    strE = strE.substring(0,strE.length()-1);
                    convertToMorseText.setText(strM);
                    inputEnglishText.setText(strE);
                }
                break;
            case R.id.paste_english_button:
                ClipData clipDataPaste = cbm.getPrimaryClip();
                int countPaste = clipDataPaste.getItemCount();
                for(int i = 0;i < countPaste;i++){
                    ClipData.Item item = clipDataPaste.getItemAt(i);
                    CharSequence str = item.coerceToText(MorseActivity.this);
                    strE = strE + str;
                }
                strM = Convert.sentenceToMorse(strE);
                inputEnglishText.setText(strE);
                convertToMorseText.setText(strM);
                break;
            case R.id.copy_morse_button:
                ClipData clipData = ClipData.newPlainText("simple text",convertToMorseText.getText().toString());// Creates a new text clip to put on the clipboard
                cbm.setPrimaryClip(clipData);// Set the clipboard's primary clip.
                break;
            default:
                break;
        }
    }


}
