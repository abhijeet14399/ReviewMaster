package com.rm.review.service;

import java.util.List;

import com.rm.review.dto.ResDto;
import com.rm.review.dto.RevDto;
import com.rm.review.entity.Resreview;

public interface AddService {

	public String addRes(ResDto rdto);
	
	public String addRev(RevDto rdto);
	
	public int deleteRev(int resid, String comment, String username);
	
	public List<Resreview> getRestaurentReviews(int resid);

	
}
