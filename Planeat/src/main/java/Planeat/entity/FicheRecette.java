package Planeat.entity;

import javax.persistence.*;

import java.util.Set;
@Entity
@Table(name= "fiche_recette")
@SequenceGenerator(name = "seqFiche", sequenceName = "seq_fiche", initialValue = 1, allocationSize = 1)
public class FicheRecette {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqFiche")
@Column(name="id")
    private Long idFiche;

    private DifficulteRecette difficulteRecette;
    @OneToOne(mappedBy = "ficheRecette")
    private Recette recette;

    public Recette getRecette() {
        return recette;
    }

    public void setRecette(Recette recette) {
        this.recette = recette;
    }

    @ManyToMany
    @JoinTable
    private Set<EtapeRecette> etapesRecette;

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
}
