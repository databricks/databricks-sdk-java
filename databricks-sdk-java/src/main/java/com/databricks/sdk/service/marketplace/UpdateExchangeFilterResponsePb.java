// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateExchangeFilterResponsePb {
  @JsonProperty("filter")
  private ExchangeFilter filter;

  public UpdateExchangeFilterResponsePb setFilter(ExchangeFilter filter) {
    this.filter = filter;
    return this;
  }

  public ExchangeFilter getFilter() {
    return filter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateExchangeFilterResponsePb that = (UpdateExchangeFilterResponsePb) o;
    return Objects.equals(filter, that.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExchangeFilterResponsePb.class).add("filter", filter).toString();
  }
}
