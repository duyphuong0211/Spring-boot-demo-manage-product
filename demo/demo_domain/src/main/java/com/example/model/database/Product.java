package com.example.model.database;

import com.example.model.dto.ProductDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Table(name = "product")
@NoArgsConstructor
@Entity
public class Product {
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String name;
	private String brand;
	private String madein;
	private float price;

	public static Product newProduct(ProductDTO dto) {
		Product product = new Product();
		product.setName(dto.getName());
		product.setMadein(dto.getMadein());
		product.setId(dto.getId());
		product.setBrand(dto.getBrand());
		product.setPrice(dto.getPrice());
		return product;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
