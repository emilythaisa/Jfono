package src;

public class Clinica {
    int id;
    String nome;
    String cnpj;
    String endereco;

    public static void main(String[] args) {

        Clinica cl = new Clinica();
        cl.nome = "Fonomais";
        cl.cnpj = "1111.001-05";
        cl.endereco= "Shopping pier 21 loja 01, andar 04";
        
        /*
         * 1- encapsule os atributos
         * 2- defina construtor ou construtores
         * 3- crie dois objetos
         * 4- passe parâmetros para construtores sobrecarregadors
         * 5- gere método getters
         * 6- e imprima um relatório do objeto criado
         */
        public Clinica() {
        }

        public Clinica(int id, String nome, String cnpj, String endereco) {
            this.id = id;
            this.nome = nome;
            this.cnpj = cnpj;
            this.endereco = endereco;
        
            public int getId() {
                return id;
                public String getNome() {
                    return nome;
                }
            
                public String getCnpj() {
                    return cnpj;
                }
            
                public String getEndereco() {
                    return endereco;
                }
            
            
                public void imprimirRelatorio() {
                    System.out.println("=== Relatório da Clínica ===");
                    System.out.println("ID: " + id);
                    System.out.println("Nome: " + nome);
                    System.out.println("CNPJ: " + cnpj);
                    System.out.println("Endereço: " + endereco);
                    System.out.println("=============================");
                }
            

    }
    
}
