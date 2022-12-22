public class Security extends Officer{

    private String document;

    public Security(String name, String surname, String phoneNumber, String email, String department, String shift, String document) {
        super(name, surname, phoneNumber, email, department, shift);
        this.document = document;
    }

    public String getDocument() {
        return this.document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void guard(){
        System.out.println(this.getName() + " guard has change!");
    }
}
