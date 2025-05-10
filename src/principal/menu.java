package principal;

import conexiones.CrearDireccion;
import conexiones.EjecutarAccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        List<Moneda> historial = new ArrayList<>();
        var console = new Scanner(System.in);
        try{
            //Se muestrae el menu inicial
            while(true){
                System.out.println("**********************");
                System.out.println("""
                        Bienvenido al sistema de conversor de monedas.
                        Escoga su opcion:
                        1.Perso Argentino a Dolar.
                        2.Dolar a Peso Argentino.
                        3.Boliviano Boliviano a Dolar.
                        4.Dolar a Boliviano Boliviano.
                        5.Real Brasileño a Dolar.
                        6.Dolar a Real Brasileno.
                        7.Salir.
                        """);
                var opcion = console.nextInt();
                //Creo una pequenia comprobacion para saber si el usuario quiere ver el historial o salir.
                if(opcion == 7){
                    System.out.println("Su historial:\n"+historial);
                    break;

                }
                else if (opcion == 8) {
                    System.out.println("Gracias por usar mi conversor :).");
                    break;
                }
                System.out.println("Ahora ingrese la cantidad a convertir: ");
                var cantidad = console.nextDouble();
                //Llamo a la funcion para ejecutar las acciones
                EjecutarAccion.ejecucion(opcion,cantidad,historial);
                System.out.println("**********************");
            }
        }catch (Exception e){
            System.out.println("Ocurrio un error inesperado: " + e.getMessage());
        }
    }
}
