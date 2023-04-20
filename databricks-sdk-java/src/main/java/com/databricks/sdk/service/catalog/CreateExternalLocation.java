// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateExternalLocation {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the storage credential used with this location. */
  @JsonProperty("credential_name")
  private String credentialName;

  /** Name of the external location. */
  @JsonProperty("name")
  private String name;

  /** Indicates whether the external location is read-only. */
  @JsonProperty("read_only")
  private Boolean readOnly;

  /** Skips validation of the storage credential associated with the external location. */
  @JsonProperty("skip_validation")
  private Boolean skipValidation;

  /** Path URL of the external location. */
  @JsonProperty("url")
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
        && Objects.equals(name, that.name)
        && Objects.equals(readOnly, that.readOnly)
        && Objects.equals(skipValidation, that.skipValidation)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, credentialName, name, readOnly, skipValidation, url);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExternalLocation.class)
        .add("comment", comment)
        .add("credentialName", credentialName)
        .add("name", name)
        .add("readOnly", readOnly)
        .add("skipValidation", skipValidation)
        .add("url", url)
        .toString();
  }
}
