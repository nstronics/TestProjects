package com.santhosh.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "errors", namespace = "urn:ietf:params:xml:ns:yang:ietf-restconf")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errors", propOrder = { "errorList" })

public class Errors {

	@XmlElement(name = "error")
	private List<Error> errorList;

    public List<Error> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<Error> errorList) {
        this.errorList = errorList;
    }

    @Override
    public String toString() {
        return "Errors [errorList=" + errorList + "]";
    }



}
