package com.smartcontact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contacts")
public class Contact {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String cFirstName;
	private String cLastName;
	private String cPhone;
	private String cEmail;
	private String cWork;
	private String cImage;
	@Column(length = 500)
	private String cDecriptions;
	@ManyToOne
	private User user;
	
	
	

}
