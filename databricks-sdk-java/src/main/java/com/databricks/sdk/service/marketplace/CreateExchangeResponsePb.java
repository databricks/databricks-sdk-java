// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateExchangeResponsePb {
  @JsonProperty("exchange_id")
  private String exchangeId;

  public CreateExchangeResponsePb setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  public String getExchangeId() {
    return exchangeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateExchangeResponsePb that = (CreateExchangeResponsePb) o;
    return Objects.equals(exchangeId, that.exchangeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExchangeResponsePb.class).add("exchangeId", exchangeId).toString();
  }
}
