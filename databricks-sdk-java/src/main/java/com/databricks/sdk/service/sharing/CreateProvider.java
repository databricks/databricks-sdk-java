// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateProvider class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateProvider {
  /** The delta sharing authentication type. */
  @JsonProperty("authentication_type")
  private AuthenticationType authenticationType;

  /** Description about the provider. */
  @JsonProperty("comment")
  private String comment;

  /** The name of the Provider. */
  @JsonProperty("name")
  private String name;

  /** This field is required when the __authentication_type__ is **TOKEN** or not provided. */
  @JsonProperty("recipient_profile_str")
  private String recipientProfileStr;

  /**
   * <p>Setter for the field <code>authenticationType</code>.</p>
   *
   * @param authenticationType a {@link com.databricks.sdk.service.sharing.AuthenticationType} object
   * @return a {@link com.databricks.sdk.service.sharing.CreateProvider} object
   */
  public CreateProvider setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  /**
   * <p>Getter for the field <code>authenticationType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.AuthenticationType} object
   */
  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.CreateProvider} object
   */
  public CreateProvider setComment(String comment) {
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
   * @return a {@link com.databricks.sdk.service.sharing.CreateProvider} object
   */
  public CreateProvider setName(String name) {
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
   * <p>Setter for the field <code>recipientProfileStr</code>.</p>
   *
   * @param recipientProfileStr a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.CreateProvider} object
   */
  public CreateProvider setRecipientProfileStr(String recipientProfileStr) {
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
    CreateProvider that = (CreateProvider) o;
    return Objects.equals(authenticationType, that.authenticationType)
        && Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(recipientProfileStr, that.recipientProfileStr);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(authenticationType, comment, name, recipientProfileStr);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateProvider.class)
        .add("authenticationType", authenticationType)
        .add("comment", comment)
        .add("name", name)
        .add("recipientProfileStr", recipientProfileStr)
        .toString();
  }
}
