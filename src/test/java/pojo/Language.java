
package pojo;

import java.util.HashMap;
import java.util.Map;

public class Language {

    private String iso639_1;
    private String iso639_2;
    private String name;
    private String nativeName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getIso639_1() {
        return iso639_1;
    }

    public void setIso639_1(String iso639_1) {
        this.iso639_1 = iso639_1;
    }

    public Language withIso6391(String iso6391) {
        this.iso639_1 = iso6391;
        return this;
    }

    public String getIso639_2() {
        return iso639_2;
    }

    public void setIso639_2(String iso639_2) {
        this.iso639_2 = iso639_2;
    }

    public Language withIso6392(String iso6392) {
        this.iso639_2 = iso6392;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language withName(String name) {
        this.name = name;
        return this;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public Language withNativeName(String nativeName) {
        this.nativeName = nativeName;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Language withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
