
package pojo;

import java.util.HashMap;
import java.util.Map;

public class Currency {

    private String code;
    private String name;
    private String symbol;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Currency withCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency withName(String name) {
        this.name = name;
        return this;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Currency withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Currency withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
