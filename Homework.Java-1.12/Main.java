public class Main {
    public static void main(String[] args) {
        int x = 0;
        try {
            int result = divideTenBy(x);
            System.out.println("Rezultatul este: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Impartire prin 0.");
            e.printStackTrace();
        }
    }

    public static int divideTenBy(int x) throws ArithmeticException {
        if (x == 0) {
            throw new ArithmeticException("Impartire prin 0.");
        }
        return 10 / x;
    }
}
// Aceasta abordare este mai flexibila, deoarece atribuie abordarea unei exceptii
// la codul care foloseste metoda divideTenBy, permitand mai mult control
// si modularitate.
