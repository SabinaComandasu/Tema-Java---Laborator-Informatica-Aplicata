public class Main {
    public static void main(String[] args) {
        App app1 = new App();
        Integer nr1, nr2, sum;

        System.out.println("Introduceți primul număr:");
        nr1 = app1.readNumber();

        System.out.println("Introduceți al doilea număr:");
        nr2 = app1.readNumber();

        sum = app1.calculateSum(nr1, nr2);

        System.out.println("Suma: " + sum);
    }
}
