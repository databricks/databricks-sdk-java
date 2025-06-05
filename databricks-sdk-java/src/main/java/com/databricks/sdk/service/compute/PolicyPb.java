// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Describes a Cluster Policy entity. */
@Generated
class PolicyPb {
  @JsonProperty("created_at_timestamp")
  private Long createdAtTimestamp;

  @JsonProperty("creator_user_name")
  private String creatorUserName;

  @JsonProperty("definition")
  private String definition;

  @JsonProperty("description")
  private String description;

  @JsonProperty("is_default")
  private Boolean isDefault;

  @JsonProperty("libraries")
  private Collection<Library> libraries;

  @JsonProperty("max_clusters_per_user")
  private Long maxClustersPerUser;

  @JsonProperty("name")
  private String name;

  @JsonProperty("policy_family_definition_overrides")
  private String policyFamilyDefinitionOverrides;

  @JsonProperty("policy_family_id")
  private String policyFamilyId;

  @JsonProperty("policy_id")
  private String policyId;

  public PolicyPb setCreatedAtTimestamp(Long createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
    return this;
  }

  public Long getCreatedAtTimestamp() {
    return createdAtTimestamp;
  }

  public PolicyPb setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public PolicyPb setDefinition(String definition) {
    this.definition = definition;
    return this;
  }

  public String getDefinition() {
    return definition;
  }

  public PolicyPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PolicyPb setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  public Boolean getIsDefault() {
    return isDefault;
  }

  public PolicyPb setLibraries(Collection<Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<Library> getLibraries() {
    return libraries;
  }

  public PolicyPb setMaxClustersPerUser(Long maxClustersPerUser) {
    this.maxClustersPerUser = maxClustersPerUser;
    return this;
  }

  public Long getMaxClustersPerUser() {
    return maxClustersPerUser;
  }

  public PolicyPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PolicyPb setPolicyFamilyDefinitionOverrides(String policyFamilyDefinitionOverrides) {
    this.policyFamilyDefinitionOverrides = policyFamilyDefinitionOverrides;
    return this;
  }

  public String getPolicyFamilyDefinitionOverrides() {
    return policyFamilyDefinitionOverrides;
  }

  public PolicyPb setPolicyFamilyId(String policyFamilyId) {
    this.policyFamilyId = policyFamilyId;
    return this;
  }

  public String getPolicyFamilyId() {
    return policyFamilyId;
  }

  public PolicyPb setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolicyPb that = (PolicyPb) o;
    return Objects.equals(createdAtTimestamp, that.createdAtTimestamp)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(definition, that.definition)
        && Objects.equals(description, that.description)
        && Objects.equals(isDefault, that.isDefault)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(maxClustersPerUser, that.maxClustersPerUser)
        && Objects.equals(name, that.name)
        && Objects.equals(policyFamilyDefinitionOverrides, that.policyFamilyDefinitionOverrides)
        && Objects.equals(policyFamilyId, that.policyFamilyId)
        && Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAtTimestamp,
        creatorUserName,
        definition,
        description,
        isDefault,
        libraries,
        maxClustersPerUser,
        name,
        policyFamilyDefinitionOverrides,
        policyFamilyId,
        policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(PolicyPb.class)
        .add("createdAtTimestamp", createdAtTimestamp)
        .add("creatorUserName", creatorUserName)
        .add("definition", definition)
        .add("description", description)
        .add("isDefault", isDefault)
        .add("libraries", libraries)
        .add("maxClustersPerUser", maxClustersPerUser)
        .add("name", name)
        .add("policyFamilyDefinitionOverrides", policyFamilyDefinitionOverrides)
        .add("policyFamilyId", policyFamilyId)
        .add("policyId", policyId)
        .toString();
  }
}
