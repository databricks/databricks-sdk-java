// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SuccessStatusPb {
  @JsonProperty("data_token")
  private String dataToken;

  @JsonProperty("truncated")
  private Boolean truncated;

  public SuccessStatusPb setDataToken(String dataToken) {
    this.dataToken = dataToken;
    return this;
  }

  public String getDataToken() {
    return dataToken;
  }

  public SuccessStatusPb setTruncated(Boolean truncated) {
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
    SuccessStatusPb that = (SuccessStatusPb) o;
    return Objects.equals(dataToken, that.dataToken) && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataToken, truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(SuccessStatusPb.class)
        .add("dataToken", dataToken)
        .add("truncated", truncated)
        .toString();
  }
}
