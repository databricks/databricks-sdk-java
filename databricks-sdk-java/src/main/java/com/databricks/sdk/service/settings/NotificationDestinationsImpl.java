// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of NotificationDestinations */
@Generated
class NotificationDestinationsImpl implements NotificationDestinationsService {
  private final ApiClient apiClient;

  public NotificationDestinationsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public NotificationDestination create(CreateNotificationDestinationRequest request) {
    String path = "/api/2.0/notification-destinations";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, NotificationDestination.class, headers);
  }

  @Override
  public void delete(DeleteNotificationDestinationRequest request) {
    String path = String.format("/api/2.0/notification-destinations/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, Empty.class, headers);
  }

  @Override
  public NotificationDestination get(GetNotificationDestinationRequest request) {
    String path = String.format("/api/2.0/notification-destinations/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, NotificationDestination.class, headers);
  }

  @Override
  public ListNotificationDestinationsResponse list(ListNotificationDestinationsRequest request) {
    String path = "/api/2.0/notification-destinations";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "GET", path, request, ListNotificationDestinationsResponse.class, headers);
  }

  @Override
  public NotificationDestination update(UpdateNotificationDestinationRequest request) {
    String path = String.format("/api/2.0/notification-destinations/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, NotificationDestination.class, headers);
  }
}
