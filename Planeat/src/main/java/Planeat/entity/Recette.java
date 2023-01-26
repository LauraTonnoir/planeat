package Planeat.entity;

import javax.persistence.*;

import java.util.Set;
@Entity
@Table(name = "recette")
@SequenceGenerator(name = "seqRecette", sequenceName = "seq_recette", initialValue = 1, allocationSize = 1)

public class Recette {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqRecette")
    private Long idRecette;
    @ManyToMany
    @JoinTable
    private Set<Ingredient> listeIngredient;

    private TypeRecette typerecette;
    @OneToOne
    @JoinColumn
    private FicheRecette ficheRecette;

    @ManyToMany
    @JoinTable
    private Set<Creneau> listeCreneaux;


    @ManyToMany
    @JoinTable
    private Set<Tag> listeTags;
    public Set<Ingredient> getListeIngredient() {
        return listeIngredient;
    }

    public void setListeIngredient(Set<Ingredient> listeIngredient) {
        this.listeIngredient = listeIngredient;
    }

    public FicheRecette getFicheRecette() {
        return ficheRecette;
    }

    public void setFicheRecette(FicheRecette ficheRecette) {
        this.ficheRecette = ficheRecette;
    }

    public TypeRecette getTyperecette() {
        return typerecette;
    }

    public void setTyperecette(TypeRecette typerecette) {
        this.typerecette = typerecette;
    }

    public Recette(Long idRecette) {
        this.idRecette = idRecette;
    }

    public Long getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(Long idRecette) {
        this.idRecette = idRecette;
    }

    public Set<Creneau> getListeCreneaux() {
        return listeCreneaux;
    }

    public void setListeCreneaux(Set<Creneau> listeCreneaux) {
        this.listeCreneaux = listeCreneaux;
    }
}
