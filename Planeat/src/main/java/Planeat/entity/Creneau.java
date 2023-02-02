package Planeat.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="creneau")
@SequenceGenerator(name = "seqCreneau", sequenceName = "seq_creneau", initialValue = 1, allocationSize = 1)
public class Creneau {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCreneau")
    @Column(name="id")
    private Long idCreneaux;
    @ManyToMany(mappedBy = "listeCreneaux")
    private Set<Recette> listeRecette;
    @ManyToOne
    @JoinColumn
    private Jour jour;
    @Enumerated(EnumType.STRING)
    private TypeCreneaux typeCreneaux;
    public Creneau(Long idCreneaux) {
        this.idCreneaux = idCreneaux;
    }
    public Long getIdCreneaux() {
        return idCreneaux;
    }

    @Enumerated(EnumType.STRING)
    public TypeCreneaux getTypeCreneaux() {
        return typeCreneaux;
    }


    public Creneau() {
    }

    public void setTypeCreneaux(TypeCreneaux typeCreneaux) {
        this.typeCreneaux = typeCreneaux;
    }

    public void setIdCreneaux(Long idCreneaux) {
        this.idCreneaux = idCreneaux;
    }


    public Set<Recette> getListeRecette() {
        return listeRecette;
    }

    public void setListeRecette(Set<Recette> listeRecette) {
        this.listeRecette = listeRecette;
    }

    public Jour getJour() {
        return jour;
    }

    public void setJour(Jour jour) {
        this.jour = jour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creneau creneau = (Creneau) o;
        return Objects.equals(idCreneaux, creneau.idCreneaux);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCreneaux);
    }
}
