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
@JsonSerialize(using = UpdateExternalLocation.UpdateExternalLocationSerializer.class)
@JsonDeserialize(using = UpdateExternalLocation.UpdateExternalLocationDeserializer.class)
public class UpdateExternalLocation {
  /** User-provided free-form text description. */
  private String comment;

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

  /** Force update even if changing url invalidates dependent external tables or mounts. */
  private Boolean force;

  /** */
  private IsolationMode isolationMode;

  /** Name of the external location. */
  private String name;

  /** New name for the external location. */
  private String newName;

  /** The owner of the external location. */
  private String owner;

  /** Indicates whether the external location is read-only. */
  private Boolean readOnly;

  /** Skips validation of the storage credential associated with the external location. */
  private Boolean skipValidation;

  /** Path URL of the external location. */
  private String url;

  public UpdateExternalLocation setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateExternalLocation setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  public String getCredentialName() {
    return credentialName;
  }

  public UpdateExternalLocation setEnableFileEvents(Boolean enableFileEvents) {
    this.enableFileEvents = enableFileEvents;
    return this;
  }

  public Boolean getEnableFileEvents() {
    return enableFileEvents;
  }

  public UpdateExternalLocation setEncryptionDetails(EncryptionDetails encryptionDetails) {
    this.encryptionDetails = encryptionDetails;
    return this;
  }

  public EncryptionDetails getEncryptionDetails() {
    return encryptionDetails;
  }

  public UpdateExternalLocation setFallback(Boolean fallback) {
    this.fallback = fallback;
    return this;
  }

  public Boolean getFallback() {
    return fallback;
  }

  public UpdateExternalLocation setFileEventQueue(FileEventQueue fileEventQueue) {
    this.fileEventQueue = fileEventQueue;
    return this;
  }

  public FileEventQueue getFileEventQueue() {
    return fileEventQueue;
  }

  public UpdateExternalLocation setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public UpdateExternalLocation setIsolationMode(IsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public IsolationMode getIsolationMode() {
    return isolationMode;
  }

  public UpdateExternalLocation setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateExternalLocation setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateExternalLocation setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateExternalLocation setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public UpdateExternalLocation setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
    return this;
  }

  public Boolean getSkipValidation() {
    return skipValidation;
  }

  public UpdateExternalLocation setUrl(String url) {
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
    UpdateExternalLocation that = (UpdateExternalLocation) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(credentialName, that.credentialName)
        && Objects.equals(enableFileEvents, that.enableFileEvents)
        && Objects.equals(encryptionDetails, that.encryptionDetails)
        && Objects.equals(fallback, that.fallback)
        && Objects.equals(fileEventQueue, that.fileEventQueue)
        && Objects.equals(force, that.force)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(skipValidation, that.skipValidation)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        credentialName,
        enableFileEvents,
        encryptionDetails,
        fallback,
        fileEventQueue,
        force,
        isolationMode,
        name,
        newName,
        owner,
        readOnly,
        skipValidation,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExternalLocation.class)
        .add("comment", comment)
        .add("credentialName", credentialName)
        .add("enableFileEvents", enableFileEvents)
        .add("encryptionDetails", encryptionDetails)
        .add("fallback", fallback)
        .add("fileEventQueue", fileEventQueue)
        .add("force", force)
        .add("isolationMode", isolationMode)
        .add("name", name)
        .add("newName", newName)
        .add("owner", owner)
        .add("readOnly", readOnly)
        .add("skipValidation", skipValidation)
        .add("url", url)
        .toString();
  }

  UpdateExternalLocationPb toPb() {
    UpdateExternalLocationPb pb = new UpdateExternalLocationPb();
    pb.setComment(comment);
    pb.setCredentialName(credentialName);
    pb.setEnableFileEvents(enableFileEvents);
    pb.setEncryptionDetails(encryptionDetails);
    pb.setFallback(fallback);
    pb.setFileEventQueue(fileEventQueue);
    pb.setForce(force);
    pb.setIsolationMode(isolationMode);
    pb.setName(name);
    pb.setNewName(newName);
    pb.setOwner(owner);
    pb.setReadOnly(readOnly);
    pb.setSkipValidation(skipValidation);
    pb.setUrl(url);

    return pb;
  }

  static UpdateExternalLocation fromPb(UpdateExternalLocationPb pb) {
    UpdateExternalLocation model = new UpdateExternalLocation();
    model.setComment(pb.getComment());
    model.setCredentialName(pb.getCredentialName());
    model.setEnableFileEvents(pb.getEnableFileEvents());
    model.setEncryptionDetails(pb.getEncryptionDetails());
    model.setFallback(pb.getFallback());
    model.setFileEventQueue(pb.getFileEventQueue());
    model.setForce(pb.getForce());
    model.setIsolationMode(pb.getIsolationMode());
    model.setName(pb.getName());
    model.setNewName(pb.getNewName());
    model.setOwner(pb.getOwner());
    model.setReadOnly(pb.getReadOnly());
    model.setSkipValidation(pb.getSkipValidation());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class UpdateExternalLocationSerializer
      extends JsonSerializer<UpdateExternalLocation> {
    @Override
    public void serialize(
        UpdateExternalLocation value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateExternalLocationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateExternalLocationDeserializer
      extends JsonDeserializer<UpdateExternalLocation> {
    @Override
    public UpdateExternalLocation deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateExternalLocationPb pb = mapper.readValue(p, UpdateExternalLocationPb.class);
      return UpdateExternalLocation.fromPb(pb);
    }
  }
}
