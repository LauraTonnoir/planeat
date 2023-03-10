package Planeat.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
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

    public Jour() {
    }

    @ManyToOne
    @JoinColumn
    private Semaine semaine;
    @Enumerated(EnumType.STRING)
    private JourDeLaSemaine jourDeLaSemaine;

    private LocalDate dateDuJour;

    public Jour(Long idJour) {
        this.idJour = idJour;
    }
    public Semaine getSemaine() {
        return semaine;
    }

    public void setSemaine(Semaine semaine) {
        this.semaine = semaine;
    }

    public LocalDate getDateDuJour() {
        return dateDuJour;
    }

    public void setDateDuJour(LocalDate dateDuJour) {
        this.dateDuJour = dateDuJour;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jour jour = (Jour) o;
        return Objects.equals(idJour, jour.idJour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJour);
    }
}
