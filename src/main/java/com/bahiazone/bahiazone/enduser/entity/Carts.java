package com.bahiazone.bahiazone.enduser.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "carts")
public class Carts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cartId")
	private int cartId;
	
	@Column(name="productId")
	private int productId;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="quantity")
	private int quantity;
	

	
}