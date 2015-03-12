/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.web.api.dto;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.xml.bind.annotation.XmlType;

/**
 * A Controller Service that can be shared by other components
 */
@XmlType(name = "controllerService")
public class ControllerServiceDTO extends NiFiComponentDTO {

    private String name;
    private String type;
    private String comments;
    private String availability;
    private String state;
    
    private Map<String, String> properties;
    private Map<String, PropertyDescriptorDTO> descriptors;
 
    private String annotationData;
    
    private Set<ControllerServiceReferencingComponentDTO> referencingComponents;
    
    private Collection<String> validationErrors;

    /**
     * The controller service name.
     * 
     * @return 
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The controller service type.
     * 
     * @return 
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    /**
     * The comment for the Controller Service
     * @return
     */
    public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
     * Where this service is available. Possible values are NCM, NODE.
     * 
     * @return 
     */
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * The state of this controller service. Possible values are ENABLED, ENABLING, DISABLED, DISABLING.
     * @return 
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * The controller service properties.
     * 
     * @return 
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * The descriptors for the controller service properties.
     * 
     * @return 
     */
    public Map<String, PropertyDescriptorDTO> getDescriptors() {
        return descriptors;
    }

    public void setDescriptors(Map<String, PropertyDescriptorDTO> descriptors) {
        this.descriptors = descriptors;
    }

    /**
     * The annotation data for this controller service.
     * 
     * @return 
     */
    public String getAnnotationData() {
        return annotationData;
    }

    public void setAnnotationData(String annotationData) {
        this.annotationData = annotationData;
    }

    /**
     * All components referencing this controller service.
     * 
     * @return 
     */
    public Set<ControllerServiceReferencingComponentDTO> getReferencingComponents() {
        return referencingComponents;
    }

    public void setReferencingComponents(Set<ControllerServiceReferencingComponentDTO> referencingComponents) {
        this.referencingComponents = referencingComponents;
    }

    /**
     * Gets the validation errors from this controller service. These validation errors
     * represent the problems with the controller service that must be resolved before it
     * can be enabled.
     *
     * @return The validation errors
     */
    public Collection<String> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(Collection<String> validationErrors) {
        this.validationErrors = validationErrors;
    }
}