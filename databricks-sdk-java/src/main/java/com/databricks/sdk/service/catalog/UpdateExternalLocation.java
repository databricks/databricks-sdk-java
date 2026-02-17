// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateExternalLocation {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the storage credential used with this location. */
  @JsonProperty("credential_name")
  private String credentialName;

  /** The effective value of `enable_file_events` after applying server-side defaults. */
  @JsonProperty("effective_enable_file_events")
  private Boolean effectiveEnableFileEvents;

  /**
   * Whether to enable file events on this external location. Default to `true`. Set to `false` to
   * disable file events. The actual applied value may differ due to server-side defaults; check
   * `effective_enable_file_events` for the effective state.
   */
  @JsonProperty("enable_file_events")
  private Boolean enableFileEvents;

  /** */
  @JsonProperty("encryption_details")
  private EncryptionDetails encryptionDetails;

  /**
   * Indicates whether fallback mode is enabled for this external location. When fallback mode is
   * enabled, the access to the location falls back to cluster credentials if UC credentials are not
   * sufficient.
   */
  @JsonProperty("fallback")
  private Boolean fallback;

  /**
   * File event queue settings. If `enable_file_events` is not `false`, must be defined and have
   * exactly one of the documented properties.
   */
  @JsonProperty("file_event_queue")
  private FileEventQueue fileEventQueue;

  /** Force update even if changing url invalidates dependent external tables or mounts. */
  @JsonProperty("force")
  private Boolean force;

  /** */
  @JsonProperty("isolation_mode")
  private IsolationMode isolationMode;

  /** Name of the external location. */
  @JsonIgnore private String name;

  /** New name for the external location. */
  @JsonProperty("new_name")
  private String newName;

  /** The owner of the external location. */
  @JsonProperty("owner")
  private String owner;

  /** Indicates whether the external location is read-only. */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** Skips validation of the storage credential associated with the external location. */
  @JsonProperty("skip_validation")
  private Boolean skipValidation;

  /** Path URL of the external location. */
  @JsonProperty("url")
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

  public UpdateExternalLocation setEffectiveEnableFileEvents(Boolean effectiveEnableFileEvents) {
    this.effectiveEnableFileEvents = effectiveEnableFileEvents;
    return this;
  }

  public Boolean getEffectiveEnableFileEvents() {
    return effectiveEnableFileEvents;
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
        && Objects.equals(effectiveEnableFileEvents, that.effectiveEnableFileEvents)
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
        effectiveEnableFileEvents,
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
        .add("effectiveEnableFileEvents", effectiveEnableFileEvents)
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
}
