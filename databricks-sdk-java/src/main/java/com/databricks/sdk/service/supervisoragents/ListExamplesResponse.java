// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A list of Supervisor Agent examples. */
@Generated
public class ListExamplesResponse {
  /** */
  @JsonProperty("examples")
  private Collection<Example> examples;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListExamplesResponse setExamples(Collection<Example> examples) {
    this.examples = examples;
    return this;
  }

  public Collection<Example> getExamples() {
    return examples;
  }

  public ListExamplesResponse setNextPageToken(String nextPageToken) {
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
    ListExamplesResponse that = (ListExamplesResponse) o;
    return Objects.equals(examples, that.examples)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(examples, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExamplesResponse.class)
        .add("examples", examples)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
