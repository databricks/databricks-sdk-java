// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class CreateConnectionPb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("connection_type")
  private ConnectionType connectionType;

  @JsonProperty("name")
  private String name;

  @JsonProperty("options")
  private Map<String, String> options;

  @JsonProperty("properties")
  private Map<String, String> properties;

  @JsonProperty("read_only")
  private Boolean readOnly;

  public CreateConnectionPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateConnectionPb setConnectionType(ConnectionType connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  public ConnectionType getConnectionType() {
    return connectionType;
  }

  public CreateConnectionPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateConnectionPb setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public CreateConnectionPb setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CreateConnectionPb setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateConnectionPb that = (CreateConnectionPb) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(connectionType, that.connectionType)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(properties, that.properties)
        && Objects.equals(readOnly, that.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, connectionType, name, options, properties, readOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateConnectionPb.class)
        .add("comment", comment)
        .add("connectionType", connectionType)
        .add("name", name)
        .add("options", options)
        .add("properties", properties)
        .add("readOnly", readOnly)
        .toString();
  }
}
