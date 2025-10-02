// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Status of conversion of FOREIGN entity into UC Native entity. */
@Generated
public class ConversionInfo {
  /** The conversion state of the resource. */
  @JsonProperty("state")
  private ConversionInfoState state;

  public ConversionInfo setState(ConversionInfoState state) {
    this.state = state;
    return this;
  }

  public ConversionInfoState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConversionInfo that = (ConversionInfo) o;
    return Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state);
  }

  @Override
  public String toString() {
    return new ToStringer(ConversionInfo.class).add("state", state).toString();
  }
}
