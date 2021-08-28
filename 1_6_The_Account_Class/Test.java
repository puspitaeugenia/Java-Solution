public class Test {
    //Tester Class
    public static void main(String[] args) {
        Account acc1 = new Account("5508w33", "Migunani Puspita");
        //Print data acc1
        System.out.println(acc1);
        Account acc2 = new Account("1910k90", "Eugenia Caryopyrata", 28500);
        //Print data acc2
        System.out.println(acc2.toString());
        //Menambahkan credit sebesar 450.000 ke acc2
        acc2.credit(450000);
        System.out.println(acc2.toString());
        //Mengurangi balance sejumlah 150.000 dari acc2 untuk transaksi debit 
        acc2.debit(150000);
        System.out.println(acc2.toString());
        //Melakukan transfer ke acc1 dari acc2 sebesar 25000
        acc2.transferTo(acc1, 25000);
        System.out.println(acc1.toString());
        //Melakukan transaksi debit namun jumlah balance kurang dari jumlah yang ingin ditarik
        acc2.debit(500000);
    }    
}
