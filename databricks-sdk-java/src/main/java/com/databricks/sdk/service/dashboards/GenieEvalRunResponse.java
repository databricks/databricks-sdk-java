// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieEvalRunResponse {
  /** Timestamp when the evaluation run was created (milliseconds since epoch). */
  @JsonProperty("created_timestamp")
  private Long createdTimestamp;

  /** The unique identifier for the evaluation run. */
  @JsonProperty("eval_run_id")
  private String evalRunId;

  /** Current status of the evaluation run. */
  @JsonProperty("eval_run_status")
  private EvaluationStatusType evalRunStatus;

  /** Timestamp when the evaluation run was last updated (milliseconds since epoch). */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** Number of questions answered correctly. */
  @JsonProperty("num_correct")
  private Long numCorrect;

  /** Number of questions that have been completed. */
  @JsonProperty("num_done")
  private Long numDone;

  /** Number of questions that need manual review. */
  @JsonProperty("num_needs_review")
  private Long numNeedsReview;

  /** Total number of questions in the evaluation run. */
  @JsonProperty("num_questions")
  private Long numQuestions;

  /** User ID who initiated the evaluation run. */
  @JsonProperty("run_by_user")
  private Long runByUser;

  public GenieEvalRunResponse setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public GenieEvalRunResponse setEvalRunId(String evalRunId) {
    this.evalRunId = evalRunId;
    return this;
  }

  public String getEvalRunId() {
    return evalRunId;
  }

  public GenieEvalRunResponse setEvalRunStatus(EvaluationStatusType evalRunStatus) {
    this.evalRunStatus = evalRunStatus;
    return this;
  }

  public EvaluationStatusType getEvalRunStatus() {
    return evalRunStatus;
  }

  public GenieEvalRunResponse setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public GenieEvalRunResponse setNumCorrect(Long numCorrect) {
    this.numCorrect = numCorrect;
    return this;
  }

  public Long getNumCorrect() {
    return numCorrect;
  }

  public GenieEvalRunResponse setNumDone(Long numDone) {
    this.numDone = numDone;
    return this;
  }

  public Long getNumDone() {
    return numDone;
  }

  public GenieEvalRunResponse setNumNeedsReview(Long numNeedsReview) {
    this.numNeedsReview = numNeedsReview;
    return this;
  }

  public Long getNumNeedsReview() {
    return numNeedsReview;
  }

  public GenieEvalRunResponse setNumQuestions(Long numQuestions) {
    this.numQuestions = numQuestions;
    return this;
  }

  public Long getNumQuestions() {
    return numQuestions;
  }

  public GenieEvalRunResponse setRunByUser(Long runByUser) {
    this.runByUser = runByUser;
    return this;
  }

  public Long getRunByUser() {
    return runByUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieEvalRunResponse that = (GenieEvalRunResponse) o;
    return Objects.equals(createdTimestamp, that.createdTimestamp)
        && Objects.equals(evalRunId, that.evalRunId)
        && Objects.equals(evalRunStatus, that.evalRunStatus)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(numCorrect, that.numCorrect)
        && Objects.equals(numDone, that.numDone)
        && Objects.equals(numNeedsReview, that.numNeedsReview)
        && Objects.equals(numQuestions, that.numQuestions)
        && Objects.equals(runByUser, that.runByUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdTimestamp,
        evalRunId,
        evalRunStatus,
        lastUpdatedTimestamp,
        numCorrect,
        numDone,
        numNeedsReview,
        numQuestions,
        runByUser);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieEvalRunResponse.class)
        .add("createdTimestamp", createdTimestamp)
        .add("evalRunId", evalRunId)
        .add("evalRunStatus", evalRunStatus)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("numCorrect", numCorrect)
        .add("numDone", numDone)
        .add("numNeedsReview", numNeedsReview)
        .add("numQuestions", numQuestions)
        .add("runByUser", runByUser)
        .toString();
  }
}
