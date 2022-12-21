public class Main {
    /*
    public static void print (){
        System.out.println("Hello World!");
    }
    */
    public static void main(String[] args) {
        //print();

        Course math = new Course("Matematic", "Math-101", 70);
        Course phy = new Course("Physic", "PHY-101", 40);
        Course chem = new Course("Chemistry", "CHEM-101", 100);

        Course[] lesson = {math, phy, chem};
        Calculate.calcAvarege(lesson);  // Static method

        int[] notes = {math.note, phy.note, chem.note};
        Calculate.calcAvarege1(notes); // Static method

        //Calculate calc = new Calculate ();
        //calc.calcAvarege(notes);

        /*Player p1 = new Player("John Smith", 1);
        System.out.println(p1.name);
        // non-static variable this cannot be referenced from a static context || Player Class 16. row
        Player.showName();
*/
        /*
        Player p2 = new Player("Kodluyoruz", 2);
        p2.login();
        Player p3 = new Player("Patika.dev", 3);
        p3.login();
        System.out.println(Player.count);
        */

        /*
         * Player p2 = new Player("Kodluyoruz", 2);
         * System.out.println(p2.count);
         * Player p3 = new Player("Patika.dev", 3);
         * System.out.println(p3.count);
         * System.out.println(Player.count);
         * */
    }
}
