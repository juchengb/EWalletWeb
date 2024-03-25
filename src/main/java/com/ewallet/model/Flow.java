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
public class Flow { //錢包交易明細
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 交易明細編號
	
	@Column
	private Integer orderId; // 交易訂單編號
	
	@Column
	private Integer walletId; // 錢包編號
	
	@Column
	private Double updateAmount; // 更新金額
	
	@Column
	private Double balance; // 交易後餘額
	
}
