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
}
