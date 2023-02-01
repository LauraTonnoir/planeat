package Planeat.restController;

import Planeat.entity.Recette;
import Planeat.services.RecetteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/recette")
public class RecetteRestController {

    @Autowired
    RecetteService recetteservice;

    @GetMapping("")
    public List<Recette> getAll(){return recetteservice.getAll();}
}
