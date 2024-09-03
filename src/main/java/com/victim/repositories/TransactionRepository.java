package com.victim.repositories;

import com.victim.enumerated_enums.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Victim Musundire
 */

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
