// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class MultiValuesOptionsPb {
  @JsonProperty("prefix")
  private String prefix;

  @JsonProperty("separator")
  private String separator;

  @JsonProperty("suffix")
  private String suffix;

  public MultiValuesOptionsPb setPrefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  public String getPrefix() {
    return prefix;
  }

  public MultiValuesOptionsPb setSeparator(String separator) {
    this.separator = separator;
    return this;
  }

  public String getSeparator() {
    return separator;
  }

  public MultiValuesOptionsPb setSuffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  public String getSuffix() {
    return suffix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MultiValuesOptionsPb that = (MultiValuesOptionsPb) o;
    return Objects.equals(prefix, that.prefix)
        && Objects.equals(separator, that.separator)
        && Objects.equals(suffix, that.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, separator, suffix);
  }

  @Override
  public String toString() {
    return new ToStringer(MultiValuesOptionsPb.class)
        .add("prefix", prefix)
        .add("separator", separator)
        .add("suffix", suffix)
        .toString();
  }
}
