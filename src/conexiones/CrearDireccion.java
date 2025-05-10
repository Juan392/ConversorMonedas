package conexiones;

import java.net.URI;

public class CrearDireccion {
    public static URI direccion(int opcion){
        //Creo un switch con las distintas opciones
        String tipo = "";
        switch(opcion){
            case 1-> tipo = "ARS";
            case 2, 4, 6 -> tipo = "USD";
            case 3-> tipo = "BOB";
            case 5 -> tipo = "BRL";
        }
        //Creo la direccion y la mando a la Conexion
        var direcccion = URI.create("https://v6.exchangerate-api.com/v6/e1b93f6ca674b67aa7c1269a/latest/"+tipo);
        return direcccion;
    }
}
