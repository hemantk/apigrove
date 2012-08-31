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
// Generated on: 2012.06.05 at 04:21:54 PM CEST 
//


package com.alu.e3.data.model.sub;

import java.io.Serializable;



public class ResourceItem implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 6285596883835909980L;
	protected String name;
    protected String grammar;
    protected boolean isMain;
    

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the grammar property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public String getGrammar() {
        return grammar;
    }

    /**
     * Sets the value of the grammar property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGrammar(String value) {
        this.grammar = value;
    }

    /**
     * Gets the value of the isMain property.
     * 
     */
    public boolean isIsMain() {
        return isMain;
    }

    /**
     * Sets the value of the isMain property.
     * 
     */
    public void setIsMain(boolean value) {
        this.isMain = value;
    }

}