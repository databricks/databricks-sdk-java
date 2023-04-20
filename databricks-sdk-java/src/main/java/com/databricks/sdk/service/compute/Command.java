// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public Command setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public Command setCommand(String command) {
    this.command = command;
    return this;
  }

  public String getCommand() {
    return command;
  }

  public Command setContextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  public String getContextId() {
    return contextId;
  }

  public Command setLanguage(Language language) {
    this.language = language;
    return this;
  }

  public Language getLanguage() {
    return language;
  }

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

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, command, contextId, language);
  }

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
