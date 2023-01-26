package Planeat.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="jour")
@SequenceGenerator(name = "seqJour", sequenceName = "seq_jour", initialValue = 1, allocationSize = 1)

public class Jour {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqJour")
    @Column(name="id")
    private Long idJour;


    @OneToMany(mappedBy = "jour")
    private Set<Creneau> creneaux;

    @ManyToOne
    @JoinColumn
    private Semaine semaine;

    JourDeLaSemaine jourDeLaSemaine;

    public Jour(Long idJour) {
        this.idJour = idJour;
    }

    public Long getIdJour() {
        return idJour;
    }

    public void setIdJour(Long idJour) {
        this.idJour = idJour;
    }

    public Set<Creneau> getCreneaux() {
        return creneaux;
    }

    public void setCreneaux(Set<Creneau> creneaux) {
        this.creneaux = creneaux;
    }

    public JourDeLaSemaine getJourDeLaSemaine() {
        return jourDeLaSemaine;
    }

    public void setJourDeLaSemaine(JourDeLaSemaine jourDeLaSemaine) {
        this.jourDeLaSemaine = jourDeLaSemaine;
    }
}
