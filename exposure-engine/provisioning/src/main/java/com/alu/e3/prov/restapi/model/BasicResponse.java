/**
 * Copyright © 2012 Alcatel-Lucent.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * Licensed to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.20 at 02:23:24 PM CET 
//

package com.alu.e3.prov.restapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Basic class for the REST services response.
 * 
 */
@XmlRootElement(name="response")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basicResponse", propOrder = { "id", "ids", "error", "status" })
public class BasicResponse {

	public final static String SUCCESS = "SUCCESS";
	public final static String FAILURE = "FAILURE";

	protected String id;
	@XmlElementWrapper(name = "ids")
	@XmlElement(name = "id")
	protected List<String> ids;
	protected Error error;
	protected String status;

	public BasicResponse() {

	}

	public BasicResponse(String status) {
		setStatus(status);
	}
	
	public BasicResponse(String status, String id) {
		setStatus(status);
		setId(id);
	}
	
	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * 
	 * @return
	 */
	public List<String> getIds() {
		if (ids == null) {
			ids = new ArrayList<String>();
		}
		return this.ids;
	}

	/**
	 * 
	 * @return
	 */
	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	/**
	 * Gets the value of the error property.
	 * 
	 * @return possible object is {@link Error }
	 * 
	 */
	public Error getError() {
		return error;
	}

	/**
	 * Sets the value of the error property.
	 * 
	 * @param value
	 *            allowed object is {@link Error }
	 * 
	 */
	public void setError(Error value) {
		this.error = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
	}

}