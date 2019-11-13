package 平时遇到的题目;

public interface Test {

    //JDK1.8后，可以接口可以有方法体，但需要被default或static修饰，且只能有一个
    default void tr(){
        System.out.println("nihoa");
    }

    abstract void aa();
}
