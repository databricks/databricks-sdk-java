// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Command class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Command {
  /** Running cluster id */
  @JsonProperty("clusterId")
  private String clusterId;

  /** Executable code */
  @JsonProperty("command")
  private String command;

  /** Running context id */
  @JsonProperty("contextId")
  private String contextId;

  /** */
  @JsonProperty("language")
  private Language language;

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Command} object
   */
  public Command setClusterId(String clusterId) {
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
   * <p>Setter for the field <code>command</code>.</p>
   *
   * @param command a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Command} object
   */
  public Command setCommand(String command) {
    this.command = command;
    return this;
  }

  /**
   * <p>Getter for the field <code>command</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCommand() {
    return command;
  }

  /**
   * <p>Setter for the field <code>contextId</code>.</p>
   *
   * @param contextId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.Command} object
   */
  public Command setContextId(String contextId) {
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

  /**
   * <p>Setter for the field <code>language</code>.</p>
   *
   * @param language a {@link com.databricks.sdk.service.compute.Language} object
   * @return a {@link com.databricks.sdk.service.compute.Command} object
   */
  public Command setLanguage(Language language) {
    this.language = language;
    return this;
  }

  /**
   * <p>Getter for the field <code>language</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.Language} object
   */
  public Language getLanguage() {
    return language;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Command that = (Command) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(command, that.command)
        && Objects.equals(contextId, that.contextId)
        && Objects.equals(language, that.language);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId, command, contextId, language);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Command.class)
        .add("clusterId", clusterId)
        .add("command", command)
        .add("contextId", contextId)
        .add("language", language)
        .toString();
  }
}
