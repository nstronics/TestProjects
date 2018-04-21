package com.santhosh.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "error", namespace = "urn:ietf:params:xml:ns:yang:ietf-restconf")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error", propOrder = { "errorType", "errorTag", "errorAppTag", "errorPath", "errorMessage",
		"errorInfo" })

public class Error {

	@XmlElement(name = "error-type")
	private String errorType;

	@XmlElement(name = "error-tag")
	private String errorTag;

	@XmlElement(name = "error-app-tag")
	private String errorAppTag;

	@XmlElement(name = "error-path")
	private String errorPath;

	@XmlElement(name = "error-message")
	private String errorMessage;

	@XmlElement(name = "error-info")
	private ErrorInfo errorInfo;

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public String getErrorTag() {
		return errorTag;
	}

	public void setErrorTag(String errorTag) {
		this.errorTag = errorTag;
	}

	public String getErrorAppTag() {
		return errorAppTag;
	}

	public void setErrorAppTag(String errorAppTag) {
		this.errorAppTag = errorAppTag;
	}

	public String getErrorPath() {
		return errorPath;
	}

	public void setErrorPath(String errorPath) {
		this.errorPath = errorPath;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	@Override
	public String toString() {
		return "Error [errorType=" + errorType + ", errorTag=" + errorTag + ", errorAppTag=" + errorAppTag
				+ ", errorPath=" + errorPath + ", errorMessage=" + errorMessage + ", errorInfo=" + errorInfo + "]";
	}

}
