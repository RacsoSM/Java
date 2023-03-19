package Directorio;

import java.util.*;

public class Agenda {
	static ArrayList<Contacto> listaContactos = new ArrayList<Contacto>(); //arraylist de los contactos
	static Scanner sc = new Scanner (System.in); //scanner para leer datos
	
	public static void main(String[] args){
		
			//AGREGAMOS 3 CONTACTOS A LA AGENDA POR DEFECTO
			String [] nombres = {"Oscar","Denisse","Laura"}; //creamos arreglo de nombres
			String [] apellidos = {"Santacruz","Rendón","Astorga"};//creamos arreglo de apellidos
			String [] alias = {"Inge oscar", "Rubia", "Gorda"};//creamos arreglo de alias
			char [] sexos = {'H','M','M'};//creamos arreglo de sexos
			
			char [] tipoTel = {'M','M','O'};//creamos arreglo de tipos de telefono
			String [] clavePais = {"+52","+52","+12"};//creamos arreglo de clave pais
			String [] telefono = {"6673017019","6671177524","4412557812"};//creamos arreglo de telefonos
			
			for (int i = 0; i < 3; i++) {
				Telefono t = new Telefono(tipoTel[i],clavePais[i],telefono[i]);
				Persona p = new Persona(nombres[i],apellidos[i],sexos[i],alias[i]);
				Contacto c = new Contacto(p,t);
				listaContactos.add(c);//añadimos al contacto al arraylist
			}
		
			
			
		int opcion=0;
		boolean flag = false;
		
			while(opcion!=8){
				
				try{
					opcion = 0;
					System.out.println("Agenda Telefónica\n\n");
					System.out.println("--- Menú principal ---\n");
					
					System.out.println("1. Imprimir todo el directorio");
					System.out.println("2. Imprimir listado");
					System.out.println("3. Agregar una persona");
					System.out.println("4. Buscar una persona");
					System.out.println("5. Eliminar una persona");
					System.out.println("6. Consultar");
					System.out.println("7. Ordenar");
					System.out.println("8. Salir ");
					
					if(flag == true) sc.nextLine(); //si el boolean es verdadero, arreglamos error de pegado del scanner
						System.out.print("\nIngrese una opción ");
						
						opcion = sc.nextInt();
						
						System.out.println("\n");
							
								switch(opcion){
									case 1: imprimirDirectorio(); break;
									case 2: imprimirListado(); break;
									case 3: agregarContacto(); break;
									case 4: busqueda(); break;
									case 5: eliminar(); break;
									case 6: consulta(); break;
									case 7: ordenar(); break;
									case 8: System.exit(0); break;
									default: System.out.println("Por favor, ingrese una opción valida.");break;
								}
				}
				catch(Exception e){
					System.out.println("Por favor, ingrese una opción valida");
					flag = true; //activamos un boolean si ya se entro alguna vez a la excepcion 
					limpiarPantalla();
				}
					
			
			}
			
	}
		
	
	//METODO DEL CASO 1 : IMPRIMIR DIRECTORIO 
		public static void imprimirDirectorio()
		{
			System.out.println("--- Imprimir todo el directorio ---\n\n");
			System.out.println(listaContactos.size()+" contactos\n");
				for(Contacto contacto : listaContactos)
				{
					System.out.println(contacto.toString());
				}
				
				System.out.println("Pulse ENTER para volver al menú principal.");
				sc.nextLine();
				sc.nextLine();
				limpiarPantalla();
		}
	
	//METODO DEL CASO 2 : MOSTRAR LOS CONTACTOS POR UN TIPO DE TELEFONO
		public static void imprimirListado()
		{
			System.out.println("--- Imprimir listado ---\n\n");
			boolean flag = false;
					//se pide el tipo de telefono
			System.out.print("Ingrese el tipo de telefono (M,O,C): ");
			char tipoTelefono = sc.next().charAt(0);
			System.out.println("\n");
				for (Contacto contacto : listaContactos)
				{
				//se compara si el tipo de telefono es igual al tipo de telefono que estas buscando
			      if (contacto.getTelefono().getTipoTelefono() == tipoTelefono) 
			      	{
			          System.out.println(contacto.toString() + "\n");
			          flag=true;
			      	}
			    }	
				if(flag == false){
					System.out.println("No se encontraron telefonos de tipo "+tipoTelefono);
				}
				
				
				System.out.println("Pulse ENTER para volver al menú principal.");
				sc.nextLine();
				sc.nextLine();
				limpiarPantalla();
		}
		
	//METODO DEL CASO 3 : AGREGAR CONTACTOS
		public static void agregarContacto()
		{
			System.out.println("--- Agregar contacto ---\n\n");
			
				    sc.nextLine();
				    System.out.print("Nombre: ");
				    String nombre = sc.nextLine();
				    System.out.print("Apellido: ");
				    String apellido = sc.nextLine();
				    System.out.print("Sexo (H,M): ");
				    char sexo = sc.nextLine().charAt(0);
				    System.out.print("Alias: ");
				    String alias = sc.nextLine();
				    System.out.print("Tipo de teléfono (M,O,C): ");
				    char tipoTelefono = sc.nextLine().charAt(0);
				    System.out.print("Clave de país: ");
				    String clavePais = sc.nextLine();
				    System.out.print("Número de teléfono: ");
				    String telefono = sc.nextLine();
				    
				    Persona p = new Persona(nombre, apellido, sexo, alias);
				    Telefono t = new Telefono(tipoTelefono, clavePais, telefono);
				    Contacto c = new Contacto(p, t);
				    listaContactos.add(c);
				    
				    System.out.println("\nEl contacto se agregó con exito.\n\n");
				    
				    System.out.println("Pulse ENTER para volver al menú principal.");
					sc.nextLine();
					limpiarPantalla();
		}
		
		
	//METODO DEL CASO 4 : BUSQUEDA DE USUARIOS
		public static void busqueda(){
			System.out.println("--- Buscar un contacto ---\n\n");
			String nombreUsuario,nombreContacto,aliasContacto,mensaje;
			int coincidencias=0;
			
			System.out.print("Ingrese el nombre/alias que desea buscar: "); sc.nextLine(); //pedimos el nombre
			nombreUsuario= sc.nextLine();
			
			for (Contacto contacto : listaContactos) {
				
					nombreContacto=contacto.getPersona().getNombre(); 
					aliasContacto=contacto.getPersona().getAlias();
					
					if(nombreContacto.equalsIgnoreCase(nombreUsuario)||aliasContacto.equalsIgnoreCase(nombreUsuario)){
						coincidencias++;
					}
			
			}
			mensaje = (coincidencias!=0)? "\nSe encontraron "+coincidencias+" coincidencias para su busqueda.":
				"\nNo se encontraron coincidencias para su busqueda, por favor verifique que los nombres esten escritos correctamente.";
			
			System.out.println(mensaje);
			
			System.out.println("\n\nPulse ENTER para volver al menú principal.");
			sc.nextLine();
			limpiarPantalla();
		}
		
		
	//METODO DEL CASO 5 : ELIMINAR UN USUARIO
		public static void eliminar(){ 
			System.out.println("--- Eliminar un contacto ---\n\n");
			String nombre,apellido;
			boolean flag=false;
			
			System.out.println("Ingrese el nombre y apellido de la persona que desea eliminar ");//pedimos los datos necesarios
			System.out.print("Nombre: "); sc.nextLine(); nombre = sc.nextLine(); //scanner se queda pegado
			System.out.print("Apellido: "); apellido = sc.nextLine();
			
			for (Contacto contacto : listaContactos) {
				//si el nombre del contacto es igual al que proporciono el usuario y a la vez el apellido tambien es igual, eliminamos el contacto
				if(contacto.getPersona().getNombre().equalsIgnoreCase(nombre) && contacto.getPersona().getApellido().equalsIgnoreCase(apellido)){
					listaContactos.remove(contacto);//eliminamos el contacto
					System.out.println("\n\nSe eliminó con exito a "+nombre+" "+apellido+".");
					flag = true; //activamos un booleano para saber que si se ejecutó con exito 
					break;
				}
			}
			if(flag == false) //si nuestro booleano es falso, mostramos un mensaje de error
			System.out.println("\n\nNo se encontró a "+nombre+ " "+apellido+", por favor verifique que este sea el nombre correcto y vuelva a intentarlo.");
			
			System.out.println("\n\nPulse ENTER para volver al menú principal.");
			sc.nextLine();
			limpiarPantalla();
		}
		
	
		
	//METODO DEL CASO 6 : CONSULTAR LOS DATOS DE UN USUARIO
	public static void consulta(){ 
		System.out.println("--- Consultar un contacto ---\n\n");
		String nombreUsuario,nombreContacto,aliasContacto;
		ArrayList<Contacto> listaBusqueda = new ArrayList<Contacto>();//creamos la listaBusqueda de forma local
		
		System.out.print("Ingrese el nombre/alias que desea consultar: "); sc.nextLine(); //pedimos el nombre
		nombreUsuario= sc.nextLine();
		System.out.println();//error del scanner que se queda pegado
		
		for (Contacto contacto : listaContactos) {
			
			
				nombreContacto=contacto.getPersona().getNombre(); 
				aliasContacto=contacto.getPersona().getAlias();
				
					if(nombreContacto.equalsIgnoreCase(nombreUsuario)||aliasContacto.equalsIgnoreCase(nombreUsuario)){ //si el nombre coincide, o la parte del nombre coincide
						listaBusqueda.add(contacto);//lo añadimos al arraylist de la busqueda
					}
			
			
		}
		if(listaBusqueda.size()!=0){ //si el arraylist de la busqueda tiene algo, se muestra
			for (Contacto contacto : listaBusqueda) {
				System.out.println(contacto.toString());//mostramos el arraylist de busqueda
			}	
		}
		else{//caso contrario, mostramos un mensaje de que no se encontraron coincidencias
			System.out.println("No se encontraron coincidencias con su busqueda.");
		}
		
		System.out.println("Pulse ENTER para volver al menú principal.");
		sc.nextLine();
		limpiarPantalla();
		
	}
	
	//METODO DEL CASO 7: ORDENAR POR NOMBRES
	public static void ordenar(){
		System.out.println("--- Ordenar el directorio ---\n\n");
		
		Collections.sort(listaContactos, new ComparadorContactos ());//esta linea ordena los nombres comparandolos uno por uno,
		//nosotros solamente le pasamos la lista de objetos y la clase con el nombre que contiene el metodo para compararlos
		
		System.out.println("El directorio se ordenó por nombre correctamente.\n\n");
		for (Contacto contacto : listaContactos) {
			System.out.println(contacto.toString());//mostramos el arraylist ya ordenado por el nombre
		}	
		
		
		System.out.println("Pulse ENTER para volver al menú principal.");
		sc.nextLine();
		sc.nextLine();
		limpiarPantalla();
	}
	
	
	
	//metodo que simula limpiar pantalla pero solo da muchos saltos de linea para mostrar la consola vacia
	public static void limpiarPantalla(){ 
		for (int i = 0; i < 25; i++) {
			System.out.println();
		}
	}
}
