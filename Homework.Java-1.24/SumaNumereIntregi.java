import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaNumereIntregi {
    public static int calculareSuma(String numeFisier) throws IOException {
        FileInputStream fis = new FileInputStream(numeFisier);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        int suma = 0;

        while ((line = br.readLine()) != null) {
            try {
                int numar = Integer.parseInt(line);
                suma += numar;
            } catch (NumberFormatException ignored) {
            }
        }

        br.close();
        fis.close();

        return suma;
    }
}
