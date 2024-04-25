 import com.google.gson.Gson;
 import com.google.gson.annotations.SerializedName;
 import java.io.IOException;
 import java.net.URI;
 import java.net.http.HttpClient;
 import java.net.http.HttpRequest;
 import java.net.http.HttpResponse;
 import java.util.Map;


 public class Conversor {

     @SerializedName("conversion_rates")
     private Map<String, Double> listaDeMonedas;
     HttpClient client = HttpClient.newHttpClient();

     public Conversor() {
         this.client = HttpClient.newHttpClient();
     }

     public Map<String, Double> Busqueda(String busq) throws IOException, InterruptedException {

         String Direccion = "https://v6.exchangerate-api.com/v6/a7cb23b994365fb337fb64bf/latest/" + busq;

         HttpRequest request = HttpRequest.newBuilder()
                 .uri(URI.create(Direccion))
                 .build();
         HttpResponse<String> response = client
                 .send(request, HttpResponse.BodyHandlers.ofString());

         Gson gson = new Gson();

         Conversor conversor = gson.fromJson(response.body(), Conversor.class);

         return conversor.listaDeMonedas ;
     }

     public void imprimidor(String monedalocal, String monedaDestino, int valor) throws IOException, InterruptedException {
         System.out.println("++++++++++++++++++++++++++++++++++++++++");
         System.out.println("      "+valor + " "+monedalocal + " corresponde a " +
                 Busqueda(monedalocal).get(monedaDestino) * valor +" "+ monedaDestino );
         System.out.println("++++++++++++++++++++++++++++++++++++++++");
     }


 }