public class Player {

    // Static: it automatically takes up space in memory without producing objects.

    public String name;
    public int id;
    public static String game = "CS";
    public static int count = 35;


    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void showName() {
        Player p1 = new Player("a", 1);
        System.out.println(p1.name);
        //System.out.println(Player.count);
    }

    /*
    public void login(){
        count++;
    }*/
}
