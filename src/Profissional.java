package src;

public class Profissional {
    int id;
    String nome;
    String telefone;
    Profissional profissional1 = new Profissional(1, "Dra. Camila", "1199887766");
        Profissional profissional2 = new Profissional(2, "Dr. Marcos", "1199776655");

    //set e get no braço
    //id so get

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
        
}


}
