package Planeat.services;

import Planeat.entity.Creneau;
import Planeat.repositories.CreneauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class CreneauService {
@Autowired
    private CreneauRepository creneauRepository;
    public List<Creneau> getAll() {
        return creneauRepository.findAll();
    }

    public Creneau getById(Long id) {
        return creneauRepository.findById(id).orElseThrow(NoResultException::new);
    }

    public Creneau create(Creneau creneau) {
        return creneauRepository.save(creneau);
    }

    public Creneau update(Creneau creneau) {

        return creneauRepository.save(creneau);
    }

    public void delete(Creneau creneau) {
        creneauRepository.delete(creneau);
    }

    public void deleteById(Long id) {
        creneauRepository.deleteById(id);
    }
}
