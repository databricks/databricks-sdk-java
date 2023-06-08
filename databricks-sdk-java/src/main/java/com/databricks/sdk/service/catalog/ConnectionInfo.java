// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class ConnectionInfo {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Unique identifier of the Connection. */
  @JsonProperty("connection_id")
  private String connectionId;

  /** The type of connection. */
  @JsonProperty("connection_type")
  private ConnectionType connectionType;

  /** Time at which this connection was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of connection creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** The type of credential. */
  @JsonProperty("credential_type")
  private CredentialType credentialType;

  /** Full name of connection. */
  @JsonProperty("full_name")
  private String fullName;

  /** Unique identifier of parent metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** Name of the connection. */
  @JsonProperty("name")
  private String name;

  /** Object properties as map of string key-value pairs. */
  @JsonProperty("options_kvpairs")
  private OptionsKvPairs optionsKvpairs;

  /** Username of current owner of the connection. */
  @JsonProperty("owner")
  private String owner;

  /** An object containing map of key-value properties attached to the connection. */
  @JsonProperty("properties_kvpairs")
  private Map<String, String> propertiesKvpairs;

  /** If the connection is read only. */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** Time at which this connection was updated, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of user who last modified connection. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /** URL of the remote data source, extracted from options_kvpairs. */
  @JsonProperty("url")
  private String url;

  public ConnectionInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ConnectionInfo setConnectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  public String getConnectionId() {
    return connectionId;
  }

  public ConnectionInfo setConnectionType(ConnectionType connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  public ConnectionType getConnectionType() {
    return connectionType;
  }

  public ConnectionInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ConnectionInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ConnectionInfo setCredentialType(CredentialType credentialType) {
    this.credentialType = credentialType;
    return this;
  }

  public CredentialType getCredentialType() {
    return credentialType;
  }

  public ConnectionInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public ConnectionInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ConnectionInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ConnectionInfo setOptionsKvpairs(OptionsKvPairs optionsKvpairs) {
    this.optionsKvpairs = optionsKvpairs;
    return this;
  }

  public OptionsKvPairs getOptionsKvpairs() {
    return optionsKvpairs;
  }

  public ConnectionInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public ConnectionInfo setPropertiesKvpairs(Map<String, String> propertiesKvpairs) {
    this.propertiesKvpairs = propertiesKvpairs;
    return this;
  }

  public Map<String, String> getPropertiesKvpairs() {
    return propertiesKvpairs;
  }

  public ConnectionInfo setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public ConnectionInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ConnectionInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public ConnectionInfo setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConnectionInfo that = (ConnectionInfo) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(connectionId, that.connectionId)
        && Objects.equals(connectionType, that.connectionType)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(credentialType, that.credentialType)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(optionsKvpairs, that.optionsKvpairs)
        && Objects.equals(owner, that.owner)
        && Objects.equals(propertiesKvpairs, that.propertiesKvpairs)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        connectionId,
        connectionType,
        createdAt,
        createdBy,
        credentialType,
        fullName,
        metastoreId,
        name,
        optionsKvpairs,
        owner,
        propertiesKvpairs,
        readOnly,
        updatedAt,
        updatedBy,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(ConnectionInfo.class)
        .add("comment", comment)
        .add("connectionId", connectionId)
        .add("connectionType", connectionType)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("credentialType", credentialType)
        .add("fullName", fullName)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("optionsKvpairs", optionsKvpairs)
        .add("owner", owner)
        .add("propertiesKvpairs", propertiesKvpairs)
        .add("readOnly", readOnly)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("url", url)
        .toString();
  }
}
