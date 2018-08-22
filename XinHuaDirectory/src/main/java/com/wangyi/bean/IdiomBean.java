package com.wangyi.bean;

/**
 * 成语bean
 *
 * @author wangyi
 * @create 2018-08-22 11:24 AM
 **/
public class IdiomBean {
    private String derivation ;      //词源
    private String example ;
    private String explanation ;
    private String pinyin;
    private String word ;
    private String abbreviation ;     //缩写

    public String getDerivation() {
        return derivation;
    }

    public void setDerivation(String derivation) {
        this.derivation = derivation;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return "derivation : "+getDerivation()+"\n"
                +"example : "+getExample()+"\n"
                +"explanation : "+getExplanation()+"\n"
                +"pinyin : "+getPinyin()+"\n"
                +"word : "+getWord()+"\n"
                +"abbreviation : "+getAbbreviation() ;
    }
}
