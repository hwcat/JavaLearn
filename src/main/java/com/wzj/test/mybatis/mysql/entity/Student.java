package com.wzj.test.mybatis.mysql.entity;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
    private static final long serialVersionUID = -7255758731320028542L;

    private int ID;
    
    private String name;
    
    private String sex;
    
    private String tel;
    
    private String major;
    
    private String description;
    
    private Date entranceDate;

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((entranceDate == null) ? 0 : entranceDate.hashCode());
        result = prime * result + ((major == null) ? 0 : major.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((sex == null) ? 0 : sex.hashCode());
        result = prime * result + ((tel == null) ? 0 : tel.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        if (ID != other.ID) return false;
        if (description == null) {
            if (other.description != null) return false;
        } else if (!description.equals(other.description)) return false;
        if (entranceDate == null) {
            if (other.entranceDate != null) return false;
        } else if (!entranceDate.equals(other.entranceDate)) return false;
        if (major == null) {
            if (other.major != null) return false;
        } else if (!major.equals(other.major)) return false;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        if (sex == null) {
            if (other.sex != null) return false;
        } else if (!sex.equals(other.sex)) return false;
        if (tel == null) {
            if (other.tel != null) return false;
        } else if (!tel.equals(other.tel)) return false;
        return true;
    }
    
}
