package 课后习题.第8章;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public static void main(String[] args) {
        String[] strings = {"a","b","a","b","c","a","b","c","b"};
        Map<String,Integer> keyCount = new HashMap<>();

        for (String s : strings){
            if (keyCount.get(s) == null){
                keyCount.put(s,1);
            }else {
                keyCount.put(s,keyCount.get(s)+1);
            }
        }
//        for (Map.Entry entry: keyCount.entrySet()){
//            System.out.println(entry.getKey() + "--" + entry.getValue());
//        }

        //lambda编程方式遍历
        keyCount.forEach((key,value) ->{
            System.out.println(key + ":" + value);
        });

    }



}
