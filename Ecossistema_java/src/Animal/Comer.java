package Animal;

import Animal.Mamiferos;

public class Comer  {
   private Mamiferos x;
   private   Mamiferos y;

//   Setters and Getters

    public void setX(Mamiferos x) {
        this.x = x;
    }

    public void setY(Mamiferos y) {
        this.y = y;
    }

    public Mamiferos getX() {
        return x;
    }

    public Mamiferos getY() {
        return y;
    }

//  Metodos

    public void Luta_pela_sobrevivencia(Mamiferos x,Mamiferos y){
        if (x.getForca() > y.getForca() && x.getVida_Morto() == true && y.getVida_Morto() == true ){
            y.setVida_Morto(false);
            Caixa();
            System.out.printf("%s Matou e comeu %s %n",x.getNome(),y.getNome());
            Caixa();
        }
        else if (x.getForca() < y.getForca() && x.getVida_Morto() == true && y.getVida_Morto() == true){
            x.setVida_Morto(false);
            Caixa();
            System.out.printf("%s foi comido por %s %n",x.getNome(),y.getNome());
            Caixa();
        }
        else if (x.getForca() == y.getForca() && x.getVida_Morto() == true && y.getVida_Morto() == true ){
            Caixa();
            System.out.printf("%s e %s tiveram um empate %n",x.getNome(),y.getNome());
            Caixa();
        }
        else {

            if (x.getVida_Morto() == false){
                Caixa();
                System.out.printf("Impossivel de fornecer batalha,%s está morto %n",x.getNome());
                Caixa();

            }
            else if (y.getVida_Morto() == false){
                Caixa();
                System.out.printf("Impossivel de fornecer batalha,%s está morto %n",y.getNome());
                Caixa();
            }
            else if (x.getVida_Morto() == false && y.getVida_Morto() == false){
                Caixa();
                System.out.print("Impossivel de fornecer batalha,%s e %s estão mortos %n");
                Caixa();
            }
        }

    }
    protected void Caixa(){
        for (int x = 0 ; x <= 46; x++){
            System.out.print("-");
        }
        System.out.println(" ");
    }
}
