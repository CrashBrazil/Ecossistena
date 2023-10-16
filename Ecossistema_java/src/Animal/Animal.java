package Animal;

public abstract class Animal {

//    Propiedades

    protected String Nome;
    protected String Tipo_de_Alimentacao;
    protected boolean Vida_Morto;
    protected int Idade;
    protected String Genero;




//    Setters and Getters

    public void setNome(String Name){
        this.Nome = Name;
    }

    public void setTipo_de_Alimentaçao(String Tipo){
        this.Tipo_de_Alimentacao = Tipo;
    }
    public void setVida_Morto(boolean Vida){
        this.Vida_Morto = Vida;
    }
    public void setIdade(int idade){
        this.Idade = idade;
    }
    public void setGenero(String Genero){
        this.Genero = Genero.toLowerCase();
    }


    public String getNome(){
        return this.Nome;
    }
    public String getTipo_de_Alimentacao(){
        return this.Tipo_de_Alimentacao;
    }
    public boolean getVida_Morto(){
        return this.Vida_Morto;
    }
    public int getIdade(){
        return this.Idade;
    }
    public String getGenero(){
        return this.Genero;
    }

//    Metodos

    public abstract void comer();
    public abstract void Locomocao();
    public abstract void detalhes();

//    Ferramentas

    public void Caixa(){
        for (int x = 0 ; x <= 40; x++){
            System.out.print("-");
        }
        System.out.println(" ");
    }























}
