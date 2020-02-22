package practice;

import java.util.*;

public class Driving {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }

        Map<String,String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");

        for(String key : map.keySet()){
            System.out.println(map.get(key));
        }


    }
}
