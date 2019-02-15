package vjezbe.entitet;

import java.util.ArrayList;
import java.util.List;

public class Zupanija {

    private String naziv;
    private Drzava drzava;
    List<Mjesto> mjesta;

    public Zupanija(String naziv, Drzava drzava) {
        this.naziv = naziv;
        this.drzava = drzava;
        this.mjesta = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
    }

    public List<Mjesto> getMjesta() {
        return mjesta;
    }
}
