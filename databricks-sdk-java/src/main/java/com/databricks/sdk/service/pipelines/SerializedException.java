// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SerializedException {
    /**
     * Runtime class of the exception
     */
    @JsonProperty("class_name")
    private String className;
    
    /**
     * Exception message
     */
    @JsonProperty("message")
    private String message;
    
    /**
     * Stack trace consisting of a list of stack frames
     */
    @JsonProperty("stack")
    private java.util.List<StackFrame> stack;
    
    public SerializedException setClassName(String className) {
        this.className = className;
        return this;
    }

    public String getClassName() {
        return className;
    }
    
    public SerializedException setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }
    
    public SerializedException setStack(java.util.List<StackFrame> stack) {
        this.stack = stack;
        return this;
    }

    public java.util.List<StackFrame> getStack() {
        return stack;
    }
    
}
