// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of InstanceProfiles */
@Generated
class InstanceProfilesImpl implements InstanceProfilesService {
  private final ApiClient apiClient;

  public InstanceProfilesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void add(AddInstanceProfile request) {
    String path = "/api/2.0/instance-profiles/add";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void edit(InstanceProfile request) {
    String path = "/api/2.0/instance-profiles/edit";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListInstanceProfilesResponse list() {
    String path = "/api/2.0/instance-profiles/list";
    try {
      Request req = new Request("GET", path);

      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListInstanceProfilesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void remove(RemoveInstanceProfile request) {
    String path = "/api/2.0/instance-profiles/remove";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
