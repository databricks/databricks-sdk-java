// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PendingStatusPb {
  @JsonProperty("data_token")
  private String dataToken;

  public PendingStatusPb setDataToken(String dataToken) {
    this.dataToken = dataToken;
    return this;
  }

  public String getDataToken() {
    return dataToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PendingStatusPb that = (PendingStatusPb) o;
    return Objects.equals(dataToken, that.dataToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataToken);
  }

  @Override
  public String toString() {
    return new ToStringer(PendingStatusPb.class).add("dataToken", dataToken).toString();
  }
}
