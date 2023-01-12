// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListPoliciesResponse {
    /**
     * List of policies.
     */
    @JsonProperty("policies")
    private java.util.List<Policy> policies;
    
    public ListPoliciesResponse setPolicies(java.util.List<Policy> policies) {
        this.policies = policies;
        return this;
    }

    public java.util.List<Policy> getPolicies() {
        return policies;
    }
    
}
