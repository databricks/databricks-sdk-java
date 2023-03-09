// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreatePolicyResponse {
    /**
     * Canonical unique identifier for the cluster policy.
     */
    @JsonProperty("policy_id")
    private String policyId;
    
    public CreatePolicyResponse setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }
    
}
