// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.protobuf.Timestamp;
import java.util.Map;
import java.util.Objects;

/**
 * The AI Functions Asynchronous API lets you process large volumes of requests as a batch in a
 * single call.
 */
@Generated
public class Batch {
  /** Output only. The time when the batch was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The AI function, for example `ai_parse_document`. */
  @JsonProperty("endpoint")
  private String endpoint;

  /**
   * Unity Catalog volume path of the JSONL input file. Each line is one request, in the form
   * `{"custom_id": ..., "body": ...}`. The file can hold up to 50,000 requests and be up to 200
   * MiB.
   */
  @JsonProperty("input_ref")
  private String inputRef;

  /**
   * Output only. Identifier. Resource name of the batch, returned by create. Format: `batch_<id>`.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Unity Catalog volume path to write the JSONL output file to. If the path is a directory, the
   * file is `<path>/<name>_output.jsonl`.
   */
  @JsonProperty("output_ref")
  private String outputRef;

  /**
   * Parameters of the function other than its input, applied to every request in the batch, for
   * example `schema` for `ai_extract`. Put function options, such as `version`, in a nested
   * `options` object. For the parameters of each function, see [AI
   * Functions](/large-language-models/ai-functions).
   */
  @JsonProperty("params")
  private Map<String, JsonNode> params;

  /**
   * Output only. The percentage of requests that are processed, from 0 to 100. Returned when you
   * get a batch, not when you list batches.
   */
  @JsonProperty("percent_complete")
  private Double percentComplete;

  /**
   * Output only. The number of requests in the batch, by result. Returned when you get a batch, not
   * when you list batches.
   */
  @JsonProperty("request_counts")
  private BatchRequestCounts requestCounts;

  /** Output only. The status of the batch. */
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
