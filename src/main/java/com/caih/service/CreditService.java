package com.caih.service;

import com.caih.vo.CreditShow;

/**
 * @author:lizhou
 * @data: 2018/7/23 14:20
 */
public interface CreditService {
    CreditShow getShowByCompany(String company);
}
