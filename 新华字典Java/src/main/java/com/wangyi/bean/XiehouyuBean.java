package com.wangyi.bean;

/**
 * 歇后语的bean
 *
 * @author wangyi
 * @create 2018-08-22 5:12 PM
 **/
public class XiehouyuBean {
    private String riddle ;
    private String answer ;

    public String getRiddle() {
        return riddle;
    }

    public void setRiddle(String riddle) {
        this.riddle = riddle;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "riddle: "+getRiddle()+"\n"
                +"answer: "+getAnswer() ;
    }
}
