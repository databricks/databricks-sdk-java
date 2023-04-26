// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>GcpServiceAccountKey class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GcpServiceAccountKey {
  /** The email of the service account. */
  @JsonProperty("email")
  private String email;

  /** The service account's RSA private key. */
  @JsonProperty("private_key")
  private String privateKey;

  /** The ID of the service account's private key. */
  @JsonProperty("private_key_id")
  private String privateKeyId;

  /**
   * <p>Setter for the field <code>email</code>.</p>
   *
   * @param email a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GcpServiceAccountKey} object
   */
  public GcpServiceAccountKey setEmail(String email) {
    this.email = email;
    return this;
  }

  /**
   * <p>Getter for the field <code>email</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEmail() {
    return email;
  }

  /**
   * <p>Setter for the field <code>privateKey</code>.</p>
   *
   * @param privateKey a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GcpServiceAccountKey} object
   */
  public GcpServiceAccountKey setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * <p>Getter for the field <code>privateKey</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * <p>Setter for the field <code>privateKeyId</code>.</p>
   *
   * @param privateKeyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GcpServiceAccountKey} object
   */
  public GcpServiceAccountKey setPrivateKeyId(String privateKeyId) {
    this.privateKeyId = privateKeyId;
    return this;
  }

  /**
   * <p>Getter for the field <code>privateKeyId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrivateKeyId() {
    return privateKeyId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpServiceAccountKey that = (GcpServiceAccountKey) o;
    return Objects.equals(email, that.email)
        && Objects.equals(privateKey, that.privateKey)
        && Objects.equals(privateKeyId, that.privateKeyId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(email, privateKey, privateKeyId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GcpServiceAccountKey.class)
        .add("email", email)
        .add("privateKey", privateKey)
        .add("privateKeyId", privateKeyId)
        .toString();
  }
}
