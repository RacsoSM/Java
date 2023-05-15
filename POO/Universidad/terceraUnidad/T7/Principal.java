package T7;

import java.util.ArrayList;
import java.util.Scanner;



public class Principal {
	  static ArrayList<Contacto> listaContactos;
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); //scanner para leer datos
		 Principal.listaContactos = new ArrayList <Contacto>();
		
		String nombres []= {"Oscar","Martin","Laura","Jose"}; 
		String apellidos [] = {"Martinez","Quevedo","Gonzales","Monreal"};
		char sexos [] = {'H','H','M','H'};
		String emails [] = {"oscarmartinez@gmail.com","martinquevedo@gmail.com","lauragonzales@gmail.com","josemonreal@gmail.com"};
		
		char tiposTel [] = {'M','C','C','M','O','O','M'};
		String clavesPais[] = {"+55","+12","+67","+10","+99","+40","+10"};
		String telefonos[] = {"66710123010","1234567890","9912315123","8811230123","55690112341","66150192031","66701230123",};
		
		//creando contactos
		for (int i = 0; i < 4; i++) {
			Contacto c= new Contacto (nombres[i],apellidos[i],sexos[i],emails[i]);
			listaContactos.add(c);
			Telefono tel = new Telefono(tiposTel[i],clavesPais[i],telefonos[i]);
			c.agregarTel(tel);
		}
		
		
		int opcion=0;
		boolean flag=false;
		
		while(opcion!=7)
		{
		
			try
			{
				opcion = 0;
				System.out.println("Agenda Telefonica\n\n");
				System.out.println("--- Menu principal ---\n");
				
				System.out.println("\n1. Agregar contacto");
				
				System.out.println("2. Eliminar contacto");
				System.out.println("3. Listar contactos");
				System.out.println("4. Mostrar lista contactos");
				System.out.println("5. Agregar telefono");
				System.out.println("6. Eliminar telefono");
				System.out.println("7. Salir ");
				
				System.out.println("\nIngrese una opcion: ");
				if(flag == true)  //si el boolean es verdadero, arreglamos error de pegado del scanner
					System.out.print("\nIngrese una opcion: ");
					opcion = sc.nextInt();
					sc.nextLine();
					
					System.out.println("\n");
					flag=false;
					
							switch(opcion)
							{
								case 1: System.out.println("Ingrese los datos del contacto que desea agregar: "); 
										System.out.println("Nombre: ");
										String nombre;  nombre=sc.nextLine();
										System.out.println("Apellido: ");
										String apellido; apellido=sc.nextLine();
										System.out.println("Sexo: ");
										char sexo; sexo=sc.nextLine().charAt(0);
										System.out.println("Correo electronico: ");
										String email; email=sc.nextLine();
										
										Contacto c = new Contacto (nombre,apellido,sexo,email);
										listaContactos.add(c);
										System.out.println("\n");
										break;
										
								case 2: 
										for (int i = 0; i < listaContactos.size(); i++) {
											System.out.println((i+1)+"  "+listaContactos.get(i).toString());
										}
										int contactoEliminar;
										System.out.println("¿Que contacto desea eliminar?");
										contactoEliminar = sc.nextInt();
										listaContactos.remove(contactoEliminar-1);
										System.out.println("\n");
										break;
										
								case 3: System.out.println("Elija como desea listar los contactos (M,O,C): ");
										char listarContactos; listarContactos = sc.nextLine().charAt(0);
										
										for (int i = 0; i < listaContactos.size(); i++) {
											
											for (int j = 0; j < listaContactos.get(i).telefonos.size(); j++) {
												
												if(listaContactos.get(i).telefonos.get(j).tipoTelefono == listarContactos){
													System.out.println(listaContactos.get(i).nombre+" "+listaContactos.get(i).telefonos.get(j).toString());
												}
												
											}
										}
										break;
										
								case 4: System.out.println();
										for (Contacto con : listaContactos) {
										System.out.println(con.toString());
										}
										System.out.println("\n");
										break;
										
								case 5: System.out.println("A que contacto le desea agregar un telefono?");
										for (int i = 0; i < listaContactos.size(); i++) {
											System.out.println((i+1)+"  "+listaContactos.get(i).toString());
										}
										int contactoAgregarTelefono;
										System.out.println("Ingrese su opcion");
										contactoAgregarTelefono = sc.nextInt();
										sc.nextLine();
										
										System.out.println("Ingrese el tipo de telefono a agregar (M,O,C): ");
										char tipoTel; tipoTel = sc.nextLine().charAt(0);
										System.out.println("Ingrese la clave de pais del telefono a agregar: ");
										String clavePais; clavePais = sc.nextLine();
										System.out.println("Ingrese el numero telefonico a agregar: ");
										String numeroTel; numeroTel = sc.nextLine();
										
										Telefono t = new Telefono (tipoTel,clavePais,numeroTel);
										listaContactos.get(contactoAgregarTelefono-1).agregarTel(t);
										System.out.println("\n");
										break;
										
								case 6: System.out.println("A que contacto le desea eliminar un telefono?");
										for (int i = 0; i < listaContactos.size(); i++) {
											System.out.println((i+1)+"  "+listaContactos.get(i).toString());
										}
										int contactoEliminarTelefono;
										System.out.println("Ingrese su opcion");
										contactoEliminarTelefono = sc.nextInt();
										sc.nextLine();
										
										System.out.println("\nEl contacto posee los siguientes telefonos\n\n");
										
										listaContactos.get(contactoEliminarTelefono-1).mostrarTelefonos();
										
										System.out.println("\nIngrese el numero de telefono que desea eliminar");
										int numeroEliminar;	numeroEliminar = sc.nextInt();
										Telefono telefonoEliminar = listaContactos.get(contactoEliminarTelefono-1).telefonos.get(numeroEliminar-1);
										listaContactos.get(contactoEliminarTelefono-1).eliminarTel(telefonoEliminar);
										System.out.println("\n");
										
										break;
									default: System.out.println("Por favor, ingrese una opcion valida.");
									break;
								}
								
								
								
							
			}
			catch(Exception e)
			{
				System.out.println("\nPor favor, ingrese una opcion valida");
				flag = true; //activamos un boolean si ya se entro alguna vez a la excepcion 	
			}
		}		
		
		
		
		//System.out.println(listaContactos);
	}
}
