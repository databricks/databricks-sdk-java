// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ServedEntitySpec {
  /**
   * The name of the entity served. The entity may be a model in the Databricks Model Registry, a
   * model in the Unity Catalog (UC), or a function of type FEATURE_SPEC in the UC. If it is a UC
   * object, the full name of the object is given in the form of
   * __catalog_name__.__schema_name__.__model_name__.
   */
  @JsonProperty("entity_name")
  private String entityName;

  /**
   * The version of the served entity in Databricks Model Registry or empty if the entity is a
   * FEATURE_SPEC.
   */
  @JsonProperty("entity_version")
  private String entityVersion;

  /**
   * The external model that is served. NOTE: Only one of external_model, foundation_model, and
   * (entity_name, entity_version) is returned based on the endpoint type.
   */
  @JsonProperty("external_model")
  private ExternalModel externalModel;

  /**
   * The foundation model that is served. NOTE: Only one of foundation_model, external_model, and
   * (entity_name, entity_version) is returned based on the endpoint type.
   */
  @JsonProperty("foundation_model")
  private FoundationModel foundationModel;

  /** The name of the served entity. */
  @JsonProperty("name")
  private String name;

  public ServedEntitySpec setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public ServedEntitySpec setEntityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
    return this;
  }

  public String getEntityVersion() {
    return entityVersion;
  }

  public ServedEntitySpec setExternalModel(ExternalModel externalModel) {
    this.externalModel = externalModel;
    return this;
  }

  public ExternalModel getExternalModel() {
    return externalModel;
  }

  public ServedEntitySpec setFoundationModel(FoundationModel foundationModel) {
    this.foundationModel = foundationModel;
    return this;
  }

  public FoundationModel getFoundationModel() {
    return foundationModel;
  }

  public ServedEntitySpec setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServedEntitySpec that = (ServedEntitySpec) o;
    return Objects.equals(entityName, that.entityName)
        && Objects.equals(entityVersion, that.entityVersion)
        && Objects.equals(externalModel, that.externalModel)
        && Objects.equals(foundationModel, that.foundationModel)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, entityVersion, externalModel, foundationModel, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedEntitySpec.class)
        .add("entityName", entityName)
        .add("entityVersion", entityVersion)
        .add("externalModel", externalModel)
        .add("foundationModel", foundationModel)
        .add("name", name)
        .toString();
  }
}
