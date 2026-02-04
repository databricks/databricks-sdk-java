// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
import java.util.Collection;

/** Package-local implementation of AlertsLegacy */
@Generated
class AlertsLegacyImpl implements AlertsLegacyService {
  private final ApiClient apiClient;

  public AlertsLegacyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public LegacyAlert create(CreateAlert request) {
    String path = "/api/2.0/preview/sql/alerts";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, LegacyAlert.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteAlertsLegacyRequest request) {
    String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public LegacyAlert get(GetAlertsLegacyRequest request) {
    String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, LegacyAlert.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Collection<LegacyAlert> list() {
    String path = "/api/2.0/preview/sql/alerts";
    Request req = new Request("GET", path);
    req.withHeader("Accept", "application/json");
    if (apiClient.workspaceId() != null) {
      req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
    }
    return apiClient.getCollection(req, LegacyAlert.class);
  }

  @Override
  public void update(EditAlert request) {
    String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
