package com.victim.enumerated_enums;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

	@Id
	@GeneratedValue
	private Long id;

	@Enumerated(EnumType.STRING)
	private TransactionTypes transactionType;

	private String description;

	private String accountNumber;
}