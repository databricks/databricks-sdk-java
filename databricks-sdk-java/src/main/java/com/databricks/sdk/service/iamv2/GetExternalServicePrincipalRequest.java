// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetExternalServicePrincipalRequest {
  /**
   * Required. The resource name of the external service principal. Format:
   * accounts/{account_id}/external-service-principals/{external_service_principal_id}
   */
  @JsonIgnore private String name;

  public GetExternalServicePrincipalRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetExternalServicePrincipalRequest that = (GetExternalServicePrincipalRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExternalServicePrincipalRequest.class).add("name", name).toString();
  }
}
