package com.caih.vo;

import java.util.Map;

import com.caih.bo.IhomeIll;
import com.caih.bo.IhomeMerchantType;
import com.caih.bo.IhomeServicePurchase;
import com.caih.bo.IhomeUserNum;

public class IhomeData {
	private String currentServiceNum;
	private String onlineServiceNum;
	private String offlineServiceNum;
	private String satisfactionRate;
	private String serviceTotalNumMonth;
	private Map<String,String> serviceNumMonth;
	private Map<String,String> serviceTimeMonth;
	private IhomeServicePurchase servicePurchase;
	private IhomeMerchantType merchantType;
	private IhomeUserNum userNum;
	private IhomeIll ill;
	public String getCurrentServiceNum() {
		return currentServiceNum;
	}
	public void setCurrentServiceNum(String currentServiceNum) {
		this.currentServiceNum = currentServiceNum;
	}
	public String getOnlineServiceNum() {
		return onlineServiceNum;
	}
	public void setOnlineServiceNum(String onlineServiceNum) {
		this.onlineServiceNum = onlineServiceNum;
	}
	public String getOfflineServiceNum() {
		return offlineServiceNum;
	}
	public void setOfflineServiceNum(String offlineServiceNum) {
		this.offlineServiceNum = offlineServiceNum;
	}
	public String getSatisfactionRate() {
		return satisfactionRate;
	}
	public void setSatisfactionRate(String satisfactionRate) {
		this.satisfactionRate = satisfactionRate;
	}
	public String getServiceTotalNumMonth() {
		return serviceTotalNumMonth;
	}
	public void setServiceTotalNumMonth(String serviceTotalNumMonth) {
		this.serviceTotalNumMonth = serviceTotalNumMonth;
	}
	public Map<String, String> getServiceNumMonth() {
		return serviceNumMonth;
	}
	public void setServiceNumMonth(Map<String, String> serviceNumMonth) {
		this.serviceNumMonth = serviceNumMonth;
	}
	public Map<String, String> getServiceTimeMonth() {
		return serviceTimeMonth;
	}
	public void setServiceTimeMonth(Map<String, String> serviceTimeMonth) {
		this.serviceTimeMonth = serviceTimeMonth;
	}
	public IhomeServicePurchase getServicePurchase() {
		return servicePurchase;
	}
	public void setServicePurchase(IhomeServicePurchase servicePurchase) {
		this.servicePurchase = servicePurchase;
	}
	public IhomeMerchantType getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(IhomeMerchantType merchantType) {
		this.merchantType = merchantType;
	}
	public IhomeUserNum getUserNum() {
		return userNum;
	}
	public void setUserNum(IhomeUserNum userNum) {
		this.userNum = userNum;
	}
	public IhomeIll getIll() {
		return ill;
	}
	public void setIll(IhomeIll ill) {
		this.ill = ill;
	}
}
