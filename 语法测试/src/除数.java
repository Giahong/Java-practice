public class 除数 {

    public static void main(String[] args) {

        System.out.println(hh());

    }

    public static int hh(){
        int i = 0;
        try {
            i = 1;
            return i;
        }catch (Exception e){
            i = 3;
            return i;
        }finally {  //值传递，传的是副本
            i = 5;
        }
    }
}
