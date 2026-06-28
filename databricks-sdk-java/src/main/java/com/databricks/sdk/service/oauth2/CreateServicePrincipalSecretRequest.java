// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateServicePrincipalSecretRequest {
  /**
   * The lifetime of the secret in seconds. If this parameter is not provided, the secret will have
   * a default lifetime of 730 days (63072000s).
   */
  @JsonProperty("lifetime")
  private String lifetime;

  /** The service principal ID. */
  @JsonIgnore private String servicePrincipalId;

  public CreateServicePrincipalSecretRequest setLifetime(String lifetime) {
    this.lifetime = lifetime;
    return this;
  }

  public String getLifetime() {
    return lifetime;
  }

  public CreateServicePrincipalSecretRequest setServicePrincipalId(String servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public String getServicePrincipalId() {
    return servicePrincipalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateServicePrincipalSecretRequest that = (CreateServicePrincipalSecretRequest) o;
    return Objects.equals(lifetime, that.lifetime)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifetime, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServicePrincipalSecretRequest.class)
        .add("lifetime", lifetime)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }
}
