// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateExchangeRequest {
  /** */
  @JsonProperty("exchange")
  private Exchange exchange;

  /** */
  private String id;

  public UpdateExchangeRequest setExchange(Exchange exchange) {
    this.exchange = exchange;
    return this;
  }

  public Exchange getExchange() {
    return exchange;
  }

  public UpdateExchangeRequest setId(String id) {
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
    UpdateExchangeRequest that = (UpdateExchangeRequest) o;
    return Objects.equals(exchange, that.exchange) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange, id);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExchangeRequest.class)
        .add("exchange", exchange)
        .add("id", id)
        .toString();
  }
}
