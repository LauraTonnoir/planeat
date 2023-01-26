package Planeat.entity;

import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "etape_recette")
@SequenceGenerator(name = "seqetape_recette", sequenceName = "seqetape_recette", initialValue = 1, allocationSize = 1)

public class EtapeRecette {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqetape_recette")
    @Column(name="id")
    private Long idEtape;
    @ManyToMany(mappedBy = "etapesRecette")
    private Set<FicheRecette> listeRecette;

    public EtapeRecette(Long idEtape) {
        this.idEtape = idEtape;
    }

    public Long getIdEtape() {
        return idEtape;
    }

    public Set<FicheRecette> getListeRecette() {
        return listeRecette;
    }

    public void setListeRecette(Set<FicheRecette> listeRecette) {
        this.listeRecette = listeRecette;
    }

    public void setIdEtape(Long idEtape) {
        this.idEtape = idEtape;
    }

    public String getDescriptionEtape() {
        return DescriptionEtape;
    }

    public void setDescriptionEtape(String descriptionEtape) {
        DescriptionEtape = descriptionEtape;
    }

    private String DescriptionEtape;
}
