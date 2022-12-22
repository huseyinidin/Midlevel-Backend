public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", "Smith", "5999999999", "John@smith.com");
        e1.entry();
        System.out.println("-------------");

        Academic a1 = new Academic("Ella", "Watson", "5999999998", "Ella@watson.com", "Computer Science", "Professor");
        a1.lesson();
        System.out.println("-------------");

        Instructor i1 = new Instructor("Lucy", "Page", "5999999997", "Lucy@page.com", "Computer Science", "Instructor", "I555");
        i1.entry();
        i1.lesson();
        System.out.println(i1.getDoorNo());
        System.out.println("-------------");

        Assistant A1 = new Assistant("Frederick", "Benson", "5999999996", "Frederick@benson.com", "Computer Science", "Assistant", "9:00 - 21:00");
        A1.entryDiningHall();
        System.out.println(A1.getDegree());
        System.out.println("-------------");

        LabAssistant l1 = new LabAssistant("Micheal", "Carter", "5999999995", "Micheal@carter.com", "Computer Science", "Laboratory assistant", "8:00 - 21:00");
        l1.entry();
        l1.exitDiningHall();
        System.out.println(l1.getName());
        System.out.println("-------------");

        Officer o1 = new Officer("Ricky", "Stone", "5999999994", "Ricky@stone.com", "Information Technology", "8.00 - 18:00");
        o1.work();
        o1.entryDiningHall();
        System.out.println("-------------");

        InformationTechnology it1 = new InformationTechnology("Sergei", "Cohane", "5999999993", "Sergei@cohane.com", "Information Technology", "8:00 - 18:00", "IT");
        it1.networkSetup();
        it1.exit();
        System.out.println("-------------");

        Security s1 = new Security("Calv", "Hamlin", "5999999992", "Calv@hamlin.com", "Security", "6:00 - 22:00", "Puzzle");
        s1.entry();
        s1.guard();
    }
}

