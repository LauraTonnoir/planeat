package Planeat.services;

import Planeat.entity.Semaine;
import Planeat.repositories.SemaineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class SemaineService {
    @Autowired
    private SemaineRepository semaineRepository;
    public List<Semaine> getAll() {
        return semaineRepository.findAll();
    }

    public Semaine getById(Long id) {
        return semaineRepository.findById(id).orElseThrow(NoResultException::new);
    }

    public Semaine create(Semaine semaine) {
        return semaineRepository.save(semaine);
    }

    public Semaine update(Semaine semaine) {

        return semaineRepository.save(semaine);
    }

    public void delete(Semaine semaine) {
        semaineRepository.delete(semaine);
    }

    public void deleteById(Long id) {
        semaineRepository.deleteById(id);
    }
}