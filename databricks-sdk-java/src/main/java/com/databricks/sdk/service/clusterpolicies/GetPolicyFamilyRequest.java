// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class GetPolicyFamilyRequest {
    /**
     
     */
    
    private String policyFamilyId;
    
    public GetPolicyFamilyRequest setPolicyFamilyId(String policyFamilyId) {
        this.policyFamilyId = policyFamilyId;
        return this;
    }

    public String getPolicyFamilyId() {
        return policyFamilyId;
    }
    
}
