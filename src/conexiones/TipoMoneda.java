package conexiones;

import principal.Moneda;
import principal.MonedaC;
import principal.calculos.ExtranjeraANacional;
import principal.calculos.NacionalAExtranjera;

public class TipoMoneda {
    protected static Moneda filtroConversion(MonedaC moneda, int opcion,double cantidad) {
        double tipo = 0;
        double conversion = 0;
        Moneda newMon = null;
        switch (opcion) {
            case 1 -> {
                tipo = moneda.conversion_rates().get("USD");
                conversion = NacionalAExtranjera.convertir(tipo,cantidad);
                newMon = new Moneda(tipo,conversion,"USD");
            }
            case 2 -> {
                tipo = moneda.conversion_rates().get("ARS");
                conversion = ExtranjeraANacional.convertir(tipo,cantidad);
                newMon = new Moneda(tipo,conversion,"ARS");
            }
            case 3 -> {
                tipo = moneda.conversion_rates().get("USD");
                conversion = NacionalAExtranjera.convertir(tipo,cantidad);
                newMon = new Moneda(tipo,conversion,"USD");
            }
            case 4 -> {
                tipo = moneda.conversion_rates().get("BOB");
                conversion = ExtranjeraANacional.convertir(tipo,cantidad);
                newMon = new Moneda(tipo,conversion,"BOB");
            }
            case 5 -> {
                tipo = moneda.conversion_rates().get("USD");
                conversion = NacionalAExtranjera.convertir(tipo,cantidad);
                newMon = new Moneda(tipo,conversion,"USD");
            }
            case 6 -> {
                tipo = moneda.conversion_rates().get("BRL");
                conversion = ExtranjeraANacional.convertir(tipo,cantidad);
                newMon = new Moneda(tipo,conversion,"BRL");
            }
        }
        return newMon;
    }
}