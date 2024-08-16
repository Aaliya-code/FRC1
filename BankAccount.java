public class BankAccount {
      

    // instance variables (replicated for each object)
    private String name;
    private int id;
    public int totalAccountsOpen;

    public BankAccount(String n, int i) {
		    name = n;
            id = i;
            totalAccountsOpen++;
      
    }
  
    

    

    public int getID() {   // return this account's id
        return id;
}
}
