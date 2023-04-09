// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Delete Published OAuth App Integration */
public class DeletePublishedAppIntegrationRequest {
  /** The oauth app integration ID. */
  private String integrationId;

  public DeletePublishedAppIntegrationRequest setIntegrationId(String integrationId) {
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
    DeletePublishedAppIntegrationRequest that = (DeletePublishedAppIntegrationRequest) o;
    return Objects.equals(integrationId, that.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePublishedAppIntegrationRequest.class)
        .add("integrationId", integrationId)
        .toString();
  }
}
