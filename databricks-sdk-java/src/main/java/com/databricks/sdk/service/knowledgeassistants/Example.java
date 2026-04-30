// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/**
 * An example associated with a Knowledge Assistant. Contains a question and guidelines for how the
 * assistant should respond.
 */
@Generated
public class Example {
  /** Timestamp when this example was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The universally unique identifier (UUID) of the example. */
  @JsonProperty("example_id")
  private String exampleId;

  /** Guidelines for answering the question. */
  @JsonProperty("guidelines")
  private Collection<String> guidelines;

  /** Full resource name: knowledge-assistants/{knowledge_assistant_id}/examples/{example_id} */
  @JsonProperty("name")
  private String name;

  /** The example question. */
  @JsonProperty("question")
  private String question;

  /** Timestamp when this example was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Example setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

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

  public Example setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Example that = (Example) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(exampleId, that.exampleId)
        && Objects.equals(guidelines, that.guidelines)
        && Objects.equals(name, that.name)
        && Objects.equals(question, that.question)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, exampleId, guidelines, name, question, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Example.class)
        .add("createTime", createTime)
        .add("exampleId", exampleId)
        .add("guidelines", guidelines)
        .add("name", name)
        .add("question", question)
        .add("updateTime", updateTime)
        .toString();
  }
}
