package com.turfbooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turfbooking.Entity.Turf;

public interface TurfRepository extends JpaRepository<Turf, Long>{

}
