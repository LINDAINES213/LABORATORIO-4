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
    private Scanner scan;
    private String destino;
    private int entrada;
    private int opcion = 0;
    private String contactos;
    /**
	* Fin del constructor de la clase RadioS.
	*/

    public RadioS(String destino, int entrada) {
        this.destino = destino;
        this.entrada = entrada;
    }
    

    public String getDestino() {
        return destino;
    }

    public int getEntrada() {
        return entrada;
    }
    
    public void Productividad(){

    }

    public void Radios(int interruptor, int volumen, int banda, int emisora){
        System.out.println("La radio esta apagada, presione 1 para encender la radio."); //Se pide al usuario que encienda la radio.
        interruptor = scan.nextInt();
        if (interruptor == 1){
            System.out.println("La radio se ha encendido"); //Mensaje de confirmación de la radio encendida.
        }
        System.out.println("Bienvenido. Que desea hacer?\n1. Volumen de la radio. \n2. AM/FM. \n3. Cambio de estacion. \n4. Agregar nueva emisora. \n5. Cargar emisora. \n6. Reproducir musica. \n7. Usar telefono. \n8. Planificar viaje. \n9. Apagar radio.");
        opcion = scan.nextInt(); //Menú de opciones para el uso de la radio.
        if (opcion == 1){
            System.out.println("Desea subir o bajar el volumen? \n1. Subir. \n2. Bajar."); //Volumen
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
        if (opcion == 2){
           System.out.println("Desea cambiar la banda a AM o FM? \n1. AM. \n2. FM."); //Cambia de banda
           banda = scan.nextInt();
           if (banda == 1){
               System.out.println("Radio configurada a AM."); //Radio AM configurada.
           }
           else if (banda == 2){
               System.out.println("Radio configurada a FM."); //Radio FM configurada
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

    public void Reproduccion(){ //Menú de reproducción de música.
        System.out.println("Que desea hacer? \n1. Seleccionar lista de reproduccion. \n2. Cambio de canciones. \n3. Ver datos de canción.");
        opcion = scan.nextInt();
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

    public void Telefono(){ //Menú de llamadas telefónicas.
        System.out.println("Que desea hacer? \n1. Conectar el celular. \n2. Agenda de contactos. \n3. Llamar contacto. \n4. Cambiar bocinas a auriculares o viceversa.");
        opcion = scan.nextInt();
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
            System.out.println("Desea cambiar a bocinas o auriculares? \n1. Bocinas. \n2. Auriculares."); //Pide escoger la entrada de sonido.
            entrada = scan.nextInt();
            if (entrada == 1){
                System.out.println("Bocinas conectadas."); //Bocinas.
            }
            else if (entrada == 2){
                System.out.println("Auriculares conectados."); //Auriculares.
            }
            else{
                System.out.println("Ingrese una opcion valida."); //Pide una opción correcta.
            }
        }
    }
}
