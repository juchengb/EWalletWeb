package com.ewallet.model;

import java.util.Date;

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
public class Wallet { // 錢包資訊
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 錢包編號
	
	@Column
	private String adress; // 錢包地址
	
	@Column
	private String name; // 錢包名稱
	
	@Column
	private Currency currency; // 錢包幣別
	
	@Column
	private Double balance; // 錢包餘額
	
	@Column
	private Date lastUpdate; // 錢包最後更新時間
	
}
