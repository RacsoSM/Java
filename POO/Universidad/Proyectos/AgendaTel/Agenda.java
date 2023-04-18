
/*INTEGRANTES DE EQUIPO:
 
 *SANTACRUZ MALDONADO OSCAR SAID
 *PULIDO ARMENTA BRIAN ARTURO
 
*/
package AgendaTel;

import java.util.*;

public class Agenda {
	 ArrayList<Contacto> listaContactos; //arraylist de los contactos
	Scanner sc = new Scanner (System.in); //scanner para leer datos
	
	public static void main(String[] args)
	{
		
		Agenda agenda = new Agenda(); //creamos un objeto de agenda para que pueda usar todos los metodos creados
		
		agenda.listaContactos= new ArrayList<>(); //declaramos el ArrayList como atributo de la agenda
		
			//AGREGAMOS 3 CONTACTOS A LA AGENDA POR DEFECTO
			String [] nombres = {"Oscar","Denisse","Laura"}; //creamos arreglo de nombres
			String [] apellidos = {"Santacruz","Rendon","Astorga"};//creamos arreglo de apellidos
			String [] alias = {"Inge", "Rubia", "Gorda"};//creamos arreglo de alias
			char [] sexos = {'H','M','M'};//creamos arreglo de sexos
			
			char [] tipoTel = {'m','m','o'};//creamos arreglo de tipos de telefono
			String [] clavePais = {"52","52","12"};//creamos arreglo de clave pais
			String [] telefono = {"6673017019","6671177524","4412557812"};//creamos arreglo de telefonos
			
			for (int i = 0; i < 3; i++) 
			{
				Telefono t = new Telefono(tipoTel[i],clavePais[i],telefono[i]);
				Persona p = new Persona(nombres[i],apellidos[i],sexos[i],alias[i]);
				Contacto c = new Contacto(p,t);
				agenda.listaContactos.add(c);//aï¿½adimos al contacto al arraylist
			}
			
		int opcion=0;
		boolean flag = false;
		
			while(opcion!=9)
			{
			
				try
				{
					opcion = 0;
					System.out.println("Agenda Telefonica\n\n");
					System.out.println("--- Menu principal ---\n");
					
					System.out.println("1. Imprimir todo el directorio");
					System.out.println("2. Imprimir listado");
					System.out.println("3. Agregar contacto");
					System.out.println("4. Buscar contacto");
					System.out.println("5. Eliminar contacto");
					System.out.println("6. Consultar");
					System.out.println("7. Ordenar");
					System.out.println("8. Editar contacto ");
					System.out.println("9. Salir ");
					
					if(flag == true) agenda.sc.nextLine(); //si el boolean es verdadero, arreglamos error de pegado del scanner
						System.out.print("\nIngrese una opcion: ");
						opcion = agenda.sc.nextInt();
						
						System.out.println("\n");
						flag=false;
						
								switch(opcion)
								{
									case 1: agenda.imprimirDirectorio(); break;
									case 2: agenda.imprimirListado(); break;
									case 3: agenda.agregarContacto(); break;
									case 4: agenda.busqueda(); break;
									case 5: agenda.eliminar(); break;
									case 6: agenda.consulta(); break;
									case 7: agenda.ordenar(); break;
									case 8: agenda.editar(); break; 
									case 9: System.exit(0); break;
									default: System.out.println("Por favor, ingrese una opcion valida.");break;
								}
				}
				catch(Exception e)
				{
					System.out.println("\nPor favor, ingrese una opcion valida");
					flag = true; //activamos un boolean si ya se entro alguna vez a la excepcion 	
				}
			}		
	}
		
	//METODO DEL CASO 1 : IMPRIMIR DIRECTORIO 
	public void imprimirDirectorio()
		{
			System.out.println("--- Imprimir todo el directorio ---\n\n");
			System.out.println(listaContactos.size()+" contactos\n");
			for(Contacto contacto : listaContactos)
			{
				System.out.println(contacto.toString());
			}
				
			System.out.println("Pulse ENTER para volver al menu principal.");
			sc.nextLine();
			sc.nextLine();
			limpiarPantalla();
		}
	
	//METODO DEL CASO 2 : MOSTRAR LOS CONTACTOS POR UN TIPO DE TELEFONO
	public void imprimirListado()
		{
			System.out.println("--- Imprimir listado ---\n\n");
			boolean flag = false;
			char nvoTipoTel=0;
				
			System.out.print("Ingrese el tipo de telefono (M,O,C): "); //se pide el tipo de telefono
			char tipoTelefono = sc.next().charAt(0);
			nvoTipoTel=Character.toLowerCase(tipoTelefono); //convierte el caracter a minuscula
			
			System.out.println("\n");
			for (Contacto contacto : listaContactos)
			{
			//se compara si el tipo de telefono es igual al tipo de telefono que estas buscando
				if (contacto.getTelefono().getTipoTelefono() == nvoTipoTel) 
			    {
					System.out.println(contacto.toString() + "\n");
			        flag=true;
			    }
			}	
			if(flag == false)
			{
				System.out.println("No se encontraron telefonos de tipo "+tipoTelefono);
			}
			System.out.println("Pulse ENTER para volver al menu principal.");
			sc.nextLine();
			sc.nextLine();
			limpiarPantalla();
		}
		
	//METODO DEL CASO 3 : AGREGAR CONTACTOS
	public void agregarContacto()
		{
			System.out.println("--- Agregar contacto ---\n\n");
			boolean flag=false;
			char sexo=0,nvoTipoTel=0,tipoTelefono;
			String telefono="", nombre, apellido;
			sc.nextLine();
			do{
				flag = false;
				System.out.print("Nombre: ");
				nombre = sc.nextLine();
				if (nombre == "")
				{
					flag = true;
					System.out.println("Ingrese un nombre");
				}
			}while(flag == true);
			
			do{
				flag = false;
				System.out.print("Apellido: ");
				apellido = sc.nextLine();
				if (apellido == "")
				{
					flag = true;
				    System.out.println("Ingrese un apellido");
				}
			}while(flag == true);
				    
			do{
				System.out.print("Sexo (H,M): ");
				sexo = sc.nextLine().charAt(0);
				sexo=Character.toUpperCase(sexo); //convierte el caracter a mayuscula
				if(sexo!='M' && sexo!='H') 
				{
					System.out.println("Por favor, ingrese un sexo valido");
				}
			}while (sexo!='M' && sexo!= 'H');
				    
			System.out.print("Alias: ");
			String alias = sc.nextLine();
				    
			do{
				System.out.print("Tipo de telefono (M,O,C): ");
				tipoTelefono = sc.nextLine().charAt(0);
				nvoTipoTel=Character.toLowerCase(tipoTelefono); //convierte el caracter a minuscula
				if(nvoTipoTel!='m' && nvoTipoTel!= 'o' && nvoTipoTel != 'c') 
				{
					System.out.println("Por favor, ingrese un tipo valido");
				}
			}while (nvoTipoTel!='m' && nvoTipoTel!= 'o' && nvoTipoTel != 'c');
				    
			String clavePais = "";
			char [] digitos = {'1','2','3','4','5','6','7','8','9','0'};
			int contadorDigitos = 0;
			do{
				flag = false;
				clavePais = "";
				contadorDigitos = 0;
				System.out.print("Clave de pais: ");
				clavePais = sc.nextLine();
				if (clavePais.length()<=2)
				{
					for (int i = 0; i < clavePais.length(); i++) 
				    {
						if (!Character.isDigit(clavePais.charAt(i)))
						{
							flag = true;
						}
					}
				}
				
				if (clavePais.length() > 2 || clavePais=="") 
				{
					flag = true;
				}
				if ( flag == true)
				{
					System.out.println("Ingrese una clave de pais valida");
				}
			}while(flag == true);
				    
				     
			do{
				flag=false;
				System.out.print("Numero de telefono: ");
				telefono = sc.nextLine();
						 
				for (int i = 0; i < telefono.length(); i++) 
				{
					if(!Character.isDigit(telefono.charAt(i))) 
					{
						flag=true;
					}
				}
						 
				if(telefono.length()!=10)
				{
					flag=true;
				}
				for (Contacto c: listaContactos) 
				{
					if(c.getTelefono().getNumeroTelefonico().equalsIgnoreCase(telefono)) 
					{
						flag=true;
					}
				}
			if(flag==true) 
			{
				System.out.println("Por favor, ingrese un numero de telefono valido");
			}
			}while(flag==true);
				
				  
			Persona p = new Persona(nombre, apellido, sexo, alias);
			Telefono t = new Telefono(nvoTipoTel, clavePais, telefono);
			Contacto c = new Contacto(p, t);
			listaContactos.add(c);
			
			System.out.println("\nEl contacto se agrego con exito.\n\n");
			System.out.println("Pulse ENTER para volver al menu principal.");
			sc.nextLine();
			limpiarPantalla();		    
		}
		
	//METODO DEL CASO 4 : BUSQUEDA DE USUARIOS
	public void busqueda()
	{
			System.out.println("--- Buscar un contacto ---\n\n");
			String nombreUsuario,nombreContacto,aliasContacto,mensaje;
			int coincidencias=0;
			
			System.out.print("Ingrese el nombre/alias que desea buscar: "); sc.nextLine(); //pedimos el nombre
			nombreUsuario= sc.nextLine();
			
			for (Contacto contacto : listaContactos) 
			{
				
					nombreContacto=contacto.getPersona().getNombre(); 
					aliasContacto=contacto.getPersona().getAlias();
					
					if(nombreContacto.equalsIgnoreCase(nombreUsuario)||aliasContacto.equalsIgnoreCase(nombreUsuario))
					{
						coincidencias++;
					}
			
			}
			mensaje = (coincidencias!=0)? "\nSe encontraron "+coincidencias+" coincidencias para su busqueda.":
				"\nNo se encontraron coincidencias para su busqueda, por favor verifique que los nombres esten escritos correctamente.";
			
			System.out.println(mensaje);
			
			System.out.println("\n\nPulse ENTER para volver al menu principal.");
			sc.nextLine();
			limpiarPantalla();
		}
		
	//METODO DEL CASO 5 : ELIMINAR UN CONTACTO
	public void eliminar(){ 
			System.out.println("--- Eliminar un contacto ---\n\n");
			String nombre,apellido;
			int opcionEliminar = 0;
			boolean flag=false;
			
			System.out.println("Ingrese el nombre y apellido de la persona que desea eliminar ");//pedimos los datos necesarios
			System.out.print("Nombre: "); 
			sc.nextLine();
			nombre = sc.nextLine(); //scanner se queda pegado
			System.out.print("Apellido: "); apellido = sc.nextLine();
			
			for (Contacto contacto : listaContactos) 
			{
				//hay que mostrar los datos del contacto 
				
				if(contacto.getPersona().getNombre().equalsIgnoreCase(nombre) && contacto.getPersona().getApellido().equalsIgnoreCase(apellido))
				{					
					
					System.out.println("¿Es este el contacto que desea eliminar? ");
					System.out.println(contacto.toString());
					System.out.println("1)Si \n2)No");
					opcionEliminar = sc.nextInt();
					if (opcionEliminar == 1)
					{
						listaContactos.remove(contacto);
						System.out.println("El contacto ha sido eliminado");
						sc.nextLine();
						System.out.println("\n\nPulse ENTER para volver al menu principal.");
						sc.nextLine();
						limpiarPantalla();
						flag = true;
						break;
					}
					else
					{
						System.out.println("No se ha eliminado ningun contacto");
						sc.nextLine();
						System.out.println("\n\nPulse ENTER para continuar.");
						sc.nextLine();
						flag = true;
					}
				}
			}
			if(flag == false) //si nuestro booleano es falso, mostramos un mensaje de error
			{
				System.out.println("\n\nNo se encontro a "+nombre+ " "+apellido+", por favor verifique que este sea el nombre correcto y vuelva a intentarlo.");
				
				System.out.println("\n\nPulse ENTER para volver al menu principal.");
				sc.nextLine();
				limpiarPantalla();
			}
		}
		
	//METODO DEL CASO 6 : CONSULTAR LOS DATOS DE UN USUARIO
	public void consulta(){ 
		System.out.println("--- Consultar un contacto ---\n\n");
		String nombreUsuario,nombreContacto,aliasContacto;
		ArrayList<Contacto> listaBusqueda = new ArrayList<Contacto>();//creamos la listaBusqueda de forma local
		
		System.out.print("Ingrese el nombre/alias que desea consultar: "); sc.nextLine(); //pedimos el nombre
		nombreUsuario= sc.nextLine();
		System.out.println();//error del scanner que se queda pegado
		
		for (Contacto contacto : listaContactos) 
		{
			nombreContacto=contacto.getPersona().getNombre(); 
			aliasContacto=contacto.getPersona().getAlias();
			
			if(nombreContacto.equalsIgnoreCase(nombreUsuario)||aliasContacto.equalsIgnoreCase(nombreUsuario)) //si el nombre coincide, o la parte del nombre coincide
			{ 
				listaBusqueda.add(contacto);//lo aï¿½adimos al arraylist de la busqueda
			}
		}
		if(listaBusqueda.size()!=0) //si el arraylist de la busqueda tiene algo, se muestra
		{ 
			for (Contacto contacto : listaBusqueda) 
			{
				System.out.println(contacto.toString());//mostramos el arraylist de busqueda
			}	
		}
		else  //caso contrario, mostramos un mensaje de que no se encontraron coincidencias
		{
			System.out.println("No se encontraron coincidencias con su busqueda.");
		}
		System.out.println("Pulse ENTER para volver al menu principal.");
		sc.nextLine();
		limpiarPantalla();	
	}
	
	//METODO DEL CASO 7: ORDENAR POR NOMBRES
	public void ordenar(){
		System.out.println("--- Ordenar el directorio ---\n\n");
		
		Collections.sort(listaContactos, new ComparadorContactos ());//esta linea ordena los nombres comparandolos uno por uno,
		//nosotros solamente le pasamos la lista de objetos y la clase con el nombre que contiene el metodo para compararlos
		
		System.out.println("El directorio se ordeno por nombre correctamente.\n\n");
		for (Contacto contacto : listaContactos) 
		{
			System.out.println(contacto.toString());//mostramos el arraylist ya ordenado por el nombre
		}	
		
		System.out.println("Pulse ENTER para volver al menu principal.");
		sc.nextLine();
		sc.nextLine();
		limpiarPantalla();
	}
	
	//METODO DEL CASO 8: EDITAR UN CONTACTO
	public void editar(){
		System.out.println("--- Editar contacto ---");
		String tel="",nvoNombre="",nvaApellido="",nvoAlias="",nvoTel="";
		int op=0;
		boolean flag=false;
		
		System.out.print("\nIngrese el numero de telefono del contacto a editar: ");
		sc.nextLine();
		tel=sc.nextLine();
		
		for (Contacto c : listaContactos) 
		{
			if(c.getTelefono().getNumeroTelefonico().equalsIgnoreCase(tel))
			{
				flag=true;
				System.out.println("\nEl contacto a editar es: \n"+c.toString());
			
				System.out.println("\tOpciones");
				System.out.println("1. Nombre");
				System.out.println("2. Apellido");
				System.out.println("3. Alias");
				System.out.println("4. Numero Telefonico");
				
				System.out.print("\n¿Que dato desea editar? ");
				op=sc.nextInt();
				sc.nextLine();
					switch(op)
					{
					
						case 1: System.out.print("Ingrese el nuevo nombre: ");
								nvoNombre = sc.nextLine();
								c.getPersona().setNombre(nvoNombre); break;
								
						case 2: System.out.print("Ingrese el nuevo apellido: ");
								nvaApellido = sc.nextLine();
								c.getPersona().setApellido(nvaApellido); break;
								
						case 3: System.out.print("Ingrese el nuevo alias: ");
								nvoAlias = sc.nextLine();
								c.getPersona().setAlias(nvoAlias); break;
								
						case 4:	System.out.print("Ingrese el nuevo numero telefonico: ");
								nvoTel = sc.nextLine();
								c.getTelefono().setNumeroTelefonico(nvoTel); break;
								
						default: System.out.print("Opcion invalida");
						
					}
					System.out.println("El cambio se realizo con exito.");
			}
		}
	
		if(flag==false)
			System.out.println("No se encontraron contactos con el numero de telefono "+tel);
		
		System.out.println("\nPulse ENTER para volver al menu principal.");
		sc.nextLine();
		limpiarPantalla();
	}

	//metodo que simula limpiar pantalla pero solo da muchos saltos de linea para mostrar la consola vacia
	public void limpiarPantalla(){ 
		for (int i = 0; i < 25; i++) 
		{
			System.out.println();
		}
	}
	
}
