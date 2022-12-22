public class LabAssistant extends Assistant {

    public LabAssistant(String name, String surname, String phoneNumber, String email, String department, String degree, String officeClock) {
        super(name, surname, phoneNumber, email, department, degree, officeClock);
    }

    public void labEntry() {
        System.out.println(this.getName() + " entered the laboratory course.");
    }
}
