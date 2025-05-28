package src;

public class Exercicio {

    private int id;
    private String nome;
    private String descricao;
    private String som;
    private int tempoMin;
    private String exemplo;

    public Exercicio(){
        
    }
    
    public Exercicio(String nome, 
                     String descricao, 
                     String som,
                     int tempoMin,
                     String exemplo){

            this.nome = nome;
            this.descricao = descricao;
            this.som = som;
            this.tempoMin = tempoMin;
            this.exemplo = exemplo;

                     
        }
}
