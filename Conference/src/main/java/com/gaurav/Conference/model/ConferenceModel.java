package com.gaurav.Conference.model;

import java.util.Date;

public class ConferenceModel {
	
	private String roomCode;
	private String roomName;
	private String roomCapacity;
	private String roomLocation;
	private String roomFloor;
	private Date creationDate;
	private String purpose;
	private String status;
	
	
	public ConferenceModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ConferenceModel(String roomCode, String roomName, String roomCapacity, String roomLocation, String roomFloor,
			Date creationDate, String purpose, String status) {
		super();
		this.roomCode = roomCode;
		this.roomName = roomName;
		this.roomCapacity = roomCapacity;
		this.roomLocation = roomLocation;
		this.roomFloor = roomFloor;
		this.creationDate = creationDate;
		this.purpose = purpose;
		this.status = status;
	}
	
	public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomCapacity() {
		return roomCapacity;
	}
	public void setRoomCapacity(String roomCapacity) {
		this.roomCapacity = roomCapacity;
	}
	public String getRoomLocation() {
		return roomLocation;
	}
	public void setRoomLocation(String roomLocation) {
		this.roomLocation = roomLocation;
	}
	public String getRoomFloor() {
		return roomFloor;
	}
	public void setRoomFloor(String roomFloor) {
		this.roomFloor = roomFloor;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ConferenceModel [roomCode=" + roomCode + ", roomName=" + roomName + ", roomCapacity=" + roomCapacity
				+ ", roomLocation=" + roomLocation + ", roomFloor=" + roomFloor + ", creationDate=" + creationDate
				+ ", purpose=" + purpose + ", status=" + status + "]";
	}
	
	
}
