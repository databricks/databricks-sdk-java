// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class UpdateSchema {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /**
   * Dropped objects in the schema remain recoverable for this number of hours before they are
   * permanently purged. The value must be 0 or within the range allowed for the metastore. Schemas
   * that do not set their own value inherit the parent catalog's value.
   */
  @JsonProperty("custom_max_retention_hours")
  private Long customMaxRetentionHours;

  /**
   * Whether predictive optimization is enabled for this schema and the objects under it. Valid
   * values are ENABLE, DISABLE, and INHERIT, where INHERIT applies the parent catalog's setting.
   * New schemas start as INHERIT. It cannot be set when creating a schema; use the update method
   * instead.
   */
  @JsonProperty("enable_predictive_optimization")
  private EnablePredictiveOptimization enablePredictiveOptimization;

  /** Full name of the schema, in the form catalog_name.schema_name. */
  @JsonIgnore private String fullName;

  /** New name for the schema. */
  @JsonProperty("new_name")
  private String newName;

  /**
   * The user or group that owns the schema. The creator becomes the owner, and the owner can be
   * changed only through the update method.
   */
  @JsonProperty("owner")
  private String owner;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  public UpdateSchema setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateSchema setCustomMaxRetentionHours(Long customMaxRetentionHours) {
    this.customMaxRetentionHours = customMaxRetentionHours;
    return this;
  }

  public Long getCustomMaxRetentionHours() {
    return customMaxRetentionHours;
  }

  public UpdateSchema setEnablePredictiveOptimization(
      EnablePredictiveOptimization enablePredictiveOptimization) {
    this.enablePredictiveOptimization = enablePredictiveOptimization;
    return this;
  }

  public EnablePredictiveOptimization getEnablePredictiveOptimization() {
    return enablePredictiveOptimization;
  }

  public UpdateSchema setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateSchema setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateSchema setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateSchema setProperties(Map<String, String> properties) {
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
    UpdateSchema that = (UpdateSchema) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(customMaxRetentionHours, that.customMaxRetentionHours)
        && Objects.equals(enablePredictiveOptimization, that.enablePredictiveOptimization)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        customMaxRetentionHours,
        enablePredictiveOptimization,
        fullName,
        newName,
        owner,
        properties);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSchema.class)
        .add("comment", comment)
        .add("customMaxRetentionHours", customMaxRetentionHours)
        .add("enablePredictiveOptimization", enablePredictiveOptimization)
        .add("fullName", fullName)
        .add("newName", newName)
        .add("owner", owner)
        .add("properties", properties)
        .toString();
  }
}
