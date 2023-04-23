// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public GcpServiceAccountKey setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public GcpServiceAccountKey setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  public String getPrivateKey() {
    return privateKey;
  }

  public GcpServiceAccountKey setPrivateKeyId(String privateKeyId) {
    this.privateKeyId = privateKeyId;
    return this;
  }

  public String getPrivateKeyId() {
    return privateKeyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpServiceAccountKey that = (GcpServiceAccountKey) o;
    return Objects.equals(email, that.email)
        && Objects.equals(privateKey, that.privateKey)
        && Objects.equals(privateKeyId, that.privateKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, privateKey, privateKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpServiceAccountKey.class)
        .add("email", email)
        .add("privateKey", privateKey)
        .add("privateKeyId", privateKeyId)
        .toString();
  }
}
