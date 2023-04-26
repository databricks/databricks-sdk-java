// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>UpdateShare class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateShare {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the share. */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of share. */
  @JsonProperty("owner")
  private String owner;

  /** Array of shared data object updates. */
  @JsonProperty("updates")
  private Collection<SharedDataObjectUpdate> updates;

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateShare} object
   */
  public UpdateShare setComment(String comment) {
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
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateShare} object
   */
  public UpdateShare setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.sharing.UpdateShare} object
   */
  public UpdateShare setOwner(String owner) {
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
   * <p>Setter for the field <code>updates</code>.</p>
   *
   * @param updates a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateShare} object
   */
  public UpdateShare setUpdates(Collection<SharedDataObjectUpdate> updates) {
    this.updates = updates;
    return this;
  }

  /**
   * <p>Getter for the field <code>updates</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<SharedDataObjectUpdate> getUpdates() {
    return updates;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateShare that = (UpdateShare) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(updates, that.updates);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(comment, name, owner, updates);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateShare.class)
        .add("comment", comment)
        .add("name", name)
        .add("owner", owner)
        .add("updates", updates)
        .toString();
  }
}
