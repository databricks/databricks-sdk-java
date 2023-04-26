// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListExperimentsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListExperimentsResponse {
  /** Paginated Experiments beginning with the first item on the requested page. */
  @JsonProperty("experiments")
  private Collection<Experiment> experiments;

  /**
   * Token that can be used to retrieve the next page of experiments. Empty token means no more
   * experiment is available for retrieval.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /**
   * <p>Setter for the field <code>experiments</code>.</p>
   *
   * @param experiments a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.ListExperimentsResponse} object
   */
  public ListExperimentsResponse setExperiments(Collection<Experiment> experiments) {
    this.experiments = experiments;
    return this;
  }

  /**
   * <p>Getter for the field <code>experiments</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Experiment> getExperiments() {
    return experiments;
  }

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListExperimentsResponse} object
   */
  public ListExperimentsResponse setNextPageToken(String nextPageToken) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExperimentsResponse that = (ListExperimentsResponse) o;
    return Objects.equals(experiments, that.experiments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(experiments, nextPageToken);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListExperimentsResponse.class)
        .add("experiments", experiments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
