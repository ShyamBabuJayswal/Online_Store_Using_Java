package com.project.nine_zero_nine.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;

public class ProductDto {
	@NotEmpty(message="The name is required")
	private String name;
	
	@NotEmpty(message="The brand is required")
	private String brand;
	
	@NotEmpty(message="The  is required")
	private String category;
	
	@Min(0)
	private double price;
	@Size(min=10, message="The description should be at least 10 characters")
	@Size(max=2000, message="The description cannot exceed 2000 characters")
	private String description;
	
	private MultipartFile imageFile;

}
