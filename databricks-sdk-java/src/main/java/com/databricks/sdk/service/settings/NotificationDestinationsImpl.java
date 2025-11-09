// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, NotificationDestination.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteNotificationDestinationRequest request) {
    String path = String.format("/api/2.0/notification-destinations/%s", request.getId());
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
  public NotificationDestination get(GetNotificationDestinationRequest request) {
    String path = String.format("/api/2.0/notification-destinations/%s", request.getId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, NotificationDestination.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListNotificationDestinationsResponse list(ListNotificationDestinationsRequest request) {
    String path = "/api/2.0/notification-destinations";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListNotificationDestinationsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public NotificationDestination update(UpdateNotificationDestinationRequest request) {
    String path = String.format("/api/2.0/notification-destinations/%s", request.getId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, NotificationDestination.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
