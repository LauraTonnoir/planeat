package Planeat.repositories;


import Planeat.entity.RecetteIngredient;
import Planeat.entity.RecetteIngredientKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetteIngredientRepository extends JpaRepository<RecetteIngredient,RecetteIngredientKey> {
}
