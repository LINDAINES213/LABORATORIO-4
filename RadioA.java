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
    private Scanner scan;
    private String llamadaU;
    private int tarjeta;
    private int opcion = 0;
    private String contactos;
    /**
	* Fin del constructor de la clase RadioA.
	*/

    public RadioA(String llamadaU, int tarjeta) {
        this.llamadaU = llamadaU;
        this.tarjeta = tarjeta;
    }

    public String getLlamadaU(){
        return llamadaU;
    }

    public int getTarjeta(){
        return tarjeta;
    }

    public void Productividad(){
        //Persistencia.
    }

    public void Radios(int interruptor, int volumen, int banda, int emisora){
        System.out.println("La radio esta apagada, presione 1 para encender la radio."); //Se pide al usuario que encienda la radio.
         interruptor = scan.nextInt();
         if (interruptor == 1){
             System.out.println("La radio se ha encendido"); //Mensaje de confirmación de la radio encendida.
            }
         System.out.println("Bienvenido. Que desea hacer?\n1. Volumen de la radio. \n2. AM/FM. \n3. Cambio de estacion. \n4. Agregar nueva emisora. \n5. Cargar emisora. \n6. Reproducir musica. \n7. Usar telefono. \n8. Ver tarjetas. \n9. Apagar radio.");
         opcion = scan.nextInt(); //Menú de opciones para el uso de la radio.
         if (opcion == 1){ //Volumen
             System.out.println("Desea subir o bajar el volumen? \n1. Subir. \n2. Bajar."); //Baja o sube el volumen de la radio.
             opcion = scan.nextInt();
             if (opcion == 1){
                volumen = volumen + 1;
                 System.out.println("Volumen: "+ volumen); //Muestra el volumen aumentado.
             }
             else if (opcion == 2){
                volumen = volumen - 1;
                 System.out.println("Volumen: "+ volumen); //Muestra el volumen disminuido.
             }
             else{
                 System.out.println("Ingrese una opcion valida.");
             }
            }
         if (opcion == 2){ //Cambia de banda.
            System.out.println("Desea cambiar la banda a AM o FM? \n1. AM. \n2. FM.");
            banda = scan.nextInt();
            if (banda == 1){
                System.out.println("Radio configurada a AM."); //Radio AM configurada.
            }
            else if (banda == 2){
                System.out.println("Radio configurada a FM."); //Radio FM configurada.
            }
            else{
                System.out.println("Ingrese una opcion valida.");
            }
        }
         if (opcion == 3){
            System.out.println("Cambio de estacion."); //Persistencia.
        }
         if (opcion == 4){
            System.out.println("Nueva emisora agregada."); //Persistencia.
        }
         if (opcion == 5){
            System.out.println("Emisora cargada."); //Persistencia.
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
            System.out.println("Radio apagandose."); //Termina el programa.
        }
        else{
            System.out.println("Elija una opcion que corresponda a las indicadas."); //Pide una opción correcta.
        }
    }

    public void Reproduccion(){
        System.out.println("Que desea hacer? \n1. Seleccionar lista de reproduccion. \n2. Cambio de canciones. \n3. Ver datos de canción.");
        opcion = scan.nextInt(); //Menú de reproducción de música.
        if (opcion == 1){
            System.out.println("Seleccionando lista de reproduccion..."); //Persistencia.
        }
        if (opcion == 2){
            System.out.println("Cambiando cancion..."); //Persistencia.
        }
        if (opcion == 3){
            System.out.println("Viendo datos de cancion..."); //Persistencia.
        }
        else{
            System.out.println("Elija una opcion que corresponda a las indicadas"); //Pide una opción correcta.
        }
    }

    public void Telefono(){
        System.out.println("Que desea hacer? \n1. Conectar el celular. \n2. Agenda de contactos. \n3. Llamar contacto. \n4. Llamar ultimo contacto.");
        opcion = scan.nextInt(); //Menú de llamadas telefónicas.
        if (opcion == 1){
            System.out.println("El telefono esta apagado, presione 1 para encender el telefono."); //Enciende el teléfono.
            int celular = scan.nextInt();
            if (celular == 1){
                System.out.println("El telefono se ha encendido"); //Mensaje de confirmación.
            }
        }
        if (opcion == 2){
            System.out.println("Mostrando contactos..."+ contactos); //Persistencia.
        }
        if (opcion == 3){
            System.out.println("Llamando contacto..."); //Persistencia.
        }
        if (opcion == 4){
            System.out.println("Llamando ultimo contacto con el que se hablo..."); //Persistencia.
        }
    }
}
