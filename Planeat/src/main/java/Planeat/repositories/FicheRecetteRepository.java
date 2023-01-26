package Planeat.repositories;

import Planeat.entity.FicheRecette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FicheRecetteRepository extends JpaRepository<FicheRecette,Long> {
}
