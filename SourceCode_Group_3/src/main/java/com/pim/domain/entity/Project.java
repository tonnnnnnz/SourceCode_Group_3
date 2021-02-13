package com.pim.domain.entity;

 


import javax.persistence.*;

import com.sun.istack.NotNull;
 
 
@Entity
@Table(name= "user")
public class Project {



    @GeneratedValue
    @Id
    private int id;

    @NotNull
    private String title;
    private String fname;
    private String lname;
    private String date;
    private String stime;
    private String etime;
    private String meeting;
    private String detail;


	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStime() {
		return stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

	public String getEtime() {
		return etime;
	}

	public void setEtime(String etime) {
		this.etime = etime;
	}
    
    public String getMeeting() {
		return meeting;
	}

	public void setMeeting(String meeting) {
		this.meeting = meeting;
	}



}