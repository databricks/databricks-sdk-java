// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * An example associated with a Supervisor Agent. Contains a question and guidelines for how the
 * agent should respond.
 */
@Generated
public class Example {
  /** The universally unique identifier (UUID) of the example. */
  @JsonProperty("example_id")
  private String exampleId;

  /** Guidelines for answering the question. */
  @JsonProperty("guidelines")
  private Collection<String> guidelines;

  /** Full resource name: supervisor-agents/{supervisor_agent_id}/examples/{example_id} */
  @JsonProperty("name")
  private String name;

  /** The example question. */
  @JsonProperty("question")
  private String question;

  public Example setExampleId(String exampleId) {
    this.exampleId = exampleId;
    return this;
  }

  public String getExampleId() {
    return exampleId;
  }

  public Example setGuidelines(Collection<String> guidelines) {
    this.guidelines = guidelines;
    return this;
  }

  public Collection<String> getGuidelines() {
    return guidelines;
  }

  public Example setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Example setQuestion(String question) {
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
    Example that = (Example) o;
    return Objects.equals(exampleId, that.exampleId)
        && Objects.equals(guidelines, that.guidelines)
        && Objects.equals(name, that.name)
        && Objects.equals(question, that.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exampleId, guidelines, name, question);
  }

  @Override
  public String toString() {
    return new ToStringer(Example.class)
        .add("exampleId", exampleId)
        .add("guidelines", guidelines)
        .add("name", name)
        .add("question", question)
        .toString();
  }
}
