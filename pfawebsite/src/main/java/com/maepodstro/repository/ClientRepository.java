package com.maepodstro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maepodstro.entities.Client;

public interface ClientRepository extends JpaRepository <Client,Long> {

}
