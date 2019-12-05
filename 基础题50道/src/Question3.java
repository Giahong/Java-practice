/*
    打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其 各位数字立方和 等于 该数本身。
 */


public class Question3 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++){
            if (isNarcissisticNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isNarcissisticNumber(int n){
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100;

        if (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3) == n){
            return true;
        }else {
            return false;
        }
    }
}
