package Planeat.entity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name = "recette")
@SequenceGenerator(name = "seqRecette", sequenceName = "seq_recette", initialValue = 1, allocationSize = 1)

public class Recette {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqRecette")
    private Long idRecette;

    private String nomRecette;

    @Enumerated(EnumType.STRING)
    private TypeRecette typerecette;
    @OneToOne
    @JoinColumn
    private FicheRecette ficheRecette;

    @ManyToMany
    @JoinTable
    private Set<Creneau> listeCreneaux;


    @OneToMany(mappedBy = "idRI.recetteIngredient")
    private Set<RecetteIngredient> listerecetteIngredient;
    @ManyToMany
    @JoinTable
    private Set<Tag> listeTags;

    private Boolean quantiteAdaptable;



    public FicheRecette getFicheRecette() {
        return ficheRecette;
    }

    public void setFicheRecette(FicheRecette ficheRecette) {
        this.ficheRecette = ficheRecette;

    }

    public TypeRecette getTyperecette() {
        return typerecette;
    }

    public void setTyperecette(TypeRecette typerecette) {
        this.typerecette = typerecette;
    }

    public Recette(Long idRecette) {
        this.idRecette = idRecette;
    }

    public Long getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(Long idRecette) {
        this.idRecette = idRecette;
    }

    public Set<Creneau> getListeCreneaux() {
        return listeCreneaux;
    }

    public void setListeCreneaux(Set<Creneau> listeCreneaux) {
        this.listeCreneaux = listeCreneaux;
    }

    public Recette(String nomRecette) {
        this.nomRecette = nomRecette;
        this.quantiteAdaptable=true;
    }

    public String getNomRecette() {
        return nomRecette;
    }

    public void setNomRecette(String nomRecette) {
        this.nomRecette = nomRecette;
    }

    public Set<RecetteIngredient> getListerecetteIngredient() {
        return listerecetteIngredient;
    }

    public void setListerecetteIngredient() {
        this.listerecetteIngredient = listerecetteIngredient;
    }

    public Set<Tag> getListeTags() {
        return listeTags;
    }

    public void setListeTags(Set<Tag> listeTags) {
        this.listeTags = listeTags;
    }

    public Boolean getQuantiteAdaptable() {
        return quantiteAdaptable;
    }

    public void setQuantiteAdaptable(Boolean quantiteAdaptable) {
        this.quantiteAdaptable = quantiteAdaptable;
    }

    public void setListerecetteIngredient(Set<RecetteIngredient> listerecetteIngredient) {
        this.listerecetteIngredient = listerecetteIngredient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recette recette = (Recette) o;
        return Objects.equals(idRecette, recette.idRecette);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRecette);
    }
}
