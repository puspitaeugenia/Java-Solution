public class Test {
    //Tester Class
    public static void main(String[] args) {
        Time t1 = new Time(23, 59, 59);
        System.out.println(t1.toString());
        //Mendapatkan waktu setelah penambahan 1 detik
        t1.nextSecond();
        System.out.println(t1.toString());
        //Mendapatkan waktu setelah penguran 1 detik
        t1.previousSecond();
        System.out.println(t1.toString());
    }    
}
