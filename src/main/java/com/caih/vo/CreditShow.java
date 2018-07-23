package com.caih.vo;

import java.util.List;

public class CreditShow {
    private String status;
    private String company;
    private String createtime;
    private List<CreditData> messageList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public List<CreditData> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<CreditData> messageList) {
        this.messageList = messageList;
    }
}
