package Planeat.entity;

import javax.persistence.*;

import java.util.Objects;
import java.util.Set;
@Entity
@Table(name= "fiche_recette")
@SequenceGenerator(name = "seqFiche", sequenceName = "seq_fiche", initialValue = 1, allocationSize = 1)
public class FicheRecette {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqFiche")
@Column(name="id")
    private Long idFiche;
    @Enumerated(EnumType.STRING)
    private DifficulteRecette difficulteRecette;
    @OneToOne(mappedBy = "ficheRecette")
    private Recette recette;
    @ManyToMany
    @JoinTable
    private Set<EtapeRecette> etapesRecette;

    public FicheRecette() {
    }

    public Recette getRecette() {
        return recette;
    }

    public void setRecette(Recette recette) {
        this.recette = recette;
    }



    public Long getIdFiche() {
        return idFiche;
    }

    public void setIdFiche(Long idFiche) {
        this.idFiche = idFiche;
    }

    public DifficulteRecette getDifficulteRecette() {
        return difficulteRecette;
    }

    public void setDifficulteRecette(DifficulteRecette difficulteRecette) {
        this.difficulteRecette = difficulteRecette;
    }

    public Set<EtapeRecette> getEtapesRecette() {
        return etapesRecette;
    }

    public void setEtapesRecette(Set<EtapeRecette> etapesRecette) {
        this.etapesRecette = etapesRecette;
    }

    public FicheRecette(Long idFiche) {
        this.idFiche = idFiche;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FicheRecette that = (FicheRecette) o;
        return Objects.equals(idFiche, that.idFiche);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFiche);
    }
}
