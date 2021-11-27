package com.example.mongodb.response;

import java.util.List;

import com.example.mongodb.to.CatererDetailsTo;

public class CatererResponse {
	String msg;
	boolean isSuccess;

	List<CatererDetailsTo> detailsTo;

	public CatererResponse() {

	}

	public CatererResponse(String msg, boolean isSuccess, List<CatererDetailsTo> detailsTo) {
		super();
		this.msg = msg;
		this.isSuccess = isSuccess;
		this.detailsTo = detailsTo;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public List<CatererDetailsTo> getDetailsTo() {
		return detailsTo;
	}

	public void setDetailsTo(List<CatererDetailsTo> detailsTo) {
		this.detailsTo = detailsTo;
	}

}
