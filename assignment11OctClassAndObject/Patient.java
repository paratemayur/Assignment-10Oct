package com.mayur.assignment11OctClassAndObject;

public class Patient {

	private String patientName;
	private Double height;
	private Double weight;

	public Patient() {
	}

	public Patient(String patientName, Double height, Double weight) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double computeBMI() {
//		this.height = height;
//		this.weight = weight;
		return this.weight / (this.height * this.height);

	}

	public static void main(String[] args) {
		Patient p = new Patient("Subrat", 2.2, 57.00);
		System.out.println("Name of Patient : " + p.patientName + "\nBMI : " + p.computeBMI());
	}
}