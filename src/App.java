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
        ex1.nome = "Vibrar lábios";
        ex.descricao = "Fazer os lábios vibrarem, como um som de uma moto";
        ex1.tempoMin = 2;
        ex1.exemplo = "Br (som de motor)";

        
    } 
}
