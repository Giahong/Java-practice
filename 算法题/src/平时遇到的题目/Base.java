package 平时遇到的题目;

public class Base
{
    private String baseName = "base";
    public Base()
    {
        callName();
    }

    public void callName()
    {
        System. out. println(baseName);
    }

    static class Sub extends Base
    {
        private String baseName = "sub";
        public void callName()
        {
            System. out. println (baseName) ;
        }//就近原则
    }
    public static void main(String[] args)
    {
        Base b = new Sub();
    }
}
