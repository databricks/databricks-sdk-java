// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class EditPolicy {
    /**
     * Policy definition document expressed in Databricks Cluster Policy
     * Definition Language.
     */
    @JsonProperty("definition")
    private String definition;
    
    /**
     * Additional human-readable description of the cluster policy.
     */
    @JsonProperty("description")
    private String description;
    
    /**
     * Max number of clusters per user that can be active using this policy. If
     * not present, there is no max limit.
     */
    @JsonProperty("max_clusters_per_user")
    private Long maxClustersPerUser;
    
    /**
     * Cluster Policy name requested by the user. This has to be unique. Length
     * must be between 1 and 100 characters.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Policy definition JSON document expressed in Databricks Policy Definition
     * Language. The JSON document must be passed as a string and cannot be
     * embedded in the requests.
     * 
     * You can use this to customize the policy definition inherited from the
     * policy family. Policy rules specified here are merged into the inherited
     * policy definition.
     */
    @JsonProperty("policy_family_definition_overrides")
    private String policyFamilyDefinitionOverrides;
    
    /**
     * ID of the policy family. The cluster policy's policy definition inherits
     * the policy family's policy definition.
     * 
     * Cannot be used with `definition`. Use
     * `policy_family_definition_overrides` instead to customize the policy
     * definition.
     */
    @JsonProperty("policy_family_id")
    private String policyFamilyId;
    
    /**
     * The ID of the policy to update.
     */
    @JsonProperty("policy_id")
    private String policyId;
    
    public EditPolicy setDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    public String getDefinition() {
        return definition;
    }
    
    public EditPolicy setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public EditPolicy setMaxClustersPerUser(Long maxClustersPerUser) {
        this.maxClustersPerUser = maxClustersPerUser;
        return this;
    }

    public Long getMaxClustersPerUser() {
        return maxClustersPerUser;
    }
    
    public EditPolicy setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public EditPolicy setPolicyFamilyDefinitionOverrides(String policyFamilyDefinitionOverrides) {
        this.policyFamilyDefinitionOverrides = policyFamilyDefinitionOverrides;
        return this;
    }

    public String getPolicyFamilyDefinitionOverrides() {
        return policyFamilyDefinitionOverrides;
    }
    
    public EditPolicy setPolicyFamilyId(String policyFamilyId) {
        this.policyFamilyId = policyFamilyId;
        return this;
    }

    public String getPolicyFamilyId() {
        return policyFamilyId;
    }
    
    public EditPolicy setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }
    
}
