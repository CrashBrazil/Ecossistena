public abstract class Mamiferos extends Animal {

    //     CONSTRUTOR

    public Mamiferos(String Name,String Tipo,boolean vida_Morto,int idade,String genero){
        this.Nome = Name;
        this.Tipo_de_Alimentacao = Tipo;
        this.Vida_Morto = vida_Morto;
        this.Idade = idade;
        this.Genero = genero.toUpperCase();
    }

    @Override
    public void comer() {

    }

    @Override
    public void Locomocao() {

    }

    @Override
    public void detalhes() {

    }
}
