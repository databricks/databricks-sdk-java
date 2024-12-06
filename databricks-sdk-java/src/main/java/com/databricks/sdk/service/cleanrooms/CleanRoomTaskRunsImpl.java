// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListCleanRoomNotebookTaskRunsResponse.class, headers);
  }
}
