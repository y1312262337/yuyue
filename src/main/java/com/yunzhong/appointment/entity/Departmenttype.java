package com.yunzhong.appointment.entity;


public class Departmenttype {
    private String dplId;

    private String dplName;
    

    public String getDplId() {
        return dplId;
    }

    public void setDplId(String dplId) {
        this.dplId = dplId == null ? null : dplId.trim();
    }

    public String getDplName() {
        return dplName;
    }

    public void setDplName(String dplName) {
        this.dplName = dplName == null ? null : dplName.trim();
    }

	@Override
	public String toString() {
		return "Departmenttype [dplId=" + dplId + ", dplName=" + dplName + "]";
	}


	
}