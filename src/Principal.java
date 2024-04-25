import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entradaDeTeclado = new Scanner(System.in);
        int salir = 1;
        Conversor conversor = new Conversor();

        String inicio = """
                 
                 **********************************************
                ***************** Conversor ********************
                *                                              *
                *         ** Eliga la opcion deseada **        *
                *                                              *
                *    1- Dolar => Peso Argentino                *
                *    2- Peso Argentino => Dolar                *
                *    3- Dolar => Real Brasileño               *
                *    4- Real Brasileño => Dolar                *
                *    5- Dolar => Peso Colombiano               *
                *    6- Peso Colombiano => Dolar               *
                *    7- salir                                  *
                *                                              *
                ************************************************
                  *********************************************
                """;

        while (salir == 1){
            System.out.println(inicio);
            try {
                int seleccion = entradaDeTeclado.nextInt();
                if (seleccion<1 || seleccion >7){
                    System.out.println("opcion incorrecta");
                }else if (seleccion==7) {
                        System.out.println("Gracias por Utilizar nuestros Servicios" );
                        salir=0;
                    }else {
                        System.out.print("valor que desee convetir: ");
                        int valor = entradaDeTeclado.nextInt();
                        if (valor<=0 ){
                            System.out.println("ingrese valores positivos");
                        }else {
                            switch (seleccion){
                                case 1:
                                    conversor.imprimidor("USD","ARS", valor );
                                    break;
                                case 2:
                                    conversor.imprimidor("ARS","USD", valor );
                                    break;
                                case 3:
                                    conversor.imprimidor("USD","BRL", valor );
                                    break;
                                case 4:
                                    conversor.imprimidor("BRL","USD", valor );
                                    break;
                                case 5:
                                    conversor.imprimidor("USD","COP", valor );
                                    break;
                                case 6:
                                    conversor.imprimidor("COP","USD", valor );
                                    break;
                            }
                        }
                }
            }catch (Exception e){
                System.out.println("************************************************");
                System.out.println("!!!! Error, Ingrese un numero" );
                System.out.println("************************************************");
                System.out.println("");
                entradaDeTeclado.nextLine();
            }
        }
    }
}
