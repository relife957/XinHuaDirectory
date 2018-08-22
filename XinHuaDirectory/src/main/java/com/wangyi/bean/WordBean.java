package com.wangyi.bean;

/**
 * 字的bean
 *
 * @author wangyi
 * @create 2018-08-22 5:14 PM
 **/
public class WordBean {
    private String word ;
    private String oldword ;
    private String strokes ;
    private String pinyin ;
    private String radicals ;
    private String explanation ;
    private String more ;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getOldword() {
        return oldword;
    }

    public void setOldword(String oldword) {
        this.oldword = oldword;
    }

    public String getStrokes() {
        return strokes;
    }

    public void setStrokes(String strokes) {
        this.strokes = strokes;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getRadicals() {
        return radicals;
    }

    public void setRadicals(String radicals) {
        this.radicals = radicals;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    @Override
    public String toString() {
        return "word : "+getWord()+"\n"
                +"oldword : "+getOldword()+"\n"
                +"strokes : "+getStrokes()+"\n"
                +"pinyin : "+getPinyin()+"\n"
                +"radicals : "+getRadicals()+"\n"
                +"explanation : "+getExplanation()+"\n"
                +"more : "+getMore() ;
    }
}
