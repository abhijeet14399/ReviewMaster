package com.rm.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.review.dao.ResDao;
import com.rm.review.dao.RevDao;
import com.rm.review.dto.ResDto;
import com.rm.review.dto.RevDto;
import com.rm.review.entity.Resreview;
import com.rm.review.entity.Restaurent;

@Service
public class AddServiceImpl implements AddService {

	@Autowired
	ResDao resdao;
	
	@Override
	public String addRes(ResDto rdto) {
		
		Restaurent res=new Restaurent();
		res.setResID(rdto.getId());
		res.setResName(rdto.getName());
		res.setResOwner(rdto.getOwner());
		res.setResAddress(rdto.getAddress());
		res.setResSpecialization(rdto.getSpecialization());
		
		resdao.save(res);
		
		return "Added Successfully";
				
	}

	@Override
	public String addRev(RevDto rdto) {
		Resreview rev= new Resreview();
		rev.setResid(rdto.getResid());
		rev.setReview(rdto.getReview());
		rev.setUserName(rdto.getUserName());
		
		return "review Added";
	}
	
	@Autowired
	RevDao rev;

	@Override
	public int deleteRev(int resid, String comment, String username) {
		int b=rev.deleteReview(username, comment, resid);
		return b;
	}

	@Override
	public List<Resreview> getRestaurentReviews(int resid) {
		
		List<Resreview> list=rev.getReviews(resid);
		
		return list;
	}
	

}
