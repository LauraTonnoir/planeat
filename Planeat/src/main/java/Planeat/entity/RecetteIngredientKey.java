package Planeat.entity;


import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;


    @Embeddable
    public class RecetteIngredientKey implements Serializable {

        @ManyToOne
        @JoinColumn(name = "ingredient_id", foreignKey = @ForeignKey(name = "ingredient_recette_ingredient_id_fk"))

        private Ingredient ingredient;

        @ManyToOne
        @JoinColumn(name = "recette_id", foreignKey = @ForeignKey(name = "ingredient_recette_recette_id_fk"))
        private Recette recetteIngredient;

        public RecetteIngredientKey() {
        }

        public RecetteIngredientKey(Ingredient ingredient, Recette recette) {
            this.ingredient = ingredient;
            this.recetteIngredient = recette;
        }

        public Ingredient getIngredient() {
            return ingredient;
        }



        public Recette getRecetteIngredient() {
            return recetteIngredient;
        }

        public void setRecetteIngredient(Recette recetteIngredient) {
            this.recetteIngredient = recetteIngredient;
        }

        public void setIngredient(Ingredient ingredient) {
            this.ingredient = ingredient;
        }

        @Override
        public int hashCode() {
            return Objects.hash(ingredient, recetteIngredient);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            RecetteIngredientKey other = (RecetteIngredientKey) obj;
            return Objects.equals(ingredient, other.ingredient) && Objects.equals(recetteIngredient, other.recetteIngredient);
        }

    }


