package com.byes.paap.rest.byescostcenterinterface.dto;

public class CostCenterDTO
{
    private String tenantId;
	private String companyName;
	private String orderType;
	private String code;
	private String shortDescription;
	private String description;
	private String codeLevel;
	private String parentCode;
	private String status;
	private String responsiblePerson;
	private String startDateValidity;
    private String endDateValidity;
    private String lastDateUpdated;
    private String profitCenter;
    private String profitCenterDesc;
    
    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getOrderType() {
        return orderType;
    }
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCodeLevel() {
        return codeLevel;
    }
    public void setCodeLevel(String codeLevel) {
        this.codeLevel = codeLevel;
    }
    public String getParentCode() {
        return parentCode;
    }
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getResponsiblePerson() {
        return responsiblePerson;
    }
    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }
    public String getStartDateValidity() {
        return startDateValidity;
    }
    public void setStartDateValidity(String startDateValidity) {
        this.startDateValidity = startDateValidity;
    }
    public String getEndDateValidity() {
        return endDateValidity;
    }
    public void setEndDateValidity(String endDateValidity) {
        this.endDateValidity = endDateValidity;
    }
    public String getLastDateUpdated() {
        return lastDateUpdated;
    }
    public void setLastDateUpdated(String lastDateUpdated) {
        this.lastDateUpdated = lastDateUpdated;
    }
    public String getProfitCenter() {
        return profitCenter;
    }
    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
    }
    public String getProfitCenterDesc() {
        return profitCenterDesc;
    }
    public void setProfitCenterDesc(String profitCenterDesc) {
        this.profitCenterDesc = profitCenterDesc;
    }
    
}