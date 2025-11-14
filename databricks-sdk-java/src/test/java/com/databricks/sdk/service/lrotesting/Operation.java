// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lrotesting;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** This resource represents a long-running operation that is the result of a network API call. */
@Generated
public class Operation {
  /**
   * If the value is `false`, it means the operation is still in progress. If `true`, the operation
   * is completed, and either `error` or `response` is available.
   */
  @JsonProperty("done")
  private Boolean done;

  /** The error result of the operation in case of failure or cancellation. */
  @JsonProperty("error")
  private DatabricksServiceExceptionWithDetailsProto error;

  /**
   * Service-specific metadata associated with the operation. It typically contains progress
   * information and common metadata such as create time. Some services might not provide such
   * metadata.
   */
  @JsonProperty("metadata")
  private Object metadata;

  /**
   * The server-assigned name, which is only unique within the same service that originally returns
   * it. If you use the default HTTP mapping, the `name` should be a resource name ending with
   * `operations/{unique_id}`.
   */
  @JsonProperty("name")
  private String name;

  /** The normal, successful response of the operation. */
  @JsonProperty("response")
  private Object response;

  public Operation setDone(Boolean done) {
    this.done = done;
    return this;
  }

  public Boolean getDone() {
    return done;
  }

  public Operation setError(DatabricksServiceExceptionWithDetailsProto error) {
    this.error = error;
    return this;
  }

  public DatabricksServiceExceptionWithDetailsProto getError() {
    return error;
  }

  public Operation setMetadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  public Object getMetadata() {
    return metadata;
  }

  public Operation setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Operation setResponse(Object response) {
    this.response = response;
    return this;
  }

  public Object getResponse() {
    return response;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Operation that = (Operation) o;
    return Objects.equals(done, that.done)
        && Objects.equals(error, that.error)
        && Objects.equals(metadata, that.metadata)
        && Objects.equals(name, that.name)
        && Objects.equals(response, that.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(done, error, metadata, name, response);
  }

  @Override
  public String toString() {
    return new ToStringer(Operation.class)
        .add("done", done)
        .add("error", error)
        .add("metadata", metadata)
        .add("name", name)
        .add("response", response)
        .toString();
  }
}
