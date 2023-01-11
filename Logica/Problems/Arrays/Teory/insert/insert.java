public class insert {
    
    public static void main(String[] args) {
        int arr [] = new int [6];
        end(arr);
        start(arr);
        anywhere(arr);


    }

    public static void end (int [] arr){
        //Insertar al final de un array
        //Aqui llenamos las primeras 3 posiciones del array
        int length=0;
        for(int i=0; i<3;i++){ 
            arr[length]=i;
            length++;
        }
        //Hacemos un espacio adelante para el nuevo elemento 
       

        arr[length] = 10;
        System.out.println("FIN DEL ARRAY");
        max_consecutive_ones.ImprimeInt(arr);
       

    }

    public static void start (int [] arr){
        //Insertar al inicio de un array
        //Hacemos un espacio adelante para el nuevo elemento 
        for (int i = 3; i >= 0; i--) {
           arr[i + 1] = arr[i];
        }

        arr[0] = 20;
        System.out.println("\n\n\nINICIO DEL ARRAY");
        max_consecutive_ones.ImprimeInt(arr);
       

    }

    public static void anywhere (int [] arr){
         //Donde sea en el array
       

         //Hacemos un espacio en el 2do espacio del array (numero cualquiera)
         for (int i = 4; i >= 2; i--)
          {
            // Mandamos cada elemento un espacio a la derecha.
             arr[i+1] = arr[i];
          }
 
         arr[2] = 30;
 
         System.out.println("\n\n\nDONDE SEA DEL ARRAY");
         max_consecutive_ones.ImprimeInt(arr);
        
 
     }

     public static void otroEjemplo (){
        //ESTE EJEMPLO HACE UN ESPACIO EN CUALQUIER LUGAR DEL ARRAY DUPLICANDOLO Y DEJANDO EL ESPACIO DUPLICADO PARA NOSOTROS INGRESAR UN NUMERO
        /*
         * EJEMPLO:
         * 2,3,4,5,6,7,8,9,0,0
         * NOSOTROS PEDIMOS LA POSICION 3 Y EL NUMERO 999
         * QUEDARIA ASI:
         * 2,3,4,5,5,6,7,8,9,0
         * PARA LUEGO EN EL LUGAR DEL 5 DUPLICADO QUE ES EL INDICE 3, COLOCAR NUESTRO NUMERO Y QUEDAR ASI
         * 2,3,4,999,5,6,7,8,9,0
         */
        int arr [] = new int [10];
        int num=0,pos=0,aux=0;
 
        for(int i=0;i<8;i++)  arr[i]=i+2;
 
        System.out.println("Ingrese el numero: "); num=sc.nextInt();
        System.out.println("Ingrese la posicion: "); pos=sc.nextInt();
 
        
        for(int i=8;i>=pos;i--){
         arr[i+1]=arr[i];
        }
        arr[pos]=num;
     
 
        for(int i:arr){
         System.out.println(i);
        }
     }
     
    
}
