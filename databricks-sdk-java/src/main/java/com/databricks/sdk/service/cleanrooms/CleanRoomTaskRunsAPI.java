// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Clean room task runs are the executions of notebooks in a clean room. */
@Generated
public class CleanRoomTaskRunsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CleanRoomTaskRunsAPI.class);

  private final CleanRoomTaskRunsService impl;

  /** Regular-use constructor */
  public CleanRoomTaskRunsAPI(ApiClient apiClient) {
    impl = new CleanRoomTaskRunsImpl(apiClient);
  }

  /** Constructor for mocks */
  public CleanRoomTaskRunsAPI(CleanRoomTaskRunsService mock) {
    impl = mock;
  }

  public Iterable<CleanRoomNotebookTaskRun> list(String cleanRoomName) {
    return list(new ListCleanRoomNotebookTaskRunsRequest().setCleanRoomName(cleanRoomName));
  }

  /** List all the historical notebook task runs in a clean room. */
  public Iterable<CleanRoomNotebookTaskRun> list(ListCleanRoomNotebookTaskRunsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListCleanRoomNotebookTaskRunsResponse::getRuns,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public CleanRoomTaskRunsService impl() {
    return impl;
  }
}
