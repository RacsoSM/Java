package ClasesAbstractas;

//Como esta es la primera clase padre, la de hasta arriba de la jerarquia, se le pone abstract despues del modificador de acceso
public abstract class SerVivo { 

    //En las clases tambien se pone este abstract
    public abstract void alimentarse(); 
    //Dado que no sabemos como se alimentan los seres vivos, digo, es muy generico, lo sub dividimos en los siguientes.
    /*
     *          SerVivo (abstract)
     * 
     *     Planta      Animal (abstract)
     * 
     *          Herbivoro   Carnivoro
     *  
     */

}
