package lt.codeacademy.entities;

import javax.persistence.*;

@Entity
public class Atsakymai {

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "klausimo_id")
    private Long klausimo_id;

    @Column(name = "atsakymas")
    private String atsakymas;

    @Column(name = "ar_teisingas")
    private int ar_teisingas;

    public Atsakymai(){}

    public Long getKlausimo_id() {
        return klausimo_id;
    }

    public void setKlausimo_id(Long klausimo_id) {
        this.klausimo_id = klausimo_id;
    }

    public String getAtsakymas() {
        return atsakymas;
    }

    public void setAtsakymas(String atsakymas) {
        this.atsakymas = atsakymas;
    }

    public int getAr_teisingas() {
        return ar_teisingas;
    }

    public void setAr_teisingas(int ar_teisingas) {
        this.ar_teisingas = ar_teisingas;
    }
}
