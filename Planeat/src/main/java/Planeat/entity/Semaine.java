package Planeat.entity;

import javax.persistence.*;

import java.util.Set;
@Entity
@Table(name = "semaine")
@SequenceGenerator(name = "seqSemaine", sequenceName = "seq_semaine", initialValue = 1, allocationSize = 1)

public class Semaine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqSemaine")
    private Long idSemaine;
    @OneToMany(mappedBy = "semaine")
    private Set<Jour> listejours;
    public Semaine(Long idSemaine) {
        this.idSemaine = idSemaine;
    }

    public Long getIdSemaine() {
        return idSemaine;
    }

    public void setIdSemaine(Long idSemaine) {
        this.idSemaine = idSemaine;
    }

    public Set<Jour> getListejours() {
        return listejours;
    }

    public void setListejours(Set<Jour> listejours) {
        this.listejours = listejours;
    }
}
