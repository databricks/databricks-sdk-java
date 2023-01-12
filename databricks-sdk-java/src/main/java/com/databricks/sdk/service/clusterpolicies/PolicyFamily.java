// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class PolicyFamily {
    /**
     * Policy definition document expressed in Databricks Cluster Policy
     * Definition Language.
     */
    @JsonProperty("definition")
    private String definition;
    
    /**
     * Human-readable description of the purpose of the policy family.
     */
    @JsonProperty("description")
    private String description;
    
    /**
     * Name of the policy family.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * ID of the policy family.
     */
    @JsonProperty("policy_family_id")
    private String policyFamilyId;
    
    public PolicyFamily setDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    public String getDefinition() {
        return definition;
    }
    
    public PolicyFamily setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public PolicyFamily setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public PolicyFamily setPolicyFamilyId(String policyFamilyId) {
        this.policyFamilyId = policyFamilyId;
        return this;
    }

    public String getPolicyFamilyId() {
        return policyFamilyId;
    }
    
}
