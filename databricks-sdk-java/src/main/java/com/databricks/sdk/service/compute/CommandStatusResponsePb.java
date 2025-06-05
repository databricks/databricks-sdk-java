// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CommandStatusResponsePb {
  @JsonProperty("id")
  private String id;

  @JsonProperty("results")
  private Results results;

  @JsonProperty("status")
  private CommandStatus status;

  public CommandStatusResponsePb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CommandStatusResponsePb setResults(Results results) {
    this.results = results;
    return this;
  }

  public Results getResults() {
    return results;
  }

  public CommandStatusResponsePb setStatus(CommandStatus status) {
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
    CommandStatusResponsePb that = (CommandStatusResponsePb) o;
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
    return new ToStringer(CommandStatusResponsePb.class)
        .add("id", id)
        .add("results", results)
        .add("status", status)
        .toString();
  }
}
