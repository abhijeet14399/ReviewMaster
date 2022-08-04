package com.rm.review.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rm.review.dto.ResDto;
import com.rm.review.dto.RevDto;
import com.rm.review.entity.Resreview;
import com.rm.review.service.AddService;

@RestController
@CrossOrigin("*")
@RequestMapping("/rev")
public class ResController {

	@Autowired
	AddService add;
	
	@PostMapping("/add")
	public String addRestaurent(@Valid @RequestBody ResDto rdto, BindingResult br) {
		System.out.println(rdto);
		String str = add.addRes(rdto);
		return str;

	}
	
	@PostMapping("/addRev")  //Adding the review 
	public String addRestaurent(@Valid @RequestBody RevDto rdto, BindingResult br) {
		System.out.println(rdto);
		String str = add.addRev(rdto);
		return str;

	}
	
	@DeleteMapping("/delete/{resid}/{comment}/{username}") //Deleting the review
	public String deleteBill(@PathVariable int resid, @PathVariable String comment, @PathVariable String username) {
		
		int b = add.deleteRev(resid, comment, username);
		if(b==1) {
			return "Review Deleted Successfully";
		}
		else
			
		return "Review Already Deleted or Not found";
	}
	

	@GetMapping("/getreviews/{resid}")
	public ResponseEntity<?> getReviewsofRestaurent(@PathVariable int resid) {
		List<Resreview> list=add.getRestaurentReviews(resid);
		if(list.isEmpty()) {
			return ResponseEntity.badRequest().body("Error: Reviews not found. Be the first to post review !");
		}
		return new ResponseEntity<List<Resreview>>(add.getRestaurentReviews(resid), HttpStatus.OK);
		

	}
	
}
