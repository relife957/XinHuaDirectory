package com.wangyi.DealJson;

import com.alibaba.fastjson.JSONArray;
import com.wangyi.bean.* ;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 将字符串转换位json
 *
 * @author wangyi
 * @create 2018-08-21 9:05 PM
 **/
public class ToJson {
    /**
     * 去除json外的中括号
     * @param str
     * @return
     */
    public static String removeBracket(String str){
        if(str != null && str.charAt(0) == '['
                && str.charAt(str.length()-1) == ']'){
            str = str.substring(1,str.length()-1);
        }
        return str ;
    }

    /**
     * 判断该字符串是否只包含一个json,如果不是就只取第一个
     * @param str
     * @return
     */
    public static String judge(String str){
        int end = str.indexOf("}") ;
        if(end != str.length()-1){
            str = str.substring(0,end+1) ;
        }
        return str ;
    }

    public static JSONArray getJsonArray(String str){
        str = str.trim() ;
        JSONArray jsonArray = JSONArray.parseArray(str);
        return jsonArray ;
    }

    public static <T> T jsonToBean(JSONObject jsonObject ,Class<T> clazz) throws Exception{
        T t = clazz.newInstance() ;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods){
            String methodName = method.getName();
            if(methodName.contains("set")){
                method.invoke(t,jsonObject.getString(methodName.substring(3).toLowerCase()).trim());
            }
        }
        return t ;
    }

    public static <T> List<T> getBeanArray(JSONArray jsonArray ,
                                       Class<T> clazz) throws Exception{
        List<T> ts = new ArrayList<>();
        for (Object obj : jsonArray){
            JSONObject jsonObject = (JSONObject)obj ;
            ts.add(jsonToBean(jsonObject,clazz));
        }
        return ts ;
    }

    public static void main(String[] args) {
        String str = "[{\"derivation\":\"南朝梁·刘勰《文心雕龙·体性》步夜俊侠，故兴高而采烈。”\",\"example\":\"阿二忽然对于曾沧海的威吓全没怕惧，反而～的说起来了。（茅盾《子夜》四）\",\"explanation\":\"兴原指志趣，后指兴致；采原指神采，后指精神；烈旺盛。原指文章志趣高尚，言词犀利◇多形容兴致高，精神饱满。\",\"pinyin\":\"xìng gāo cǎi liè\",\"word\":\"兴高采烈\",\"abbreviation\":\"xgcl\"}]\n" ;
        //IdiomBean idiom = getJsonBean(s,IdiomBean.class);
        //System.out.println(idiom.getAbbreviation());
//        str = judge(removeBracket(str.trim())) ;
//        JSONObject jsonObject = JSONObject.parseObject(str) ;
//        IdiomBean idiomBean = null ;
//        try {
//            idiomBean = jsonToBean(jsonObject,IdiomBean.class);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println(idiomBean.getWord());
//        JSONArray jsonArray = getJson(str) ;
//        for (Object obj:jsonArray){
//            JSONObject jsonObject = (JSONObject)obj ;
//            System.out.println(jsonObject.getString("word"));
//        }
    }
}
