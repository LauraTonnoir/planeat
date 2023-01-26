package Planeat;

import Planeat.entity.*;
import Planeat.services.IngredientService;
import Planeat.services.RecetteIngredientService;
import Planeat.services.RecetteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class BDD {

    @Autowired
    private IngredientService ingredientService;

    @Autowired
    private RecetteService recetteService;

    @Autowired
    private RecetteIngredientService recetteIngredientService;

    @Test
    public void BDD(){
        System.out.println("BDD les ingredients de base");

        // le filet de poulet
        Ingredient FiletDePoulet = new Ingredient("Filet de poulet");
        FiletDePoulet.setProvenance("Carrefour");
        ingredientService.create(FiletDePoulet);


        //Ramen picard
        Ingredient ramen = new Ingredient("Ramen");
        ramen.setProvenance("Picard");
        ingredientService.create(ramen);

        //Oeuf
        Ingredient oeuf = new Ingredient("oeuf");
        oeuf.setProvenance("carrefour");
        ingredientService.create(oeuf);

        //Harricot vert
        Ingredient hv = new Ingredient("Harricots verts");
        hv.setProvenance("carrefour");
        ingredientService.create(hv);

        //Painitalien
        Ingredient painItalien = new Ingredient("Petit pain Italien");
        painItalien.setProvenance("Picard");
        ingredientService.create(painItalien);

        //coquillette
        Ingredient coquillette = new Ingredient("Coquillette");
        coquillette.setProvenance("Carrefour");
        ingredientService.create(coquillette);

        //jambon blanc
        Ingredient jb = new Ingredient("Jambon Blanc");
        jb.setProvenance("Carrefour");
        ingredientService.create(jb);

        //cube de bouillon de volaille
        Ingredient bdv = new Ingredient("Cube de bouillon de volaille");
       bdv.setProvenance("Carrefour");
        ingredientService.create(bdv);

        //oignon
        Ingredient oignon = new Ingredient("Oignon");
        oignon.setProvenance("Carrefour");
        ingredientService.create(oignon);

        //ail
        Ingredient ail = new Ingredient("Ail");
        ail.setProvenance("Carrefour");
        ingredientService.create(ail);

        //creme fraiche
        Ingredient cf = new Ingredient("Creme Fraiche");
        cf.setProvenance("Carrefour");
        ingredientService.create(cf);


        //parmesan
        Ingredient parmesan = new Ingredient("parmesan");
        parmesan.setProvenance("Carrefour");
        ingredientService.create(parmesan);

        //ciboullette
        Ingredient ciboullette = new Ingredient("ciboullette");
        ciboullette.setProvenance("Carrefour");
        ingredientService.create(ciboullette);



        System.out.println("BDD RECETTE avec ces ingredients");

        //recette type complet ramen picard
        Recette recetteRamen = new Recette("Ramen Picard");
        recetteRamen.setTyperecette(TypeRecette.Complet); //optionnel
        RecetteIngredientKey recetteRameKey = new RecetteIngredientKey(ramen,recetteRamen);
        RecetteIngredient recetteRamenRI = new RecetteIngredient(recetteRameKey);
        recetteRamenRI.setQuantiteIngredient((long)1); //optionnel
        recetteRamenRI.setUniteIngredient(UniteIngredient.unité); //optionnel
        Set<RecetteIngredient> listeingredientramen = new HashSet<>();
        listeingredientramen.add(recetteRamenRI);
        recetteRamen.setListerecetteIngredient(listeingredientramen);
        recetteService.create(recetteRamen);
        recetteIngredientService.create(recetteRamenRI);

        //  risotto de coquillette de Cyril
        Recette rco = new Recette("Risotto de coquillettes Jambon Cyril Lignac");
        rco.setTyperecette(TypeRecette.Complet);

        RecetteIngredientKey rcocoquilletteKey = new RecetteIngredientKey(coquillette,rco);
        RecetteIngredient rcocoquilletteRI  = new RecetteIngredient(rcocoquilletteKey);
        rcocoquilletteRI.setUniteIngredient(UniteIngredient.gramme);
        rcocoquilletteRI.setQuantiteIngredient(100L);

        RecetteIngredientKey rcojbKey = new RecetteIngredientKey(jb,rco);
        RecetteIngredient rcojbRI = new RecetteIngredient(rcojbKey);
        rcojbRI.setQuantiteIngredient(1L);
        rcojbRI.setUniteIngredient(UniteIngredient.unité);

        RecetteIngredientKey rcocbvkey = new RecetteIngredientKey(bdv,rco);
        RecetteIngredient rcobdvRI = new RecetteIngredient(rcocbvkey);

        RecetteIngredientKey rcooignonkey = new RecetteIngredientKey(oignon,rco);
        RecetteIngredient rcoOignonRI = new RecetteIngredient(rcooignonkey);

        RecetteIngredientKey rcocfKey = new RecetteIngredientKey(cf,rco);
        RecetteIngredient rcocfRI = new RecetteIngredient(rcocfKey);
        rcocfRI.setQuantiteIngredient(1L);
        rcocfRI.setUniteIngredient(UniteIngredient.cuillère_à_soupe);

        RecetteIngredientKey rcocparmKEY = new RecetteIngredientKey(parmesan,rco);
        RecetteIngredient rcoparmRI = new RecetteIngredient(rcocparmKEY);
        rcoparmRI.setQuantiteIngredient((long) 12.5);
        rcoparmRI.setUniteIngredient(UniteIngredient.gramme);

        Set<RecetteIngredient> listeingredientrco = new HashSet<>();
        listeingredientrco.add(rcocoquilletteRI);
        listeingredientrco.add(rcojbRI);
        listeingredientrco.add(rcobdvRI);
        listeingredientrco.add(rcoOignonRI);
        listeingredientrco.add(rcocfRI);
        listeingredientrco.add(rcoparmRI);
        rco.setListerecetteIngredient(listeingredientrco);
        recetteService.create(rco);
        recetteIngredientService.create(rcocoquilletteRI);
        recetteIngredientService.create(rcojbRI);
        recetteIngredientService.create(rcobdvRI);
        recetteIngredientService.create(rcoOignonRI);
        recetteIngredientService.create(rcocfRI);
        recetteIngredientService.create(rcoparmRI);




        //oeuf aux plat
        Recette oeufauxplat = new Recette("Oeufs au plat");
        oeufauxplat.setTyperecette(TypeRecette.Proteine);
        RecetteIngredientKey oeufauxplatKey = new RecetteIngredientKey(oeuf,oeufauxplat);
        RecetteIngredient oeufauxplatRI = new RecetteIngredient(oeufauxplatKey);
        oeufauxplatRI.setQuantiteIngredient((long)2);
        oeufauxplatRI.setUniteIngredient(UniteIngredient.unité);
        Set<RecetteIngredient> listeIoeufplat = new HashSet<>();
        listeIoeufplat.add(oeufauxplatRI);
        oeufauxplat.setListerecetteIngredient(listeIoeufplat);
        recetteService.create(oeufauxplat);
        recetteIngredientService.create(oeufauxplatRI);



        //omelette



        //recette de type protéin filet de poulet à la poele
       Recette FiletDePouletALaPoele = new Recette("Filet de poulet à la poêle");
        RecetteIngredientKey pouletALaPoeleKey = new RecetteIngredientKey(FiletDePoulet, FiletDePouletALaPoele);
      RecetteIngredient pouletALaPoeleRI = new RecetteIngredient(pouletALaPoeleKey);
      pouletALaPoeleRI.setQuantiteIngredient((long) 1);
      pouletALaPoeleRI.setUniteIngredient(UniteIngredient.unité);
        Set<RecetteIngredient> listeIngredientrecettepoulet = new HashSet<RecetteIngredient>();
        listeIngredientrecettepoulet.add(pouletALaPoeleRI);
     FiletDePouletALaPoele.setListerecetteIngredient(listeIngredientrecettepoulet);
     FiletDePouletALaPoele.setTyperecette(TypeRecette.Proteine);
      recetteService.create(FiletDePouletALaPoele);
        recetteIngredientService.create(pouletALaPoeleRI);





    }

    }

