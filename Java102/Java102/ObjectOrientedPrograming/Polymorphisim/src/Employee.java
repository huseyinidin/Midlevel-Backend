public class Employee {

    private String name;
    private String surname;
    private String phoneNumber;
    private String email;

    public Employee(String name, String surname, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void entry() {
        System.out.println(this.getName() + " entered the university.");
    }

    public void exit() {
        System.out.println(this.getName() + " is out of university.");
    }

    public void entryDiningHall() {
        System.out.println(this.getName() + " entered the dining hall.");
    }

    public void exitDiningHall() {
        System.out.println(this.getName() + " is out of dining hall.");
    }

    public static void loginUsers(Employee[] loginUsers) {
        for (Employee loginUser : loginUsers) {
            System.out.print("-");
            loginUser.entry();
        }
    }
}
