public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", "Smith", "5999999999", "John@smith.com");
        e1.entry();
        System.out.println("-------------");

        Employee a1 = new Academic("Ella", "Watson", "5999999998", "Ella@watson.com", "Computer Science", "Professor");
        // OverRiding
        a1.entry();
        System.out.println("-------------");

        Instructor i1 = new Instructor("Lucy", "Page", "5999999997", "Lucy@page.com", "Computer Science", "Instructor", "I555");
        // OverRiding
        i1.entry();
        System.out.println("-------------");

        Officer o1 = new Officer("Ricky", "Stone", "5999999994", "Ricky@stone.com", "Information Technology", "8.00 - 18:00");
        // OverRiding
        o1.entry();
        System.out.println("-------------");

        // Polymorphisim

        Employee[] loginUser = {e1, a1, i1, o1};
        // Static method
        Employee.loginUsers(loginUser);
    }
}
