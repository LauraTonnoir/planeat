package Planeat.services;

import java.util.List;

import Planeat.entity.RecetteIngredient;
import Planeat.repositories.RecetteIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RecetteIngredientService {

    @Autowired
    private RecetteIngredientRepository ingredientIngredientRepository;

    public List<RecetteIngredient> getAllIngredient() {
        return ingredientIngredientRepository.findAll();
    }

    public RecetteIngredient create(RecetteIngredient ingredientIngredient) {// faire en sorte que au moment on on créer une ingredient on créer aussi les ingredientIngredient associé et les RecetteDessert il faut aussi mettre la ingredient dans pizza et save
        //ingredient.getIngredients(); <- renvoi la liste des ingredientIngredient pour cette ingredient
        System.out.println(ingredientIngredient);
        return ingredientIngredientRepository.save(ingredientIngredient);
    }

    public RecetteIngredient update(RecetteIngredient ingredientIngredient) {
        // si version dans ingredient
        // Recette ingredientEnBase = getById(ingredient.getId());
        // ingredient.setVersion(ingredientEnBase.getVersion());

        return ingredientIngredientRepository.save(ingredientIngredient);
    }

    public void delete(RecetteIngredient ingredientIngredient) {
        ingredientIngredientRepository.delete(ingredientIngredient);
    }




}
