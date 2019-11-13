package 平时遇到的题目;

public class Demo {
    class Super{
        int flag=1;
        Super(){
            test();
        }  void test(){
            System.out.println("Super.test() flag="+flag);
        }
    }
    class Sub extends Super{
        Sub(int i){
            flag=i;
            System.out.println("Sub.Sub()flag="+flag);
        }
        void test(){
            System.out.println("Sub.test()flag="+flag); //变量使用的是就近原则，加载父类时，对象子类属性还未被加载赋值
        }
}
    public static void main(String[] args) {
        new Demo().new Sub(5);
    }
}