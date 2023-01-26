package Planeat.entity;

import javax.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ingredient")
@SequenceGenerator(name = "seqIngredient", sequenceName = "seq_ingredient", initialValue = 1, allocationSize = 1)
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqIngredient")
    private Long idIngredient;

    private String nomIngredient;

    private String provenance;

    @OneToMany(mappedBy = "idRI.recetteIngredient")
    Set<RecetteIngredient> listerecetteIngredient;
    public void setIdIngredient(Long idIngredient) {
        this.idIngredient = idIngredient;
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

    public Ingredient(String nomIngredient) {
        this.nomIngredient = nomIngredient;
    }

    public String getNomIngredient() {
        return nomIngredient;
    }

    public void setNomIngredient(String nomIngredient) {
        this.nomIngredient = nomIngredient;
    }

    public Set<RecetteIngredient> getListerecetteIngredient() {
        return listerecetteIngredient;
    }

    public void setListerecetteIngredient(Set<RecetteIngredient> listerecetteIngredient) {
        this.listerecetteIngredient = listerecetteIngredient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(idIngredient, that.idIngredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idIngredient);
    }
}
