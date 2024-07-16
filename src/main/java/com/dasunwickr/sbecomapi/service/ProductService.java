package com.dasunwickr.sbecomapi.service;

import com.dasunwickr.sbecomapi.dao.ProductsDAO;
import com.dasunwickr.sbecomapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public class ProductService {

    ProductsDAO productsDAO;

    @Autowired
    public void setProductsDAO(ProductsDAO productsDAO) {
        this.productsDAO = productsDAO;
    }

    public List<Product> getAllProducts() {
        return productsDAO.findAll();
    }

    public Product getProductById(int id) {
        return productsDAO.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        productsDAO.save(product);
        return product;
    }

    public Product updateProduct (Product product, MultipartFile imageFile) throws IOException {
        product.setImageData(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return productsDAO.save(product);
    }


    public void deleteProduct(int id) {
        productsDAO.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        return productsDAO.searchProduct(keyword);
    }
}
