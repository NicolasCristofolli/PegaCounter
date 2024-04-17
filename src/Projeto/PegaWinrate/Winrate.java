//package Projeto.PegaWinrate;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//import java.util.Scanner;
//public class Winrate {
//    // URL da página com os counters
//    Scanner leitura = new Scanner(System.in);
//    private String lane;
//
//    public void setCounter(String counter) {
//        this.lane = counter;
//    }
//    public void mostrar() {
//        System.out.println("Ditite de qual lane você quer saber as melhores escolhas!");
//        setCounter(leitura.nextLine());
//        // Conectar à página e obter o documento HTML
//        Document doc = null;
//        try {
//            doc = Jsoup.connect("https://lolalytics.com/lol/tierlist/?lane=" + lane ).get();
//        } catch (IOException e) {
//            System.out.println("Nao achamos os dados dessa lane");
//        }
//        // Selecionar os elementos que contêm os counters
//        Elements winrateElements = doc.getElementsByClass("flex");
//        System.out.println("==========================================================================================");
////        // Imprimir os 3 maiores counters
////        for (int i = 0; i < 3; i++) {
//        System.out.println(winrateElements.text());
////            System.out.println("Rank " + (i + 1) + ": " + winrate.text());
////        }
////        System.out.println("==========================================================================================");
//    }
//}
