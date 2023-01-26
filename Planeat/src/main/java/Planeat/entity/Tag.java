package Planeat.entity;

import javax.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tag")
@SequenceGenerator(name = "seqTag", sequenceName = "seq_tag", initialValue = 1, allocationSize = 1)

public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTag")
    private Long idTag;
    @ManyToMany(mappedBy = "listeTags")
    private Set<Recette>listeRecette;
    public Long getIdTag() {
        return idTag;
    }

    public void setIdTag(Long idTag) {
        this.idTag = idTag;
    }


    public Tag(Long idTag) {
        this.idTag = idTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(idTag, tag.idTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTag);
    }
}
