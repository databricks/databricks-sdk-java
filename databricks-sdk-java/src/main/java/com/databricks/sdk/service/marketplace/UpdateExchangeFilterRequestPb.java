// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateExchangeFilterRequestPb {
  @JsonProperty("filter")
  private ExchangeFilter filter;

  @JsonIgnore private String id;

  public UpdateExchangeFilterRequestPb setFilter(ExchangeFilter filter) {
    this.filter = filter;
    return this;
  }

  public ExchangeFilter getFilter() {
    return filter;
  }

  public UpdateExchangeFilterRequestPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateExchangeFilterRequestPb that = (UpdateExchangeFilterRequestPb) o;
    return Objects.equals(filter, that.filter) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, id);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExchangeFilterRequestPb.class)
        .add("filter", filter)
        .add("id", id)
        .toString();
  }
}
