// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GetExchangeResponsePb {
  @JsonProperty("exchange")
  private Exchange exchange;

  public GetExchangeResponsePb setExchange(Exchange exchange) {
    this.exchange = exchange;
    return this;
  }

  public Exchange getExchange() {
    return exchange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetExchangeResponsePb that = (GetExchangeResponsePb) o;
    return Objects.equals(exchange, that.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExchangeResponsePb.class).add("exchange", exchange).toString();
  }
}
