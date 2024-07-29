package hw.oopTask.learnToStringException.task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Account acc1 = new Account("test1","123", true);
        Account acc2 = new Account("test2","1234", false);
        Account acc3 = new Account("test3","125", false);
        Account acc4 = new Account("test4","1236", false);
        Account acc5 = new Account("test5","1237", false);
        Account acc6 = new Account("test1","123", true);
        Account [] allAccounts = {acc1, acc2, acc3, acc4, acc5};
        System.out.println(accountExist(allAccounts, acc6));
        Account cloneAcc = (Account) acc1.clone() ;
        System.out.println(cloneAcc);
        System.out.println(acc1);
    }
    public static boolean accountExist(Account [] accounts, Account account){
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i].equals(account)){
                return true;
            }
        }
        return false;
    }
}
