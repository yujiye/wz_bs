package com.caih.controller;

import com.caih.service.*;
import com.caih.vo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetData {

	@Autowired
	IhomeService ihomeService;
	@Autowired
	TrafficService trafficService;
	@Autowired
	MedicalService medicalService;
	@Autowired
	TravelService travelService;
    @Autowired
    ApprovalService approvalService;
	@Autowired
	CreditService creditService;
	//用/getIhomeData.action访问
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getIhomeData")
	public @ResponseBody IhomeShow getIhomeData(){
		return ihomeService.getShow();
	}

	//用/getTrafficData.action访问
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getTrafficData")
	@ResponseBody
	public TrafficShow getTrafficData(){
		return trafficService.getShow();
	}

	//用/getMedicalData.action访问
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getMedicalData")
	@ResponseBody
	public MedicalShow getMedicalData(){
		return medicalService.getShow();
	}

	//用/getTravelData.action访问
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getTravelData")
	@ResponseBody
	public TravelShow getTravelData(){
		return travelService.getShow();
	}

	//用/getApprovalData.action访问
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getApprovalData")
	@ResponseBody
	public ApprovalShow getApprovalData(){
		return approvalService.getShow();
	}

	//用/getCreditData.action访问
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getCreditData")
	@ResponseBody
	public CreditShow getCreditData(@Param("company") String company){
		return creditService.getShowByCompany(company);
	}
}
