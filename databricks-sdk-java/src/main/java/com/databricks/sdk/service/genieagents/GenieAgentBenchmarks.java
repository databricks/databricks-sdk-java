// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Benchmarks for evaluating a Genie Agent. */
@Generated
public class GenieAgentBenchmarks {
  /** The benchmark questions, sorted by `id` in descending order. */
  @JsonProperty("questions")
  private Collection<GenieAgentBenchmarkQuestion> questions;

  public GenieAgentBenchmarks setQuestions(Collection<GenieAgentBenchmarkQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public Collection<GenieAgentBenchmarkQuestion> getQuestions() {
    return questions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentBenchmarks that = (GenieAgentBenchmarks) o;
    return Objects.equals(questions, that.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentBenchmarks.class).add("questions", questions).toString();
  }
}
