import java.util.Scanner;

public class Vista {

    Scanner sn = new Scanner(System.in);
    
    public int menuPrincipal() {

        int opcion1;

        System.out.println();
        System.out.println();
        System.out.println("------------ Mercedes-Benz ------------");
        System.out.println();
        System.out.println("Bienvendo a Mercedes-Benz!");
        System.out.println("Puedes probar cualquier radio dependiendo el modelo del carro que elijas");
        System.out.println("Hora de Empezar! Que radio deseas probar?");
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------");

        String menuPrincipal = "1. Radio para Carro Modelo S\n" + 
                                "2. Radio para Carro Modelo A\n" + 
                                "3. Radio para Carro Modelo C\n" + 
                                "4. Salir del programa\n";

        System.out.println(menuPrincipal);
        opcion1 = sn.nextInt();
        return opcion1;
    }

    public void Despedida() {
        System.out.println("\nMuchas gracias por utilizar la aplicación! Vuelva pronto!\n");
    }
}
