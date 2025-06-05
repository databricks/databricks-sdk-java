// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateExchangeFilterResponsePb {
  @JsonProperty("filter_id")
  private String filterId;

  public CreateExchangeFilterResponsePb setFilterId(String filterId) {
    this.filterId = filterId;
    return this;
  }

  public String getFilterId() {
    return filterId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateExchangeFilterResponsePb that = (CreateExchangeFilterResponsePb) o;
    return Objects.equals(filterId, that.filterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExchangeFilterResponsePb.class)
        .add("filterId", filterId)
        .toString();
  }
}
