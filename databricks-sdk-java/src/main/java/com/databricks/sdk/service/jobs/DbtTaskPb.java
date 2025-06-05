// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class DbtTaskPb {
  @JsonProperty("catalog")
  private String catalog;

  @JsonProperty("commands")
  private Collection<String> commands;

  @JsonProperty("profiles_directory")
  private String profilesDirectory;

  @JsonProperty("project_directory")
  private String projectDirectory;

  @JsonProperty("schema")
  private String schema;

  @JsonProperty("source")
  private Source source;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public DbtTaskPb setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public DbtTaskPb setCommands(Collection<String> commands) {
    this.commands = commands;
    return this;
  }

  public Collection<String> getCommands() {
    return commands;
  }

  public DbtTaskPb setProfilesDirectory(String profilesDirectory) {
    this.profilesDirectory = profilesDirectory;
    return this;
  }

  public String getProfilesDirectory() {
    return profilesDirectory;
  }

  public DbtTaskPb setProjectDirectory(String projectDirectory) {
    this.projectDirectory = projectDirectory;
    return this;
  }

  public String getProjectDirectory() {
    return projectDirectory;
  }

  public DbtTaskPb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public DbtTaskPb setSource(Source source) {
    this.source = source;
    return this;
  }

  public Source getSource() {
    return source;
  }

  public DbtTaskPb setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtTaskPb that = (DbtTaskPb) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(commands, that.commands)
        && Objects.equals(profilesDirectory, that.profilesDirectory)
        && Objects.equals(projectDirectory, that.projectDirectory)
        && Objects.equals(schema, that.schema)
        && Objects.equals(source, that.source)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalog, commands, profilesDirectory, projectDirectory, schema, source, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtTaskPb.class)
        .add("catalog", catalog)
        .add("commands", commands)
        .add("profilesDirectory", profilesDirectory)
        .add("projectDirectory", projectDirectory)
        .add("schema", schema)
        .add("source", source)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
