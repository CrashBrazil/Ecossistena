package Animal;

import Animal.Animal;

public class Mamiferos extends Animal {
//    Propiedades
    private int SeresBipedes;
    private double Forca;

//    CONSTRUTOR

    public Mamiferos(String Name,String Tipo,boolean vida_Morto,int idade,String genero,int SeresBipedes,double forca){
        this.Nome = Name.toLowerCase();
        this.Tipo_de_Alimentacao = Tipo.toLowerCase();
        this.Vida_Morto = vida_Morto;
        this.Idade = idade;
        this.Genero = genero.toLowerCase();
        this.SeresBipedes = SeresBipedes;
        this.Forca = forca;
    }

//    Setters and Getters
    public void setSeresBipedes(int Pernas){
        this.SeresBipedes = Pernas;
    }
    public int getSeresBipedes(){
        return this.SeresBipedes;
    }

    public void setForca(double forca) {
        this.Forca = forca;
    }

    public double getForca() {
        return this.Forca;
    }

//    Metodos
    @Override
    public void comer() {
        System.out.printf("%s está comendo %s %n",this.getNome(),this.getTipo_de_Alimentacao());

    }

    @Override
    public void Locomocao() {
        System.out.printf("O %s está andando sobre %d no lugar %n",getNome(),getSeresBipedes());
    }

    @Override
    public void detalhes() {
        System.out.printf("Nome: %s %n",getNome());
        Caixa();
        System.out.printf("Alimentação: %s %n",getTipo_de_Alimentacao());
        if (getVida_Morto() == true){
            System.out.println("Estado: Vivo");
        }
        else{
            System.out.println("Estado: Morto");
        }
        System.out.printf("Idade: %d %n",getIdade());
        System.out.printf("Genero: %s %n",getGenero());
        System.out.printf("Quantidades de patas: %d %n",getSeresBipedes());
        Caixa();
    }
}
