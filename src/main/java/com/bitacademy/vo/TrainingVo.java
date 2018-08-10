package com.bitacademy.vo;

public class TrainingVo {
    private int seq;
    private int user_no;
    private String startDate;
    private String endDate;
    private String eduCenterName;
    private String eduCourseName;
    private String content;

    public TrainingVo() {
    }

    public TrainingVo(int seq, int user_no, String startDate, String endDate, String eduCenterName, String eduCourseName, String content) {
        this.seq = seq;
        this.user_no = user_no;
        this.startDate = startDate;
        this.endDate = endDate;
        this.eduCenterName = eduCenterName;
        this.eduCourseName = eduCourseName;
        this.content = content;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEduCenterName() {
        return eduCenterName;
    }

    public void setEduCenterName(String eduCenterName) {
        this.eduCenterName = eduCenterName;
    }

    public String getEduCourseName() {
        return eduCourseName;
    }

    public void setEduCourseName(String eduCourseName) {
        this.eduCourseName = eduCourseName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TrainingVo{" +
                "seq=" + seq +
                ", user_no=" + user_no +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", eduCenterName='" + eduCenterName + '\'' +
                ", eduCourseName='" + eduCourseName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

