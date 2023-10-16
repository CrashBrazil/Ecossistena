package Plantas;

import Plantas.Plantas;

public class Arvores extends Plantas {

    private int Maca;

//    Construtor
    public Arvores(int Folhas, double Tamanho_caule, int Quatidade_raizes, String Cor_folhas, int idade, boolean estado,int Alimento){
        this.Folhas = Folhas;
        this.Tamanho_Caule = Tamanho_caule;
        this.Quantidade_Raizes = Quatidade_raizes;
        this.Cor_Folhas = Cor_folhas;
        this.Idade = idade;
        this.vida = estado;
        this.Maca = Alimento;
    }

//    Setters and Getters

    public void setAlimento(int alimento) {
        this.Maca = alimento;
    }
    public int getAlimento() {
        return Maca;
    }

//    Metodos
    @Override
    public void fotossintese() {

    }

    @Override
    public void Produzir_Alimento() {
        this.Maca = getAlimento() + 1;
        System.out.println("A arvore produziu uma maçã");

    }
    public void Retirar_Maca(){
        this.Maca = getAlimento() - 1;
        System.out.println("Você retirou uma maçã");
    }
    public void Corta_Arvore(){
        this.setVida(false);
        System.out.println("Você cortou a arvore ");
    }

    @Override
    public void detalhes() {
        Caixa();
        System.out.printf("Quantidade de folhas: %d %n",this.getFolhas());
        System.out.printf("Tamanho do Caule: %.2f %n",this.getTamanho_Caule());
        System.out.printf("Quantidade de Raizes: %d %n",this.getQuantidade_Raizes());
        System.out.printf("Cor das folhas: %s %n",this.getCor_Folhas());
        System.out.printf("Idade da Arvore: %d %n",this.getIdade());
        if (getVida() == true){
            System.out.println("Estado: Viva");
        }
        else if (getVida() == false){
            System.out.println("Estado: Morto");
        }
        System.out.printf("Quantidade de Maçã: %d %n",this.getAlimento());
        Caixa();
    }

}
