package com.capgemini.in.SpringInjectionUsingAutowire4;

public class Person {

	int pid;
	String pname;
	Address peradd, tempadd;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Address getPeradd() {
		return peradd;
	}
	public void setPeradd(Address peradd) {
		this.peradd = peradd;
	}
	public Address getTempadd() {
		return tempadd;
	}
	public void setTempadd(Address tempadd) {
		this.tempadd = tempadd;
	}
	 public void showTemp()    {
	        System.out.println("\n Person ID : "+ pid +"\n Person Name :"+ pname + "\n Temp Address : " + tempadd);
	    }
	    public void showPer() {
	        System.out.println("\n Person ID : "+ pid +"\n Person Name :"+ pname + "\n Perm Address : " + peradd);
	    }		
	
}
