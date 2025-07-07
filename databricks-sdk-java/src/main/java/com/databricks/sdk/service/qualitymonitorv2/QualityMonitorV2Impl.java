// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of QualityMonitorV2 */
@Generated
class QualityMonitorV2Impl implements QualityMonitorV2Service {
  private final ApiClient apiClient;

  public QualityMonitorV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public QualityMonitor createQualityMonitor(CreateQualityMonitorRequest request) {
    String path = "/api/2.0/quality-monitors";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getQualityMonitor()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, QualityMonitor.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteQualityMonitor(DeleteQualityMonitorRequest request) {
    String path =
        String.format(
            "/api/2.0/quality-monitors/%s/%s", request.getObjectType(), request.getObjectId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public QualityMonitor getQualityMonitor(GetQualityMonitorRequest request) {
    String path =
        String.format(
            "/api/2.0/quality-monitors/%s/%s", request.getObjectType(), request.getObjectId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, QualityMonitor.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListQualityMonitorResponse listQualityMonitor(ListQualityMonitorRequest request) {
    String path = "/api/2.0/quality-monitors";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListQualityMonitorResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public QualityMonitor updateQualityMonitor(UpdateQualityMonitorRequest request) {
    String path =
        String.format(
            "/api/2.0/quality-monitors/%s/%s", request.getObjectType(), request.getObjectId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request.getQualityMonitor()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, QualityMonitor.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
