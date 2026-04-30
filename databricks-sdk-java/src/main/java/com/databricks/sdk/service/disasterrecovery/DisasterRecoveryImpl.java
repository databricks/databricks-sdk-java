// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of DisasterRecovery */
@Generated
class DisasterRecoveryImpl implements DisasterRecoveryService {
  private final ApiClient apiClient;

  public DisasterRecoveryImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public FailoverGroup createFailoverGroup(CreateFailoverGroupRequest request) {
    String path =
        String.format("/api/disaster-recovery/v1/%s/failover-groups", request.getParent());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getFailoverGroup()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, FailoverGroup.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public StableUrl createStableUrl(CreateStableUrlRequest request) {
    String path = String.format("/api/disaster-recovery/v1/%s/stable-urls", request.getParent());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getStableUrl()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, StableUrl.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteFailoverGroup(DeleteFailoverGroupRequest request) {
    String path = String.format("/api/disaster-recovery/v1/%s", request.getName());
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
  public void deleteStableUrl(DeleteStableUrlRequest request) {
    String path = String.format("/api/disaster-recovery/v1/%s", request.getName());
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
  public FailoverGroup failoverFailoverGroup(FailoverFailoverGroupRequest request) {
    String path = String.format("/api/disaster-recovery/v1/%s/failover", request.getName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, FailoverGroup.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public FailoverGroup getFailoverGroup(GetFailoverGroupRequest request) {
    String path = String.format("/api/disaster-recovery/v1/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, FailoverGroup.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public StableUrl getStableUrl(GetStableUrlRequest request) {
    String path = String.format("/api/disaster-recovery/v1/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, StableUrl.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListFailoverGroupsResponse listFailoverGroups(ListFailoverGroupsRequest request) {
    String path =
        String.format("/api/disaster-recovery/v1/%s/failover-groups", request.getParent());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListFailoverGroupsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListStableUrlsResponse listStableUrls(ListStableUrlsRequest request) {
    String path = String.format("/api/disaster-recovery/v1/%s/stable-urls", request.getParent());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListStableUrlsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public FailoverGroup updateFailoverGroup(UpdateFailoverGroupRequest request) {
    String path = String.format("/api/disaster-recovery/v1/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getFailoverGroup()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, FailoverGroup.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
