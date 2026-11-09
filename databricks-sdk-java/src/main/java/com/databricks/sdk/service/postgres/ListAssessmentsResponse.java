// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response to list assessments. */
@Generated
public class ListAssessmentsResponse {
  /** Assessment runs ordered from newest to oldest. */
  @JsonProperty("assessments")
  private Collection<Assessment> assessments;

  /** A token for retrieving the next page. Empty when there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListAssessmentsResponse setAssessments(Collection<Assessment> assessments) {
    this.assessments = assessments;
    return this;
  }

  public Collection<Assessment> getAssessments() {
    return assessments;
  }

  public ListAssessmentsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAssessmentsResponse that = (ListAssessmentsResponse) o;
    return Objects.equals(assessments, that.assessments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAssessmentsResponse.class)
        .add("assessments", assessments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
