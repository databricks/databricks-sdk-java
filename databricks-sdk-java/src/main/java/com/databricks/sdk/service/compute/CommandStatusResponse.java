// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CommandStatusResponse {
  /** ID of the command. */
  @JsonProperty("id")
  private String id;

  /**
   * Output of the command. It is populated only once the command has reached a terminal status, and
   * its `resultType` tells which of its other fields are set.
   */
  @JsonProperty("results")
  private Results results;

  /**
   * Current status of the command. `Queued` and `Running` mean the command has not completed yet,
   * and `Cancelling` means a cancellation is in progress. `Finished`, `Error` and `Cancelled` are
   * terminal: `Finished` means the command ran to completion, including when the code itself raised
   * an error (reported in `results` with the `error` result type), while `Error` means the
   * execution environment failed, for example because the driver or the context stopped.
   */
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
