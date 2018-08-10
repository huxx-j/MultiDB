package com.bitacademy.vo;

public class LicenseVo {
    private int seq;
    private int user_no;
    private String liceName;
    private String acquireDate;
    private String issueOrgan;
    private String score;

    public LicenseVo() {
    }

    public LicenseVo(int user_no, String liceName, String acquireDate, String issueOrgan, String score) {
        this.user_no = user_no;
        this.liceName = liceName;
        this.acquireDate = acquireDate;
        this.issueOrgan = issueOrgan;
        this.score = score;
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

    public String getLiceName() {
        return liceName;
    }

    public void setLiceName(String liceName) {
        this.liceName = liceName;
    }

    public String getAcquireDate() {
        return acquireDate;
    }

    public void setAcquireDate(String acquireDate) {
        this.acquireDate = acquireDate;
    }

    public String getIssueOrgan() {
        return issueOrgan;
    }

    public void setIssueOrgan(String issueOrgan) {
        this.issueOrgan = issueOrgan;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "LicenseVo{" +
                "user_no=" + user_no +
                ", liceName='" + liceName + '\'' +
                ", acquireDate='" + acquireDate + '\'' +
                ", issueOrgan='" + issueOrgan + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
