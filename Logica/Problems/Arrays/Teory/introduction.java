public class introduction {

    public static void main (String[] args){

     
  String DVD [] = new String [5];

  DVD [1] = "Brad Pitt";
  DVD [3] = "Guillermo del toro";
  DVD [4] = "Enrique Peña Nieto";


  System.out.println(DVD[1]);
  System.out.println(DVD[2]);
  System.out.println(DVD[3]);
  System.out.println(DVD[4]);

  System.out.println("\n\n\n");
  // Create a new array with a capacity of 6.
int[] array = new int[6];

// Current length is 0, because it has 0 elements.
int length = 0;

// Add 3 items into it.
for (int i = 0; i < 3; i++) {
    array[i] = i * i;
    // Each time we add an element, the length goes up by one.
    length++;
}

System.out.println("The Array has a capacity of " + array.length);
System.out.println("The Array has a length of " + length);
  
    }
    
}
