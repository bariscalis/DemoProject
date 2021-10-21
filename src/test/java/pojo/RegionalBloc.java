
package pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegionalBloc {

    private String acronym;
    private String name;
    private List<Object> otherAcronyms = null;
    private List<Object> otherNames = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public RegionalBloc withAcronym(String acronym) {
        this.acronym = acronym;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RegionalBloc withName(String name) {
        this.name = name;
        return this;
    }

    public List<Object> getOtherAcronyms() {
        return otherAcronyms;
    }

    public void setOtherAcronyms(List<Object> otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
    }

    public RegionalBloc withOtherAcronyms(List<Object> otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
        return this;
    }

    public List<Object> getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(List<Object> otherNames) {
        this.otherNames = otherNames;
    }

    public RegionalBloc withOtherNames(List<Object> otherNames) {
        this.otherNames = otherNames;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public RegionalBloc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
