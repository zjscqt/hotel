package com.hm.hotel_management.repository;

import com.hm.hotel_management.model.Bed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedRepository extends JpaRepository<Bed,Integer> {
}
