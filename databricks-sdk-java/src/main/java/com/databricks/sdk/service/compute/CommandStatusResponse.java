// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CommandStatusResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.CommandStatusResponse} object
   */
  public CommandStatusResponse setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>results</code>.</p>
   *
   * @param results a {@link com.databricks.sdk.service.compute.Results} object
   * @return a {@link com.databricks.sdk.service.compute.CommandStatusResponse} object
   */
  public CommandStatusResponse setResults(Results results) {
    this.results = results;
    return this;
  }

  /**
   * <p>Getter for the field <code>results</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.Results} object
   */
  public Results getResults() {
    return results;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.compute.CommandStatus} object
   * @return a {@link com.databricks.sdk.service.compute.CommandStatusResponse} object
   */
  public CommandStatusResponse setStatus(CommandStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.CommandStatus} object
   */
  public CommandStatus getStatus() {
    return status;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommandStatusResponse that = (CommandStatusResponse) o;
    return Objects.equals(id, that.id)
        && Objects.equals(results, that.results)
        && Objects.equals(status, that.status);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(id, results, status);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CommandStatusResponse.class)
        .add("id", id)
        .add("results", results)
        .add("status", status)
        .toString();
  }
}
