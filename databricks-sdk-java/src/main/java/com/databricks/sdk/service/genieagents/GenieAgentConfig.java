// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * General settings of a Genie Agent. The warehouse, display name, and description are separate
 * fields of the Genie Agent.
 */
@Generated
public class GenieAgentConfig {
  /** Sample questions shown to users of the Genie Agent, sorted by `id`. */
  @JsonProperty("sample_questions")
  private Collection<GenieAgentSampleQuestion> sampleQuestions;

  public GenieAgentConfig setSampleQuestions(Collection<GenieAgentSampleQuestion> sampleQuestions) {
    this.sampleQuestions = sampleQuestions;
    return this;
  }

  public Collection<GenieAgentSampleQuestion> getSampleQuestions() {
    return sampleQuestions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentConfig that = (GenieAgentConfig) o;
    return Objects.equals(sampleQuestions, that.sampleQuestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sampleQuestions);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentConfig.class)
        .add("sampleQuestions", sampleQuestions)
        .toString();
  }
}
