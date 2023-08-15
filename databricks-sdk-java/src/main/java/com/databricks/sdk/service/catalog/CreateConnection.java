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
  @JsonProperty("options_kvpairs")
  private Map<String, String> optionsKvpairs;

  /** Username of current owner of the connection. */
  @JsonProperty("owner")
  private String owner;

  /** An object containing map of key-value properties attached to the connection. */
  @JsonProperty("properties_kvpairs")
  private Map<String, String> propertiesKvpairs;

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

  public CreateConnection setOptionsKvpairs(Map<String, String> optionsKvpairs) {
    this.optionsKvpairs = optionsKvpairs;
    return this;
  }

  public Map<String, String> getOptionsKvpairs() {
    return optionsKvpairs;
  }

  public CreateConnection setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public CreateConnection setPropertiesKvpairs(Map<String, String> propertiesKvpairs) {
    this.propertiesKvpairs = propertiesKvpairs;
    return this;
  }

  public Map<String, String> getPropertiesKvpairs() {
    return propertiesKvpairs;
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
        && Objects.equals(optionsKvpairs, that.optionsKvpairs)
        && Objects.equals(owner, that.owner)
        && Objects.equals(propertiesKvpairs, that.propertiesKvpairs)
        && Objects.equals(readOnly, that.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment, connectionType, name, optionsKvpairs, owner, propertiesKvpairs, readOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateConnection.class)
        .add("comment", comment)
        .add("connectionType", connectionType)
        .add("name", name)
        .add("optionsKvpairs", optionsKvpairs)
        .add("owner", owner)
        .add("propertiesKvpairs", propertiesKvpairs)
        .add("readOnly", readOnly)
        .toString();
  }
}
