package com.bitacademy.vo;

public class CompanyVo {
    private int company_no;
    private String compName;
    private String stockMarket;
    private String address;
    private String tel;
    private String business;
    private String capital;
    private String yearSell;
    private String staffNum;
    private String homePage;
    private String postCode;
    private String introduction;
    private String compResNum;
    private String welfare;

    public CompanyVo() {
    }

    public CompanyVo(int company_no, String compName, String stockMarket, String address, String tel, String business, String capital, String yearSell, String staffNum, String homePage, String postCode, String introduction, String compResNum, String welfare) {
        this.company_no = company_no;
        this.compName = compName;
        this.stockMarket = stockMarket;
        this.address = address;
        this.tel = tel;
        this.business = business;
        this.capital = capital;
        this.yearSell = yearSell;
        this.staffNum = staffNum;
        this.homePage = homePage;
        this.postCode = postCode;
        this.introduction = introduction;
        this.compResNum = compResNum;
        this.welfare = welfare;
    }

    public int getCompany_no() {
        return company_no;
    }

    public void setCompany_no(int company_no) {
        this.company_no = company_no;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getStockMarket() {
        return stockMarket;
    }

    public void setStockMarket(String stockMarket) {
        this.stockMarket = stockMarket;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getYearSell() {
        return yearSell;
    }

    public void setYearSell(String yearSell) {
        this.yearSell = yearSell;
    }

    public String getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getCompResNum() {
        return compResNum;
    }

    public void setCompResNum(String compResNum) {
        this.compResNum = compResNum;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    @Override
    public String toString() {
        return "CompanyVo{" +
                "company_no=" + company_no +
                ", compName='" + compName + '\'' +
                ", stockMarket='" + stockMarket + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", business='" + business + '\'' +
                ", capital='" + capital + '\'' +
                ", yearSell='" + yearSell + '\'' +
                ", staffNum='" + staffNum + '\'' +
                ", homePage='" + homePage + '\'' +
                ", postCode='" + postCode + '\'' +
                ", introduction='" + introduction + '\'' +
                ", compResNum='" + compResNum + '\'' +
                ", welfare='" + welfare + '\'' +
                '}';
    }
}
