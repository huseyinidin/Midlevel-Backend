public class Instructor extends Academic {

    private String doorNo;

    public Instructor(String name, String surname, String phoneNumber, String email, String department, String degree, String doorNo) {
        super(name, surname, phoneNumber, email, department, degree);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return this.doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    @Override
    public void entry() {
        System.out.println(this.getName() + " entered through Gate " + this.getDoorNo());
    }

    // Abstract method - can take different parameters
    @Override
    public void entryLesson(String oClock) {
        System.out.println("Instructor " + this.getName() + " entered the class at " + oClock + " pm");
    }
}
