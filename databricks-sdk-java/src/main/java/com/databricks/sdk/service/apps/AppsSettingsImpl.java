// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.apps;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AppsSettings */
@Generated
class AppsSettingsImpl implements AppsSettingsService {
  private final ApiClient apiClient;

  public AppsSettingsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CustomTemplate createCustomTemplate(CreateCustomTemplateRequest request) {
    String path = "/api/2.0/apps-settings/templates";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getTemplate()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CustomTemplate.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CustomTemplate deleteCustomTemplate(DeleteCustomTemplateRequest request) {
    String path = String.format("/api/2.0/apps-settings/templates/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CustomTemplate.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CustomTemplate getCustomTemplate(GetCustomTemplateRequest request) {
    String path = String.format("/api/2.0/apps-settings/templates/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CustomTemplate.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListCustomTemplatesResponse listCustomTemplates(ListCustomTemplatesRequest request) {
    String path = "/api/2.0/apps-settings/templates";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListCustomTemplatesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CustomTemplate updateCustomTemplate(UpdateCustomTemplateRequest request) {
    String path = String.format("/api/2.0/apps-settings/templates/%s", request.getName());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request.getTemplate()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CustomTemplate.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
