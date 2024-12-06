// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List notebook task runs */
@Generated
public class ListCleanRoomNotebookTaskRunsRequest {
  /** Name of the clean room. */
  @JsonIgnore private String cleanRoomName;

  /** Notebook name */
  @JsonIgnore
  @QueryParam("notebook_name")
  private String notebookName;

  /** The maximum number of task runs to return */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListCleanRoomNotebookTaskRunsRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public ListCleanRoomNotebookTaskRunsRequest setNotebookName(String notebookName) {
    this.notebookName = notebookName;
    return this;
  }

  public String getNotebookName() {
    return notebookName;
  }

  public ListCleanRoomNotebookTaskRunsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListCleanRoomNotebookTaskRunsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCleanRoomNotebookTaskRunsRequest that = (ListCleanRoomNotebookTaskRunsRequest) o;
    return Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(notebookName, that.notebookName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomName, notebookName, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomNotebookTaskRunsRequest.class)
        .add("cleanRoomName", cleanRoomName)
        .add("notebookName", notebookName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
