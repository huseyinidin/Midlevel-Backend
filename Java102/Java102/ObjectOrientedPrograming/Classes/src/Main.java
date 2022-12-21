public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Danny", "Brooke", "123", "FR", 55);
        Student st2 = new Student("Ella", "Wick", "125", "DE", 55);
        Student st3 = new Student("Tom", "Wood", "130", "BG", 55);

        Instructor teacher = new Instructor("John", "Nash", "Mathematics");

        // Composition , Aggregation
        // Course has a Instructor
        Course math = new Course("Mathematics", "MAT-101", teacher);
        System.out.println(math.getInstructor().getSurName());

        Student[] stu = {st1, st2, st3};
        System.out.println("Avarage: " + math.calcAvarage(stu));
    }
}
