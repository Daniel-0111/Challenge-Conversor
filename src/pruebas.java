import java.io.IOException;
import java.util.Map;

public class pruebas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Conversor conversor = new Conversor();



        try {
            //conversor.Busqueda("USD").get("ARS")
            Map<String, Double> conversionRates = conversor.Busqueda("USD");

            System.out.println("5 DOLAR SON: "+ conversionRates.get("ARS")*5 + "aRS") ;

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error al buscar las tasas de cambio: " + e.getMessage());
        }
    }
}