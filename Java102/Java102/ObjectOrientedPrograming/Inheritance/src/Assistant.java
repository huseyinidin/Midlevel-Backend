public class Assistant extends Academic {

    private String officeClock;

    public Assistant(String name, String surname, String phoneNumber, String email, String department, String degree, String officeClock) {
        super(name, surname, phoneNumber, email, department, degree);
        this.officeClock = officeClock;
    }

    public String getOfficeClock() {
        return this.officeClock;
    }

    public void setOfficeClock(String officeClock) {
        this.officeClock = officeClock;
    }

    public void quiz() {
        System.out.println(this.getName() + " the exam is complete!");
    }
}
