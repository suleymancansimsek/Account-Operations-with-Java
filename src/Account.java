public class Account implements Lockable{
   // Attributes of this class will be account number, account balance, and the name of the account’s owner
    private int accountNumber;
    private int accountBalance;
    private String ownerName;
    int key;
    boolean lockStatus;

    Account(int accountNumber,int accountBalance, String ownerName){
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.ownerName=ownerName;
        key=1111;
        lockStatus = false;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        if(lockStatus==true){
            return accountBalance;
        }
        return -1;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getOwnerName() {
        return ownerName;    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public int setKey(int key) {
        this.key = key;
        return key;
    }

    @Override
    public boolean lock(int key) {
        if(this.key == key){
            lockStatus = false;
            System.out.println("Account Locked");
        }

        return lockStatus =true;
    }

    @Override
    public boolean unlock(int key) {
        if(this.key == key){
            lockStatus = true;
            System.out.println("Account Unlocked");
            return lockStatus=true;
        }
        else
            System.out.println("Account Still Locked");
        return lockStatus =false;
    }

    @Override
    public int locked() {
        lockStatus = false;
        System.out.println("Account State Is Locked");
        return -1;
    }
}
