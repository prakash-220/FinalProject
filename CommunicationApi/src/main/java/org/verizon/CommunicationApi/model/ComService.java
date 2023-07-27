package org.verizon.CommunicationApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ComService {
@Id
private int con_id;
private int planId;
private String activity;
private String qos;

public ComService() {
}
public int getCon_id() {
	return con_id;
}
public void setCon_id(int con_id) {
	this.con_id = con_id;
}
public int getPlanId() {
	return planId;
}
public void setPlanId(int planId) {
	this.planId = planId;
}
public String getActivity() {
	return activity;
}
public void setActivity(String activity) {
	this.activity = activity;
}
public String getQos() {
	return qos;
}
public void setQos(String qos) {
	this.qos = qos;
}


}
