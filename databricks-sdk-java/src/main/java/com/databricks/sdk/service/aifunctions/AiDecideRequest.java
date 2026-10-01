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
   * A JSON object mapping question IDs to their definitions. Choose a nonempty string for each ID;
   * its answer is returned with the same ID in `response.answers`.
   *
   * <p>Each definition is an object with the required fields `type` and `instructions`. The
   * `criteria` field is optional for the type `noul` but is required for the types `choice` and
   * `score`.
   *
   * <p>The `instructions` field describes the judgment to make and can be a string, object, or
   * array. Use an object or array to include supporting context alongside the instructions.
   *
   * <p>The `type` can be one of:
   *
   * <p>- `choice`: Selects one option from a defined set. Requires `criteria` to be an object
   * mapping 1 to 255 nonempty option names to descriptions. The criteria description can be a
   * string, object, array, or null when the name needs no additional detail. For example:
   *
   * <p>```json { "team": { "type": "choice", "instructions": "Which team should handle this
   * ticket?", "criteria": { "billing": "Payments, charges, and refunds", "technical_support": null
   * } } } ```
   *
   * <p>- `noul`: Estimates the probability that the answer to a true-or-false question is true.
   * `criteria` can take the fields `true` or `false`, or both, with descriptions that are strings,
   * objects, or arrays. Omit `criteria` to use the question alone. For example, both of the
   * following are valid:
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
   * 10 level descriptions, ordered from low to high. Descriptions can be strings, objects, or
   * arrays. Array positions define levels starting at 0. For example:
   *
   * <p>```json { "urgency": { "type": "score", "instructions": "How urgent is this ticket?",
   * "criteria": [ "Routine: can wait a few days", "Time-sensitive: needs attention today",
   * "Critical: needs immediate action" ] } } ```
   */
  @JsonProperty("questions")
  private JsonNode questions;

  /**
   * A string, JSON object, or array containing the content, related context, and examples needed to
   * answer the provided questions. For example, provide a support message, a conversation, or
   * records describing the current state of an application. All questions receive this same state.
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
