package 基础习题;

/*
    题目：使用循环语句输出下面的图形。
#
# # #
# # # # #
# # # # # # #
# # # # # # # # #
 */
public class Question12 {
    public static void main(String[] args){
        for (int i = 1; i<=9; i++){
            if (i%2 == 1){
                for (int j=1;j<=i;j++){
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
}
