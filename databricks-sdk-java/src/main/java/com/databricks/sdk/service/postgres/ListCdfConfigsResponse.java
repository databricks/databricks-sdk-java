// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Response to a ListCdfConfigs request, containing a page of CdfConfigs and a token for fetching
 * the next page.
 */
@Generated
public class ListCdfConfigsResponse {
  /** The CdfConfigs under the parent database. */
  @JsonProperty("cdf_configs")
  private Collection<CdfConfig> cdfConfigs;

  /** Token to retrieve the next page of results; empty when there are no more. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListCdfConfigsResponse setCdfConfigs(Collection<CdfConfig> cdfConfigs) {
    this.cdfConfigs = cdfConfigs;
    return this;
  }

  public Collection<CdfConfig> getCdfConfigs() {
    return cdfConfigs;
  }

  public ListCdfConfigsResponse setNextPageToken(String nextPageToken) {
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
    ListCdfConfigsResponse that = (ListCdfConfigsResponse) o;
    return Objects.equals(cdfConfigs, that.cdfConfigs)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdfConfigs, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCdfConfigsResponse.class)
        .add("cdfConfigs", cdfConfigs)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
