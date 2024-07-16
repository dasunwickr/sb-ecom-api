package com.dasunwickr.sbecomapi.dao;

import com.dasunwickr.sbecomapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsDAO extends JpaRepository<Product,Integer> {

}
