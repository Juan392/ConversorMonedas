package conexiones;

import principal.Moneda;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EjecutarAccion {
    public static void ejecucion(int opcion,double cantidad, List historial){
        //Llamo a la funcion dirrecion para crear la direccion
        var direccion = CrearDireccion.direccion(opcion);
        //Aqui tomo el valor retornado en ConexionApi y lo mando al conversor
        var moneda = ConexionAPI.ConexionCaS(direccion);
        Moneda mon = TipoMoneda.filtroConversion(moneda,opcion,cantidad);
        //Aniado a la lista los valores recibidos y los mando a la terminal
        historial.add(mon);
        //Y cuandotodo se ejecuta simplemente mando a immprimir el resultado
        System.out.println(mon);
        try {
            FileWriter historialMonedas = new FileWriter("historial.txt");
                    historialMonedas.write(String.valueOf(historial));
                    historialMonedas.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
