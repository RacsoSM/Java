package segundaUnidad;
public class EnteroX {
    int x; //declaramos atributos

    public  int getX(){//getter y setter de x
        return x;
    }
    public  void setX(int newX){
        x=newX;
    }

    public static void main(String[] args) {
        EnteroX unaX = new EnteroX();//declaramos 2 objetos sin constructor
        EnteroX otraX = new EnteroX();

        unaX.setX(10); //cambiamos los valores de x
        otraX.setX(50);

        System.out.println("unaX.getX = "+unaX.getX()); //los mostramos
        System.out.println("otraX.getX = "+otraX.getX());
    }
}
