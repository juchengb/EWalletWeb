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
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date createTime; // 交易訂單成立時間
	
}
