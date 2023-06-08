// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Object properties as map of string key-value pairs. */
@Generated
public class OptionsKvPairs {
  /** */
  @JsonProperty("host")
  private String host;

  public OptionsKvPairs setHost(String host) {
    this.host = host;
    return this;
  }

  public String getHost() {
    return host;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionsKvPairs that = (OptionsKvPairs) o;
    return Objects.equals(host, that.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host);
  }

  @Override
  public String toString() {
    return new ToStringer(OptionsKvPairs.class).add("host", host).toString();
  }
}
