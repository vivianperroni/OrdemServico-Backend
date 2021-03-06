package ordemservico.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ordemservico.entities.Servidor;

@Repository
public interface ServidorRepository extends JpaRepository<Servidor, Long> {
	boolean existsByEmail(String email);
	Optional<Servidor> findByEmail(String email);
}
