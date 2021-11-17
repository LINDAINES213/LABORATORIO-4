public class Main {

    public static void main(String[] args){

       RadioA radioA = new RadioA();
       RadioS radioS = new RadioS();
       RadioC radioC = new RadioC();
       Vista vista = new Vista();

       int opcion1 = 0;

       while (opcion1 != 4){

           opcion1 = vista.menuPrincipal();

           if (opcion1 == 1){

                radioS.Radios(opcion1, opcion1, opcion1, opcion1);

           } else if (opcion1 == 2){

                radioA.Radios(opcion1, opcion1, opcion1, opcion1);

           } else if (opcion1 == 3){

                radioC.Radios(opcion1, opcion1, opcion1, opcion1);

           } else if (opcion1 == 4){

               vista.Despedida();

           }
       }
    }
    
}