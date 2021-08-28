public class Test {
    //Tester Class
    public static void main(String[] args) {
        Employee e1 = new Employee (8, "Migunani", "Puspita", 125000);
        System.out.println(e1.toString());
        System.out.print("Annual Salary: ");
        //Print gaji tahunan pegawai e1 
        System.out.println(e1.getAnnualSalary());
        //Print data pegawai e1 setelah kenaikan gaji sebesar 25%
        System.out.println("After 25% raises:");
        e1.raiseSalary(25);
        System.out.println(e1.toString());
        //Print gaji tahunan pegawai e1 setlah kenaikan gaji sebesar 25%
        System.out.print("Annual Salary After: ");
        System.out.println(e1.getAnnualSalary());   
    }
}