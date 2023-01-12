// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListPolicyFamiliesResponse {
    /**
     * A token that can be used to get the next page of results. If not present,
     * there are no more results to show.
     */
    @JsonProperty("next_page_token")
    private String nextPageToken;
    
    /**
     * List of policy families.
     */
    @JsonProperty("policy_families")
    private java.util.List<PolicyFamily> policyFamilies;
    
    public ListPolicyFamiliesResponse setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }
    
    public ListPolicyFamiliesResponse setPolicyFamilies(java.util.List<PolicyFamily> policyFamilies) {
        this.policyFamilies = policyFamilies;
        return this;
    }

    public java.util.List<PolicyFamily> getPolicyFamilies() {
        return policyFamilies;
    }
    
}
