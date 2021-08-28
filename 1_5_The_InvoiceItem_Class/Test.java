public class Test {
    //Tester Class
    public static void main(String[] args) {
        InvoiceItem barang1 = new InvoiceItem("1862","Loose Leaf 50 BOSS", 100, 7500); 
        //Print data barang1
        System.out.println(barang1.toString());
        //Mendapatkan total harga barang
        System.out.print("Total: ");
        System.out.println(barang1.getTotal());
    }    
}