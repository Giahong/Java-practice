package 课后习题.第16章.线程通信;

//账户类，指定存款后就应该取款
public class Account {
    private String accountNo;
    private double balance;

    private boolean flag = false;

    public Account(){}

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    //取款函数
    public synchronized void draw(double drawAccount){
        try {
            if (flag == false){
                wait();
            }else {
                if (balance > drawAccount){
                    System.out.println(Thread.currentThread().getName() +
                    "取钱：" + drawAccount);
                }



            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }

}
