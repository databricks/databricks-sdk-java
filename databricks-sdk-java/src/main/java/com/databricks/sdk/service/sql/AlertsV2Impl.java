// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AlertsV2 */
@Generated
class AlertsV2Impl implements AlertsV2Service {
  private final ApiClient apiClient;

  public AlertsV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AlertV2 createAlert(CreateAlertV2Request request) {
    String path = "/api/2.0/alerts";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getAlert()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AlertV2.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AlertV2 getAlert(GetAlertV2Request request) {
    String path = String.format("/api/2.0/alerts/%s", request.getId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AlertV2.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListAlertsV2Response listAlerts(ListAlertsV2Request request) {
    String path = "/api/2.0/alerts";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListAlertsV2Response.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void trashAlert(TrashAlertV2Request request) {
    String path = String.format("/api/2.0/alerts/%s", request.getId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Empty.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AlertV2 updateAlert(UpdateAlertV2Request request) {
    String path = String.format("/api/2.0/alerts/%s", request.getId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getAlert()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AlertV2.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
