/*
    题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，
    小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
    即 斐波那契数列
 */

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入月份：");
        int months = sc.nextInt();
        System.out.println("兔子数为：" + countRabbits(months));
    }

    //计算兔子数量（即斐波那契）
    public static int countRabbits(int months){
        if (months == 1 || months == 2){
            return 1;
        }else {
            return countRabbits(months - 1) + countRabbits(months - 2);
        }
    }
}
