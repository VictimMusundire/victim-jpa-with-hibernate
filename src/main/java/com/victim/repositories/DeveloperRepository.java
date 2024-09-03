package com.victim.repositories;

import com.victim.embedded_entities.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Victim Musundire
 */

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}
