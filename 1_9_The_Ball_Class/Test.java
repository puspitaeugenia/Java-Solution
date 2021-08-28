public class Test {
    //Tester Class
    public static void main(String[] args) {
        Ball b1 = new Ball(12, 5, 7, 5, 180);
        //Print data b1
        System.out.println(b1.toString());
        System.out.print("Delta X: ");
        //Mendapatkan nilai delta X
        System.out.println(b1.getXDelta());
        System.out.print("Delta Y:");
        //Mendapatkan nilai delta Y
        System.out.println(b1.getYDelta());
        System.out.println("After Move: ");
        //Mendapatkan posisi x terakhir setelah perpindahan
        b1.move();
        //Print data b1 setelah perpindahan
        System.out.println(b1.toString());
    }    
}
