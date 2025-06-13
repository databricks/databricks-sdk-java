// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PtServedModel {
  /**
   * The name of the entity to be served. The entity may be a model in the Databricks Model
   * Registry, a model in the Unity Catalog (UC), or a function of type FEATURE_SPEC in the UC. If
   * it is a UC object, the full name of the object should be given in the form of
   * **catalog_name.schema_name.model_name**.
   */
  @JsonProperty("entity_name")
  private String entityName;

  /** */
  @JsonProperty("entity_version")
  private String entityVersion;

  /**
   * The name of a served entity. It must be unique across an endpoint. A served entity name can
   * consist of alphanumeric characters, dashes, and underscores. If not specified for an external
   * model, this field defaults to external_model.name, with '.' and ':' replaced with '-', and if
   * not specified for other entities, it defaults to entity_name-entity_version.
   */
  @JsonProperty("name")
  private String name;

  /** The number of model units to be provisioned. */
  @JsonProperty("provisioned_model_units")
  private Long provisionedModelUnits;

  public PtServedModel setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public PtServedModel setEntityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
    return this;
  }

  public String getEntityVersion() {
    return entityVersion;
  }

  public PtServedModel setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PtServedModel setProvisionedModelUnits(Long provisionedModelUnits) {
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
    PtServedModel that = (PtServedModel) o;
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
    return new ToStringer(PtServedModel.class)
        .add("entityName", entityName)
        .add("entityVersion", entityVersion)
        .add("name", name)
        .add("provisionedModelUnits", provisionedModelUnits)
        .toString();
  }
}
