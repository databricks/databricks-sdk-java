// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListPipelinesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListPipelinesResponse {
  /** If present, a token to fetch the next page of events. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The list of events matching the request criteria. */
  @JsonProperty("statuses")
  private Collection<PipelineStateInfo> statuses;

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelinesResponse} object
   */
  public ListPipelinesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * <p>Setter for the field <code>statuses</code>.</p>
   *
   * @param statuses a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListPipelinesResponse} object
   */
  public ListPipelinesResponse setStatuses(Collection<PipelineStateInfo> statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * <p>Getter for the field <code>statuses</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PipelineStateInfo> getStatuses() {
    return statuses;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPipelinesResponse that = (ListPipelinesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(statuses, that.statuses);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, statuses);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListPipelinesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("statuses", statuses)
        .toString();
  }
}
