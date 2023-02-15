public class SumaMatriz {
    //Santacruz Maldonado Oscar Said
        public static void main(String[] args) {
            int matriz [][]= new int [5][5]; //declaramos la matriz de 5*5
            int totalFilas [] = new int [5];
            int totalColumnas [] = new int [5];
            int totalDiagonales [] = new int [2];
            int aux=totalColumnas.length-1;
          
            for(int i=0;i<5;i++){
                for(int k=0;k<5;k++){
                
                    matriz[i][k]=(int)(Math.random()*2); //llenamos la matriz de forma aleatoria
                    System.out.print(matriz[i][k]+" "); //mostramos el elemento actual de la matriz
                    
                    totalFilas[i]+=matriz[i][k];    //guardamos el valor actual en la posicion actual de i
                    totalColumnas[k]+=matriz[i][k]; //guardamos el valor actual en la posicion actual de k
    
                    if(k==i) totalDiagonales[0]+=matriz[i][k]; //guardamos el valor de la diagonal
                }
                
                totalDiagonales[1]+=matriz[i][aux]; //guardamos el valor de la diagonal invertida
                aux--;  //restamos 1 a aux para poder seguir guardando la diagonal invertida
              
                System.out.println(); //imprimimos un salto de linea para dar la estructura de una matriz
            }
            
            System.out.println("\nFilas: "); //imprimimos los valores de las filas
            for(int i=0;i<totalFilas.length;i++){
                System.out.println("Total fila "+i+" = "+totalFilas[i]);
            }
    
            System.out.println("\nColumnas: "); //imprimimos los valores de las columnas
            for(int i=0;i<totalColumnas.length;i++){
                System.out.println("Total columna "+i+" = "+totalColumnas[i]);
            }
    
            System.out.println("\nTotal diagonal = "+totalDiagonales[0]);
            System.out.println("\nTotal diagonal invertida = "+totalDiagonales[1]);
    
        }
    }
    