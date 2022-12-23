public abstract class Officer extends Employee {

    private String department;
    private String shift;

    public Officer(String name, String surname, String phoneNumber, String email, String department, String shift) {
        super(name, surname, phoneNumber, email);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return this.shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work() {
        System.out.println(this.getName() + " officer started working.");
    }

    public void entry() {
        System.out.println(this.getName() + " entered through Gate C.");
    }
}
