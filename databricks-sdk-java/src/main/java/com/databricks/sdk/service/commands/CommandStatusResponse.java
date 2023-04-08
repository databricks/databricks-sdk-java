// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommandStatusResponse {
  /** */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("results")
  private Results results;

  /** */
  @JsonProperty("status")
  private CommandStatus status;

  public CommandStatusResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CommandStatusResponse setResults(Results results) {
    this.results = results;
    return this;
  }

  public Results getResults() {
    return results;
  }

  public CommandStatusResponse setStatus(CommandStatus status) {
    this.status = status;
    return this;
  }

  public CommandStatus getStatus() {
    return status;
  }
}
