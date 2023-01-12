// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class Policy {
    /**
     * Creation time. The timestamp (in millisecond) when this Cluster Policy
     * was created.
     */
    @JsonProperty("created_at_timestamp")
    private Long createdAtTimestamp;
    
    /**
     * Creator user name. The field won't be included in the response if the
     * user has already been deleted.
     */
    @JsonProperty("creator_user_name")
    private String creatorUserName;
    
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
     * If true, policy is a default policy created and managed by Databricks.
     * Default policies cannot be deleted, and their policy families cannot be
     * changed.
     */
    @JsonProperty("is_default")
    private Boolean isDefault;
    
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
     * ID of the policy family.
     */
    @JsonProperty("policy_family_id")
    private String policyFamilyId;
    
    /**
     * Canonical unique identifier for the Cluster Policy.
     */
    @JsonProperty("policy_id")
    private String policyId;
    
    public Policy setCreatedAtTimestamp(Long createdAtTimestamp) {
        this.createdAtTimestamp = createdAtTimestamp;
        return this;
    }

    public Long getCreatedAtTimestamp() {
        return createdAtTimestamp;
    }
    
    public Policy setCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName;
        return this;
    }

    public String getCreatorUserName() {
        return creatorUserName;
    }
    
    public Policy setDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    public String getDefinition() {
        return definition;
    }
    
    public Policy setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public Policy setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }
    
    public Policy setMaxClustersPerUser(Long maxClustersPerUser) {
        this.maxClustersPerUser = maxClustersPerUser;
        return this;
    }

    public Long getMaxClustersPerUser() {
        return maxClustersPerUser;
    }
    
    public Policy setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public Policy setPolicyFamilyDefinitionOverrides(String policyFamilyDefinitionOverrides) {
        this.policyFamilyDefinitionOverrides = policyFamilyDefinitionOverrides;
        return this;
    }

    public String getPolicyFamilyDefinitionOverrides() {
        return policyFamilyDefinitionOverrides;
    }
    
    public Policy setPolicyFamilyId(String policyFamilyId) {
        this.policyFamilyId = policyFamilyId;
        return this;
    }

    public String getPolicyFamilyId() {
        return policyFamilyId;
    }
    
    public Policy setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }
    
}
