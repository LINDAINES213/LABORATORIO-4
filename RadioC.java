import java.util.Scanner;

/**
* Clase RadioC para mostrar los métodos y funcionamiento del radio para autos clase C.
* @author Mario Guerra y Linda Jiménez
* @version 16/11/2021
* @see RadioC
*/

public class RadioC implements Radio{

    /**
	* Constructor para la clase RadioC.
	*/
    Scanner scan = new Scanner(System.in);
    private int espera;
    private int tiempo;
    private int opcion = 0;
    private String contactos;
    /**
	* Fin del constructor de la clase RadioC.
	*/

    public RadioC() {}
    
    public int getEspera() {
        return espera;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setEspera(int espera) {
        this.espera = espera;
    }

    public void setTiempo(int tiempo){
        this.tiempo = tiempo;
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
        System.out.println("\nBienvenido. Que desea hacer?\n1. Volumen de la radio. \n2. AM/FM. \n3. Cambio de estacion. \n4. Agregar nueva emisora. \n5. Cargar emisora. \n6. Reproducir musica. \n7. Usar telefono. \n8. Pronóstico del tiempo. \n9. Apagar radio.\n");
        opcion = scan.nextInt(); //Menú de opciones para el uso de la radio.
        if (opcion == 1){
            System.out.println("\nDesea subir o bajar el volumen? \n1. Subir. \n2. Bajar."); //Volumen
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
        if (opcion == 2){ //Cambia de banda
           System.out.println("\nDesea cambiar la banda a AM o FM? \n1. AM. \n2. FM.");
           banda = scan.nextInt();
           if (banda == 1){
               System.out.println("\nRadio configurada a AM."); //Radio AM configurada.
           }
           else if (banda == 2){
               System.out.println("\nRadio configurada a FM."); //Radio FM configurada
           }
           else{
               System.out.println("\nIngrese una opcion valida.");
           }
       }
        if (opcion == 3){
           System.out.println("\nCambio de estacion."); //Persistencia.
       }
        if (opcion == 4){
           System.out.println("\nNueva emisora agregada."); //Persistencia.
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

    public void Reproduccion(){ //Menú de reproducción de música.
        System.out.println("\nQue desea hacer? \n1. Seleccionar lista de reproduccion. \n2. Cambio de canciones. \n3. Ver datos de canción.");
        opcion = scan.nextInt();
        if (opcion == 1){
            System.out.println("\nSeleccionando lista de reproduccion..."); //Persistencia.
        }
        if (opcion == 2){
            System.out.println("\nCambiando cancion..."); //Persistencia.
        }
        if (opcion == 3){
            System.out.println("\nViendo datos de cancion..."); //Persistencia.
        }
        else{
            System.out.println("\nElija una opcion que corresponda a las indicadas"); //Pide una opción correcta.
        }
    }

    public void Telefono(){ //Menú de llamadas telefónicas.
        System.out.println("\nQue desea hacer? \n1. Conectar el celular. \n2. Agenda de contactos. \n3. Llamar contacto. \n4. Poner en espera la llamada.");
        opcion = scan.nextInt();
        if (opcion == 1){
            System.out.println("\nEl telefono esta apagado, presione 1 para encender el telefono."); //Enciende el teléfono.
            int celular = scan.nextInt();
            if (celular == 1){
                System.out.println("\nEl telefono se ha encendido"); //Mensaje de confirmación.
            }
        }
        if (opcion == 2){
            System.out.println("\nMostrando contactos..."+ contactos); //Persistencia.
        }
        if (opcion == 3){
            System.out.println("\nLlamando contacto..."); //Persistencia.
        }
        if (opcion == 4){
            System.out.println("\nPresione '1' para poner en espera la llamada."); //Pone la llamada en espera.
            espera = scan.nextInt();
            if (espera == 1){
                System.out.println("\nLlamada puesta en espera."); //Mensaje de confirmación.
            }
            else{
                System.out.println("\nElija una opcion valida."); //Pide una opción correcta.
            }
        }
    }
}
