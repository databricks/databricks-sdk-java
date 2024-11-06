// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get OAuth Custom App Integration */
@Generated
public class GetCustomAppIntegrationRequest {
  /** */
  @JsonIgnore private String integrationId;

  public GetCustomAppIntegrationRequest setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCustomAppIntegrationRequest that = (GetCustomAppIntegrationRequest) o;
    return Objects.equals(integrationId, that.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCustomAppIntegrationRequest.class)
        .add("integrationId", integrationId)
        .toString();
  }
}
