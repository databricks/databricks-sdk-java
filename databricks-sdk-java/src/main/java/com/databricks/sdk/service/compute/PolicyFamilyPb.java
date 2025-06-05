// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PolicyFamilyPb {
  @JsonProperty("definition")
  private String definition;

  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("policy_family_id")
  private String policyFamilyId;

  public PolicyFamilyPb setDefinition(String definition) {
    this.definition = definition;
    return this;
  }

  public String getDefinition() {
    return definition;
  }

  public PolicyFamilyPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PolicyFamilyPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PolicyFamilyPb setPolicyFamilyId(String policyFamilyId) {
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
    PolicyFamilyPb that = (PolicyFamilyPb) o;
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
    return new ToStringer(PolicyFamilyPb.class)
        .add("definition", definition)
        .add("description", description)
        .add("name", name)
        .add("policyFamilyId", policyFamilyId)
        .toString();
  }
}
