package com.caih.controller;

import com.caih.service.*;
import com.caih.vo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetData {

	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getIhomeData")
	public @ResponseBody IhomeShow getIhomeData(){		
		IhomeService ihomeService = new IhomeService();
		return ihomeService.getShow();
	}
	
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getTrafficData")
	@ResponseBody
	public TrafficShow getTrafficData(){
		TrafficService trafficService = new TrafficService();
		return trafficService.getShow();
	}
	
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getMedicalData")
	@ResponseBody
	public MedicalShow getMedicalData(){
		MedicalService medicalService = new MedicalService();
		return medicalService.getShow();
	}
	
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getTravelData")
	@ResponseBody
	public TravelShow getTravelData(){
		TravelService travelService = new TravelService();
		return travelService.getShow();
	}

	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getApprovalData")
	@ResponseBody
	public ApprovalShow getApprovalData(){
		ApprovalService approvalService = new ApprovalService();
		return approvalService.getShow();
	}
}
