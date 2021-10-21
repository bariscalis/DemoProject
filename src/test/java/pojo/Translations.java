
package pojo;

import java.util.HashMap;
import java.util.Map;

public class Translations {

    private String de;
    private String es;
    private String fr;
    private String ja;
    private String it;
    private String br;
    private String pt;
    private String nl;
    private String hr;
    private String fa;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public Translations withDe(String de) {
        this.de = de;
        return this;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public Translations withEs(String es) {
        this.es = es;
        return this;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public Translations withFr(String fr) {
        this.fr = fr;
        return this;
    }

    public String getJa() {
        return ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public Translations withJa(String ja) {
        this.ja = ja;
        return this;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public Translations withIt(String it) {
        this.it = it;
        return this;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public Translations withBr(String br) {
        this.br = br;
        return this;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public Translations withPt(String pt) {
        this.pt = pt;
        return this;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public Translations withNl(String nl) {
        this.nl = nl;
        return this;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public Translations withHr(String hr) {
        this.hr = hr;
        return this;
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    public Translations withFa(String fa) {
        this.fa = fa;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Translations withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
