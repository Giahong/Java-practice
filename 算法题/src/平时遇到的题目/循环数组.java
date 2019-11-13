package 平时遇到的题目;


/*
    题目：输入行、列，打印循环数组，如：
    5   4
    01 02 03 04
    14 15 16 05
    13 20 17 06
    12 19 18 07
    11 10 09 08
 */

import java.util.Scanner;

public class 循环数组 {
    public static void main(String[] args) {

        //1、获取行列
        System.out.println("输入行、列");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();



        //2、定义打印的四个方向
        int right = 0, down = 1, left = 2, up = 3;
        int[][] array = new int[rows][cols];
        int direction = 0;
        int i = 0,j = 0; //定义坐标，用于打印
        for (int num = 1; num <= rows * cols; num++){
            array[i][j] = num;
            //下面只负责坐标的改变，执行完以下语句，则要保证坐标来到未修改的值
            //从左向右
            if (direction == right){
                if (j+1 < cols && array[i][j+1] ==0){
                    j++;
                }else{
                    direction = down;
                    i++;
                    continue;
                }
            }
            //从上到下
            if (direction == down){
                if (i + 1 < rows && array[i+1][j] == 0){
                    i++;
                }else {
                    direction = left;
                    j--;
                    continue;
                }
            }
            //从右到左
            if (direction == left){
                if (j - 1 >= 0 && array[i][j-1] == 0){
                    j--;
                }else {
                    direction = up;
                    i--;
                    continue;
                }
            }
            //从下到上
            if (direction == up){
                if (i - 1 >= 0 && array[i-1][j] == 0){
                    i--;
                }else {
                    direction = right;
                    j++;
                    continue;
                }
            }
        }

        //3、打印数组
        for (int a = 0; a < rows; a++){
            for (int b = 0; b < cols; b++){
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }


    }
}
