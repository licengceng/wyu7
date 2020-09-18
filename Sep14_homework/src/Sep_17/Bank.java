package Sep_17;

/**
 * @author LWQ
 * @title: Bank
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1716:17
 */
public class Bank {
    private  int count=0;
    public synchronized void addMoney(int money){
        System.out.println("准备存钱");
        count+=money;
        System.out.println("存进："+money);
    }
    public synchronized void subMoney(int money){
        System.out.println("准备取钱");
        if (count-money<0){
            System.out.println("余额不足");
            return;
        }
        count-=money;
        System.out.println("取出"+money);
    }
    public void lookMoney(){
        System.out.println("账户余额:"+count);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        for (int i = 0; i <10 ; i++) {
            Thread tadd = new Thread() {
                public void run(){

                        try{
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace(); }

                            bank.addMoney(100);

                        bank.lookMoney();
                }

            };
            tadd.start();
        }

        for (int i = 0; i <10 ; i++) {

            Thread subb = new Thread() {
                public void run(){
                        try{
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                            bank.subMoney(50);

                        bank.lookMoney();
                    }

            };
            subb.start();
        }


    }

}
