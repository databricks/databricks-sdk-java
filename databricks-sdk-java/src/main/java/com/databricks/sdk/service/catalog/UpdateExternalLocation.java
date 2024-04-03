// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateExternalLocation {
  /** The AWS access point to use when accesing s3 for this external location. */
  @JsonProperty("access_point")
  private String accessPoint;

  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the storage credential used with this location. */
  @JsonProperty("credential_name")
  private String credentialName;

  /** Encryption options that apply to clients connecting to cloud storage. */
  @JsonProperty("encryption_details")
  private EncryptionDetails encryptionDetails;

  /** Force update even if changing url invalidates dependent external tables or mounts. */
  @JsonProperty("force")
  private Boolean force;

  /** Name of the external location. */
  private String name;

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

  public UpdateExternalLocation setAccessPoint(String accessPoint) {
    this.accessPoint = accessPoint;
    return this;
  }

  public String getAccessPoint() {
    return accessPoint;
  }

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

  public UpdateExternalLocation setEncryptionDetails(EncryptionDetails encryptionDetails) {
    this.encryptionDetails = encryptionDetails;
    return this;
  }

  public EncryptionDetails getEncryptionDetails() {
    return encryptionDetails;
  }

  public UpdateExternalLocation setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
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
    return Objects.equals(accessPoint, that.accessPoint)
        && Objects.equals(comment, that.comment)
        && Objects.equals(credentialName, that.credentialName)
        && Objects.equals(encryptionDetails, that.encryptionDetails)
        && Objects.equals(force, that.force)
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
        accessPoint,
        comment,
        credentialName,
        encryptionDetails,
        force,
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
        .add("accessPoint", accessPoint)
        .add("comment", comment)
        .add("credentialName", credentialName)
        .add("encryptionDetails", encryptionDetails)
        .add("force", force)
        .add("name", name)
        .add("newName", newName)
        .add("owner", owner)
        .add("readOnly", readOnly)
        .add("skipValidation", skipValidation)
        .add("url", url)
        .toString();
  }
}
