package 数组与字符串;


/*
    题目：间隔大小写：把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
 */
public class Question13 {
    public static void main(String[] args){
        String s = "lengendary";
        char[] chars = s.toCharArray();
        for (int i=0; i < chars.length; i++){
            if (i%2 ==0){
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(new String(chars));
    }
}
