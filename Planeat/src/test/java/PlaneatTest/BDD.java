package PlaneatTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PlaneatApplicationTests.class)
class BDD {

    @Test
    public void recettesBDD(){
        System.out.println("BDD les recettes de base");

    }
    @Test
    public void ingredientBDD(){
        System.out.println("BDD les ingredients de base");

    }
}
