package com.promineotech.lawClientProject.entity;

import java.sql.Date;
import java.util.Set;

public class CaseMatter {
	
	private Long id; 
	private Date dateOpened;
	private Set<Client> Client;
	private Set<PracticeArea> PracticeArea;
	private Set<TimeEntry> TimeEntry;
	private boolean isHourly;
	private double flatFeeCharged;
	private double retainerPaid;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateOpened() {
		return dateOpened;
	}

	public void setDateOpened(Date dateOpened) {
		this.dateOpened = dateOpened;
	}

	public Set<Client> getClient() {
		return Client;
	}

	public void setClient(Set<Client> client) {
		Client = client;
	}

	public Set<PracticeArea> getPracticeArea() {
		return PracticeArea;
	}

	public void setPracticeArea(Set<PracticeArea> practiceArea) {
		PracticeArea = practiceArea;
	}

	public Set<TimeEntry> getTimeEntry() {
		return TimeEntry;
	}

	public void setTimeEntry(Set<TimeEntry> timeEntry) {
		TimeEntry = timeEntry;
	}

	public boolean isHourly() {
		return isHourly;
	}

	public void setHourly(boolean isHourly) {
		this.isHourly = isHourly;
	}

	public double getFlatFeeCharged() {
		return flatFeeCharged;
	}

	public void setFlatFeeCharged(double flatFeeCharged) {
		this.flatFeeCharged = flatFeeCharged;
	}

	public double getRetainerPaid() {
		return retainerPaid;
	}

	public void setRetainerPaid(double retainerPaid) {
		this.retainerPaid = retainerPaid;
	}

}
