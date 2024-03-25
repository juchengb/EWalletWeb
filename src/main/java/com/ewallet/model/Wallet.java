package com.ewallet.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
	
	@Column(unique = true, nullable = false)
	private String adress; // 錢包地址
	
	@Column
	private String name; // 錢包名稱
	
	@Column
	private Currency currency; // 錢包幣別
	
	@Column
	private Double balance; // 錢包餘額
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date lastUpdateTine; // 錢包最後更新時間
	
}
