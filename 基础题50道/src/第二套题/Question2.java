package 第二套题;


import java.util.Scanner;

/*
    已知某年某月，请输出这个月共有多少天。
 */
public class Question2 {
    public static void main(String[] args) {
        //获取年月
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();

        System.out.println("这个月有" + dayOfMonth(year,month) + "天");

    }

    public static int dayOfMonth(int year,int month){
        //1、定义平年和闰年的数组
        int[] ping_year = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int[] run_year = {31,29,31,30,31,30,31,31,30,31,30,31};

        //2、判断闰平年，返回天数
        if ((year%4 ==0 && year%100 !=0) || year%400 ==0){
            return run_year[month - 1];
        }else {
            return ping_year[month - 1];
        }
    }

}
