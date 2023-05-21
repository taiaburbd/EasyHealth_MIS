package it.unicas.products.action;

import com.opensymphony.xwork2.ActionSupport;

import it.unicas.products.dao.ProductManagementDAO;
import it.unicas.products.pojo.Product;

public class UpdateAction extends ActionSupport{

	private String productId;
	private String productName;
	private String productCategory;
	private Integer productPrice;
	
	public String execute() {
		String statusCode = "";
		Product product = new Product(productId, productName, productCategory, productPrice, null);
		int recordUpdated = ProductManagementDAO.updateProduct(product);
		if (recordUpdated == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
		}
		return statusCode;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	
}
