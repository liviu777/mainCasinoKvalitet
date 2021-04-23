package casino.repositories;


import casino.entities.Casino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CasinoRepository extends JpaRepository<Casino ,Long> {

    Casino findCasinoByName(String name);



}
