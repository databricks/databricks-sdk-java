// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CancelCommand {
  /** ID of the cluster that hosts the execution context. */
  @JsonProperty("clusterId")
  private String clusterId;

  /** ID of the command to cancel, as returned by __execute__. */
  @JsonProperty("commandId")
  private String commandId;

  /** ID of the execution context the command runs in. */
  @JsonProperty("contextId")
  private String contextId;

  public CancelCommand setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public CancelCommand setCommandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

  public String getCommandId() {
    return commandId;
  }

  public CancelCommand setContextId(String contextId) {
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
    CancelCommand that = (CancelCommand) o;
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
    return new ToStringer(CancelCommand.class)
        .add("clusterId", clusterId)
        .add("commandId", commandId)
        .add("contextId", contextId)
        .toString();
  }
}
