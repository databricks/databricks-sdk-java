// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A sample question shown to users of the Genie Agent. */
@Generated
public class GenieAgentSampleQuestion {
  /**
   * Identifier of the sample question: 32 lowercase hexadecimal characters, unique within the Genie
   * Agent.
   */
  @JsonProperty("id")
  private String id;

  /** The text of the question. */
  @JsonProperty("question")
  private String question;

  public GenieAgentSampleQuestion setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieAgentSampleQuestion setQuestion(String question) {
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
    GenieAgentSampleQuestion that = (GenieAgentSampleQuestion) o;
    return Objects.equals(id, that.id) && Objects.equals(question, that.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, question);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentSampleQuestion.class)
        .add("id", id)
        .add("question", question)
        .toString();
  }
}
