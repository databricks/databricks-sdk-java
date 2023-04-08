// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get OAuth Published App Integration */
public class GetPublishedAppIntegrationRequest {
  /** The oauth app integration ID. */
  private String integrationId;

  public GetPublishedAppIntegrationRequest setIntegrationId(String integrationId) {
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
    GetPublishedAppIntegrationRequest that = (GetPublishedAppIntegrationRequest) o;
    return Objects.equals(integrationId, that.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedAppIntegrationRequest.class)
        .add("integrationId", integrationId)
        .toString();
  }
}
