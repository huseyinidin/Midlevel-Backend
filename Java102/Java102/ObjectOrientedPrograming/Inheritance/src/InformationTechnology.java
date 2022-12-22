public class InformationTechnology extends Officer {

    private String duty;

    public InformationTechnology(String name, String surname, String phoneNumber, String email, String department, String shift, String duty) {
        super(name, surname, phoneNumber, email, department, shift);
        this.duty = duty;
    }

    public String getDuty() {
        return this.duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void networkSetup() {
        System.out.println(this.getName() + " installation completed successfully.");
    }
}
