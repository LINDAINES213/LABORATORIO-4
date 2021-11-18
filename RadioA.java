import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
* Clase RadioA para mostrar los métodos y funcionamiento del radio para autos clase A.
* @author Mario Guerra y Linda Jiménez
* @version 16/11/2021
* @see RadioA
*/

public class RadioA implements Radio{

    /**
	* Constructor para la clase RadioA.
	*/
    Scanner scan = new Scanner(System.in);
    private String llamadaU;
    private int tarjeta;
    private int opcion = 0;
    private String contactos;
    /**
	* Fin del constructor de la clase RadioA.
	*/

    public RadioA(){}

    public String getLlamadaU(){
        return llamadaU;
    }

    public int getTarjeta(){
        return tarjeta;
    }

    public void setTarjeta(int tarjeta){
        this.tarjeta = tarjeta;
    }

    public void setLlamadaU(String llamadaU){
        this.llamadaU = llamadaU;
    }
    public void Productividad(){
        //Persistencia.
    }

    public void Radios(int interruptor, int volumen, int banda, int emisora){
        System.out.println("\nLa radio esta apagada, presione 1 para encender la radio.\n"); //Se pide al usuario que encienda la radio.
         interruptor = scan.nextInt();
         if (interruptor == 1){
             System.out.println("\nLa radio se ha encendido"); //Mensaje de confirmación de la radio encendida.
            }
         System.out.println("\nBienvenido. Que desea hacer?\n1. Volumen de la radio. \n2. AM/FM. \n3. Cambio de estacion. \n4. Agregar nueva emisora. \n5. Cargar emisora. \n6. Reproducir musica. \n7. Usar telefono. \n8. Ver tarjetas. \n9. Apagar radio.\n");
         opcion = scan.nextInt(); //Menú de opciones para el uso de la radio.
         if (opcion == 1){ //Volumen
             System.out.println("\nDesea subir o bajar el volumen? \n1. Subir. \n2. Bajar."); //Baja o sube el volumen de la radio.
             opcion = scan.nextInt();
             if (opcion == 1){
                volumen = volumen + 1;
                 System.out.println("\nVolumen: "+ volumen); //Muestra el volumen aumentado.
             }
             else if (opcion == 2){
                volumen = volumen - 1;
                 System.out.println("\nVolumen: "+ volumen); //Muestra el volumen disminuido.
             }
             else{
                 System.out.println("\nIngrese una opcion valida.");
             }
            }
         if (opcion == 2){ //Cambia de banda.
            System.out.println("\nDesea cambiar la banda a AM o FM? \n1. AM. \n2. FM.");
            banda = scan.nextInt();
            if (banda == 1){
                System.out.println("\nRadio configurada a AM."); //Radio AM configurada.
            }
            else if (banda == 2){
                System.out.println("\nRadio configurada a FM."); //Radio FM configurada.
            }
            else{
                System.out.println("\nIngrese una opcion valida.");
            }
        }
         if (opcion == 3){

            Scanner sc;
            Scanner sn = new Scanner(System.in);
            String contenido = " ";
            boolean contains = false;
            String nombreofrecuencia;
    
            try {
            
                sc = new Scanner(new File("Emisoras.txt"));
                System.out.print("Ingresa el nombre, o la frecuencia de la emisora que deseas buscar: ");
                nombreofrecuencia = sn.nextLine();

                FileReader leer = new FileReader("Emisoras.txt");
                BufferedReader emisoras = new BufferedReader(leer);

                while(sc.hasNext()){   
                    contenido = sc.nextLine();
                    if (contenido.contains(nombreofrecuencia)) {        
                        System.out.println("\n" + contenido);
                        contenido = sc.nextLine(); 
                        System.out.println(contenido);
                        contenido = sc.nextLine(); 
                        contains = true;
                    }
                } if (!contains){

                    System.out.println("\nNo hay ninguna emisora con ese nombre o frecuencia, debe agregarla\n");
                }

            } catch (NoSuchElementException e) {
                System.out.println("\nEMISORA CAMBIADA\n");

            } catch (Exception e) { 
                System.out.println("\nERROR EN LA CARGA DE EMISORAS\n");
            }
         }
         if (opcion == 4){

            File Emisoras = new File("Emisoras.txt");
            Scanner sn = new Scanner(System.in);
            String nombre;
            String frecuencia;

            try {
                FileWriter fw = new FileWriter(Emisoras, true);
                System.out.println("Ingrese el nombre de la emisora: ");
                nombre = sn.nextLine();
                fw.write("\nNOMBRE DE LA EMISORA: " + nombre + "\n");
                System.out.println("Ingrese la frecuencia de la emisora: ");
                frecuencia = sn.nextLine();
                fw.write("FRECUENCIA: " + frecuencia + " FM\n");
                fw.close();
                System.out.println("Emisora Agregada");
            } catch (IOException e) {
                System.out.println("NO FUE POSIBLE AGREGAR LA EMISORA! INTENTE DE NUEVO");
            }
        }
         if (opcion == 5){
            System.out.println("\nEmisora cargada."); //Persistencia.
        }
        if (opcion == 6){
            Reproduccion(); //Método de reproducción de música.
        }
        if (opcion == 7){
            Telefono(); //Método de llamadas telefónicas.
        }
        if (opcion == 8){
            Productividad(); //Método de función específica.
        }
        if (opcion == 9){
            System.out.println("\nRadio apagandose."); //Termina el programa.
        }
        else{
            System.out.println("\nElija una opcion que corresponda a las indicadas."); //Pide una opción correcta.
        }
    }

    public void Reproduccion(){
        System.out.println("Que desea hacer? \n1. Seleccionar lista de reproduccion. \n2. Cambio de canciones. \n3. Ver datos de canción.");
        opcion = scan.nextInt(); //Menú de reproducción de música.
        if (opcion == 1){

            System.out.println("\nSeleccionando lista de reproduccion..."); 
            File Emisoras = new File("Canciones.txt");
            Scanner sn = new Scanner(System.in);
            String nombre;
            String artista;

            try {
                FileWriter fw = new FileWriter(Emisoras, true);
                System.out.println("Ingrese el nombre de la cancion: ");
                nombre = sn.nextLine();
                fw.write("\nNOMBRE DE LA CANCION: " + nombre + "\n");
                System.out.println("Ingrese el artista de la cancion: ");
                artista = sn.nextLine();
                fw.write("ARTISTA: " + artista + " FM\n");
                fw.close();
                System.out.println("Cancion Agregada");
            } catch (IOException e) {
                System.out.println("NO FUE POSIBLE AGREGAR LA CANCION! INTENTE DE NUEVO");
            }
        }
        if (opcion == 2){
            Scanner sc;
            Scanner sn = new Scanner(System.in);
            String contenido = " ";
            boolean contains = false;
            String datos;
    
            try {
            
                sc = new Scanner(new File("Canciones.txt"));
                System.out.print("Ingresa el nombre de la cancion que deseas buscar: ");
                datos = sn.nextLine();

                FileReader leer = new FileReader("Cabciones.txt");
                BufferedReader canciones = new BufferedReader(leer);

                while(sc.hasNext()){   
                    contenido = sc.nextLine();
                    if (contenido.contains(datos)) {        
                        System.out.println("\n" + contenido);
                        contenido = sc.nextLine(); 
                        System.out.println(contenido);
                        contenido = sc.nextLine(); 
                        contains = true;
                    }
                } if (!contains){

                    System.out.println("\nNo hay ninguna cancion con ese nombre, debe agregarla\n");
                }

            } catch (NoSuchElementException e) {
                System.out.println("\nCANCION CAMBIADA\n");

            } catch (Exception e) { 
                System.out.println("\nERROR EN LA CARGA DE CANCIONES\n");
            }
        }
        if (opcion == 3){
            Scanner sc;
            Scanner sn = new Scanner(System.in);
            String contenido = " ";
            boolean contains = false;
            String datos;
    
            try {
            
                sc = new Scanner(new File("Canciones.txt"));
                System.out.print("Ingresa el nombre de la cancion que deseas buscar: ");
                datos = sn.nextLine();

                FileReader leer = new FileReader("Canciones.txt");
                BufferedReader canciones = new BufferedReader(leer);

                while(sc.hasNext()){   
                    contenido = sc.nextLine();
                    if (contenido.contains(datos)) {        
                        System.out.println("\n" + contenido);
                        contenido = sc.nextLine(); 
                        System.out.println(contenido);
                        contenido = sc.nextLine(); 
                        contains = true;
                    }
                } if (!contains){

                    System.out.println("\nNo hay ninguna cancion con ese nombre, debe agregarla\n");
                }

            } catch (NoSuchElementException e) {
                System.out.println("\nCANCION CAMBIADA\n");

            } catch (Exception e) { 
                System.out.println("\nERROR EN LA CARGA DE CANCIONES\n");
            }
        }
        else{
            System.out.println("\nElija una opcion que corresponda a las indicadas"); //Pide una opción correcta.
        }
    }

    public void Telefono(){
        System.out.println("\nQue desea hacer? \n1. Conectar el celular. \n2. Agenda de contactos. \n3. Llamar contacto. \n4. Llamar ultimo contacto.");
        opcion = scan.nextInt(); //Menú de llamadas telefónicas.
        if (opcion == 1){
            System.out.println("\nEl telefono esta apagado, presione 1 para encender el telefono."); //Enciende el teléfono.
            int celular = scan.nextInt();
            if (celular == 1){
                System.out.println("\nEl telefono se ha encendido"); //Mensaje de confirmación.
            }
        }
        if (opcion == 2){
            System.out.println("\nMostrando contactos..."+ contactos); 
            String contenido = "";

            try {
                //Creamos un archivo FileReader que obtiene lo que tenga el archivo
                FileReader leer = new FileReader("Contactos.txt");

                //El contenido de lector se guarda en un BufferedReader
                BufferedReader contactos = new BufferedReader(leer);

                //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
                while((contenido = contactos.readLine()) != null) {
                System.out.println(contenido);
                }   
            } catch(Exception e) { 
                System.out.println("ERROR EN LA CARGA DE CONTACTOS");
            }
        }
        if (opcion == 3){
            Scanner sc;
            Scanner sn = new Scanner(System.in);
            String contenido = " ";
            boolean contains = false;
            String datos;
    
            try {
            
                sc = new Scanner(new File("Contactos.txt"));
                System.out.print("Ingresa el nombre del contacto a llamar: ");
                datos = sn.nextLine();

                FileReader leer = new FileReader("Contactos.txt");
                BufferedReader canciones = new BufferedReader(leer);

                while(sc.hasNext()){   
                    contenido = sc.nextLine();
                    if (contenido.contains(datos)) {        
                        System.out.println("\n" + contenido);
                        contenido = sc.nextLine(); 
                        System.out.println(contenido);
                        contenido = sc.nextLine(); 
                        contains = true;
                    }
                } if (!contains){

                    System.out.println("\nNo hay ningun contacto con ese nombre, debe agregarla\n");
                }

            } catch (NoSuchElementException e) {
                System.out.println("\nLLAMANDO...\n");

            } catch (Exception e) { 
                System.out.println("\nERROR EN LA CARGA DE CONTACTOS\n");
            }
        }
        if (opcion == 4){
            System.out.println("\nLlamando ultimo contacto con el que se hablo..."); //Persistencia.
        }
    }
}
