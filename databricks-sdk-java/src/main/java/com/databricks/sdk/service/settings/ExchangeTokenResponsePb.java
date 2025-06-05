// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Exhanged tokens were successfully returned. */
@Generated
class ExchangeTokenResponsePb {
  @JsonProperty("values")
  private Collection<ExchangeToken> values;

  public ExchangeTokenResponsePb setValues(Collection<ExchangeToken> values) {
    this.values = values;
    return this;
  }

  public Collection<ExchangeToken> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeTokenResponsePb that = (ExchangeTokenResponsePb) o;
    return Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    return new ToStringer(ExchangeTokenResponsePb.class).add("values", values).toString();
  }
}
