package com.maepodstro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maepodstro.entities.Product;

public interface ProductRepository extends JpaRepository <Product,Long> {

}
