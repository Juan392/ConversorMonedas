package conexiones;


import com.google.gson.GsonBuilder;
import principal.Moneda;
import principal.MonedaC;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConexionAPI {
    //Se crea una conexion con el cliente y el sevidor usando HTTP
    static MonedaC ConexionCaS(URI direccion, int opcion){
        var gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                //Aqui estoy usando la direccion que retorne de la clase CrearDireccion
                .uri(direccion)
                .build();
        //Manejo posibles errores e imprimo JSON para comprobar que si llego
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            var json = response.body();
            //System.out.println(json);
            //Retorno un valor de tipo MonedaC para la funcion de ejecucion de acciones
            MonedaC moneda = gson.fromJson(json,MonedaC.class);
            return moneda;

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
