public class main {
    public static void main(String[] args) {
        Account account = new Account(1,1500,"Süleyman");
        account.setKey(1234); //Changing password
        account.lock(1234); // locked
        account.unlock(1234);//unlocked
        account.locked(); //it shows lock state
        System.out.println(account.lockStatus);
        System.out.println(account.getAccountBalance()); // we can not access account balance because account is locked

        account.unlock(1234);
        System.out.println(account.lockStatus);
        System.out.println(account.getAccountBalance()); // now we can access account balance because account is unlocked
    }
}
