// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListJobsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListJobsResponse {
  /** */
  @JsonProperty("has_more")
  private Boolean hasMore;

  /** The list of jobs. */
  @JsonProperty("jobs")
  private Collection<BaseJob> jobs;

  /**
   * <p>Setter for the field <code>hasMore</code>.</p>
   *
   * @param hasMore a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.ListJobsResponse} object
   */
  public ListJobsResponse setHasMore(Boolean hasMore) {
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
   * <p>Setter for the field <code>jobs</code>.</p>
   *
   * @param jobs a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.ListJobsResponse} object
   */
  public ListJobsResponse setJobs(Collection<BaseJob> jobs) {
    this.jobs = jobs;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobs</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<BaseJob> getJobs() {
    return jobs;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListJobsResponse that = (ListJobsResponse) o;
    return Objects.equals(hasMore, that.hasMore) && Objects.equals(jobs, that.jobs);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(hasMore, jobs);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListJobsResponse.class)
        .add("hasMore", hasMore)
        .add("jobs", jobs)
        .toString();
  }
}
