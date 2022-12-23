public class Academic extends Employee {

    private String department;
    private String degree;

    public Academic(String name, String surname, String phoneNumber, String email, String department, String degree) {
        super(name, surname, phoneNumber, email);
        this.department = department;
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void lesson() {
        System.out.println(this.getName() + " entered the class!");
    }

    @Override
    public void entry() {
        System.out.println(this.getName() + " entered through Gate A.");
    }
}
