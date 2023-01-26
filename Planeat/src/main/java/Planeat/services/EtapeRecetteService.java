package Planeat.services;

import Planeat.entity.EtapeRecette;
import Planeat.repositories.EtapeRecetteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class EtapeRecetteService {

@Autowired
    private EtapeRecetteRepository etapeRecetteRepository;

    public List<EtapeRecette> getAll() {
        return etapeRecetteRepository.findAll();
    }

    public EtapeRecette getById(Long id) {
        return etapeRecetteRepository.findById(id).orElseThrow(NoResultException::new);
    }

    public EtapeRecette create(EtapeRecette etapeRecette) {
        return etapeRecetteRepository.save(etapeRecette);
    }

    public EtapeRecette update(EtapeRecette etapeRecette) {

        return etapeRecetteRepository.save(etapeRecette);
    }

    public void delete(EtapeRecette etapeRecette) {
        etapeRecetteRepository.delete(etapeRecette);
    }

    public void deleteById(Long id) {
        etapeRecetteRepository.deleteById(id);
    }

}
