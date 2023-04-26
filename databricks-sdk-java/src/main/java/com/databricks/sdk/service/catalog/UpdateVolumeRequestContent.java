// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateVolumeRequestContent class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateVolumeRequestContent {
  /** The comment attached to the volume */
  @JsonProperty("comment")
  private String comment;

  /** The three-level (fully qualified) name of the volume */
  private String fullNameArg;

  /** The name of the volume */
  @JsonProperty("name")
  private String name;

  /** The identifier of the user who owns the volume */
  @JsonProperty("owner")
  private String owner;

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateVolumeRequestContent} object
   */
  public UpdateVolumeRequestContent setComment(String comment) {
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
   * <p>Setter for the field <code>fullNameArg</code>.</p>
   *
   * @param fullNameArg a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateVolumeRequestContent} object
   */
  public UpdateVolumeRequestContent setFullNameArg(String fullNameArg) {
    this.fullNameArg = fullNameArg;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullNameArg</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFullNameArg() {
    return fullNameArg;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateVolumeRequestContent} object
   */
  public UpdateVolumeRequestContent setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.catalog.UpdateVolumeRequestContent} object
   */
  public UpdateVolumeRequestContent setOwner(String owner) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateVolumeRequestContent that = (UpdateVolumeRequestContent) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(fullNameArg, that.fullNameArg)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(comment, fullNameArg, name, owner);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateVolumeRequestContent.class)
        .add("comment", comment)
        .add("fullNameArg", fullNameArg)
        .add("name", name)
        .add("owner", owner)
        .toString();
  }
}
