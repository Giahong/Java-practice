package 基础习题;


import java.util.Arrays;
import java.util.Scanner;

/*
    题目：编程实现用户输入4个整数，按从大到小的顺序排列输出。
*/
public class Question01 {
    public static void main(String[] args){
        //1、先获取整数
        System.out.println("请输入4个整数：");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("排序前的数组为：" + Arrays.toString(arr));  //直接调用arr.toString，打印的是地址；需要调用Arrays工具类
        //2、排序
        //Arrays.sort(arr); //直接调用方法
        //使用自己写的排序
        arr = sort(arr);
        System.out.println("排序后的数组为：" + Arrays.toString(arr));

    }

    public static int[] sort(int[] array){
        for (int i=array.length-1; i >= 0 ;i--){
            for (int j =0; j<i;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

}
