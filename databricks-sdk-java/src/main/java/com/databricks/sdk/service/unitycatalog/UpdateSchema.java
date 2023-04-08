// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

public class UpdateSchema {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Full name of the schema. */
  private String fullName;

  /** Name of schema, relative to parent catalog. */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of schema. */
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

  public UpdateSchema setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateSchema setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
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
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, fullName, name, owner, properties);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSchema.class)
        .add("comment", comment)
        .add("fullName", fullName)
        .add("name", name)
        .add("owner", owner)
        .add("properties", properties)
        .toString();
  }
}
