import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      int totalAccountsOpen = 0;
      BankAccount a = new BankAccount("First Account", 1);
      System.out.println(a.getID());
      BankAccount b = new BankAccount("Second", 2);
      System.out.println(b.getID());
      BankAccount c =new BankAccount("Third", 3);
      System.out.println(c.getID());
      BankAccount d = new BankAccount("Fourth", 4);
      System.out.println(d.getID());
