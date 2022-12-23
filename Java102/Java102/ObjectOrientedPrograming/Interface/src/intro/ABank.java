package intro;

public class ABank implements Bank {

    private String bankName;
    private String terminalId;
    private String password;

    public ABank(String bankName, String terminalId, String password) {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("User ip: " + ipAddress);
        System.out.println("Machine ip: " + this.hostIpAddress);
        System.out.println(this.getBankName() + " Connection!");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc) {
        System.out.println("Waiting for a response from the bank");
        System.out.println("Transaction completed successfully!");
        return true;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
