public class Mamiferos extends Animal {

    //     CONSTRUTOR

    public Mamiferos(String Name,String Tipo,boolean vida_Morto,int idade,String genero){
        this.Nome = Name;
        this.Tipo_de_Alimentacao = Tipo.toLowerCase();
        this.Vida_Morto = vida_Morto;
        this.Idade = idade;
        this.Genero = genero.toUpperCase();
    }

    @Override
    public void comer() {
        System.out.printf("%S está comendo %s",this.getNome(),this.getTipo_de_Alimentacao());

    }

    @Override
    public void Locomocao() {

    }

    @Override
    public void detalhes() {

    }
}
