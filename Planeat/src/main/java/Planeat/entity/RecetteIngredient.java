package Planeat.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import Planeat.entity.RecetteIngredientKey;
import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "recette_ingredient")
public class RecetteIngredient {
    @EmbeddedId
    @Column(name = "id_recette_ingredient")

    private RecetteIngredientKey idRI;

    @Column(name = "quantite_ingredient")
    private int quantiteIngredient;



    public RecetteIngredient() {
    }

    public RecetteIngredient(RecetteIngredientKey idRI, int quantiteIngredient) {
        this.idRI = idRI;
        this.quantiteIngredient = quantiteIngredient;
    }

    public RecetteIngredientKey getIdCB() {
        return idRI;
    }

    public void setIdCB(RecetteIngredientKey idRI) {
        this.idRI = idRI;
    }

    public int getQuantiteIngredient() {
        return quantiteIngredient;
    }

    public void setQuantiteIngredient(int quantiteIngredient) {
        this.quantiteIngredient = quantiteIngredient;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRI);
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






}
