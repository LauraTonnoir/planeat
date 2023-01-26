package Planeat.repositories;

import Planeat.entity.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetteRepository extends JpaRepository<Recette,Long> {
}
