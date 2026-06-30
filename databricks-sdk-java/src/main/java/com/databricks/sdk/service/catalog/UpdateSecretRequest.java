// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateSecretRequest {
  /**
   * The three-level (fully qualified) name of the secret (for example,
   * **catalog_name.schema_name.secret_name**).
   */
  @JsonIgnore private String fullName;

  /**
   * The secret object containing the fields to update. Only fields specified in **update_mask**
   * will be updated.
   */
  @JsonProperty("secret")
  private Secret secret;

  /**
   * The field mask specifying which fields of the secret to update. Supported fields: **value**,
   * **comment**, **owner**, **expire_time**.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateSecretRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateSecretRequest setSecret(Secret secret) {
    this.secret = secret;
    return this;
  }

  public Secret getSecret() {
    return secret;
  }

  public UpdateSecretRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateSecretRequest that = (UpdateSecretRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(secret, that.secret)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, secret, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSecretRequest.class)
        .add("fullName", fullName)
        .add("secret", secret)
        .add("updateMask", updateMask)
        .toString();
  }
}
