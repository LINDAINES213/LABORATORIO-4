/**
* Interfaz Radio para instanciar variables y métodos para las clases que implementan dicha interfaz.
* @author Mario Guerra y Linda Jiménez
* @version 16/11/2021
* @see Radio
*/

public interface Radio {
    /**
	* Constructor para la Interfaz Radio.
	*/
    public int interruptor = 0; //Enciende o apaga el radio.
    public int volumen = 0; //Sube o baja el volumen.
    public int banda = 0; //Cambia la banda de la radio.
    public int listaRep = 0; //Lista de reproducción.
    public int cambioCan = 0; //Variable para cambio de canciones.
    public String cancion = ""; //Datos de la canción correspondidente.
    public int celular = 0; //Enciende el celular de la radio.
    public String contactos = ""; //Agenda de contactos.
    public int llamadas = 0; //Llamar a un contacto.
	/**
	* Fin del constructor de la Interfaz Radio.
	*/

    public void Radios(int interruptor, int volumen, int banda, int emisora); //Método para mostrar en la vista.
    public void Reproduccion(); //Método de reproducción de canciones.
    public void Telefono(); //Método de llamadas telefónicas.

}