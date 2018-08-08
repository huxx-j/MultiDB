package com.bitacademy.vo;

public class UserSchoolVo {
    private int user_no;
    private String startDate;
    private String endDate;
    private String school;
    private String state;
    private String location;
    private String degree;
    private String major;
    private String subMajor;

    public UserSchoolVo() {
    }

    public UserSchoolVo(int user_no, String startDate, String endDate, String school, String state, String location, String degree, String major, String subMajor) {
        this.user_no = user_no;
        this.startDate = startDate;
        this.endDate = endDate;
        this.school = school;
        this.state = state;
        this.location = location;
        this.degree = degree;
        this.major = major;
        this.subMajor = subMajor;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSubMajor() {
        return subMajor;
    }

    public void setSubMajor(String subMajor) {
        this.subMajor = subMajor;
    }

    @Override
    public String toString() {
        return "UserSchoolVo{" +
                "user_no=" + user_no +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", school='" + school + '\'' +
                ", state='" + state + '\'' +
                ", location='" + location + '\'' +
                ", degree='" + degree + '\'' +
                ", major='" + major + '\'' +
                ", subMajor='" + subMajor + '\'' +
                '}';
    }
}
