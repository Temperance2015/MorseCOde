package com.temperance2015.morsecode.model;

/**
 * Created by Isabel on 2015/11/9.
 */
public class Convert {

    public static String toMorse(String letter){
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
        else return "?";
    }

    public static String toEnglish(String morseCode){
        if (morseCode.equals("·-"))
            return "a";
        if (morseCode.equals("-···"))
            return "b";
        if (morseCode.equals("-·-·"))
            return "c";
        if (morseCode.equals("-··"))
            return "d";
        if (morseCode.equals("·"))
            return "e";
        if (morseCode.equals("··-·"))
            return "f";
        if (morseCode.equals("--·"))
            return "g";
        if (morseCode.equals("····"))
            return "h";
        if (morseCode.equals("··"))
            return "i";
        if (morseCode.equals("·---"))
            return "j";
        if (morseCode.equals("-·-"))
            return "k";
        if (morseCode.equals("·-··"))
            return "l";
        if (morseCode.equals("--"))
            return "m";
        if (morseCode.equals("-·"))
            return "n";
        if (morseCode.equals("---"))
            return "o";
        if (morseCode.equals("·--·"))
            return "p";
        if (morseCode.equals("--·-"))
            return "q";
        if (morseCode.equals("·-·"))
            return "r";
        if (morseCode.equals("···"))
            return "s";
        if (morseCode.equals("-"))
            return "t";
        if (morseCode.equals("··-"))
            return "u";
        if (morseCode.equals("···-"))
            return "v";
        if (morseCode.equals("·--"))
            return "w";
        if (morseCode.equals("-··-"))
            return "x";
        if (morseCode.equals("-·--"))
            return "y";
        if (morseCode.equals("--··"))
            return "z";
        if (morseCode.equals("·----"))
            return "1";
        if (morseCode.equals("··---"))
            return "2";
        if (morseCode.equals("···--"))
            return "3";
        if (morseCode.equals("····-"))
            return "4";
        if (morseCode.equals("·····"))
            return "5";
        if (morseCode.equals("-····"))
            return "6";
        if (morseCode.equals("--···"))
            return "7";
        if (morseCode.equals("---··"))
            return "8";
        if (morseCode.equals("----·"))
            return "9";
        if (morseCode.equals("-----"))
            return "0";
        if (morseCode.equals("-··--"))
            return "/";
        if (morseCode.equals("/"))
            return " ";
        else return "?";
    }

    public static String sentenceToMorse(String sentence){
        String resultStr = "";
        for(int i = 0; i < sentence.length(); i++){
            resultStr = resultStr + " " +toMorse(String.valueOf(sentence.charAt(i)));
        }
        return resultStr;
    }

    public static String longCodeToEnglish(String longCode){
        String resultStr = "";
        int markSpace = longCode.indexOf(" ");
        int markSlash = longCode.indexOf("/");
        if(markSpace == -1 || markSlash == -1){
            resultStr = toEnglish(longCode);
        }else {
            int j = 0;
            for(int i = min(markSlash,markSpace);i < longCode.length();i++){
                if (longCode.charAt(i) == ' '){
                    resultStr = resultStr + toEnglish(longCode.substring(j,i));
                    j = i+1;
                }else if (longCode.charAt(i) == '/'){
                    resultStr = resultStr + toEnglish(longCode.substring(j,i)) + " ";
                    j = i+1;
                }
            }
        }
        return resultStr;
    }

    public static int min(int a,int b){
        if(a>=b){
            return b;
        }else {
            return a;
        }
    }
}
