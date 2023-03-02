public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.string = "TEST";
        Cat cat2 = cat1;
        cat1.string = "NEW";
        System.out.println(cat2.string);

        Integer i1 = 5;

    }

}
