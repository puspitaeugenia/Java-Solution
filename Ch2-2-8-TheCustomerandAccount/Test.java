public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer(56, "Migunani Puspita", 'f');
        Customer c2 = new Customer(88, "Peter Kavinsky",'m');
        Account a1 = new Account(94, c1, 156700);
        Account a2 = new Account(30, c2);

        System.out.println("Customer 1: "+c1.toString());
        System.out.println("ID: "+c1.getID());
        System.out.println("Name: "+c1.getName());
        System.out.println("Gender: "+c1.getGender());
        System.out.println();

        System.out.println("Customer 2: "+c2.toString());
        System.out.println("ID: "+c2.getID());
        System.out.println("Name: "+c2.getName());
        System.out.println("Gender: "+c2.getGender());
        System.out.println();
        
        System.out.println("Account 1: "+a1.toString());
        System.out.println("ID: "+a1.getID());
        System.out.println("Customer: "+a1.getCustomer());
        System.out.println("Balance: "+a1.getBalance());
        a1.setBalance(865400);
        System.out.println("New balance after set: "+a1.getBalance());
        System.out.println("Account 2: "+a1.toString());
        System.out.println();

        System.out.println("Account 2: "+a2.toString());
        System.out.println("ID: "+a2.getID());
        System.out.println("Customer: "+a2.getCustomer());
        System.out.println("Balance: "+a2.getBalance());
        a2.setBalance(125000);
        System.out.println("New balance after set: "+a2.getBalance());
        System.out.println("Account 2: "+a2.toString());

        System.out.println();
        System.out.println("Customer Name: "+a1.getCustomerName());
        System.out.println("Add 150.000 to balance");
        a1.deposit(150000);
        System.out.println("Current balance: "+a1.getBalance());
        System.out.println("Withdrawal transaction of 100.000");
        a1.withdraw(100000);
        System.out.println("Current balance: "+a1.getBalance());
        System.out.println("Withdrawal transaction of 1.000.000");
        a1.withdraw(1000000);
        System.out.println(a1.toString());
        System.out.println();
    }
}
