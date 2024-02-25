package com.RelationslikeAADHARandMOBILE;

public class AADHAR {
	
	public AADHAR(){
		
	}
	public AADHAR(int aid, long ano, String aloc) {
		super();
		this.aid = aid;
		this.ano = ano;
		this.aloc = aloc;
	}
	
	private int aid;
	private long ano;
	private String aloc;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public long getAno() {
		return ano;
	}
	public void setAno(long ano) {
		this.ano = ano;
	}
	public String getAloc() {
		return aloc;
	}
	public void setAloc(String aloc) {
		this.aloc = aloc;
	}
	 
	 

}
