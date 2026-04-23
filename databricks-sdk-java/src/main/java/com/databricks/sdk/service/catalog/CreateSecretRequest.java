// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateSecretRequest {
  /**
   * The secret object to create. The **name**, **catalog_name**, **schema_name**, and **value**
   * fields are required.
   */
  @JsonProperty("secret")
  private Secret secret;

  public CreateSecretRequest setSecret(Secret secret) {
    this.secret = secret;
    return this;
  }

  public Secret getSecret() {
    return secret;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSecretRequest that = (CreateSecretRequest) o;
    return Objects.equals(secret, that.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSecretRequest.class).add("secret", secret).toString();
  }
}
