package lt.codeacademy.entities;


import javax.persistence.*;

@Entity
public class Klausimynas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "pavadinimas")
    private String pavadinimas;

    @OneToMany(mappedBy = "Klausimynas",cascade = CascadeType.ALL)
    private Klausimai klausimai;

    Klausimynas(){}

    Klausimynas(String pavadinimas){
        this.pavadinimas = pavadinimas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
}

