package Planeat.restController;

import Planeat.entity.Ingredient;
import Planeat.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/ingredient")
public class IngredientRestController {

    @Autowired
    IngredientService ingredientService;

    @GetMapping("")
    public List<Ingredient> getAll(){return ingredientService.getAll();}

}
