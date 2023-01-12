// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class PythonWheelTask {
    /**
     * Named entry point to use, if it does not exist in the metadata of the
     * package it executes the function from the package directly using
     * `$packageName.$entryPoint()`
     */
    @JsonProperty("entry_point")
    private String entryPoint;
    
    /**
     * Command-line parameters passed to Python wheel task in the form of
     * `["--name=task", "--data=dbfs:/path/to/data.json"]`. Leave it empty if
     * `parameters` is not null.
     */
    @JsonProperty("named_parameters")
    private Map<String,String> namedParameters;
    
    /**
     * Name of the package to execute
     */
    @JsonProperty("package_name")
    private String packageName;
    
    /**
     * Command-line parameters passed to Python wheel task. Leave it empty if
     * `named_parameters` is not null.
     */
    @JsonProperty("parameters")
    private java.util.List<String> parameters;
    
    public PythonWheelTask setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    public String getEntryPoint() {
        return entryPoint;
    }
    
    public PythonWheelTask setNamedParameters(Map<String,String> namedParameters) {
        this.namedParameters = namedParameters;
        return this;
    }

    public Map<String,String> getNamedParameters() {
        return namedParameters;
    }
    
    public PythonWheelTask setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public String getPackageName() {
        return packageName;
    }
    
    public PythonWheelTask setParameters(java.util.List<String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public java.util.List<String> getParameters() {
        return parameters;
    }
    
}
