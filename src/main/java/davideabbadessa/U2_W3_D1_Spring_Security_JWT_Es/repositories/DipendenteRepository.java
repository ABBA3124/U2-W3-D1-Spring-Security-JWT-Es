package davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.repositories;

import davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, UUID> {
}
