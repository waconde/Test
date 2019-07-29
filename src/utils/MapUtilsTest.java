package utils;


import org.apache.commons.collections4.MapUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangke
 * @version 1.0
 * @className MapUtilsTest
 * @description TODO
 * @date 2019/7/25 4:40 PM
 **/
public class MapUtilsTest {
    public static  void main(String [] args){
        Map<String, Integer> map= new HashMap<>();
        map.put("1",new Integer(1));
        System.out.println(MapUtils.isEmpty(map));
        System.out.println(MapUtils.isNotEmpty(map));
    }
}