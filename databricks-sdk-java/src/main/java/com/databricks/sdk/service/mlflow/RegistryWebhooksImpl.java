// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of RegistryWebhooks */
class RegistryWebhooksImpl implements RegistryWebhooksService {
  private final ApiClient apiClient;

  public RegistryWebhooksImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateResponse create(CreateRegistryWebhook request) {
    String path = "/api/2.0/mlflow/registry-webhooks/create";
    return apiClient.POST(path, request, CreateResponse.class);
  }

  @Override
  public void delete(DeleteRegistryWebhookRequest request) {
    String path = "/api/2.0/mlflow/registry-webhooks/delete";
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public ListRegistryWebhooks list(ListRegistryWebhooksRequest request) {
    String path = "/api/2.0/mlflow/registry-webhooks/list";
    return apiClient.GET(path, request, ListRegistryWebhooks.class);
  }

  @Override
  public TestRegistryWebhookResponse test(TestRegistryWebhookRequest request) {
    String path = "/api/2.0/mlflow/registry-webhooks/test";
    return apiClient.POST(path, request, TestRegistryWebhookResponse.class);
  }

  @Override
  public void update(UpdateRegistryWebhook request) {
    String path = "/api/2.0/mlflow/registry-webhooks/update";
    apiClient.PATCH(path, request, Void.class);
  }
}
