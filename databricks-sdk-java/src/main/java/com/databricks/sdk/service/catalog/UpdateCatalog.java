// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class UpdateCatalog {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Whether predictive optimization should be enabled for this object and objects under it. */
  @JsonProperty("enable_predictive_optimization")
  private EnablePredictiveOptimization enablePredictiveOptimization;

  /**
   * Whether the current securable is accessible from all workspaces or a specific set of
   * workspaces.
   */
  @JsonProperty("isolation_mode")
  private CatalogIsolationMode isolationMode;

  /** The name of the catalog. */
  @JsonIgnore private String name;

  /** New name for the catalog. */
  @JsonProperty("new_name")
  private String newName;

  /** Username of current owner of catalog. */
  @JsonProperty("owner")
  private String owner;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  public UpdateCatalog setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateCatalog setEnablePredictiveOptimization(
      EnablePredictiveOptimization enablePredictiveOptimization) {
    this.enablePredictiveOptimization = enablePredictiveOptimization;
    return this;
  }

  public EnablePredictiveOptimization getEnablePredictiveOptimization() {
    return enablePredictiveOptimization;
  }

  public UpdateCatalog setIsolationMode(CatalogIsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public CatalogIsolationMode getIsolationMode() {
    return isolationMode;
  }

  public UpdateCatalog setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateCatalog setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateCatalog setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateCatalog setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCatalog that = (UpdateCatalog) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(enablePredictiveOptimization, that.enablePredictiveOptimization)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment, enablePredictiveOptimization, isolationMode, name, newName, owner, properties);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCatalog.class)
        .add("comment", comment)
        .add("enablePredictiveOptimization", enablePredictiveOptimization)
        .add("isolationMode", isolationMode)
        .add("name", name)
        .add("newName", newName)
        .add("owner", owner)
        .add("properties", properties)
        .toString();
  }
}
