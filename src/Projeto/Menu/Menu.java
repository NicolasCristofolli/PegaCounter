package Projeto.Menu;

import Projeto.PegaCounter.Counter;


import java.util.Scanner;

public class Menu {
    Scanner leitura = new Scanner(System.in);
    Counter pegaCounter = new Counter();
    private String resp;

    public void setResp(String resp) {
        this.resp = resp;
    }

    public void escolha() {
        do {
            System.out.println("Caso você gostaria de descobrir o counter de algum campeao digite 1\nCaso queira sair digite 3 para sair!");
            setResp((leitura.next()));
            switch (resp) {
                case "1":
                    pegaCounter.mostrar();
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Nao entendi!");
            }
        } while (!resp.equals("3"));
    }
}