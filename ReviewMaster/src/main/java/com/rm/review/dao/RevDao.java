package com.rm.review.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rm.review.entity.Resreview;

@Repository
public interface RevDao extends JpaRepository<Resreview, Integer> {

	
    //@Query("delete from User u where u.firstName = ?1")
	
   // void deleteUsersByFirstName(String firstName);
	
    @Modifying
    @Transactional
	@Query("delete from Resreview u WHERE u.user_name=?1 and u.review=?2 and u.res_id=?3")
	public int deleteReview(String user_name ,String review, int res_id);
    
    @Query(value = "SELECT * FROM tb_review WHERE res_id = ?1", nativeQuery = true)
     public List<Resreview> getReviews(int res_id);
} 
