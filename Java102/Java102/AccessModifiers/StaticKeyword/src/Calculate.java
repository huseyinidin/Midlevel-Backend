public class Calculate {

    public static void calcAvarege(Course[] notes) {
        double total = 0;
        for (Course c : notes) {
            total += c.note;
        }
        double avarege = total / notes.length;
        System.out.println("Avarege: " + avarege);
    }

    public static void calcAvarege1(int[] notes) {
        double total = 0;
        for (int i : notes) {
            total += i;
        }
        double avarege = total / notes.length;
        System.out.println("Avarege: " + avarege);
    }
}
