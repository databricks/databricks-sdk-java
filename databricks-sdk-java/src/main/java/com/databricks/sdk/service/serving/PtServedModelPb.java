// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PtServedModelPb {
  @JsonProperty("entity_name")
  private String entityName;

  @JsonProperty("entity_version")
  private String entityVersion;

  @JsonProperty("name")
  private String name;

  @JsonProperty("provisioned_model_units")
  private Long provisionedModelUnits;

  public PtServedModelPb setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public PtServedModelPb setEntityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
    return this;
  }

  public String getEntityVersion() {
    return entityVersion;
  }

  public PtServedModelPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PtServedModelPb setProvisionedModelUnits(Long provisionedModelUnits) {
    this.provisionedModelUnits = provisionedModelUnits;
    return this;
  }

  public Long getProvisionedModelUnits() {
    return provisionedModelUnits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PtServedModelPb that = (PtServedModelPb) o;
    return Objects.equals(entityName, that.entityName)
        && Objects.equals(entityVersion, that.entityVersion)
        && Objects.equals(name, that.name)
        && Objects.equals(provisionedModelUnits, that.provisionedModelUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, entityVersion, name, provisionedModelUnits);
  }

  @Override
  public String toString() {
    return new ToStringer(PtServedModelPb.class)
        .add("entityName", entityName)
        .add("entityVersion", entityVersion)
        .add("name", name)
        .add("provisionedModelUnits", provisionedModelUnits)
        .toString();
  }
}
