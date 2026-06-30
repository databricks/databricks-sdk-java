// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ConsumerTerms {
  /** */
  @JsonProperty("version")
  private String version;

  public ConsumerTerms setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConsumerTerms that = (ConsumerTerms) o;
    return Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version);
  }

  @Override
  public String toString() {
    return new ToStringer(ConsumerTerms.class).add("version", version).toString();
  }
}
