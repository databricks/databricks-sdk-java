// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get entity
 */
@Generated("databricks-sdk-generator")
public class Get {
    /**
     * Canonical unique identifier for the cluster policy.
     */
    @QueryParam("policy_id")
    private String policyId;
    
    public Get setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }
    
}
