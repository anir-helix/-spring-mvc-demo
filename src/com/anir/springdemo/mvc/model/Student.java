package com.anir.springdemo.mvc.model;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private String stream;
	private String country;
	private String degree;
	private String[] languagepref;
	
	private LinkedHashMap<String, String> streamOptions;
	private LinkedHashMap<String, String> langOptions;
	
	
	/**
	 * 
	 */
	public Student() {
		//Populate stream Options by initializing LinkedHashMap
		streamOptions = new LinkedHashMap<>();
		
		streamOptions.put("Science" ,"Science");
		streamOptions.put("ARTS" ,"ARTS");
		streamOptions.put("Comm" ,"Commerce");
		streamOptions.put("Bio-Sc" ,"Bio-Sc");
		
		langOptions = new LinkedHashMap<>();
		langOptions.put("English","English");
		langOptions.put("Spanish","Spanish");
		langOptions.put("Hindi","Hindi");
		langOptions.put("Nepali","Nepali");
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public int getAge() {
		return age;
	}


	public String getStream() {
		return stream;
	}


	public String getCountry() {
		return country;
	}


	public String getDegree() {
		return degree;
	}


	public String[] getLanguagepref() {
		return languagepref;
	}


	public LinkedHashMap<String, String> getStreamOptions() {
		return streamOptions;
	}


	public LinkedHashMap<String, String> getLangOptions() {
		return langOptions;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @param age the age to set
	 */
	public final void setAge(int age) {
		this.age = age;
	}


	/**
	 * @param stream the stream to set
	 */
	public final void setStream(String stream) {
		this.stream = stream;
	}


	/**
	 * @param country the country to set
	 */
	public final void setCountry(String country) {
		this.country = country;
	}


	/**
	 * @param degree the degree to set
	 */
	public final void setDegree(String degree) {
		this.degree = degree;
	}


	/**
	 * @param languagepref the languagepref to set
	 */
	public final void setLanguagepref(String[] languagepref) {
		this.languagepref = languagepref;
	}
	
}
