package com.bitacademy.vo;

public class ApplyInfoVo {
    private int seq;
    private int user_no;
    private String curriculum_no;
    private String applyDate;
    private String applyType;
    private String testDate;
    private String testLang;
    private String testScore;
    private String testResult;
    private String coment;
    private String deposit;
    private String depositAmount;
    private String cardPayDate;
    private String cardPayAmount;
    private String cardPayState;
    private String depositDate;
    private String totalPay;
    private String note;
    private String state;
    private String gisuFlag;
    private String afterPlan;
    private String motive;

    public ApplyInfoVo() {
    }

    public ApplyInfoVo(int user_no, String curriculum_no, String applyDate, String applyType, String testDate, String testLang, String testScore, String testResult, String coment, String deposit, String depositAmount, String cardPayDate, String cardPayAmount, String cardPayState, String depositDate, String totalPay, String note, String state, String gisuFlag, String afterPlan, String motive) {
        this.user_no = user_no;
        this.curriculum_no = curriculum_no;
        this.applyDate = applyDate;
        this.applyType = applyType;
        this.testDate = testDate;
        this.testLang = testLang;
        this.testScore = testScore;
        this.testResult = testResult;
        this.coment = coment;
        this.deposit = deposit;
        this.depositAmount = depositAmount;
        this.cardPayDate = cardPayDate;
        this.cardPayAmount = cardPayAmount;
        this.cardPayState = cardPayState;
        this.depositDate = depositDate;
        this.totalPay = totalPay;
        this.note = note;
        this.state = state;
        this.gisuFlag = gisuFlag;
        this.afterPlan = afterPlan;
        this.motive = motive;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    public String getCurriculum_no() {
        return curriculum_no;
    }

    public void setCurriculum_no(String curriculum_no) {
        this.curriculum_no = curriculum_no;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getTestLang() {
        return testLang;
    }

    public void setTestLang(String testLang) {
        this.testLang = testLang;
    }

    public String getTestScore() {
        return testScore;
    }

    public void setTestScore(String testScore) {
        this.testScore = testScore;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getCardPayDate() {
        return cardPayDate;
    }

    public void setCardPayDate(String cardPayDate) {
        this.cardPayDate = cardPayDate;
    }

    public String getCardPayAmount() {
        return cardPayAmount;
    }

    public void setCardPayAmount(String cardPayAmount) {
        this.cardPayAmount = cardPayAmount;
    }

    public String getCardPayState() {
        return cardPayState;
    }

    public void setCardPayState(String cardPayState) {
        this.cardPayState = cardPayState;
    }

    public String getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(String depositDate) {
        this.depositDate = depositDate;
    }

    public String getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(String totalPay) {
        this.totalPay = totalPay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGisuFlag() {
        return gisuFlag;
    }

    public void setGisuFlag(String gisuFlag) {
        this.gisuFlag = gisuFlag;
    }

    public String getAfterPlan() {
        return afterPlan;
    }

    public void setAfterPlan(String afterPlan) {
        this.afterPlan = afterPlan;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    @Override
    public String toString() {
        return "ApplyInfoVo{" +
                "user_no=" + user_no +
                ", curriculum_no=" + curriculum_no +
                ", applyDate='" + applyDate + '\'' +
                ", applyType='" + applyType + '\'' +
                ", testDate='" + testDate + '\'' +
                ", testLang='" + testLang + '\'' +
                ", testScore='" + testScore + '\'' +
                ", testResult='" + testResult + '\'' +
                ", coment='" + coment + '\'' +
                ", deposit='" + deposit + '\'' +
                ", depositAmount='" + depositAmount + '\'' +
                ", cardPayDate='" + cardPayDate + '\'' +
                ", cardPayAmount='" + cardPayAmount + '\'' +
                ", cardPayState='" + cardPayState + '\'' +
                ", depositDate='" + depositDate + '\'' +
                ", totalPay='" + totalPay + '\'' +
                ", note='" + note + '\'' +
                ", state='" + state + '\'' +
                ", gisuFlag='" + gisuFlag + '\'' +
                ", afterPlan='" + afterPlan + '\'' +
                ", motive='" + motive + '\'' +
                '}';
    }
}
