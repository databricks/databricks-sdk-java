// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListUpdatesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListUpdatesResponse {
  /**
   * If present, then there are more results, and this a token to be used in a subsequent request to
   * fetch the next page.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** If present, then this token can be used in a subsequent request to fetch the previous page. */
  @JsonProperty("prev_page_token")
  private String prevPageToken;

  /** */
  @JsonProperty("updates")
  private Collection<UpdateInfo> updates;

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListUpdatesResponse} object
   */
  public ListUpdatesResponse setNextPageToken(String nextPageToken) {
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
   * <p>Setter for the field <code>prevPageToken</code>.</p>
   *
   * @param prevPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListUpdatesResponse} object
   */
  public ListUpdatesResponse setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>prevPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrevPageToken() {
    return prevPageToken;
  }

  /**
   * <p>Setter for the field <code>updates</code>.</p>
   *
   * @param updates a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListUpdatesResponse} object
   */
  public ListUpdatesResponse setUpdates(Collection<UpdateInfo> updates) {
    this.updates = updates;
    return this;
  }

  /**
   * <p>Getter for the field <code>updates</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<UpdateInfo> getUpdates() {
    return updates;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListUpdatesResponse that = (ListUpdatesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken)
        && Objects.equals(updates, that.updates);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, prevPageToken, updates);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListUpdatesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .add("updates", updates)
        .toString();
  }
}
