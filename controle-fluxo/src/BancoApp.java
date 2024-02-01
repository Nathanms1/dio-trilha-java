import java.text.NumberFormat;
import java.util.Scanner;

public class BancoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;

        // Iterar, baseado no período em anos, para o cálculo do valorFinal com os juros.
        for (int i = 1; i <= periodo; i++) {
            valorFinal += valorFinal * taxaJuros; // Multiplicar o valorFinal pela taxaJuros.
        }

        NumberFormat df = NumberFormat.getCurrencyInstance();

        String valorFinalFormatado = df.format(valorFinal);
        
        // Remover o símbolo da moeda (assumindo que o símbolo é o primeiro caractere) e retira a ","
        valorFinalFormatado = valorFinalFormatado.substring(1).replace(",", "");

        System.out.println("Valor final do investimento: R$ " + valorFinalFormatado);
        
        scanner.close();
    }
}
