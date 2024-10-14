package cambiosimples;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import org.json.JSONObject;

public class CurrencyConverterServiceImpl implements CurrencyService {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/4428b631f863b97a97d4b19b/pair/";
    private static final HttpClient client = HttpClient.newHttpClient();

    @Override
    public double converter(String moedaOrigem, String moedaDestino, double valorEntrada) throws IOException, InterruptedException {
        String url = API_URL + moedaOrigem + "/" + moedaDestino;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Erro ao acessar a API de conversão. Status: " + response.statusCode());
        }

        JSONObject jsonResponse = new JSONObject(response.body());

        if (!jsonResponse.has("conversion_rate")) {
            throw new RuntimeException("Taxa de conversão não encontrada na resposta da API");
        }

        double taxaConversao = jsonResponse.getDouble("conversion_rate");

        return valorEntrada * taxaConversao;
    }
}
