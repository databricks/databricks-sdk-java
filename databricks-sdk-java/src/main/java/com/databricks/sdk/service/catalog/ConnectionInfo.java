// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = ConnectionInfo.ConnectionInfoSerializer.class)
@JsonDeserialize(using = ConnectionInfo.ConnectionInfoDeserializer.class)
public class ConnectionInfo {
  /** User-provided free-form text description. */
  private String comment;

  /** Unique identifier of the Connection. */
  private String connectionId;

  /** The type of connection. */
  private ConnectionType connectionType;

  /** Time at which this connection was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of connection creator. */
  private String createdBy;

  /** The type of credential. */
  private CredentialType credentialType;

  /** Full name of connection. */
  private String fullName;

  /** Unique identifier of parent metastore. */
  private String metastoreId;

  /** Name of the connection. */
  private String name;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> options;

  /** Username of current owner of the connection. */
  private String owner;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> properties;

  /** Status of an asynchronously provisioned resource. */
  private ProvisioningInfo provisioningInfo;

  /** If the connection is read only. */
  private Boolean readOnly;

  /** The type of Unity Catalog securable. */
  private SecurableType securableType;

  /** Time at which this connection was updated, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of user who last modified connection. */
  private String updatedBy;

  /** URL of the remote data source, extracted from options. */
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

  public ConnectionInfo setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public ConnectionInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public ConnectionInfo setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public ConnectionInfo setProvisioningInfo(ProvisioningInfo provisioningInfo) {
    this.provisioningInfo = provisioningInfo;
    return this;
  }

  public ProvisioningInfo getProvisioningInfo() {
    return provisioningInfo;
  }

  public ConnectionInfo setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public ConnectionInfo setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public SecurableType getSecurableType() {
    return securableType;
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

  ConnectionInfoPb toPb() {
    ConnectionInfoPb pb = new ConnectionInfoPb();
    pb.setComment(comment);
    pb.setConnectionId(connectionId);
    pb.setConnectionType(connectionType);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setCredentialType(credentialType);
    pb.setFullName(fullName);
    pb.setMetastoreId(metastoreId);
    pb.setName(name);
    pb.setOptions(options);
    pb.setOwner(owner);
    pb.setProperties(properties);
    pb.setProvisioningInfo(provisioningInfo);
    pb.setReadOnly(readOnly);
    pb.setSecurableType(securableType);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);
    pb.setUrl(url);

    return pb;
  }

  static ConnectionInfo fromPb(ConnectionInfoPb pb) {
    ConnectionInfo model = new ConnectionInfo();
    model.setComment(pb.getComment());
    model.setConnectionId(pb.getConnectionId());
    model.setConnectionType(pb.getConnectionType());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setCredentialType(pb.getCredentialType());
    model.setFullName(pb.getFullName());
    model.setMetastoreId(pb.getMetastoreId());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setOwner(pb.getOwner());
    model.setProperties(pb.getProperties());
    model.setProvisioningInfo(pb.getProvisioningInfo());
    model.setReadOnly(pb.getReadOnly());
    model.setSecurableType(pb.getSecurableType());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class ConnectionInfoSerializer extends JsonSerializer<ConnectionInfo> {
    @Override
    public void serialize(ConnectionInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ConnectionInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ConnectionInfoDeserializer extends JsonDeserializer<ConnectionInfo> {
    @Override
    public ConnectionInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ConnectionInfoPb pb = mapper.readValue(p, ConnectionInfoPb.class);
      return ConnectionInfo.fromPb(pb);
    }
  }
}
