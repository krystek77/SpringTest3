package com.wronakrystian.domain;

public class Equipment {
	
	private String equipmentName;
	private int equipmentId;
	private static int nextEquipmentId;
	
	public Equipment() {
		this("no name equipment category");
	}
	
	public Equipment(String equipmentName) {
		super();
		equipmentId = nextEquipmentId;
		nextEquipmentId = equipmentId + 1;
		this.equipmentName = equipmentName;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public int getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}
	
	public static int getNextEquipmentId() {
		return nextEquipmentId;
	}

	@Override
	public String toString() {
		return "Equipment [equipmentName=" + equipmentName + ", equipmentId=" + equipmentId + "]";
	}
	
	
	
	
}
