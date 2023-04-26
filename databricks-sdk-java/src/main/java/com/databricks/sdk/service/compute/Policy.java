// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Policy class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Policy {
  /** Creation time. The timestamp (in millisecond) when this Cluster Policy was created. */
  @JsonProperty("created_at_timestamp")
  private Long createdAtTimestamp;

  /**
   * Creator user name. The field won't be included in the response if the user has already been
   * deleted.
   */
  @JsonProperty("creator_user_name")
  private String creatorUserName;

  /** Policy definition document expressed in Databricks Cluster Policy Definition Language. */
  @JsonProperty("definition")
  private String definition;

  /** Additional human-readable description of the cluster policy. */
  @JsonProperty("description")
  private String description;

  /**
   * If true, policy is a default policy created and managed by Databricks. Default policies cannot
   * be deleted, and their policy families cannot be changed.
   */
  @JsonProperty("is_default")
  private Boolean isDefault;

  /**
   * Max number of clusters per user that can be active using this policy. If not present, there is
   * no max limit.
   */
  @JsonProperty("max_clusters_per_user")
  private Long maxClustersPerUser;

  /**
   * Cluster Policy name requested by the user. This has to be unique. Length must be between 1 and
   * 100 characters.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Policy definition JSON document expressed in Databricks Policy Definition Language. The JSON
   * document must be passed as a string and cannot be embedded in the requests.
   *
   * <p>You can use this to customize the policy definition inherited from the policy family. Policy
   * rules specified here are merged into the inherited policy definition.
   */
  @JsonProperty("policy_family_definition_overrides")
  private String policyFamilyDefinitionOverrides;

  /** ID of the policy family. */
  @JsonProperty("policy_family_id")
  private String policyFamilyId;

  /** Canonical unique identifier for the Cluster Policy. */
  @JsonProperty("policy_id")
  private String policyId;

  /**
   * <p>Setter for the field <code>createdAtTimestamp</code>.</p>
   *
   * @param createdAtTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.Policy} object
   */
  public Policy setCreatedAtTimestamp(Long createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdAtTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreatedAtTimestamp() {
    return createdAtTimestamp;
  }

  /**
   * <p>Setter for the field <code>creatorUserName</code>.</p>
   *
   * @param creatorUserName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Policy} object
   */
  public Policy setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  /**
   * <p>Getter for the field <code>creatorUserName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatorUserName() {
    return creatorUserName;
  }

  /**
   * <p>Setter for the field <code>definition</code>.</p>
   *
   * @param definition a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Policy} object
   */
  public Policy setDefinition(String definition) {
    this.definition = definition;
    return this;
  }

  /**
   * <p>Getter for the field <code>definition</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDefinition() {
    return definition;
  }

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Policy} object
   */
  public Policy setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getter for the field <code>description</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * <p>Setter for the field <code>isDefault</code>.</p>
   *
   * @param isDefault a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.Policy} object
   */
  public Policy setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * <p>Getter for the field <code>isDefault</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * <p>Setter for the field <code>maxClustersPerUser</code>.</p>
   *
   * @param maxClustersPerUser a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.Policy} object
   */
  public Policy setMaxClustersPerUser(Long maxClustersPerUser) {
    this.maxClustersPerUser = maxClustersPerUser;
    return this;
  }

  /**
   * <p>Getter for the field <code>maxClustersPerUser</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMaxClustersPerUser() {
    return maxClustersPerUser;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Policy} object
   */
  public Policy setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>policyFamilyDefinitionOverrides</code>.</p>
   *
   * @param policyFamilyDefinitionOverrides a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Policy} object
   */
  public Policy setPolicyFamilyDefinitionOverrides(String policyFamilyDefinitionOverrides) {
    this.policyFamilyDefinitionOverrides = policyFamilyDefinitionOverrides;
    return this;
  }

  /**
   * <p>Getter for the field <code>policyFamilyDefinitionOverrides</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPolicyFamilyDefinitionOverrides() {
    return policyFamilyDefinitionOverrides;
  }

  /**
   * <p>Setter for the field <code>policyFamilyId</code>.</p>
   *
   * @param policyFamilyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Policy} object
   */
  public Policy setPolicyFamilyId(String policyFamilyId) {
    this.policyFamilyId = policyFamilyId;
    return this;
  }

  /**
   * <p>Getter for the field <code>policyFamilyId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPolicyFamilyId() {
    return policyFamilyId;
  }

  /**
   * <p>Setter for the field <code>policyId</code>.</p>
   *
   * @param policyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Policy} object
   */
  public Policy setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * <p>Getter for the field <code>policyId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPolicyId() {
    return policyId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Policy that = (Policy) o;
    return Objects.equals(createdAtTimestamp, that.createdAtTimestamp)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(definition, that.definition)
        && Objects.equals(description, that.description)
        && Objects.equals(isDefault, that.isDefault)
        && Objects.equals(maxClustersPerUser, that.maxClustersPerUser)
        && Objects.equals(name, that.name)
        && Objects.equals(policyFamilyDefinitionOverrides, that.policyFamilyDefinitionOverrides)
        && Objects.equals(policyFamilyId, that.policyFamilyId)
        && Objects.equals(policyId, that.policyId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        createdAtTimestamp,
        creatorUserName,
        definition,
        description,
        isDefault,
        maxClustersPerUser,
        name,
        policyFamilyDefinitionOverrides,
        policyFamilyId,
        policyId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Policy.class)
        .add("createdAtTimestamp", createdAtTimestamp)
        .add("creatorUserName", creatorUserName)
        .add("definition", definition)
        .add("description", description)
        .add("isDefault", isDefault)
        .add("maxClustersPerUser", maxClustersPerUser)
        .add("name", name)
        .add("policyFamilyDefinitionOverrides", policyFamilyDefinitionOverrides)
        .add("policyFamilyId", policyFamilyId)
        .add("policyId", policyId)
        .toString();
  }
}
