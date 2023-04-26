// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PolicyFamily class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PolicyFamily {
  /** Policy definition document expressed in Databricks Cluster Policy Definition Language. */
  @JsonProperty("definition")
  private String definition;

  /** Human-readable description of the purpose of the policy family. */
  @JsonProperty("description")
  private String description;

  /** Name of the policy family. */
  @JsonProperty("name")
  private String name;

  /** ID of the policy family. */
  @JsonProperty("policy_family_id")
  private String policyFamilyId;

  /**
   * <p>Setter for the field <code>definition</code>.</p>
   *
   * @param definition a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.PolicyFamily} object
   */
  public PolicyFamily setDefinition(String definition) {
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
   * @return a {@link com.databricks.sdk.service.compute.PolicyFamily} object
   */
  public PolicyFamily setDescription(String description) {
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
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.PolicyFamily} object
   */
  public PolicyFamily setName(String name) {
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
   * <p>Setter for the field <code>policyFamilyId</code>.</p>
   *
   * @param policyFamilyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.PolicyFamily} object
   */
  public PolicyFamily setPolicyFamilyId(String policyFamilyId) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolicyFamily that = (PolicyFamily) o;
    return Objects.equals(definition, that.definition)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(policyFamilyId, that.policyFamilyId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(definition, description, name, policyFamilyId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PolicyFamily.class)
        .add("definition", definition)
        .add("description", description)
        .add("name", name)
        .add("policyFamilyId", policyFamilyId)
        .toString();
  }
}
