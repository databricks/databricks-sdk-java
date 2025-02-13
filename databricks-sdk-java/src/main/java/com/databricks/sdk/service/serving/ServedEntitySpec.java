// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ServedEntitySpec {
  /** */
  @JsonProperty("entity_name")
  private String entityName;

  /** */
  @JsonProperty("entity_version")
  private String entityVersion;

  /** */
  @JsonProperty("external_model")
  private ExternalModel externalModel;

  /**
   * All fields are not sensitive as they are hard-coded in the system and made available to
   * customers.
   */
  @JsonProperty("foundation_model")
  private FoundationModel foundationModel;

  /** */
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
