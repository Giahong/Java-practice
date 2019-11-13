package 基础习题;

import java.util.Scanner;

/*
    题目：将一个正整数分解质因数。例如：输入 90，打印出 90=2*3*3*5
 */
public class Question20 {
    public static void main(String[] args){
        //1、获取输入的数
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(num + "=");
        //2、分解质因数，从小到大求解质因数，如果有不是质因数的，则在前就被分解了
        for (int i = 2; i< num; i++){
            while (num % i ==0){
                num /= i;
                System.out.print(i + "*");
            }
        }
        System.out.println(num);//最终剩下的数是除不尽的，需要打出来
    }
}
