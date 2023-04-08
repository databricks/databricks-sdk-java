// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
