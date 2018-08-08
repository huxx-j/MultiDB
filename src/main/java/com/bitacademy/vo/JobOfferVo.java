package com.bitacademy.vo;

public class JobOfferVo {
    private int company_no;
    private String hireCnt;
    private String useLang;
    private String useOS;
    private String useDB;
    private String interviewDate;
    private String career;
    private String requirement;
    private String yearIncome;
    private String major;
    private String advantage;
    private String contractType;
    private String field;
    private String welfare;
    private String procedure;
    private String reqDocument;
    private String reqDetail;
    private String telephone;
    private String fax;
    private String cellphone;
    private String email;
    private String name;
    private String department;
    private String position;
    private String etc;
    private String post;
    private String black;
    private String receiptDate;
    private String person;
    private String recruitment;
    private String employment;

    public JobOfferVo() {
    }

    public JobOfferVo(int commpany_no, String hireCnt, String useLang, String useOS, String useDB, String interviewDate, String career, String requirement, String yearIncome, String major, String advantage, String contractType, String field, String welfare, String procedure, String reqDocument, String reqDetail, String telephone, String fax, String handPhone, String email, String name, String department, String position, String etc, String post, String black, String receiptDate, String person, String recruitment, String employment) {
        this.company_no = commpany_no;
        this.hireCnt = hireCnt;
        this.useLang = useLang;
        this.useOS = useOS;
        this.useDB = useDB;
        this.interviewDate = interviewDate;
        this.career = career;
        this.requirement = requirement;
        this.yearIncome = yearIncome;
        this.major = major;
        this.advantage = advantage;
        this.contractType = contractType;
        this.field = field;
        this.welfare = welfare;
        this.procedure = procedure;
        this.reqDocument = reqDocument;
        this.reqDetail = reqDetail;
        this.telephone = telephone;
        this.fax = fax;
        this.cellphone = handPhone;
        this.email = email;
        this.name = name;
        this.department = department;
        this.position = position;
        this.etc = etc;
        this.post = post;
        this.black = black;
        this.receiptDate = receiptDate;
        this.person = person;
        this.recruitment = recruitment;
        this.employment = employment;
    }

    public int getCommpany_no() {
        return company_no;
    }

    public void setCommpany_no(int commpany_no) {
        this.company_no = commpany_no;
    }

    public String getHireCnt() {
        return hireCnt;
    }

    public void setHireCnt(String hireCnt) {
        this.hireCnt = hireCnt;
    }

    public String getUseLang() {
        return useLang;
    }

    public void setUseLang(String useLang) {
        this.useLang = useLang;
    }

    public String getUseOS() {
        return useOS;
    }

    public void setUseOS(String useOS) {
        this.useOS = useOS;
    }

    public String getUseDB() {
        return useDB;
    }

    public void setUseDB(String useDB) {
        this.useDB = useDB;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(String yearIncome) {
        this.yearIncome = yearIncome;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public String getReqDocument() {
        return reqDocument;
    }

    public void setReqDocument(String reqDocument) {
        this.reqDocument = reqDocument;
    }

    public String getReqDetail() {
        return reqDetail;
    }

    public void setReqDetail(String reqDetail) {
        this.reqDetail = reqDetail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(String recruitment) {
        this.recruitment = recruitment;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    @Override
    public String toString() {
        return "JobOfferVo{" +
                "commpany_no=" + company_no +
                ", hireCnt=" + hireCnt +
                ", useLang='" + useLang + '\'' +
                ", useOS='" + useOS + '\'' +
                ", useDB='" + useDB + '\'' +
                ", interviewDate='" + interviewDate + '\'' +
                ", career='" + career + '\'' +
                ", requirement='" + requirement + '\'' +
                ", yearIncome='" + yearIncome + '\'' +
                ", major='" + major + '\'' +
                ", advantage='" + advantage + '\'' +
                ", contractType='" + contractType + '\'' +
                ", field='" + field + '\'' +
                ", welfare='" + welfare + '\'' +
                ", procedure='" + procedure + '\'' +
                ", reqDocument='" + reqDocument + '\'' +
                ", reqDetail='" + reqDetail + '\'' +
                ", telephone='" + telephone + '\'' +
                ", fax='" + fax + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", etc='" + etc + '\'' +
                ", post='" + post + '\'' +
                ", black='" + black + '\'' +
                ", receiptDate='" + receiptDate + '\'' +
                ", person='" + person + '\'' +
                ", recruitment='" + recruitment + '\'' +
                ", employment='" + employment + '\'' +
                '}';
    }
}
