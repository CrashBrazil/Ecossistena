package Plantas;

public abstract class Plantas {
    protected int Folhas;
    protected double Tamanho_Caule;
    protected int Quantidade_Raizes;
    protected String Cor_Folhas;
    protected int Idade;
    protected boolean vida;

//    Setters and Getters

    public void setFolhas(int folhas) {
        this.Folhas = folhas;
    }

    public void setTamanho_Caule(double tamanho_Caule) {
       this.Tamanho_Caule = tamanho_Caule;
    }

    public void setQuantidade_Raizes(int quantidade_Raizes) {
        this.Quantidade_Raizes = quantidade_Raizes;
    }

    public void setCor_Folhas(String cor_Folhas) {
       this.Cor_Folhas = cor_Folhas;
    }

    public void setIdade(int idade) {
        this.Idade = idade;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    public int getFolhas() {
        return this.Folhas;
    }

    public double getTamanho_Caule() {
        return this.Tamanho_Caule;
    }

    public int getQuantidade_Raizes() {
        return this.Quantidade_Raizes;
    }

    public String getCor_Folhas() {
        return this.Cor_Folhas;
    }

    public int getIdade() {
        return this.Idade;
    }

    public boolean getVida() {
        return this.vida;
    }
    //    Metodos

    public abstract void Produzir_Alimento();
    public abstract void detalhes();

// ferramentas
protected void Caixa(){
    for (int x = 0 ; x <= 40; x++){
        System.out.print("-");
    }
    System.out.println(" ");
}

}
