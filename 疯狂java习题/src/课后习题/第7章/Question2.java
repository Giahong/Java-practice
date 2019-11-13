package 课后习题.第7章;



/*
    题目：将字符串“ABCDEFG”中的CD截出，再将B、F截出
*/
public class Question2 {
    public static void main(String[] args){
        String s = "ABCDEFG";
        String s1 = s.substring(2,4);  //左闭右开，起始为0
        System.out.println(s1);

        System.out.println(s.substring(1,2));
        System.out.println(s.charAt(1));
        System.out.println(s.substring(5,6));

    }
}
