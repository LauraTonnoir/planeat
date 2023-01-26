package Planeat.entity;

import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "ingredient")
@SequenceGenerator(name = "seqIngredient", sequenceName = "seq_ingredient", initialValue = 1, allocationSize = 1)
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqIngredient")
    private Long idIngredient;

    private String provenance;
    @ManyToMany(mappedBy = "listeIngredient")
    private Set<Recette> listeRecette;

    public void setIdIngredient(Long idIngredient) {
        this.idIngredient = idIngredient;
    }

    public Set<Recette> getListeRecette() {
        return listeRecette;
    }

    public void setListeRecette(Set<Recette> listeRecette) {
        this.listeRecette = listeRecette;
    }

    public Ingredient(Long idIngredient) {
        this.idIngredient = idIngredient;
    }

    public Long getIdIngredient() {
        return idIngredient;
    }

    public void setId(Long idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }
}
