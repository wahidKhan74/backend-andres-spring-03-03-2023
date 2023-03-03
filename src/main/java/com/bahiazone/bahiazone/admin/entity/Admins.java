package com.bahiazone.bahiazone.admin.entity;

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

/**
 * Admins Model.
 * @author Andres Vodopivec
 *
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "admins")
public class Admins {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="adminId")
	private int adminId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="fullName")
	private String fullName;
	
	@Column(name="loginType")
	private int loginType;
	
	@Column(name="addedOn")
	private Date addedOn;
	
}
