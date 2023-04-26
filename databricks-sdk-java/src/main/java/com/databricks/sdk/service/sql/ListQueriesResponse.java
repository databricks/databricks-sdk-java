// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListQueriesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListQueriesResponse {
  /** Whether there is another page of results. */
  @JsonProperty("has_next_page")
  private Boolean hasNextPage;

  /** A token that can be used to get the next page of results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("res")
  private Collection<QueryInfo> res;

  /**
   * <p>Setter for the field <code>hasNextPage</code>.</p>
   *
   * @param hasNextPage a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.ListQueriesResponse} object
   */
  public ListQueriesResponse setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }

  /**
   * <p>Getter for the field <code>hasNextPage</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasNextPage() {
    return hasNextPage;
  }

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ListQueriesResponse} object
   */
  public ListQueriesResponse setNextPageToken(String nextPageToken) {
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
   * <p>Setter for the field <code>res</code>.</p>
   *
   * @param res a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.ListQueriesResponse} object
   */
  public ListQueriesResponse setRes(Collection<QueryInfo> res) {
    this.res = res;
    return this;
  }

  /**
   * <p>Getter for the field <code>res</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<QueryInfo> getRes() {
    return res;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQueriesResponse that = (ListQueriesResponse) o;
    return Objects.equals(hasNextPage, that.hasNextPage)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(res, that.res);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(hasNextPage, nextPageToken, res);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListQueriesResponse.class)
        .add("hasNextPage", hasNextPage)
        .add("nextPageToken", nextPageToken)
        .add("res", res)
        .toString();
  }
}
