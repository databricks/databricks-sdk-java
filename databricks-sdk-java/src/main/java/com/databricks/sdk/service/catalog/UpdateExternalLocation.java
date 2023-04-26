// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateExternalLocation class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateExternalLocation} object
   */
  public UpdateExternalLocation setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>credentialName</code>.</p>
   *
   * @param credentialName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateExternalLocation} object
   */
  public UpdateExternalLocation setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentialName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * <p>Setter for the field <code>force</code>.</p>
   *
   * @param force a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateExternalLocation} object
   */
  public UpdateExternalLocation setForce(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * <p>Getter for the field <code>force</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getForce() {
    return force;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateExternalLocation} object
   */
  public UpdateExternalLocation setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>owner</code>.</p>
   *
   * @param owner a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateExternalLocation} object
   */
  public UpdateExternalLocation setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * <p>Getter for the field <code>owner</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOwner() {
    return owner;
  }

  /**
   * <p>Setter for the field <code>readOnly</code>.</p>
   *
   * @param readOnly a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateExternalLocation} object
   */
  public UpdateExternalLocation setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * <p>Getter for the field <code>readOnly</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getReadOnly() {
    return readOnly;
  }

  /**
   * <p>Setter for the field <code>url</code>.</p>
   *
   * @param url a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateExternalLocation} object
   */
  public UpdateExternalLocation setUrl(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>Getter for the field <code>url</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(comment, credentialName, force, name, owner, readOnly, url);
  }

  /** {@inheritDoc} */
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
