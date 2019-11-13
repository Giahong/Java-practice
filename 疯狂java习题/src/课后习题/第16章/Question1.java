package 课后习题.第16章;



/*
    题目：写两个线程，其中一个线程打印1~52，另一个线程打印A~Z，打印顺序应是12A34B56C....5152Z
*/

//定义了打印方法
public class Question1 {
    private boolean flag = true;

    //打印数字函数
    public synchronized void printNumber(){
        try {
            if (!flag){
                wait();
            }else{
                for (int i = 1; i <= 52; i++){
                    System.out.print(i);
                    if (i%2 == 0){
                        flag = false;
                        notifyAll();
                        wait();
                    }
                }
                System.exit(0);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //打印字母函数   ASCII中A~Z对应65~90
    public synchronized void printWord(){
        try {
            if (flag){
                wait();
            }else{
                for (int j = 65; j <= 90; j++){
                    char a = (char) j;
                    System.out.print(a);
                    flag = true;
                    notifyAll();
                    wait();
                }
                System.exit(0);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class NumberThread extends Thread
{
    private Question1 question1;

    public NumberThread(String name,Question1 question1) {
        super(name);
        this.question1 = question1;
    }

    public void run(){
        question1.printNumber();
    }
}

class WordThread extends Thread
{
    private Question1 question1;

    public WordThread(String name,Question1 question1) {
        super(name);
        this.question1 = question1;
    }

    public void run(){
        question1.printWord();
    }
}
