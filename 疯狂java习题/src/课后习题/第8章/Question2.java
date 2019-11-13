package 课后习题.第8章;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Set<String> stringSet = new HashSet<>();

        while (count < 10){
            stringSet.add(sc.nextLine());
            count++;
        }

        System.out.println(stringSet.size());
        System.out.println(stringSet);

    }

}
