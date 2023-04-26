// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Workspace */
class WorkspaceImpl implements WorkspaceService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for WorkspaceImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public WorkspaceImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(Delete request) {
    String path = "/api/2.0/workspace/delete";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public ExportResponse export(ExportRequest request) {
    String path = "/api/2.0/workspace/export";
    return apiClient.GET(path, request, ExportResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public ObjectInfo getStatus(GetStatusRequest request) {
    String path = "/api/2.0/workspace/get-status";
    return apiClient.GET(path, request, ObjectInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public void importContent(Import request) {
    String path = "/api/2.0/workspace/import";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListResponse list(ListWorkspaceRequest request) {
    String path = "/api/2.0/workspace/list";
    return apiClient.GET(path, request, ListResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void mkdirs(Mkdirs request) {
    String path = "/api/2.0/workspace/mkdirs";
    apiClient.POST(path, request, Void.class);
  }
}
