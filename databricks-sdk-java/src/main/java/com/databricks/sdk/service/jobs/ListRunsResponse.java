// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListRunsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListRunsResponse {
  /** If true, additional runs matching the provided filter are available for listing. */
  @JsonProperty("has_more")
  private Boolean hasMore;

  /** A list of runs, from most recently started to least. */
  @JsonProperty("runs")
  private Collection<BaseRun> runs;

  /**
   * <p>Setter for the field <code>hasMore</code>.</p>
   *
   * @param hasMore a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsResponse} object
   */
  public ListRunsResponse setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * <p>Getter for the field <code>hasMore</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasMore() {
    return hasMore;
  }

  /**
   * <p>Setter for the field <code>runs</code>.</p>
   *
   * @param runs a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsResponse} object
   */
  public ListRunsResponse setRuns(Collection<BaseRun> runs) {
    this.runs = runs;
    return this;
  }

  /**
   * <p>Getter for the field <code>runs</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<BaseRun> getRuns() {
    return runs;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRunsResponse that = (ListRunsResponse) o;
    return Objects.equals(hasMore, that.hasMore) && Objects.equals(runs, that.runs);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(hasMore, runs);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListRunsResponse.class)
        .add("hasMore", hasMore)
        .add("runs", runs)
        .toString();
  }
}
