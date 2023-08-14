// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void edit(InstanceProfile request) {
    String path = "/api/2.0/instance-profiles/edit";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public ListInstanceProfilesResponse list() {
    String path = "/api/2.0/instance-profiles/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, ListInstanceProfilesResponse.class, headers);
  }

  @Override
  public void remove(RemoveInstanceProfile request) {
    String path = "/api/2.0/instance-profiles/remove";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    apiClient.POST(path, request, Void.class, headers);
  }
}
