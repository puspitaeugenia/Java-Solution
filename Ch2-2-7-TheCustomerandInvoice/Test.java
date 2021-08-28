public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer(1787, "Eling Puspa", 15);
        Customer c2 = new Customer(1554, "Migunani Puspita", 20);
        Invoice i1 = new Invoice(16, c2, 1175100);
        System.out.println("Customer 1: "+c1.toString());
        System.out.println("ID: "+ c1.getID());
        System.out.println("Name: "+ c1.getName());
        System.out.println("Discount: "+c1.getDiscount()+"%");
        c1.setDiscount(25);
        System.out.println("New Discount: "+c1.getDiscount()+"%");

		System.out.println();
        System.out.println("Get Customer from Invoice 1: "+i1.getCustomer());
        System.out.println("ID Invoice: "+i1.getID());
        System.out.println();

        System.out.println("Set Invoice 1 for Customer 1");        
        i1.setCustomer(c1);
        System.out.println("Amount: "+i1.getAmount());
        System.out.println("Customer Name: "+i1.getCustomerNAme());
        System.out.println("Amount after disc: "+i1.getAmountAfterDiscount());
    }
}
