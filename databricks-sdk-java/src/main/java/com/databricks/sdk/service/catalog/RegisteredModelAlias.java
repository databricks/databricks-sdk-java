// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RegisteredModelAlias {
  /** Name of the alias, e.g. 'champion' or 'latest_stable' */
  @JsonProperty("alias_name")
  private String aliasName;

  /** The name of the catalog containing the model version */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The unique identifier of the alias */
  @JsonProperty("id")
  private String id;

  /** The name of the parent registered model of the model version, relative to parent schema */
  @JsonProperty("model_name")
  private String modelName;

  /** The name of the schema containing the model version, relative to parent catalog */
  @JsonProperty("schema_name")
  private String schemaName;

  /** Integer version number of the model version to which this alias points. */
  @JsonProperty("version_num")
  private Long versionNum;

  public RegisteredModelAlias setAliasName(String aliasName) {
    this.aliasName = aliasName;
    return this;
  }

  public String getAliasName() {
    return aliasName;
  }

  public RegisteredModelAlias setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public RegisteredModelAlias setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public RegisteredModelAlias setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public RegisteredModelAlias setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public RegisteredModelAlias setVersionNum(Long versionNum) {
    this.versionNum = versionNum;
    return this;
  }

  public Long getVersionNum() {
    return versionNum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegisteredModelAlias that = (RegisteredModelAlias) o;
    return Objects.equals(aliasName, that.aliasName)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(id, that.id)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(versionNum, that.versionNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasName, catalogName, id, modelName, schemaName, versionNum);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelAlias.class)
        .add("aliasName", aliasName)
        .add("catalogName", catalogName)
        .add("id", id)
        .add("modelName", modelName)
        .add("schemaName", schemaName)
        .add("versionNum", versionNum)
        .toString();
  }
}
