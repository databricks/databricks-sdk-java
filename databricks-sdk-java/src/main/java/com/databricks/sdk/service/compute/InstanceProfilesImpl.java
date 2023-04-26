// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of InstanceProfiles */
class InstanceProfilesImpl implements InstanceProfilesService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for InstanceProfilesImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public InstanceProfilesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public void add(AddInstanceProfile request) {
    String path = "/api/2.0/instance-profiles/add";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void edit(InstanceProfile request) {
    String path = "/api/2.0/instance-profiles/edit";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListInstanceProfilesResponse list() {
    String path = "/api/2.0/instance-profiles/list";
    return apiClient.GET(path, ListInstanceProfilesResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void remove(RemoveInstanceProfile request) {
    String path = "/api/2.0/instance-profiles/remove";
    apiClient.POST(path, request, Void.class);
  }
}
