package com.ewallet.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flow { //錢包交易明細
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 交易明細編號
	
	@JoinColumn(name = "order_id")
	@ManyToOne
	private Order order; // 交易訂單
	
	@JoinColumn(name = "wallet_id")
	@ManyToOne
	private Wallet wallet; // 交易訂單
	
	@Column
	private Double updateAmount; // 更新金額
	
	@Column
	private Double balance; // 交易後餘額
	
}
