// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Alerts */
@Generated
class AlertsImpl implements AlertsService {
  private final ApiClient apiClient;

  public AlertsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Alert create(CreateAlertRequest request) {
    String path = "/api/2.0/sql/alerts";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, Alert.class, headers);
  }

  @Override
  public void delete(TrashAlertRequest request) {
    String path = String.format("/api/2.0/sql/alerts/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Empty.class, headers);
  }

  @Override
  public Alert get(GetAlertRequest request) {
    String path = String.format("/api/2.0/sql/alerts/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, Alert.class, headers);
  }

  @Override
  public ListAlertsResponse list(ListAlertsRequest request) {
    String path = "/api/2.0/sql/alerts";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListAlertsResponse.class, headers);
  }

  @Override
  public Alert update(UpdateAlertRequest request) {
    String path = String.format("/api/2.0/sql/alerts/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, Alert.class, headers);
  }
}
