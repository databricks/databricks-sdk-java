// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateExternalLocation {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the storage credential used with this location. */
  @JsonProperty("credential_name")
  private String credentialName;

  /** Force update even if changing url invalidates dependent external tables or mounts. */
  @JsonProperty("force")
  private Boolean force;

  /** Name of the external location. */
  @JsonProperty("name")
  private String name;

  /** The owner of the external location. */
  @JsonProperty("owner")
  private String owner;

  /** Indicates whether the external location is read-only. */
  @JsonProperty("read_only")
  private Boolean readOnly;

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
        && Objects.equals(force, that.force)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, credentialName, force, name, owner, readOnly, url);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExternalLocation.class)
        .add("comment", comment)
        .add("credentialName", credentialName)
        .add("force", force)
        .add("name", name)
        .add("owner", owner)
        .add("readOnly", readOnly)
        .add("url", url)
        .toString();
  }
}
