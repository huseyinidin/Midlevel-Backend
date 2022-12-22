public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", "Smith", "5999999999", "John@smith.com");
        e1.entry();
        System.out.println("-------------");

        Academic a1 = new Academic("Ella", "Watson", "5999999998", "Ella@watson.com", "Computer Science", "Professor");

        // OverRiding
        a1.entry();
        a1.lesson();
        System.out.println("-------------");

        Instructor i1 = new Instructor("Lucy", "Page", "5999999997", "Lucy@page.com", "Computer Science", "Instructor", "I555");

        // OverRiding
        i1.entry();

        // Reminder
        // Method Overloading
        i1.entry("9:00");
        i1.entry("10:00", "20:00");
        System.out.println(i1.getDoorNo());
        System.out.println("-------------");
    }
}
