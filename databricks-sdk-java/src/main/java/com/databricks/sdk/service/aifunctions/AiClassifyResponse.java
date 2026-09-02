// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Objects;

@Generated
public class AiClassifyResponse {
  /** Additional metadata returned by AI Classify. */
  @JsonProperty("metadata")
  private AiClassifyResponseMetadata metadata;

  /**
   * The function result as a JSON value. An array of per-label objects: one element in single-label
   * mode (the default), or multiple elements when `multilabel` is true. When
   * `enable_confidence_scores` and `enable_rationales` are true, `confidence_score` and `rationale`
   * are included in each response value, respectively.
   */
  @JsonProperty("response")
  private JsonNode response;

  public AiClassifyResponse setMetadata(AiClassifyResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  public AiClassifyResponseMetadata getMetadata() {
    return metadata;
  }

  public AiClassifyResponse setResponse(JsonNode response) {
    this.response = response;
    return this;
  }

  public JsonNode getResponse() {
    return response;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiClassifyResponse that = (AiClassifyResponse) o;
    return Objects.equals(metadata, that.metadata) && Objects.equals(response, that.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, response);
  }

  @Override
  public String toString() {
    return new ToStringer(AiClassifyResponse.class)
        .add("metadata", metadata)
        .add("response", response)
        .toString();
  }
}
