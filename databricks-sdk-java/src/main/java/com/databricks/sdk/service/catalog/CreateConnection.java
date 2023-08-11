// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class CreateConnection {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** The type of connection. */
  @JsonProperty("connection_type")
  private ConnectionType connectionType;

  /** Name of the connection. */
  @JsonProperty("name")
  private String name;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("options")
  private Map<String, String> options;

  /** Username of current owner of the connection. */
  @JsonProperty("owner")
  private String owner;

  /** An object containing map of key-value properties attached to the connection. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /** If the connection is read only. */
  @JsonProperty("read_only")
  private Boolean readOnly;

  public CreateConnection setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateConnection setConnectionType(ConnectionType connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  public ConnectionType getConnectionType() {
    return connectionType;
  }

  public CreateConnection setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateConnection setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public CreateConnection setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public CreateConnection setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CreateConnection setReadOnly(Boolean readOnly) {
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
    CreateConnection that = (CreateConnection) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(connectionType, that.connectionType)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties)
        && Objects.equals(readOnly, that.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, connectionType, name, options, owner, properties, readOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateConnection.class)
        .add("comment", comment)
        .add("connectionType", connectionType)
        .add("name", name)
        .add("options", options)
        .add("owner", owner)
        .add("properties", properties)
        .add("readOnly", readOnly)
        .toString();
  }
}
