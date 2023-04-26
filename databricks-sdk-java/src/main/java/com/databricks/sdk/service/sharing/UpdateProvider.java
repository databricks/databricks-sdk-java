// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateProvider class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateProvider {
  /** Description about the provider. */
  @JsonProperty("comment")
  private String comment;

  /** The name of the Provider. */
  @JsonProperty("name")
  private String name;

  /** Username of Provider owner. */
  @JsonProperty("owner")
  private String owner;

  /** This field is required when the __authentication_type__ is **TOKEN** or not provided. */
  @JsonProperty("recipient_profile_str")
  private String recipientProfileStr;

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateProvider} object
   */
  public UpdateProvider setComment(String comment) {
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
   * @return a {@link com.databricks.sdk.service.sharing.UpdateProvider} object
   */
  public UpdateProvider setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.sharing.UpdateProvider} object
   */
  public UpdateProvider setOwner(String owner) {
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
   * <p>Setter for the field <code>recipientProfileStr</code>.</p>
   *
   * @param recipientProfileStr a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateProvider} object
   */
  public UpdateProvider setRecipientProfileStr(String recipientProfileStr) {
    this.recipientProfileStr = recipientProfileStr;
    return this;
  }

  /**
   * <p>Getter for the field <code>recipientProfileStr</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRecipientProfileStr() {
    return recipientProfileStr;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateProvider that = (UpdateProvider) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(recipientProfileStr, that.recipientProfileStr);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(comment, name, owner, recipientProfileStr);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateProvider.class)
        .add("comment", comment)
        .add("name", name)
        .add("owner", owner)
        .add("recipientProfileStr", recipientProfileStr)
        .toString();
  }
}
