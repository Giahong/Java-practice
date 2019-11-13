package 数组与字符串;

/*
    题目：peter piper picked a peck of pickled peppers
           统计这段绕口令有多少个以p开头的单词
 */

public class Question12 {
    public static void main(String[] args){
        String s = "peter piper picked a peck of pickled peppers";
        //1、将这段句子拆分成单个单词
        String[] words = s.split(" ");
        System.out.println(words.length);
        //2、进行统计
        int count = 0;
        for (String word : words){
            if (word.charAt(0) == 'p'){
                count++;
            }
        }
        System.out.println("总共有"+ count +"个p开头的字母");
    }
}
