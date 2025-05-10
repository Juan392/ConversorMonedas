package principal;

import java.util.Map;

public record MonedaC(
        String result,
        String base_code,
        Map<String, Double> conversion_rates
) {
}
