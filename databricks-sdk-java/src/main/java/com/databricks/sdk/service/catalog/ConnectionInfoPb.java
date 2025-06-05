// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class ConnectionInfoPb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("connection_id")
  private String connectionId;

  @JsonProperty("connection_type")
  private ConnectionType connectionType;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("credential_type")
  private CredentialType credentialType;

  @JsonProperty("full_name")
  private String fullName;

  @JsonProperty("metastore_id")
  private String metastoreId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("options")
  private Map<String, String> options;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("properties")
  private Map<String, String> properties;

  @JsonProperty("provisioning_info")
  private ProvisioningInfo provisioningInfo;

  @JsonProperty("read_only")
  private Boolean readOnly;

  @JsonProperty("securable_type")
  private SecurableType securableType;

  @JsonProperty("updated_at")
  private Long updatedAt;

  @JsonProperty("updated_by")
  private String updatedBy;

  @JsonProperty("url")
  private String url;

  public ConnectionInfoPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ConnectionInfoPb setConnectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  public String getConnectionId() {
    return connectionId;
  }

  public ConnectionInfoPb setConnectionType(ConnectionType connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  public ConnectionType getConnectionType() {
    return connectionType;
  }

  public ConnectionInfoPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ConnectionInfoPb setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ConnectionInfoPb setCredentialType(CredentialType credentialType) {
    this.credentialType = credentialType;
    return this;
  }

  public CredentialType getCredentialType() {
    return credentialType;
  }

  public ConnectionInfoPb setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public ConnectionInfoPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ConnectionInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ConnectionInfoPb setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public ConnectionInfoPb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public ConnectionInfoPb setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public ConnectionInfoPb setProvisioningInfo(ProvisioningInfo provisioningInfo) {
    this.provisioningInfo = provisioningInfo;
    return this;
  }

  public ProvisioningInfo getProvisioningInfo() {
    return provisioningInfo;
  }

  public ConnectionInfoPb setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public ConnectionInfoPb setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public SecurableType getSecurableType() {
    return securableType;
  }

  public ConnectionInfoPb setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ConnectionInfoPb setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public ConnectionInfoPb setUrl(String url) {
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
    ConnectionInfoPb that = (ConnectionInfoPb) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(connectionId, that.connectionId)
        && Objects.equals(connectionType, that.connectionType)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(credentialType, that.credentialType)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties)
        && Objects.equals(provisioningInfo, that.provisioningInfo)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(securableType, that.securableType)
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
        options,
        owner,
        properties,
        provisioningInfo,
        readOnly,
        securableType,
        updatedAt,
        updatedBy,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(ConnectionInfoPb.class)
        .add("comment", comment)
        .add("connectionId", connectionId)
        .add("connectionType", connectionType)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("credentialType", credentialType)
        .add("fullName", fullName)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("options", options)
        .add("owner", owner)
        .add("properties", properties)
        .add("provisioningInfo", provisioningInfo)
        .add("readOnly", readOnly)
        .add("securableType", securableType)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("url", url)
        .toString();
  }
}
