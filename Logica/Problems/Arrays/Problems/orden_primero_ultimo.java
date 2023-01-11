import java.util.Scanner;

public class orden_primero_ultimo {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        /*MOSTRAR LOS ELEMENTOS DE UN ARRAY EN EL SIGUIENTE ORDEN: PRIMER ELEMENTO, ULTIMO ELEMENTO, SEGUNDO ELEMENTO, NOVENO ELEMENTO, ETC HASTA ACABAR LOS ELEMENTOS */
      /*  int arr [] = new int [10];
       int k=arr.length-1;

       for(int i=0;i<arr.length;i++){
        arr[i]=i;
       // System.out.println(arr[i]);
       }

       for(int t=0;t<arr.length/2;t++){
        System.out.println(arr[t]);
        System.out.println(arr[k]);
        k--;
       }*/





       /*CONFORME A 2 ARRAYS DE 15 ELEMENTOS, CREAR UN 3 ARRAY QUE CONTENGA LOS DATOS DE LOS DOS ARRAYS MEZCLADOS DE ESTA FORMA:
        * 3 DEL ARRAY 1, 3 DEL ARRAY 2, 3 DEL ARRAY 1, 3 DEL ARRAY 2, ASI HASTA LLENAR EL ARRAY 3
        */
      /*  int arr1 [] = {4,7,9,12,4,6,9,16,2,9,19,12,6,9,2};
       int arr2 [] = {1,2,6,12,9,0,5,7,12,5,6,7,8,99,12};
            
      
       int arr3 [] = new int [arr1.length+arr2.length];

      
      //System.out.println(arr3.length);

      int x=0,p=0;

         for(int i=0;i<arr1.length;i++){
            System.out.println("valor de x "+x);
           arr3[x]=arr1[i];
           arr3[x+3]=arr2[i];
            x++;    
                if(x%3==0 && x!=0){
                x=x+3;
                }
           }
        for(int k:arr3){
        System.out.print(k+",");
       }*/



    

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
