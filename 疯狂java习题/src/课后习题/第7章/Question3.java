package 课后习题.第7章;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    题目：字符串A1B2C3D4E5F6G7H8，将其拆分，放入int[]和String[]数组中
    https://www.jianshu.com/p/66cc3c0e1e1a
*/
public class Question3 {
    public static void main(String[] args){
        String s = "A1B2C3D4E5F6G7H8";

        //法2：正则表达式
        String regEx = "[0-9]+";
        Matcher m = Pattern.compile(regEx).matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }


        /*
       法1，利用数组遍历获取
        char[] chars = s.toCharArray();
        List<Object> list1 = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        for (int i = 0;i<chars.length;i++){
            if (i%2 ==0){
                list2.add(chars[i]);
            }else {
                list1.add(chars[i]);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        */

    }
}
