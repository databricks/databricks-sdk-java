// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, LegacyAlert.class, headers);
  }

  @Override
  public void delete(DeleteAlertsLegacyRequest request) {
    String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public LegacyAlert get(GetAlertsLegacyRequest request) {
    String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, LegacyAlert.class, headers);
  }

  @Override
  public Collection<LegacyAlert> list() {
    String path = "/api/2.0/preview/sql/alerts";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.getCollection(path, null, LegacyAlert.class, headers);
  }

  @Override
  public void update(EditAlert request) {
    String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PUT(path, request, UpdateResponse.class, headers);
  }
}
