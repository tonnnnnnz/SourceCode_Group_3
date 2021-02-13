package com.pim.app.project;


public class ProjectForm {
    private int id;
    private String title;
    private String fname;
    private String lname;
    private String date;
    private String stime;
    private String etime;
    private String meeting;
    private String detail;

    public ProjectForm(int id, String title, String fname, String lname, String date, String stime, String etime, String meeting, String detail) {
        this.id = id;
        this.title = title;
        this.fname = fname;
        this.lname = lname;
        this.date = date;
        this.stime = stime;
        this.etime = etime;
        this.meeting = meeting;
        this.detail = detail;
    }

	public ProjectForm() {}

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