// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateServicePrincipalSecretRequestPb {
  @JsonProperty("lifetime")
  private String lifetime;

  @JsonIgnore private Long servicePrincipalId;

  public CreateServicePrincipalSecretRequestPb setLifetime(String lifetime) {
    this.lifetime = lifetime;
    return this;
  }

  public String getLifetime() {
    return lifetime;
  }

  public CreateServicePrincipalSecretRequestPb setServicePrincipalId(Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateServicePrincipalSecretRequestPb that = (CreateServicePrincipalSecretRequestPb) o;
    return Objects.equals(lifetime, that.lifetime)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifetime, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServicePrincipalSecretRequestPb.class)
        .add("lifetime", lifetime)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }
}
