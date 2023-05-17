package com.solution;

public class Venue {
	
	private String id;
	
	private String name;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private int capacity;
	
	private int minimum_tour_duration_in_days;
	
	

	public Venue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venue(String id, String name, String city, String state, String country, int capacity,
			int minimum_tour_duration_in_days) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.capacity = capacity;
		this.minimum_tour_duration_in_days = minimum_tour_duration_in_days;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getMinimum_tour_duration_in_days() {
		return minimum_tour_duration_in_days;
	}

	public void setMinimum_tour_duration_in_days(int minimum_tour_duration_in_days) {
		this.minimum_tour_duration_in_days = minimum_tour_duration_in_days;
	}

	@Override
	public String toString() {
		return "Venue [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", capacity=" + capacity + ", minimum_tour_duration_in_days=" + minimum_tour_duration_in_days + "]";
	}
	
	

}
