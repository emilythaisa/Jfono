package src;

import javax.swing.plaf.BorderUIResource.TitledBorderUIResource;

public class Paciente {
    private int id;
    private String nome;
    private String email;
    
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    

        Paciente paciente1= new Paciente();
        paciente1.nome= "helena";   
        paciente1.email= "hele.2009@gmail.com";

        Paciente paciente2= new Paciente();
        paciente2.nome= "sebastiao";   
        paciente2.email= "sesb.tiao@gmail.com";

        Paciente paciente3 = new Paciente();
        paciente3.nome= "Ana";   
        paciente3.email= "sesb.tiao@gmail.com";

        Paciente paciente4= new Paciente();
        paciente4.nome= "Titi";
        paciente4.email= "carlos.2023@email.com";

        Paciente paciente5= new Paciente();
        paciente5.nome= "juliana";
        paciente5.email= "juliana2022@email.com";


        
        System.out.println("Paciente 1: " + paciente1.getNome() + " - " + paciente1.getEmail());
        System.out.println("Paciente 2: " + paciente2.getNome() + " - " + paciente2.getEmail());
        System.out.println("Paciente 3: " + paciente3.getNome() + " - " + paciente3.getEmail());
        System.out.println("Paciente 4: " + paciente4.getNome() + " - " + paciente4.getEmail());
        System.out.println("Paciente 5: " + paciente5.getNome() + " - " + paciente5.getEmail());
    }


 
