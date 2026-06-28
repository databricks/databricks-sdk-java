// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class CommandStatusRequest {
  /** */
  @JsonIgnore
  @QueryParam("clusterId")
  private String clusterId;

  /** */
  @JsonIgnore
  @QueryParam("commandId")
  private String commandId;

  /** */
  @JsonIgnore
  @QueryParam("contextId")
  private String contextId;

  public CommandStatusRequest setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public CommandStatusRequest setCommandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

  public String getCommandId() {
    return commandId;
  }

  public CommandStatusRequest setContextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  public String getContextId() {
    return contextId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommandStatusRequest that = (CommandStatusRequest) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(commandId, that.commandId)
        && Objects.equals(contextId, that.contextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, commandId, contextId);
  }

  @Override
  public String toString() {
    return new ToStringer(CommandStatusRequest.class)
        .add("clusterId", clusterId)
        .add("commandId", commandId)
        .add("contextId", contextId)
        .toString();
  }
}
