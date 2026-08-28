// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetExternalServicePrincipalProxyRequest {
  /**
   * Required. The resource name of the external service principal. Format:
   * external-service-principals/{external_service_principal_id}
   */
  @JsonIgnore private String name;

  public GetExternalServicePrincipalProxyRequest setName(String name) {
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
    GetExternalServicePrincipalProxyRequest that = (GetExternalServicePrincipalProxyRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExternalServicePrincipalProxyRequest.class)
        .add("name", name)
        .toString();
  }
}
