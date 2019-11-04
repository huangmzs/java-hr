package com.java158.hr.response;

import java.util.Date;

public class RestResponse<T> {
	private int code;
	private String msg;
	private T data;




	public RestResponse() {
		//  默认是成功的
		this(200,"SUCCESS");
	}

	public RestResponse(int code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public RestResponse(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
