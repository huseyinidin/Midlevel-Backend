public class Main {

    public static void main(String[] args) {

    Book harryPotter = new Book ("Harry Potter", 150);
    Book lordOfTheRings = new Book ("Lord Of The Rings", -150);
    lordOfTheRings.setName("Flowers for Algernon");
    lordOfTheRings.setPageNumber(123);
    System.out.println(lordOfTheRings.getName());
    System.out.println(lordOfTheRings.getPageNumber());
    }
}
