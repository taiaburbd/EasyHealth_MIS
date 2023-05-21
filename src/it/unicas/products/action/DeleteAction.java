package it.unicas.products.action;

import com.opensymphony.xwork2.ActionSupport;

import it.unicas.products.dao.ProductManagementDAO;

public class DeleteAction extends ActionSupport{

	private String productId;
	
	public String execute() {
		String statusCode = "";
		int recordDeleted = ProductManagementDAO.deleteProduct(productId);
		if (recordDeleted == 1) {
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
}
