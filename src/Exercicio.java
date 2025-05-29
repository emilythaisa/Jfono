package src;

public class Exercicio {
    private int id;
    private String nome;
    private String descricao;
    private String som;
    private int tempoMin;
    private String exemplo;

    public Exercicio() {
    }

    public Exercicio(String nome, 
                     String descricao, 
                     String som,
                     int tempoMin,
                     String exemplo) {
        this.nome = nome;
        this.descricao = descricao;
        this.som = som;
        this.tempoMin = tempoMin;
        this.exemplo = exemplo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public int getTempoMin() {
        return tempoMin;
    }

    public void setTempoMin(int tempoMin) {
        this.tempoMin = tempoMin;
    }

    public String getExemplo() {
        return exemplo;
    }

    public void setExemplo(String exemplo) {
        this.exemplo = exemplo;

        Exercicio ex1 = new Exercicio(
            "Alongamento de Pescoço",
            "Gire a cabeça lentamente para os lados",
            "não tem",
            2,
            "vire de um lado para o outro"
        );

        Exercicio ex2 = new Exercicio(
            "Respiração Profunda",
            "Respire fundo e expire lentamente",
            "não tem",
            5,
            "puxe todo o ar pela boca e solte pelo nariz lentamente "
        );

        System.out.println("Exercício 1: " + ex1.getNome() + " - " + ex1.getDescricao());
        System.out.println("Exercício 2: " + ex2.getNome() + " - " + ex2.getDescricao());
    }
}
    

