// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CommandPb {
  @JsonProperty("clusterId")
  private String clusterId;

  @JsonProperty("command")
  private String command;

  @JsonProperty("contextId")
  private String contextId;

  @JsonProperty("language")
  private Language language;

  public CommandPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public CommandPb setCommand(String command) {
    this.command = command;
    return this;
  }

  public String getCommand() {
    return command;
  }

  public CommandPb setContextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  public String getContextId() {
    return contextId;
  }

  public CommandPb setLanguage(Language language) {
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
    CommandPb that = (CommandPb) o;
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
    return new ToStringer(CommandPb.class)
        .add("clusterId", clusterId)
        .add("command", command)
        .add("contextId", contextId)
        .add("language", language)
        .toString();
  }
}
