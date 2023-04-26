// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CancelCommand class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CancelCommand {
  /** */
  @JsonProperty("clusterId")
  private String clusterId;

  /** */
  @JsonProperty("commandId")
  private String commandId;

  /** */
  @JsonProperty("contextId")
  private String contextId;

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.CancelCommand} object
   */
  public CancelCommand setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClusterId() {
    return clusterId;
  }

  /**
   * <p>Setter for the field <code>commandId</code>.</p>
   *
   * @param commandId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.CancelCommand} object
   */
  public CancelCommand setCommandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

  /**
   * <p>Getter for the field <code>commandId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCommandId() {
    return commandId;
  }

  /**
   * <p>Setter for the field <code>contextId</code>.</p>
   *
   * @param contextId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.CancelCommand} object
   */
  public CancelCommand setContextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * <p>Getter for the field <code>contextId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getContextId() {
    return contextId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CancelCommand that = (CancelCommand) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(commandId, that.commandId)
        && Objects.equals(contextId, that.contextId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId, commandId, contextId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CancelCommand.class)
        .add("clusterId", clusterId)
        .add("commandId", commandId)
        .add("contextId", contextId)
        .toString();
  }
}
