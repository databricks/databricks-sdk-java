// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SuccessStatus {
  /**
   * The token to poll for result asynchronously Example:
   * EC0A..ChAB7WCEn_4Qo4vkLqEbXsxxEgh3Y2pbWw45WhoQXgZSQo9aS5q2ZvFcbvbx9CgA-PAEAQ
   */
  @JsonProperty("data_token")
  private String dataToken;

  /** Whether the query result is truncated (either by byte limit or row limit) */
  @JsonProperty("truncated")
  private Boolean truncated;

  public SuccessStatus setDataToken(String dataToken) {
    this.dataToken = dataToken;
    return this;
  }

  public String getDataToken() {
    return dataToken;
  }

  public SuccessStatus setTruncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  public Boolean getTruncated() {
    return truncated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SuccessStatus that = (SuccessStatus) o;
    return Objects.equals(dataToken, that.dataToken) && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataToken, truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(SuccessStatus.class)
        .add("dataToken", dataToken)
        .add("truncated", truncated)
        .toString();
  }
}
