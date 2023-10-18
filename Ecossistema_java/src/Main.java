import Animal.Anfibios;
import Animal.Mamiferos;
import Fenomenos.fenomenos;
import Plantas.Arvores;

public class Main {
    public static void main(String[] args) {
        Mamiferos Leao = new Mamiferos("Rato","Carne",true,20,"M",4,2);
        Mamiferos Leo = new Mamiferos("Cada","Carne",true,20,"M",4,2);
        Anfibios Leo1 = new Anfibios("Salamandra","Insetos",true,20,"f",true,"Azul");
        fenomenos L = new fenomenos();
        Arvores N = new Arvores(2,130,20,"Verde",1000,true,20);

        L.incendio(N);
        Leao.detalhes();
        Leo.detalhes();
        Leo1.detalhes();
        N.detalhes();
        Leao.Luta_pela_sobrevivencia(Leao,Leo);










    }


}
