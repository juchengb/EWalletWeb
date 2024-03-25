package com.ewallet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order { // 交易訂單
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 交易訂單編號
	
	@Column
	private String fromWalletAdress; // 轉出之錢包地址
	
	@Column
	private String toWalletAdress; // 轉入之錢包地址
	
	@Column
	private Double amount; // 交易金額
	
}
