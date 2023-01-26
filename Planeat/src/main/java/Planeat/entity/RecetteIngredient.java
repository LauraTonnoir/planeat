package Planeat.entity;

import java.util.LongSummaryStatistics;
import java.util.Objects;

import javax.persistence.*;

import Planeat.entity.RecetteIngredientKey;
import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "recette_ingredient")
public class RecetteIngredient {
    @EmbeddedId
    @Column(name = "id_recette_ingredient")

    private RecetteIngredientKey idRI;

    @Column(name = "quantite_ingredient")
    private Long quantiteIngredient;
    @Enumerated(EnumType.STRING)
    private UniteIngredient uniteIngredient;



    public RecetteIngredient() {
    }

    public RecetteIngredient(RecetteIngredientKey idRI, Long quantiteIngredient) {
        this.idRI = idRI;
        this.quantiteIngredient = quantiteIngredient;
    }

    public RecetteIngredient(RecetteIngredientKey idRI) {
        this.idRI = idRI;
    }

    public RecetteIngredientKey getIdCB() {
        return idRI;
    }

    public void setIdCB(RecetteIngredientKey idRI) {
        this.idRI = idRI;
    }

    public Long getQuantiteIngredient() {
        return quantiteIngredient;
    }

    public void setQuantiteIngredient(Long quantiteIngredient) {
        this.quantiteIngredient = quantiteIngredient;
    }

    public RecetteIngredientKey getIdRI() {
        return idRI;
    }

    public void setIdRI(RecetteIngredientKey idRI) {
        this.idRI = idRI;
    }

    public UniteIngredient getUniteIngredient() {
        return uniteIngredient;
    }

    public void setUniteIngredient(UniteIngredient uniteIngredient) {
        this.uniteIngredient = uniteIngredient;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RecetteIngredient other = (RecetteIngredient) obj;
        return Objects.equals(idRI, other.idRI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRI);
    }
}
