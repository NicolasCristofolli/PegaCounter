package Projeto.PegaCounter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;
public class Counter {
    // URL da página com os counters
    Scanner leitura = new Scanner(System.in);
    private String counter;

    public void setCounter(String counter) {
        this.counter = counter;
    }
    public void mostrar() {
        System.out.println("Ditite de qual campeão você quer saber os counters!");
        setCounter(leitura.nextLine());
        // Conectar à página e obter o documento HTML
        Document doc = null;
        try {
            doc = Jsoup.connect("https://lolalytics.com/lol/" + counter + "/counters/").get();
        } catch (IOException e) {
            System.out.println("Nao achamos os dados desse campeao");
        }
        // Selecionar os elementos que contêm os counters
        Elements countersElements = doc.getElementsByClass("mb-2");
        System.out.println("==========================================================================================");
        // Imprimir os 3 maiores counters
        for (int i = 0; i < 3; i++) {
            Element counters = countersElements.get(i);
            String counterText = counters.text();
            // Substitui "VS" por "em"
            counterText = counterText.replace("VS", "em");
            // Divide a string em partes baseado em um espaço
            String[] parts = counterText.split(" ");
            // Pega as duas últimas palavras
            String ultimasPalavras = parts[parts.length - 2] + " " + parts[parts.length - 1];
            // Substitui o texto após "em" pelas duas últimas palavras
            counterText = counterText.substring(0, counterText.indexOf("em") + 2) + " " + ultimasPalavras;
            System.out.println("Counter " + (i + 1) + ": " + counterText);
        }

        System.out.println("==========================================================================================");
    }
}
