// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Follow-up questions suggested by Genie */
@Generated
public class GenieFollowupQuestionsAttachment {
  /** The suggested follow-up questions */
  @JsonProperty("questions")
  private Collection<String> questions;

  public GenieFollowupQuestionsAttachment setQuestions(Collection<String> questions) {
    this.questions = questions;
    return this;
  }

  public Collection<String> getQuestions() {
    return questions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieFollowupQuestionsAttachment that = (GenieFollowupQuestionsAttachment) o;
    return Objects.equals(questions, that.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieFollowupQuestionsAttachment.class)
        .add("questions", questions)
        .toString();
  }
}
