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
import java.util.Objects;

@Generated
@JsonSerialize(using = ExternalLocationInfo.ExternalLocationInfoSerializer.class)
@JsonDeserialize(using = ExternalLocationInfo.ExternalLocationInfoDeserializer.class)
public class ExternalLocationInfo {
  /**
   * Indicates whether the principal is limited to retrieving metadata for the associated object
   * through the BROWSE privilege when include_browse is enabled in the request.
   */
  private Boolean browseOnly;

  /** User-provided free-form text description. */
  private String comment;

  /** Time at which this external location was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of external location creator. */
  private String createdBy;

  /** Unique ID of the location's storage credential. */
  private String credentialId;

  /** Name of the storage credential used with this location. */
  private String credentialName;

  /** [Create:OPT Update:OPT] Whether to enable file events on this external location. */
  private Boolean enableFileEvents;

  /** Encryption options that apply to clients connecting to cloud storage. */
  private EncryptionDetails encryptionDetails;

  /**
   * Indicates whether fallback mode is enabled for this external location. When fallback mode is
   * enabled, the access to the location falls back to cluster credentials if UC credentials are not
   * sufficient.
   */
  private Boolean fallback;

  /** [Create:OPT Update:OPT] File event queue settings. */
  private FileEventQueue fileEventQueue;

  /** */
  private IsolationMode isolationMode;

  /** Unique identifier of metastore hosting the external location. */
  private String metastoreId;

  /** Name of the external location. */
  private String name;

  /** The owner of the external location. */
  private String owner;

  /** Indicates whether the external location is read-only. */
  private Boolean readOnly;

  /** Time at which external location this was last modified, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of user who last modified the external location. */
  private String updatedBy;

  /** Path URL of the external location. */
  private String url;

  public ExternalLocationInfo setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public ExternalLocationInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ExternalLocationInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ExternalLocationInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ExternalLocationInfo setCredentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public String getCredentialId() {
    return credentialId;
  }

  public ExternalLocationInfo setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  public String getCredentialName() {
    return credentialName;
  }

  public ExternalLocationInfo setEnableFileEvents(Boolean enableFileEvents) {
    this.enableFileEvents = enableFileEvents;
    return this;
  }

  public Boolean getEnableFileEvents() {
    return enableFileEvents;
  }

  public ExternalLocationInfo setEncryptionDetails(EncryptionDetails encryptionDetails) {
    this.encryptionDetails = encryptionDetails;
    return this;
  }

  public EncryptionDetails getEncryptionDetails() {
    return encryptionDetails;
  }

  public ExternalLocationInfo setFallback(Boolean fallback) {
    this.fallback = fallback;
    return this;
  }

  public Boolean getFallback() {
    return fallback;
  }

  public ExternalLocationInfo setFileEventQueue(FileEventQueue fileEventQueue) {
    this.fileEventQueue = fileEventQueue;
    return this;
  }

  public FileEventQueue getFileEventQueue() {
    return fileEventQueue;
  }

  public ExternalLocationInfo setIsolationMode(IsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public IsolationMode getIsolationMode() {
    return isolationMode;
  }

  public ExternalLocationInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ExternalLocationInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExternalLocationInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public ExternalLocationInfo setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public ExternalLocationInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ExternalLocationInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public ExternalLocationInfo setUrl(String url) {
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
    ExternalLocationInfo that = (ExternalLocationInfo) o;
    return Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(credentialId, that.credentialId)
        && Objects.equals(credentialName, that.credentialName)
        && Objects.equals(enableFileEvents, that.enableFileEvents)
        && Objects.equals(encryptionDetails, that.encryptionDetails)
        && Objects.equals(fallback, that.fallback)
        && Objects.equals(fileEventQueue, that.fileEventQueue)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        browseOnly,
        comment,
        createdAt,
        createdBy,
        credentialId,
        credentialName,
        enableFileEvents,
        encryptionDetails,
        fallback,
        fileEventQueue,
        isolationMode,
        metastoreId,
        name,
        owner,
        readOnly,
        updatedAt,
        updatedBy,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLocationInfo.class)
        .add("browseOnly", browseOnly)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("credentialId", credentialId)
        .add("credentialName", credentialName)
        .add("enableFileEvents", enableFileEvents)
        .add("encryptionDetails", encryptionDetails)
        .add("fallback", fallback)
        .add("fileEventQueue", fileEventQueue)
        .add("isolationMode", isolationMode)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("readOnly", readOnly)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("url", url)
        .toString();
  }

  ExternalLocationInfoPb toPb() {
    ExternalLocationInfoPb pb = new ExternalLocationInfoPb();
    pb.setBrowseOnly(browseOnly);
    pb.setComment(comment);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setCredentialId(credentialId);
    pb.setCredentialName(credentialName);
    pb.setEnableFileEvents(enableFileEvents);
    pb.setEncryptionDetails(encryptionDetails);
    pb.setFallback(fallback);
    pb.setFileEventQueue(fileEventQueue);
    pb.setIsolationMode(isolationMode);
    pb.setMetastoreId(metastoreId);
    pb.setName(name);
    pb.setOwner(owner);
    pb.setReadOnly(readOnly);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);
    pb.setUrl(url);

    return pb;
  }

  static ExternalLocationInfo fromPb(ExternalLocationInfoPb pb) {
    ExternalLocationInfo model = new ExternalLocationInfo();
    model.setBrowseOnly(pb.getBrowseOnly());
    model.setComment(pb.getComment());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setCredentialId(pb.getCredentialId());
    model.setCredentialName(pb.getCredentialName());
    model.setEnableFileEvents(pb.getEnableFileEvents());
    model.setEncryptionDetails(pb.getEncryptionDetails());
    model.setFallback(pb.getFallback());
    model.setFileEventQueue(pb.getFileEventQueue());
    model.setIsolationMode(pb.getIsolationMode());
    model.setMetastoreId(pb.getMetastoreId());
    model.setName(pb.getName());
    model.setOwner(pb.getOwner());
    model.setReadOnly(pb.getReadOnly());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class ExternalLocationInfoSerializer extends JsonSerializer<ExternalLocationInfo> {
    @Override
    public void serialize(
        ExternalLocationInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExternalLocationInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExternalLocationInfoDeserializer
      extends JsonDeserializer<ExternalLocationInfo> {
    @Override
    public ExternalLocationInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExternalLocationInfoPb pb = mapper.readValue(p, ExternalLocationInfoPb.class);
      return ExternalLocationInfo.fromPb(pb);
    }
  }
}
