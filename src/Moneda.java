import com.google.gson.Gson;

import java.util.Map;

public record Moneda(
        String base_code,
        Map<String, Double> conversion_rates) {
    public String toJsonString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
