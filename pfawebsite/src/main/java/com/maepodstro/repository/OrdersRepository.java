package com.maepodstro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maepodstro.entities.Orders;

public interface OrdersRepository extends JpaRepository <Orders,Long> {

}
