public interface Radio {
    
    public boolean interruptor = false;
    public int volumen = 0;
    public int banda = 0;
    public int listaRep = 0;
    public int cambioCan = 0;
    public String cancion = "";
    public boolean celular = false;
    public String contactos = "";
    public int llamadas = 0;

    public void Radio();
    public void Reproduccion();
    public void Telefono();

}
