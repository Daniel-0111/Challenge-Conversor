import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) throws IOException, InterruptedException {
        Conversor conversor = new Conversor();



        try {
            //conversor.Busqueda("USD").get("ARS")
            Map<String, Double> conversionRates = conversor.Busqueda("USD");

            System.out.println("5 DOLAR SON: "+ conversionRates.get("ARS")*5 + "aRS") ;

            /*/ Itera sobre el mapa de tasas de conversión e imprime cada par clave-valor
            for (Map.Entry<String, Double> entry : conversionRates.entrySet()) {
                String codigoMoneda = entry.getKey();
                Double tasaConversion = entry.getValue();
                System.out.println("Código de moneda: " + codigoMoneda + ", Tasa de conversión: " + tasaConversion);
            }*/
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error al buscar las tasas de cambio: " + e.getMessage());
        }
    }
}