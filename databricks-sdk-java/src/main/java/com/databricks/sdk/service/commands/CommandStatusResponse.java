// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommandStatusResponse that = (CommandStatusResponse) o;
    return Objects.equals(id, that.id)
        && Objects.equals(results, that.results)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, results, status);
  }

  @Override
  public String toString() {
    return new ToStringer(CommandStatusResponse.class)
        .add("id", id)
        .add("results", results)
        .add("status", status)
        .toString();
  }
}
