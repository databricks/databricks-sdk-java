// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;

/**
 * Clean room task runs are the executions of notebooks in a clean room.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CleanRoomTaskRunsService {
  /** List all the historical notebook task runs in a clean room. */
  ListCleanRoomNotebookTaskRunsResponse list(
      ListCleanRoomNotebookTaskRunsRequest listCleanRoomNotebookTaskRunsRequest);
}
