package com.wangyi;

import com.alibaba.fastjson.JSONArray;
import com.wangyi.DealJson.ToJson;
import com.wangyi.HttpRequest.RequestData;
import com.wangyi.bean.IdiomBean;
import com.wangyi.bean.WordBean;
import com.wangyi.bean.XiehouyuBean;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 主类
 *
 * @author wangyi
 * @create 2018-08-22 5:16 PM
 **/
public class Main {
    public static Class getClass(String type){
        Class clazz = null ;
        switch (type){
            case "idiom" :
                clazz = IdiomBean.class ;
                break ;
            case "idiom2" :
                clazz = IdiomBean.class ;
                break ;
            case "xiehouyu":
                clazz = XiehouyuBean.class ;
                break;
            case "word":
                clazz = WordBean.class ;
                break ;
        }
        return clazz ;
    }

    public static void print(String type,String value){
        Class clazz = getClass(type) ;
        String url = RequestData.makeurl(type,value);
        Iterator iterator = null ;
        try {
            String data = RequestData.getContent(url);
            JSONArray jsonArray = ToJson.getJsonArray(data);
            iterator = ToJson.getBeanArray(jsonArray,clazz).iterator();

        }catch (Exception e){
            e.printStackTrace();
        }
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String type = args[0] ;
        String value ;
        Scanner scanner = new Scanner(System.in) ;
        while (true){
            System.out.print(">");
            value = scanner.nextLine();
            if (value.equalsIgnoreCase(":quit")){
                break;
            }
            print(type,value);
        }
    }
}
