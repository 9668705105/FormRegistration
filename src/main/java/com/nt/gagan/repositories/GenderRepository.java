package com.nt.gagan.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.gagan.entity.Genders;

public interface GenderRepository extends JpaRepository<Genders, Serializable> {

}
