// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete service principal secret */
@Generated
class DeleteServicePrincipalSecretRequestPb {
  @JsonIgnore private String secretId;

  @JsonIgnore private Long servicePrincipalId;

  public DeleteServicePrincipalSecretRequestPb setSecretId(String secretId) {
    this.secretId = secretId;
    return this;
  }

  public String getSecretId() {
    return secretId;
  }

  public DeleteServicePrincipalSecretRequestPb setServicePrincipalId(Long servicePrincipalId) {
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
    DeleteServicePrincipalSecretRequestPb that = (DeleteServicePrincipalSecretRequestPb) o;
    return Objects.equals(secretId, that.secretId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretId, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteServicePrincipalSecretRequestPb.class)
        .add("secretId", secretId)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }
}
