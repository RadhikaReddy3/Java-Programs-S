package com.m;

public class Course {

	 private int cid;
	    private String cname;
	    private int cduration;

	    public void setCid(int id) {
	        this.cid = id;
	    }

	    public void setCname(String name) {
	        this.cname = name;
	    }

	    public void setCduration(int duration) {
	        this.cduration = duration;
	    }

	    public int getCid() {
	        return this.cid;
	    }

	    public String getCname() {
	        return this.cname;
	    }

	    public int getCduration() {
	        return this.cduration;
	    }
}
