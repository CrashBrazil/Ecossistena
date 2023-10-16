package Fenomenos;

import Plantas.Arvores;

public class fenomenos {
    //    Metodos
    public void meteoro(){
        Caixa();
        System.out.println("Um meteoro caiu em algum lugar");
        Caixa();
    }
    public void incendio(Arvores x){
        Caixa();
        x.setVida(false);
        System.out.println("A arvore comecou a queimar!!!");
        Caixa();
    }


    private void Caixa(){
        for (int x = 0 ; x <= 40; x++){
            System.out.print("-");
        }
        System.out.println(" ");
}
}
