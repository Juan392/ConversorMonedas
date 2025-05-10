package principal;

import com.google.gson.annotations.SerializedName;

public class Moneda {
    @SerializedName("result")
    private String moneda;
    @SerializedName("")
    private double cambio;
    @SerializedName("cantidad")
    private double cantidad;

    public Moneda(double cambio, double cantidad, String moneda) {
        this.cambio = cambio;
        this.cantidad = cantidad;
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "\nConversion: " +
                "\n\tMoneda='" + moneda + '\'' +
                "\n\tCambio=$" + cambio +
                "\n\tCantidad= $" + cantidad;
    }
}
