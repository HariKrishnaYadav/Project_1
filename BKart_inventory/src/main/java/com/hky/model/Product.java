package com.hky.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@NotEmpty(message = "The name must not be null")
	@Length(message = "The field must be less than 255 characters")
	private Long productName;
	@Length(max = 255, message = "The field must be less than 255 characters")
	private String productSummary;

	@Length(max = 255, message = "The field must be less than 255 characters")
	private String productTagsW;
	@Column(columnDefinition = "TEXT")
	private String productDescription;
	@Column(columnDefinition = "DATETIME")
	private Date productDate;

	@Column(name = "productViews", nullable = false, columnDefinition = "bigint(20) default 0")
	private long productViews = 0;
	@Min(value = 0, message = "Product price must no be less then zero.")
	private double productPrice;

	@NotEmpty(message = "Condition must not be null")
	private String productCondition;

	@Min(value = 0, message = "Product unit must no be less then zero.")
	private int unitInStock;
	@Transient
	private MultipartFile productImage;

	@OneToMany(mappedBy = "product")
	@JsonIgnore
	private List<CartItem> cartItemList;

	@OneToMany(mappedBy = "product")
	@JsonIgnore
	private List<ProductComment> productCommentList;

	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category productCategory;

	@OneToMany(mappedBy = "product")
	@JsonIgnore
	private List<ProductTag> productTags;

	@Override
	public int compareTo(Product arg0) {

		return 0;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductName() {
		return productName;
	}

	public void setProductName(Long productName) {
		this.productName = productName;
	}

	public String getProductSummary() {
		return productSummary;
	}

	public void setProductSummary(String productSummary) {
		this.productSummary = productSummary;
	}

	public String getProductTagsW() {
		return productTagsW;
	}

	public void setProductTagsW(String productTagsW) {
		this.productTagsW = productTagsW;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Date getProductDate() {
		return productDate;
	}

	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	public long getProductViews() {
		return productViews;
	}

	public void setProductViews(long productViews) {
		this.productViews = productViews;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	public List<CartItem> getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(List<CartItem> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public List<ProductComment> getProductCommentList() {
		return productCommentList;
	}

	public void setProductCommentList(List<ProductComment> productCommentList) {
		this.productCommentList = productCommentList;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}

	public List<ProductTag> getProductTags() {
		return productTags;
	}

	public void setProductTags(List<ProductTag> productTags) {
		this.productTags = productTags;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productSummary=" + productSummary
				+ ", productTagsW=" + productTagsW + ", productDescription=" + productDescription + ", productDate="
				+ productDate + ", productViews=" + productViews + ", productPrice=" + productPrice
				+ ", productCondition=" + productCondition + ", unitInStock=" + unitInStock + ", productImage="
				+ productImage + ", cartItemList=" + cartItemList + ", productCommentList=" + productCommentList
				+ ", productCategory=" + productCategory + ", productTags=" + productTags + "]";
	}
	

}
