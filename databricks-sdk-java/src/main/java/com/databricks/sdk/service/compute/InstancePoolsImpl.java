// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of InstancePools */
class InstancePoolsImpl implements InstancePoolsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for InstancePoolsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public InstancePoolsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public CreateInstancePoolResponse create(CreateInstancePool request) {
    String path = "/api/2.0/instance-pools/create";
    return apiClient.POST(path, request, CreateInstancePoolResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteInstancePool request) {
    String path = "/api/2.0/instance-pools/delete";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void edit(EditInstancePool request) {
    String path = "/api/2.0/instance-pools/edit";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetInstancePool get(GetInstancePoolRequest request) {
    String path = "/api/2.0/instance-pools/get";
    return apiClient.GET(path, request, GetInstancePool.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListInstancePools list() {
    String path = "/api/2.0/instance-pools/list";
    return apiClient.GET(path, ListInstancePools.class);
  }
}
