
package pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Country {

    private String name;
    private List<String> topLevelDomain = null;
    private String alpha2Code;
    private String alpha3Code;
    private List<String> callingCodes = null;
    private String capital;
    private List<String> altSpellings = null;
    private String region;
    private String subregion;
    private int population;
    private List<Double> latlng = null;
    private String demonym;
    private double area;
    private double gini;
    private List<String> timezones = null;
    private List<String> borders = null;
    private String nativeName;
    private String numericCode;
    private List<Currency> currencies = null;
    private List<Language> languages = null;
    private Translations translations;
    private String flag;
    private List<RegionalBloc> regionalBlocs = null;
    private String cioc;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country withName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public Country withTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public Country withAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
        return this;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public Country withAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
        return this;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public Country withCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
        return this;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Country withCapital(String capital) {
        this.capital = capital;
        return this;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public Country withAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Country withRegion(String region) {
        this.region = region;
        return this;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Country withSubregion(String subregion) {
        this.subregion = subregion;
        return this;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Country withPopulation(int population) {
        this.population = population;
        return this;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public Country withLatlng(List<Double> latlng) {
        this.latlng = latlng;
        return this;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public Country withDemonym(String demonym) {
        this.demonym = demonym;
        return this;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Country withArea(double area) {
        this.area = area;
        return this;
    }

    public double getGini() {
        return gini;
    }

    public void setGini(double gini) {
        this.gini = gini;
    }

    public Country withGini(double gini) {
        this.gini = gini;
        return this;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public Country withTimezones(List<String> timezones) {
        this.timezones = timezones;
        return this;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public Country withBorders(List<String> borders) {
        this.borders = borders;
        return this;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public Country withNativeName(String nativeName) {
        this.nativeName = nativeName;
        return this;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public Country withNumericCode(String numericCode) {
        this.numericCode = numericCode;
        return this;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public Country withCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
        return this;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public Country withLanguages(List<Language> languages) {
        this.languages = languages;
        return this;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public Country withTranslations(Translations translations) {
        this.translations = translations;
        return this;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Country withFlag(String flag) {
        this.flag = flag;
        return this;
    }

    public List<RegionalBloc> getRegionalBlocs() {
        return regionalBlocs;
    }

    public void setRegionalBlocs(List<RegionalBloc> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    public Country withRegionalBlocs(List<RegionalBloc> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
        return this;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public Country withCioc(String cioc) {
        this.cioc = cioc;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Country withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
