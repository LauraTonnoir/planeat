package Planeat.services;

import Planeat.entity.Jour;
import Planeat.repositories.JourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class JourService {
    @Autowired
    private JourRepository jourRepository;
    public List<Jour> getAll() {
        return jourRepository.findAll();
    }

    public Jour getById(Long id) {
        return jourRepository.findById(id).orElseThrow(NoResultException::new);
    }

    public Jour create(Jour jour) {
        return jourRepository.save(jour);
    }

    public Jour update(Jour jour) {

        return jourRepository.save(jour);
    }

    public void delete(Jour jour) {
        jourRepository.delete(jour);
    }

    public void deleteById(Long id) {
        jourRepository.deleteById(id);
    }
}