package com.ewallet.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Wallet {
	
	Integer id;
	String user;
	Date lastUpdate;
	
}
