package com.hky.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="code")
	private String code;
	@Column(name="name")
	private String name;
	@Column(name="descr")
	private String description;
	@Column(name="prices")
	private double prices;
	//@Transient
	//private boolean inStock = true;

}
