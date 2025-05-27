package src;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Fono");

        Exercicio ex = new Exercicio();
        ex.nome = "kiko";
        ex.descricao =  "exercício de aquecimento, imitando o kiko";
        ex.tempoMin = 3;
        ex.som = "sons/kiko.mp3";

        Exercicio ex1 = new Exercicio ();
        ex1.nome = "abelha";
        ex.descricao = "relaxamento";
    } 
}
