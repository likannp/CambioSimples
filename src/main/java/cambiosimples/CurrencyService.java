package cambiosimples;
import java.io.IOException;

public interface CurrencyService {
    double converter(String moedaOrigem, String moedaDestino, double valorEntrada) throws IOException, InterruptedException;
}
