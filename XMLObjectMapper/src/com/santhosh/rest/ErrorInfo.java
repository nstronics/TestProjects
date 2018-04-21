package com.santhosh.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "error-info", namespace = "urn:ietf:params:xml:ns:yang:ietf-restconf")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error-info", propOrder = { "errorcode", "errormodule" })

public class ErrorInfo {

	@XmlElement(name = "error-code")
	private String errorcode;

	@XmlElement(name = "error-module")
	private String errormodule;

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public String getErrormodule() {
		return errormodule;
	}

	public void setErrormodule(String errormodule) {
		this.errormodule = errormodule;
	}

	@Override
	public String toString() {
		return "ErrorInfo [errorcode=" + errorcode + ", errormodule=" + errormodule + "]";
	}

}
