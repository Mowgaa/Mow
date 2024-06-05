package com.maepodstro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maepodstro.entities.Bcard;

public interface BcardRepository extends JpaRepository <Bcard,Long> {

}
