// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of Alerts */
@Generated
class AlertsImpl implements AlertsService {
  private final ApiClient apiClient;

  public AlertsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Alert create(CreateAlert request) {
    String path = "/api/2.0/preview/sql/alerts";
    return apiClient.POST(path, request, Alert.class);
  }

  @Override
  public void delete(DeleteAlertRequest request) {
    String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public Alert get(GetAlertRequest request) {
    String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
    return apiClient.GET(path, request, Alert.class);
  }

  @Override
  public Collection<Alert> list() {
    String path = "/api/2.0/preview/sql/alerts";
    return apiClient.getCollection(path, null, Alert.class);
  }

  @Override
  public void update(EditAlert request) {
    String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
    apiClient.PUT(path, request, Void.class);
  }
}
