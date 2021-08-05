package com.nt.gagan.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.gagan.entity.Timings;

public interface TimingRepository extends JpaRepository<Timings, Serializable> {

}
