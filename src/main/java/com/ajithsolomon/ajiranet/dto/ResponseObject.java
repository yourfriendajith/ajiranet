package com.ajithsolomon.ajiranet.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ajithsolomon.ajiranet.entity.Device;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Component
public class ResponseObject implements Serializable {

	private static final long serialVersionUID = 30755559399521379L;

	@JsonInclude(Include.NON_NULL)
	private String msg;

	@JsonInclude(Include.NON_NULL)
	private List<Device> devices;

	public ResponseObject(String msg) {
		super();
		this.msg = msg;
	}

	public ResponseObject(List<Device> devices) {
		super();
		this.devices = devices;
	}

	public ResponseObject() {
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	@Override
	public String toString() {
		return "ResponseObject [msg=" + msg + "]";
	}

}
