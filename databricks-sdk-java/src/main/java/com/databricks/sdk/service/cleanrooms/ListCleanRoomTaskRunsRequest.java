// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListCleanRoomTaskRunsRequest {
  /** Name of the clean room. */
  @JsonIgnore private String cleanRoomName;

  /** Executable name. */
  @JsonIgnore
  @QueryParam("name")
  private String name;

  /** The maximum number of task runs to return. Maximum value of 100. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** Filter by the type of Clean Room task. */
  @JsonIgnore
  @QueryParam("task_type")
  private CleanRoomTaskType taskType;

  public ListCleanRoomTaskRunsRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public ListCleanRoomTaskRunsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ListCleanRoomTaskRunsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListCleanRoomTaskRunsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListCleanRoomTaskRunsRequest setTaskType(CleanRoomTaskType taskType) {
    this.taskType = taskType;
    return this;
  }

  public CleanRoomTaskType getTaskType() {
    return taskType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCleanRoomTaskRunsRequest that = (ListCleanRoomTaskRunsRequest) o;
    return Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(name, that.name)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(taskType, that.taskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomName, name, pageSize, pageToken, taskType);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomTaskRunsRequest.class)
        .add("cleanRoomName", cleanRoomName)
        .add("name", name)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("taskType", taskType)
        .toString();
  }
}
