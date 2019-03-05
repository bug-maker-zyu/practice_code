package com.wzy.view;

public class Patient {
	
	private String num;
	private String name;
	private String symptom;
	
	public Patient(String num, String name, String symptom) {
		this.name = name;
		this.num = num;
		this.symptom = symptom;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSymptom() {
		return symptom;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	@Override
	public String toString() {
		return "Patient [num=" + num + ", name=" + name + ", symptom=" + symptom + "]";
	}
	
}
