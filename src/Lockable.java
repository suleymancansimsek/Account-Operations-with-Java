public interface Lockable {
    //setKey, lock, unlock, and locked.
    public int  setKey(int key);
    public boolean lock(int key);
    public boolean unlock(int key);
    public int locked();
}
