package com.nt.bo;
import java.io.Serializable;
public class CustmerBO {
	private String cname;
	private String cadd;
	private float pamt;
	private float rate;
	private float time;
	private float intrAmt;
	
	//getters and Setters Method
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public float getPamt() {
		return pamt;
	}
	public void setPamt(float pamt) {
		this.pamt = pamt;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public float getIntrAmt() {
		return intrAmt;
	}
	public void setIntrAmt(float intrAmt) {
		this.intrAmt = intrAmt;
	}
	
	//toString()
	@Override
	public String toString() {
		return "CustmerBO [cname=" + cname + ", cadd=" + cadd + ", pamt=" + pamt + ", rate=" + rate + ", time=" + time
				+ ", intrAmt=" + intrAmt + "]";
	}
	
	
}
