// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Objects;

@Generated
public class AiDecideResponse {
  /** Metadata identifying the function API version used for this request. */
  @JsonProperty("metadata")
  private AiDecideResponseMetadata metadata;

  /**
   * A JSON object containing an `answers` map with one answer for each question, keyed by the same
   * IDs as `questions`.
   *
   * <p>Each answer has a `type` matching its question and the following fields:
   *
   * <p>- `choice`: choice is the highest-probability option from `criteria`. `probabilities` maps
   * every option name to its probability. `confidence` is a number from 0 to 1 indicating how well
   * the state supports the assessment. The `probabilities` values sum to 1. For example:
   *
   * <p>```json { "answers": { "team": { "type": "choice", "choice": "billing", "probabilities": {
   * "billing": 0.85, "technical_support": 0.15 }, "confidence": 0.9 } } } ```
   *
   * <p>- `noul`: `probability` is a number from 0 to 1 estimating the probability that the answer
   * is true. For example:
   *
   * <p>```json { "answers": { "escalate": { "type": "noul", "probability": 0.8 } } } ```
   *
   * <p>- `score`: score is the probability-weighted mean of the zero-based level indices. It can
   * fall between levels, from 0 to the number of levels minus 1. `probabilities` maps each level
   * index to its probability, and `legend` maps each index to its original description. Both maps
   * use string keys such as "0", "1", and "2". `confidence` is a number from 0 to 1 indicating how
   * well the state supports the assessment. The `probabilities` values sum to 1. For example:
   *
   * <p>```json { "answers": { "urgency": { "type": "score", "score": 1.6, "probabilities": { "0":
   * 0.1, "1": 0.2, "2": 0.7 }, "legend": { "0": "Routine: can wait a few days", "1":
   * "Time-sensitive: needs attention today", "2": "Critical: needs immediate action" },
   * "confidence": 0.85 } } } ```
   */
  @JsonProperty("response")
  private JsonNode response;

  public AiDecideResponse setMetadata(AiDecideResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  public AiDecideResponseMetadata getMetadata() {
    return metadata;
  }

  public AiDecideResponse setResponse(JsonNode response) {
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
    AiDecideResponse that = (AiDecideResponse) o;
    return Objects.equals(metadata, that.metadata) && Objects.equals(response, that.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, response);
  }

  @Override
  public String toString() {
    return new ToStringer(AiDecideResponse.class)
        .add("metadata", metadata)
        .add("response", response)
        .toString();
  }
}
