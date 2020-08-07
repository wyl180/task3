package com.jnshu.result;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Result
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/2 15:12
 * @Version 1.0
 */
public class Result {
    public static Map<String, Object> set(int code, String msg, Object o){
        Map<String, Object> result = new HashMap<>();
        result.put("code", code);
        result.put("msg", msg);
        result.put("data", o);
        return result;
    }
    public static Map<String, Object> set(int code, String msg){
        Map<String, Object> result = new HashMap<>();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

}
