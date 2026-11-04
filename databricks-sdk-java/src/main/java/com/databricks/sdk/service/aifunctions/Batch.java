// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.protobuf.Timestamp;
import java.util.Map;
import java.util.Objects;

/** An asynchronous run of one AI function over a file of requests. */
@Generated
public class Batch {
  /** Output only. Time the batch was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The AI function to run for every request, for example `ai_extract`. */
  @JsonProperty("endpoint")
  private String endpoint;

  /** Path of the JSONL input file on a Unity Catalog volume. Each line is one request. */
  @JsonProperty("input_ref")
  private String inputRef;

  /** ID of the batch, in the form `batch_<id>`. The service assigns it. */
  @JsonProperty("name")
  private String name;

  /**
   * Path on a Unity Catalog volume to write the JSONL output to. When it is omitted, the output
   * stays on Databricks-managed storage and a finished batch returns a short-lived download URL in
   * this field instead.
   */
  @JsonProperty("output_ref")
  private String outputRef;

  /** Function options applied to every request in the batch, for example the extraction schema. */
  @JsonProperty("params")
  private Map<String, JsonNode> params;

  /**
   * Output only. Percentage of the requests that finished, from 0 to 100. Returned when one batch
   * is read, not when batches are listed.
   */
  @JsonProperty("percent_complete")
  private Double percentComplete;

  /** Output only. Request counts. Returned when one batch is read, not when batches are listed. */
  @JsonProperty("request_counts")
  private BatchRequestCounts requestCounts;

  /** Output only. Status of the batch. */
  @JsonProperty("status")
  private BatchStatus status;

  public Batch setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Batch setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public Batch setInputRef(String inputRef) {
    this.inputRef = inputRef;
    return this;
  }

  public String getInputRef() {
    return inputRef;
  }

  public Batch setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Batch setOutputRef(String outputRef) {
    this.outputRef = outputRef;
    return this;
  }

  public String getOutputRef() {
    return outputRef;
  }

  public Batch setParams(Map<String, JsonNode> params) {
    this.params = params;
    return this;
  }

  public Map<String, JsonNode> getParams() {
    return params;
  }

  public Batch setPercentComplete(Double percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }

  public Double getPercentComplete() {
    return percentComplete;
  }

  public Batch setRequestCounts(BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
    return this;
  }

  public BatchRequestCounts getRequestCounts() {
    return requestCounts;
  }

  public Batch setStatus(BatchStatus status) {
    this.status = status;
    return this;
  }

  public BatchStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Batch that = (Batch) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(endpoint, that.endpoint)
        && Objects.equals(inputRef, that.inputRef)
        && Objects.equals(name, that.name)
        && Objects.equals(outputRef, that.outputRef)
        && Objects.equals(params, that.params)
        && Objects.equals(percentComplete, that.percentComplete)
        && Objects.equals(requestCounts, that.requestCounts)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        endpoint,
        inputRef,
        name,
        outputRef,
        params,
        percentComplete,
        requestCounts,
        status);
  }

  @Override
  public String toString() {
    return new ToStringer(Batch.class)
        .add("createTime", createTime)
        .add("endpoint", endpoint)
        .add("inputRef", inputRef)
        .add("name", name)
        .add("outputRef", outputRef)
        .add("params", params)
        .add("percentComplete", percentComplete)
        .add("requestCounts", requestCounts)
        .add("status", status)
        .toString();
  }
}
