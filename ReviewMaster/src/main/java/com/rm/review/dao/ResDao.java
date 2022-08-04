package com.rm.review.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rm.review.entity.Restaurent;

@Repository
public interface ResDao extends JpaRepository<Restaurent, String> {

}
