import java.time.LocalDate;

public class Prodejce {
    private String name;
    private int pocetSmluv;
    private String narozeni;
    private double mn_viMrkve;
    private boolean senior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPocetSmluv() {
        return pocetSmluv;
    }

    public void setPocetSmluv(int pocetSmluv) {
        this.pocetSmluv = pocetSmluv;
    }

    public String getNarozeni() {
        return narozeni;
    }

    public void setNarozeni(String narozeni) {
        this.narozeni = narozeni;
    }

    public double getMn_viMrkve() {
        return mn_viMrkve;
    }

    public void setMn_viMrkve(double mn_viMrkve) {
        this.mn_viMrkve = mn_viMrkve;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    public Prodejce(String name, int pocetSmluv, String narozeni, double mn_viMrkve, boolean senior) {
        this.name = name;
        this.pocetSmluv = pocetSmluv;
        this.narozeni = narozeni;
        this.mn_viMrkve = mn_viMrkve;
        this.senior = senior;


    }
}

