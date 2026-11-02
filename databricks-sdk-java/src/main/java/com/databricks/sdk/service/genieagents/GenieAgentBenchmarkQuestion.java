// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A benchmark question with its expected answer. */
@Generated
public class GenieAgentBenchmarkQuestion {
  /**
   * The expected answer. At most one answer is supported; omit it when the question has no expected
   * answer.
   */
  @JsonProperty("answer")
  private Collection<GenieAgentBenchmarkAnswer> answer;

  /** Notes on how to evaluate answers to the question. */
  @JsonProperty("evaluation_note")
  private String evaluationNote;

  /**
   * Identifier of the question: 32 lowercase hexadecimal characters, unique within the Genie Agent.
   */
  @JsonProperty("id")
  private String id;

  /** The question. */
  @JsonProperty("question")
  private String question;

  public GenieAgentBenchmarkQuestion setAnswer(Collection<GenieAgentBenchmarkAnswer> answer) {
    this.answer = answer;
    return this;
  }

  public Collection<GenieAgentBenchmarkAnswer> getAnswer() {
    return answer;
  }

  public GenieAgentBenchmarkQuestion setEvaluationNote(String evaluationNote) {
    this.evaluationNote = evaluationNote;
    return this;
  }

  public String getEvaluationNote() {
    return evaluationNote;
  }

  public GenieAgentBenchmarkQuestion setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieAgentBenchmarkQuestion setQuestion(String question) {
    this.question = question;
    return this;
  }

  public String getQuestion() {
    return question;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentBenchmarkQuestion that = (GenieAgentBenchmarkQuestion) o;
    return Objects.equals(answer, that.answer)
        && Objects.equals(evaluationNote, that.evaluationNote)
        && Objects.equals(id, that.id)
        && Objects.equals(question, that.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, evaluationNote, id, question);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentBenchmarkQuestion.class)
        .add("answer", answer)
        .add("evaluationNote", evaluationNote)
        .add("id", id)
        .add("question", question)
        .toString();
  }
}
