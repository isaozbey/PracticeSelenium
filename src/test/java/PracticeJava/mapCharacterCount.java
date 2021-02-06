package PracticeJava;

import io.cucumber.java.sl.In;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class mapCharacterCount {


    @Test
    public void test(){

        String str="aaabb11xxddaaaaartyqq";

        Map<Character,Integer> mapList=new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {


            if (mapList.containsKey(each)) {

                mapList.put(each, mapList.get(each)+1);
            }else {
                mapList.put(each,1);
            }


        }

        System.out.println("mapList = " + mapList);

    }


    @Test
    public void test2(){

        String str="aabb@@dddfffeeerrrrrpppoooiiiuuuuytrffdsa";

        Map<Character,Integer> map=new LinkedHashMap<>();


        for (Character ch :str.toCharArray()) {


            if (map.containsKey(ch)) {

                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }

        for (Map.Entry<Character, Integer> each : map.entrySet() ) {

            System.out.print(each.getKey()+"="+each.getValue()+"---");


        }
        System.out.println();

        for (Character each :map.keySet()) {
            System.out.print(each+"-");
        }
        System.out.println();

        for (Integer each :map.values()) {
            System.out.print(each+"-");
        }


    }



}
