package Planeat.services;

import Planeat.entity.Recette;
import Planeat.repositories.RecetteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class RecetteService {
    @Autowired
    private RecetteRepository recetteRepository;
    public List<Recette> getAll() {
        return recetteRepository.findAll();
    }

    public Recette getById(Long id) {
        return recetteRepository.findById(id).orElseThrow(NoResultException::new);
    }

    public Recette create(Recette recette) {
        return recetteRepository.save(recette);
    }

    public Recette update(Recette recette) {

        return recetteRepository.save(recette);
    }

    public void delete(Recette recette) {
        recetteRepository.delete(recette);
    }

    public void deleteById(Long id) {
        recetteRepository.deleteById(id);
    }
}
