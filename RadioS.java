import java.util.Scanner;

/**
* Clase RadioS para mostrar los métodos y funcionamiento del radio para autos clase S
* @author Mario Guerra y Linda Jiménez
* @version 16/11/2021
* @see RadioS
*/

public class RadioS implements Radio{

    /**
	* Constructor para la clase RadioS.
	*/
    Scanner scan = new Scanner(System.in);
    private String destino;
    private int entrada;
    private int opcion = 0;
    private String contactos;
    /**
	* Fin del constructor de la clase RadioS.
	*/

    public RadioS() {}
    

    public String getDestino() {
        return destino;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public void setEntrada(int entrada){
        this.entrada = entrada;
    }
    
    public void Productividad(){

    }

    public void Radios(int interruptor, int volumen, int banda, int emisora){
        System.out.println("La radio esta apagada, presione 1 para encender la radio.\n"); //Se pide al usuario que encienda la radio.
        interruptor = scan.nextInt();
        if (interruptor == 1){
            System.out.println("\nLa radio se ha encendido\n"); //Mensaje de confirmación de la radio encendida.
        }
        System.out.println("Bienvenido. Que desea hacer?\n1. Volumen de la radio. \n2. AM/FM. \n3. Cambio de estacion. \n4. Agregar nueva emisora. \n5. Cargar emisora. \n6. Reproducir musica. \n7. Usar telefono. \n8. Planificar viaje. \n9. Apagar radio.\n");
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
        if (opcion == 2){
           System.out.println("\nDesea cambiar la banda a AM o FM? \n1. AM. \n2. FM."); //Cambia de banda
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
        System.out.println("\nQue desea hacer? \n1. Conectar el celular. \n2. Agenda de contactos. \n3. Llamar contacto. \n4. Cambiar bocinas a auriculares o viceversa.");
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
            System.out.println("\nDesea cambiar a bocinas o auriculares? \n1. Bocinas. \n2. Auriculares."); //Pide escoger la entrada de sonido.
            entrada = scan.nextInt();
            if (entrada == 1){
                System.out.println("\nBocinas conectadas."); //Bocinas.
            }
            else if (entrada == 2){
                System.out.println("\nAuriculares conectados."); //Auriculares.
            }
            else{
                System.out.println("\nIngrese una opcion valida."); //Pide una opción correcta.
            }
        }
    }
}
