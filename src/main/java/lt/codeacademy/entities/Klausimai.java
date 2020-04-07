package lt.codeacademy.entities;

import javax.persistence.*;

@Entity
public class Klausimai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "klausimynas_id")
    private Klausimynas klausimynas_id;

    @Column(name = "klausimas")
    private String klausimas;

    public Klausimai(){}

    public Klausimai(String klausimas){
        this.klausimas = klausimas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Klausimynas getKlausimynas_id() {
        return klausimynas_id;
    }

    public void setKlausimynas_id(Klausimynas klausimynas) {
        this.klausimynas_id = klausimynas;
    }

    public String getKlausimas() {
        return klausimas;
    }

    public void setKlausimas(String klausimas) {
        this.klausimas = klausimas;
    }


}
