package Animal;

import Animal.Animal;

public class Anfibios extends Animal {
    private boolean Parte_Corpo;
    private String Cor_Pele;

//    Construtor

    public Anfibios(String Name,String Tipo,boolean vida_Morto,int idade,String genero,boolean Partes, String Cor){
        this.Nome = Name.toLowerCase();
        this.Tipo_de_Alimentacao = Tipo.toLowerCase();
        this.Vida_Morto = vida_Morto;
        this.Idade = idade;
        this.Genero = genero.toLowerCase();
        this.Parte_Corpo = Partes;
        this.Cor_Pele = Cor;
    }

//   Setters and Getters

    public void setParte_Corpo(boolean Corpo){
        this.Parte_Corpo = Corpo;
    }
    public void setCor_Pele(String cor_Pele){
        this.Cor_Pele = cor_Pele;
    }
    public boolean getParte_Corpo(){
        return this.Parte_Corpo;
    }
    public String getCor_Pele(){
        return this.Cor_Pele;
    }


//    Metodos

    public void Regenerar(){
        if (getParte_Corpo() == false){
            this.Parte_Corpo = true;
            System.out.printf("O %s teve uma parte de seu corpo regenerada!! %n",this.getNome());

        }

    }
    @Override
    public void comer() {
        System.out.printf("O %s comeu %s %n",this.getNome(),getTipo_de_Alimentacao());

    }

    @Override
    public void Locomocao() {
        System.out.printf("O %s Nadou pelo ambiente %n",this.getNome());

    }

    @Override
    public void detalhes() {
        System.out.printf("Nome: %s %n",getNome());
        Caixa();
        System.out.printf("Cor: %s %n",this.getCor_Pele());
        System.out.printf("Alimentação: %s %n",getTipo_de_Alimentacao());
        if (getVida_Morto() == true){
            System.out.println("Estado: Vivo");
        }
        else{
            System.out.println("Estado: Morto");
        }
        System.out.printf("Idade: %d %n",getIdade());
        System.out.printf("Genero: %s %n",getGenero());
        if (getParte_Corpo() == true){
            System.out.println("Corpo: 100% ");
        }
        else {
            Caixa();
            System.out.printf("Alerta !!! %n%s possui alguma parte do corpo danificada %n",getNome());


        }
        Caixa();

    }



}
