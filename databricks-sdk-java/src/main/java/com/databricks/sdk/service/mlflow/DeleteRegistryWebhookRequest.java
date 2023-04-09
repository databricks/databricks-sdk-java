// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Delete a webhook */
public class DeleteRegistryWebhookRequest {
  /** Webhook ID required to delete a registry webhook. */
  @QueryParam("id")
  private String id;

  public DeleteRegistryWebhookRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteRegistryWebhookRequest that = (DeleteRegistryWebhookRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRegistryWebhookRequest.class).add("id", id).toString();
  }
}
