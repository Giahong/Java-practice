/*
    题目：判断101-200之间有多少个素数，并输出所有素数。
 */

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {

        int count = 0;  //计算
        List<Integer> numbers = new ArrayList<>();  //用于存放数组

        for (int i = 1; i <= 100; i++){
            if (isPrimeNumber(i)){
                count++;
                numbers.add(i);
            }
        }
        //打印
        System.out.println("质数数量为：" + count);
        System.out.println("如下：");
        for (int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i) + "  ");
        }
    }

    public static boolean isPrimeNumber(int num){
        if (num == 1){
            return false;
        }
        if (num <= 3){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

}
