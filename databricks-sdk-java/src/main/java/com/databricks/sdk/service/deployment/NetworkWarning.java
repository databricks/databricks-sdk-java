// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class NetworkWarning {
    /**
     * Details of the warning.
     */
    @JsonProperty("warning_message")
    private String warningMessage;
    
    /**
     * The AWS resource associated with this warning: a subnet or a security
     * group.
     */
    @JsonProperty("warning_type")
    private WarningType warningType;
    
    public NetworkWarning setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
        return this;
    }

    public String getWarningMessage() {
        return warningMessage;
    }
    
    public NetworkWarning setWarningType(WarningType warningType) {
        this.warningType = warningType;
        return this;
    }

    public WarningType getWarningType() {
        return warningType;
    }
    
}
