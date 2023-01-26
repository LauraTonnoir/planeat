package Planeat.services;

import Planeat.entity.FicheRecette;
import Planeat.repositories.FicheRecetteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class FicheRecetteService {
    @Autowired
    private FicheRecetteRepository ficheRecetteRepository;
    public List<FicheRecette> getAll() {
        return ficheRecetteRepository.findAll();
    }

    public FicheRecette getById(Long id) {
        return ficheRecetteRepository.findById(id).orElseThrow(NoResultException::new);
    }

    public FicheRecette create(FicheRecette creneau) {
        return ficheRecetteRepository.save(creneau);
    }

    public FicheRecette update(FicheRecette creneau) {

        return ficheRecetteRepository.save(creneau);
    }

    public void delete(FicheRecette creneau) {
        ficheRecetteRepository.delete(creneau);
    }

    public void deleteById(Long id) {
        ficheRecetteRepository.deleteById(id);
    }
}