package com.wangyi.HttpRequest;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 通过请求获取数据
 *
 * @author wangyi
 * @create 2018-08-22 4:54 PM
 **/
public class RequestData {
    private static final String base_url = "https://www.pwxcoo.com/dictionary?" ;

    /**
     * 从url中获取数据
     * @param url
     * @return
     * @throws Exception
     */
    public static String getContent(String url) throws Exception{
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        String result = null ;
        try {
            httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(url) ;
            response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity);
        }catch (Exception e){
            throw e ;
        }finally {
            httpClient.close();
            response.close();
        }
        return result ;
    }

    public static String makeurl(String type , String value){
        String type_value = branchValue(type) ;
        if(type.equalsIgnoreCase("idiom2")){
            type = "idiom" ;
        }
        String result = base_url + "type="+type+"&"+type_value+"="+value ;
        return result ;
    }
    /**
     * 获取不同参数对应的类型值
     * @param value
     * @return
     */
    public static String branchValue(String value) {
        String result = "";
        switch (value) {
            case "idiom":                 //通过成语名来获取成语
                result = "word";
                break;
            case "idiom2":
                result = "abbreviation";  //通过缩写来获取成语
                break;
            case "xiehouyu":                //歇后语,模糊查询
                result = "riddle";
                break;
            case "word":                    //字
                result = "word";
        }
        return result;
    }

    public static void main(String[] args) {
//        String url = base_url + "type=word&word=饕" ;
//        try {
//
//            System.out.println(getContent(url));
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        System.out.println("toString".contains("set"));
    }



}
