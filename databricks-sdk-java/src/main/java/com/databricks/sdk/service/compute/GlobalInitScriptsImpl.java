// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of GlobalInitScripts */
class GlobalInitScriptsImpl implements GlobalInitScriptsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for GlobalInitScriptsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public GlobalInitScriptsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public CreateResponse create(GlobalInitScriptCreateRequest request) {
    String path = "/api/2.0/global-init-scripts";
    return apiClient.POST(path, request, CreateResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteGlobalInitScriptRequest request) {
    String path = String.format("/api/2.0/global-init-scripts/%s", request.getScriptId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public GlobalInitScriptDetailsWithContent get(GetGlobalInitScriptRequest request) {
    String path = String.format("/api/2.0/global-init-scripts/%s", request.getScriptId());
    return apiClient.GET(path, request, GlobalInitScriptDetailsWithContent.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListGlobalInitScriptsResponse list() {
    String path = "/api/2.0/global-init-scripts";
    return apiClient.GET(path, ListGlobalInitScriptsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(GlobalInitScriptUpdateRequest request) {
    String path = String.format("/api/2.0/global-init-scripts/%s", request.getScriptId());
    apiClient.PATCH(path, request, Void.class);
  }
}
