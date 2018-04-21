package com.santhosh.rest;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Client {

    public static void main(String[] args) throws JAXBException  {

    	File file = new File("response.xml");  

    	
    	JAXBContext jaxbContext = JAXBContext.newInstance(Errors.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Errors unmarshalledObj = (Errors) jaxbUnmarshaller.unmarshal(file);
		System.out.println(unmarshalledObj);

    }

}
