// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Objects;

@Generated
public class AiDecideRequest {
  /** Function options. Omitted fields fall back to their documented defaults. */
  @JsonProperty("options")
  private AiDecideOptions options;

  /**
   * A JSON object mapping up to 256 question IDs to their definitions. Each ID must be nonblank;
   * its answer is returned with the same ID in `response.answers`.
   *
   * <p>Each definition is an object with the required fields `type` and `instructions`. The
   * `criteria` field is optional for the type `noul` but is required for the types `choice` and
   * `score`.
   *
   * <p>In AI Decide v2, `instructions` and each criteria description must be nonblank strings. Each
   * question may contain at most 20,000 characters across its ID, instructions, and criteria.
   *
   * <p>The `type` can be one of:
   *
   * <p>- `choice`: Selects one option from a defined set. Requires `criteria` to be an object
   * mapping 1 to 255 nonblank option names to nonblank string descriptions. For example:
   *
   * <p>```json { "team": { "type": "choice", "instructions": "Which team should handle this
   * ticket?", "criteria": { "billing": "Payments, charges, and refunds", "technical_support":
   * "Product errors and troubleshooting" } } } ```
   *
   * <p>- `noul`: Estimates the probability that the answer to a true-or-false question is true.
   * `criteria` can take the fields `true` or `false`, or both, with nonblank string descriptions.
   * Omit `criteria` to use the question alone. For example, both of the following are valid:
   *
   * <p>```json { "escalate": { "type": "noul", "instructions": "Does this ticket need escalation?",
   * "criteria": { "true": "Suspected fraud or an exception to standard policy", "false": "A routine
   * issue frontline support can resolve" } } } ```
   *
   * <p>or
   *
   * <p>```json { "escalate": { "type": "noul", "instructions": "Does this ticket need escalation?"
   * } } ```
   *
   * <p>- `score`: Rates the state on an ordered scale. Requires `criteria` to be an array of 2 to
   * 10 unique, nonblank string descriptions, ordered from low to high. Array positions define
   * levels starting at 0. For example:
   *
   * <p>```json { "urgency": { "type": "score", "instructions": "How urgent is this ticket?",
   * "criteria": [ "Routine: can wait a few days", "Time-sensitive: needs attention today",
   * "Critical: needs immediate action" ] } } ```
   */
  @JsonProperty("questions")
  private JsonNode questions;

  /**
   * A nonempty array of typed content objects shared by all questions. Set `options.version` to
   * `"2.0"` to use this format. Text and JSON content plus questions must fit within 32 KiB as
   * compact UTF-8 JSON, excluding image parts.
   *
   * <p>| type | Content field | Value | | --- | --- | --- | | `text` | `text` | A nonblank string.
   * | | `json` | `data` | A JSON object or array. | | `image` | `image_url` | An inline base64 PNG
   * or JPEG data URL: `data:image/png;base64,<base64-encoded image bytes>` or
   * `data:image/jpeg;base64,<base64-encoded image bytes>`. HTTP URLs and file paths are not
   * supported. Each image must be at most 4 MiB after base64 decoding, with a resolution up to
   * 1,568 × 1,568 pixels (or an equivalent pixel count). A request supports up to five images.
   * Images are only supported in [select regions]. |
   *
   * <p>[select regions]:
   * https://docs.databricks.com/aws/en/resources/feature-region-support#ai-function-availability
   */
  @JsonProperty("state")
  private JsonNode state;

  public AiDecideRequest setOptions(AiDecideOptions options) {
    this.options = options;
    return this;
  }

  public AiDecideOptions getOptions() {
    return options;
  }

  public AiDecideRequest setQuestions(JsonNode questions) {
    this.questions = questions;
    return this;
  }

  public JsonNode getQuestions() {
    return questions;
  }

  public AiDecideRequest setState(JsonNode state) {
    this.state = state;
    return this;
  }

  public JsonNode getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiDecideRequest that = (AiDecideRequest) o;
    return Objects.equals(options, that.options)
        && Objects.equals(questions, that.questions)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, questions, state);
  }

  @Override
  public String toString() {
    return new ToStringer(AiDecideRequest.class)
        .add("options", options)
        .add("questions", questions)
        .add("state", state)
        .toString();
  }
}
