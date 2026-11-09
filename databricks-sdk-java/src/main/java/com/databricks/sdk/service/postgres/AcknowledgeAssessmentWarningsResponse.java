// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Response produced after assessment warnings are acknowledged. */
@Generated
public class AcknowledgeAssessmentWarningsResponse {
  /** The assessment after its warnings are acknowledged. */
  @JsonProperty("assessment")
  private Assessment assessment;

  public AcknowledgeAssessmentWarningsResponse setAssessment(Assessment assessment) {
    this.assessment = assessment;
    return this;
  }

  public Assessment getAssessment() {
    return assessment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AcknowledgeAssessmentWarningsResponse that = (AcknowledgeAssessmentWarningsResponse) o;
    return Objects.equals(assessment, that.assessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessment);
  }

  @Override
  public String toString() {
    return new ToStringer(AcknowledgeAssessmentWarningsResponse.class)
        .add("assessment", assessment)
        .toString();
  }
}
