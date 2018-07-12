package com.caih.controller;

import com.caih.service.*;
import com.caih.vo.*;
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

	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getIhomeData")
	public @ResponseBody IhomeShow getIhomeData(){
		return ihomeService.getShow();
	}
	
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getTrafficData")
	@ResponseBody
	public TrafficShow getTrafficData(){
		return trafficService.getShow();
	}
	
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getMedicalData")
	@ResponseBody
	public MedicalShow getMedicalData(){
		return medicalService.getShow();
	}

	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getTravelData")
	@ResponseBody
	public TravelShow getTravelData(){
		return travelService.getShow();
	}

	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getApprovalData")
	@ResponseBody
	public ApprovalShow getApprovalData(){
		return approvalService.getShow();
	}
}
