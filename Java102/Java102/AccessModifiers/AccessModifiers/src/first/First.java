package first;

public class First {

    /* Access modifiers = Public, Private, Protected */
    //public String str;
    protected String str;

    public First(String str){
        this.str = str;
    }
    //  protected void show(){
    public void show(){
        System.out.println(this.str);
    }

   /*
    Private

    private String str;

    private void showStr(){
        System.out.println(this.str);
    }

    void show(){
        this.showStr();
    }
    */
}
