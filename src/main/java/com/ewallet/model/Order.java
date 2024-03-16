package com.ewallet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Order {
	Integer id;
	String from;
	String to;
	Integer amount;
	
}
