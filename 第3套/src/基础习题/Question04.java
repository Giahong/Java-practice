package 基础习题;


import java.util.Scanner;

/*
    题目：输入 3 个正数，判断能否构成一个三角形
 */
public class Question04 {
    public static void main(String[] args){
        System.out.println("请输入三个整数：");

        //1、获取输入的数据
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();

        //三个数需要都大于0
        if (a<=0 || b<=0 || c<=0){
            System.out.println("请输入正整数！");
            System.exit(1);
        }

        //2、进行三个数的对比
        if ((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println("可以构成三角形");
        }else{
            System.out.println("不能构成三角形");
        }



    }
}
