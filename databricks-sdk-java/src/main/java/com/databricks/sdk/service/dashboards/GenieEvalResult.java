// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Shows summary information for an evaluation result. For detailed information including SQL
 * execution results, actual/expected responses, and assessment scores, use
 * GenieGetEvalResultDetails.
 */
@Generated
public class GenieEvalResult {
  /** Stored snapshot of original benchmark answer text. */
  @JsonProperty("benchmark_answer")
  private String benchmarkAnswer;

  /** The ID of the benchmark question that was evaluated. */
  @JsonProperty("benchmark_question_id")
  private String benchmarkQuestionId;

  /** User ID who created evaluation result. */
  @JsonProperty("created_by_user")
  private Long createdByUser;

  /** Stored snapshot of original benchmark question text. */
  @JsonProperty("question")
  private String question;

  /** Unique identifier for this evaluation result. */
  @JsonProperty("result_id")
  private String resultId;

  /** The ID of the space the evaluation result belongs to. */
  @JsonProperty("space_id")
  private String spaceId;

  /** Current status of this evaluation result. */
  @JsonProperty("status")
  private EvaluationStatusType status;

  public GenieEvalResult setBenchmarkAnswer(String benchmarkAnswer) {
    this.benchmarkAnswer = benchmarkAnswer;
    return this;
  }

  public String getBenchmarkAnswer() {
    return benchmarkAnswer;
  }

  public GenieEvalResult setBenchmarkQuestionId(String benchmarkQuestionId) {
    this.benchmarkQuestionId = benchmarkQuestionId;
    return this;
  }

  public String getBenchmarkQuestionId() {
    return benchmarkQuestionId;
  }

  public GenieEvalResult setCreatedByUser(Long createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

  public Long getCreatedByUser() {
    return createdByUser;
  }

  public GenieEvalResult setQuestion(String question) {
    this.question = question;
    return this;
  }

  public String getQuestion() {
    return question;
  }

  public GenieEvalResult setResultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  public String getResultId() {
    return resultId;
  }

  public GenieEvalResult setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public GenieEvalResult setStatus(EvaluationStatusType status) {
    this.status = status;
    return this;
  }

  public EvaluationStatusType getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieEvalResult that = (GenieEvalResult) o;
    return Objects.equals(benchmarkAnswer, that.benchmarkAnswer)
        && Objects.equals(benchmarkQuestionId, that.benchmarkQuestionId)
        && Objects.equals(createdByUser, that.createdByUser)
        && Objects.equals(question, that.question)
        && Objects.equals(resultId, that.resultId)
        && Objects.equals(spaceId, that.spaceId)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        benchmarkAnswer, benchmarkQuestionId, createdByUser, question, resultId, spaceId, status);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieEvalResult.class)
        .add("benchmarkAnswer", benchmarkAnswer)
        .add("benchmarkQuestionId", benchmarkQuestionId)
        .add("createdByUser", createdByUser)
        .add("question", question)
        .add("resultId", resultId)
        .add("spaceId", spaceId)
        .add("status", status)
        .toString();
  }
}
