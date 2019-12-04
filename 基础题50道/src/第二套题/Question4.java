package 第二套题;

import java.util.Scanner;

/*
    计算数字n阶乘 n! = n * n-1 * n-2 ...
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入n：");
        int n = sc.nextInt();
        try {
            if (n < 0){
                System.out.println("输入需要大于0");
                throw new Exception();
            }
            System.out.println("n! = " + factorial(n));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int factorial(int n){

        if (n == 0 || n == 1){
            return 1;
        }else{
            return factorial(n-1) * n;
        }
    }


}
