package com.promineotech.lawClientProject.entity;

import java.sql.Date;
import java.util.Set;

public class CaseMatter {
	

	private Long id; 
	private Date dateOpened;
	private Set<Client> Client;
	private Set<PracticeArea> PracticeArea;
	private boolean isHourly;
	private double flatFeeCharged;
	private double retainerPaid;

}
