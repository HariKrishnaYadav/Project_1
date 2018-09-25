package com.hky.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Product implements Serializable, Comparable<Product> {

	private static final long serialVersionUID = -6989243970039135205L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	@Override
	public int compareTo(Product arg0) {
		
		return 0;
	}
	

	

}
