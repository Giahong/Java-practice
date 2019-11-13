package 课后习题.第16章;

//第一问的执行类
public class Main1 {

    public static void main(String[] args){
        Question1 question1 = new Question1();
        new NumberThread("打印数字线程",question1).start();
        new WordThread("打印字母线程",question1).start();
    }
}
