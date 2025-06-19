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
@JsonSerialize(using = CreateExternalLocation.CreateExternalLocationSerializer.class)
@JsonDeserialize(using = CreateExternalLocation.CreateExternalLocationDeserializer.class)
public class CreateExternalLocation {
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

  /** Name of the external location. */
  private String name;

  /** Indicates whether the external location is read-only. */
  private Boolean readOnly;

  /** Skips validation of the storage credential associated with the external location. */
  private Boolean skipValidation;

  /** Path URL of the external location. */
  private String url;

  public CreateExternalLocation setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateExternalLocation setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  public String getCredentialName() {
    return credentialName;
  }

  public CreateExternalLocation setEnableFileEvents(Boolean enableFileEvents) {
    this.enableFileEvents = enableFileEvents;
    return this;
  }

  public Boolean getEnableFileEvents() {
    return enableFileEvents;
  }

  public CreateExternalLocation setEncryptionDetails(EncryptionDetails encryptionDetails) {
    this.encryptionDetails = encryptionDetails;
    return this;
  }

  public EncryptionDetails getEncryptionDetails() {
    return encryptionDetails;
  }

  public CreateExternalLocation setFallback(Boolean fallback) {
    this.fallback = fallback;
    return this;
  }

  public Boolean getFallback() {
    return fallback;
  }

  public CreateExternalLocation setFileEventQueue(FileEventQueue fileEventQueue) {
    this.fileEventQueue = fileEventQueue;
    return this;
  }

  public FileEventQueue getFileEventQueue() {
    return fileEventQueue;
  }

  public CreateExternalLocation setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateExternalLocation setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public CreateExternalLocation setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
    return this;
  }

  public Boolean getSkipValidation() {
    return skipValidation;
  }

  public CreateExternalLocation setUrl(String url) {
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
    CreateExternalLocation that = (CreateExternalLocation) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(credentialName, that.credentialName)
        && Objects.equals(enableFileEvents, that.enableFileEvents)
        && Objects.equals(encryptionDetails, that.encryptionDetails)
        && Objects.equals(fallback, that.fallback)
        && Objects.equals(fileEventQueue, that.fileEventQueue)
        && Objects.equals(name, that.name)
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
        name,
        readOnly,
        skipValidation,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExternalLocation.class)
        .add("comment", comment)
        .add("credentialName", credentialName)
        .add("enableFileEvents", enableFileEvents)
        .add("encryptionDetails", encryptionDetails)
        .add("fallback", fallback)
        .add("fileEventQueue", fileEventQueue)
        .add("name", name)
        .add("readOnly", readOnly)
        .add("skipValidation", skipValidation)
        .add("url", url)
        .toString();
  }

  CreateExternalLocationPb toPb() {
    CreateExternalLocationPb pb = new CreateExternalLocationPb();
    pb.setComment(comment);
    pb.setCredentialName(credentialName);
    pb.setEnableFileEvents(enableFileEvents);
    pb.setEncryptionDetails(encryptionDetails);
    pb.setFallback(fallback);
    pb.setFileEventQueue(fileEventQueue);
    pb.setName(name);
    pb.setReadOnly(readOnly);
    pb.setSkipValidation(skipValidation);
    pb.setUrl(url);

    return pb;
  }

  static CreateExternalLocation fromPb(CreateExternalLocationPb pb) {
    CreateExternalLocation model = new CreateExternalLocation();
    model.setComment(pb.getComment());
    model.setCredentialName(pb.getCredentialName());
    model.setEnableFileEvents(pb.getEnableFileEvents());
    model.setEncryptionDetails(pb.getEncryptionDetails());
    model.setFallback(pb.getFallback());
    model.setFileEventQueue(pb.getFileEventQueue());
    model.setName(pb.getName());
    model.setReadOnly(pb.getReadOnly());
    model.setSkipValidation(pb.getSkipValidation());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class CreateExternalLocationSerializer
      extends JsonSerializer<CreateExternalLocation> {
    @Override
    public void serialize(
        CreateExternalLocation value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateExternalLocationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateExternalLocationDeserializer
      extends JsonDeserializer<CreateExternalLocation> {
    @Override
    public CreateExternalLocation deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateExternalLocationPb pb = mapper.readValue(p, CreateExternalLocationPb.class);
      return CreateExternalLocation.fromPb(pb);
    }
  }
}
