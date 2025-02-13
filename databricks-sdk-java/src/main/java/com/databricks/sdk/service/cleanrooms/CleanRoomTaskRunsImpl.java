// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of CleanRoomTaskRuns */
@Generated
class CleanRoomTaskRunsImpl implements CleanRoomTaskRunsService {
  private final ApiClient apiClient;

  public CleanRoomTaskRunsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ListCleanRoomNotebookTaskRunsResponse list(ListCleanRoomNotebookTaskRunsRequest request) {
    String path = String.format("/api/2.0/clean-rooms/%s/runs", request.getCleanRoomName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListCleanRoomNotebookTaskRunsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
