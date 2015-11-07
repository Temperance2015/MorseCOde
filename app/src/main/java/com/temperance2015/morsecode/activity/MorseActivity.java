package com.temperance2015.morsecode.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.temperance2015.morsecode.R;

/**
 * Created by Isabel on 2015/11/7.
 */
public class MorseActivity extends BaseActivity implements OnClickListener{

    private TextView inputText;
    private TextView convertText;
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
    private Button copy;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.morse_layout);
        inputText = (TextView) findViewById(R.id.inputText);
        convertText = (TextView) findViewById(R.id.convertText);
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
        copy = (Button) findViewById(R.id.copy_button);
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
        copy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.a:
                inputText.setText(inputText.getText()+"a");
                convertText.setText(convertText.getText()+toMorse("a")+" ");
                break;
            case R.id.b:
                inputText.setText(inputText.getText()+"b");
                convertText.setText(convertText.getText()+toMorse("b")+" ");
                break;
            case R.id.c:
                inputText.setText(inputText.getText()+"c");
                convertText.setText(convertText.getText()+toMorse("c")+" ");
                break;
            case R.id.d:
                inputText.setText(inputText.getText()+"d");
                convertText.setText(convertText.getText()+toMorse("d")+" ");
                break;
            case R.id.e:
                inputText.setText(inputText.getText()+"e");
                convertText.setText(convertText.getText()+toMorse("e")+" ");
                break;
            case R.id.f:
                inputText.setText(inputText.getText()+"f");
                convertText.setText(convertText.getText()+toMorse("f")+" ");
                break;
            case R.id.g:
                inputText.setText(inputText.getText()+"g");
                convertText.setText(convertText.getText()+toMorse("g")+" ");
                break;
            case R.id.h:
                inputText.setText(inputText.getText()+"h");
                convertText.setText(convertText.getText()+toMorse("h")+" ");
                break;
            case R.id.i:
                inputText.setText(inputText.getText()+"i");
                convertText.setText(convertText.getText()+toMorse("i")+" ");
                break;
            case R.id.j:
                inputText.setText(inputText.getText()+"j");
                convertText.setText(convertText.getText()+toMorse("j")+" ");
                break;
            case R.id.k:
                inputText.setText(inputText.getText()+"k");
                convertText.setText(convertText.getText()+toMorse("k")+" ");
                break;
            case R.id.l:
                inputText.setText(inputText.getText()+"l");
                convertText.setText(convertText.getText()+toMorse("l")+" ");
                break;
            case R.id.m:
                inputText.setText(inputText.getText()+"m");
                convertText.setText(convertText.getText()+toMorse("m")+" ");
                break;
            case R.id.n:
                inputText.setText(inputText.getText()+"n");
                convertText.setText(convertText.getText()+toMorse("n")+" ");
                break;
            case R.id.o:
                inputText.setText(inputText.getText()+"o");
                convertText.setText(convertText.getText()+toMorse("o")+" ");
                break;
            case R.id.p:
                inputText.setText(inputText.getText()+"p");
                convertText.setText(convertText.getText()+toMorse("p")+" ");
                break;
            case R.id.q:
                inputText.setText(inputText.getText()+"q");
                convertText.setText(convertText.getText()+toMorse("q")+" ");
                break;
            case R.id.r:
                inputText.setText(inputText.getText()+"r");
                convertText.setText(convertText.getText()+toMorse("r")+" ");
                break;
            case R.id.s:
                inputText.setText(inputText.getText()+"s");
                convertText.setText(convertText.getText()+toMorse("s")+" ");
                break;
            case R.id.t:
                inputText.setText(inputText.getText()+"t");
                convertText.setText(convertText.getText()+toMorse("t")+" ");
                break;
            case R.id.u:
                inputText.setText(inputText.getText()+"u");
                convertText.setText(convertText.getText()+toMorse("u")+" ");
                break;
            case R.id.v:
                inputText.setText(inputText.getText()+"v");
                convertText.setText(convertText.getText()+toMorse("v")+" ");
                break;
            case R.id.w:
                inputText.setText(inputText.getText()+"w");
                convertText.setText(convertText.getText()+toMorse("w")+" ");
                break;
            case R.id.x:
                inputText.setText(inputText.getText()+"x");
                convertText.setText(convertText.getText()+toMorse("x")+" ");
                break;
            case R.id.y:
                inputText.setText(inputText.getText()+"y");
                convertText.setText(convertText.getText()+toMorse("y")+" ");
                break;
            case R.id.z:
                inputText.setText(inputText.getText()+"z");
                convertText.setText(convertText.getText()+toMorse("z")+" ");
                break;
            case R.id.one:
                inputText.setText(inputText.getText()+"1");
                convertText.setText(convertText.getText()+toMorse("1")+" ");
                break;
            case R.id.two:
                inputText.setText(inputText.getText()+"2");
                convertText.setText(convertText.getText()+toMorse("2")+" ");
                break;
            case R.id.three:
                inputText.setText(inputText.getText()+"3");
                convertText.setText(convertText.getText()+toMorse("3")+" ");
                break;
            case R.id.four:
                inputText.setText(inputText.getText()+"4");
                convertText.setText(convertText.getText()+toMorse("4")+" ");
                break;
            case R.id.five:
                inputText.setText(inputText.getText()+"5");
                convertText.setText(convertText.getText()+toMorse("5")+" ");
                break;
            case R.id.six:
                inputText.setText(inputText.getText()+"6");
                convertText.setText(convertText.getText()+toMorse("6")+" ");
                break;
            case R.id.seven:
                inputText.setText(inputText.getText()+"7");
                convertText.setText(convertText.getText()+toMorse("7")+" ");
                break;
            case R.id.eight:
                inputText.setText(inputText.getText()+"8");
                convertText.setText(convertText.getText()+toMorse("8")+" ");
                break;
            case R.id.nine:
                inputText.setText(inputText.getText()+"9");
                convertText.setText(convertText.getText()+toMorse("9")+" ");
                break;
            case R.id.zero:
                inputText.setText(inputText.getText()+"0");
                convertText.setText(convertText.getText()+toMorse("0")+" ");
                break;
            case R.id.slash:
                inputText.setText(inputText.getText()+"/");
                convertText.setText(convertText.getText()+toMorse("/")+" ");
                break;
            case R.id.space:
                inputText.setText(inputText.getText()+" ");
                convertText.setText(convertText.getText()+toMorse(" ")+" ");
                break;
            case R.id.back_space:
                String strE = inputText.getText().toString();
                String strM = convertText.getText().toString();
                if (strE.length() >= 1 && strM.length() >= 1)
                {
                    String lastChar = String.valueOf(strE.charAt(strE.length()-1));
                    strM = strM.substring(0,strM.length()-1-toMorse(String.valueOf(lastChar)).length());
                    strE = strE.substring(0,strE.length()-1);
                    convertText.setText(strM);
                    inputText.setText(strE);
                }
                break;
            case R.id.copy_button:
                ClipboardManager cbm = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);//系统剪贴板实例
                ClipData clipData = ClipData.newPlainText("simple text",convertText.getText().toString());// Creates a new text clip to put on the clipboard
                cbm.setPrimaryClip(clipData);// Set the clipboard's primary clip.
                break;
            default:
                break;
        }
    }

    public String toMorse(String letter){
        if (letter.equals("a"))
            return "·-";
        if (letter.equals("b"))
            return "-···";
        if (letter.equals("c"))
            return "-·-·";
        if (letter.equals("d"))
            return "-··";
        if (letter.equals("e"))
            return "·";
        if (letter.equals("f"))
            return "··-·";
        if (letter.equals("g"))
            return "--·";
        if (letter.equals("h"))
            return "····";
        if (letter.equals("i"))
            return "··";
        if (letter.equals("j"))
            return "·---";
        if (letter.equals("k"))
            return "-·-";
        if (letter.equals("l"))
            return "·-··";
        if (letter.equals("m"))
            return "--";
        if (letter.equals("n"))
            return "-·";
        if (letter.equals("o"))
            return "---";
        if (letter.equals("p"))
            return "·--·";
        if (letter.equals("q"))
            return "--·-";
        if (letter.equals("r"))
            return "·-·";
        if (letter.equals("s"))
            return "···";
        if (letter.equals("t"))
            return "-";
        if (letter.equals("u"))
            return "··-";
        if (letter.equals("v"))
            return "···-";
        if (letter.equals("w"))
            return "·--";
        if (letter.equals("x"))
            return "-··-";
        if (letter.equals("y"))
            return "-·--";
        if (letter.equals("z"))
            return "--··";
        if (letter.equals("1"))
            return "·----";
        if (letter.equals("2"))
            return "··---";
        if (letter.equals("3"))
            return "···--";
        if (letter.equals("4"))
            return "····-";
        if (letter.equals("5"))
            return "·····";
        if (letter.equals("6"))
            return "-····";
        if (letter.equals("7"))
            return "--···";
        if (letter.equals("8"))
            return "---··";
        if (letter.equals("9"))
            return "----·";
        if (letter.equals("0"))
            return "-----";
        if (letter.equals("/"))
            return "-··--";
        if (letter.equals(" "))
            return "/";
        else return "";
    }
}
