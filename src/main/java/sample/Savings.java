package sample;

public class Savings {
    private String savingscode;
    private String custname;
    private Double cdep;
    private int nyears;
    private String savingstype;

    public Savings(String savingscode, String custname, Double cdep, int nyears, String savingstype) {
        this.savingscode = savingscode;
        this.custname = custname;
        this.cdep = cdep;
        this.nyears = nyears;
        this.savingstype = savingstype;
    }

    public String getSavingscode() {
        return savingscode;
    }

    public void setSavingscode(String savingscode) {
        this.savingscode = savingscode;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public Double getCdep() {
        return cdep;
    }

    public void setCdep(Double cdep) {
        this.cdep = cdep;
    }

    public int getNyears() {
        return nyears;
    }

    public void setNyears(int nyears) {
        this.nyears = nyears;
    }

    public String getSavingstype() {
        return savingstype;
    }

    public void setSavingstype(String savingstype) {
        this.savingstype = savingstype;
    }
}
