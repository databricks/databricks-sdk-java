// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
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

  @Override
  public int hashCode() {
    return Objects.hash(definition, description, name, policyFamilyId);
  }

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
