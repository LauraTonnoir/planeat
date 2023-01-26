package Planeat.services;

import Planeat.entity.Tag;
import Planeat.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;
    public List<Tag> getAll() {
        return tagRepository.findAll();
    }

    public Tag getById(Long id) {
        return tagRepository.findById(id).orElseThrow(NoResultException::new);
    }

    public Tag create(Tag tag) {
        return tagRepository.save(tag);
    }

    public Tag update(Tag tag) {

        return tagRepository.save(tag);
    }

    public void delete(Tag tag) {
        tagRepository.delete(tag);
    }

    public void deleteById(Long id) {
        tagRepository.deleteById(id);
    }
}
