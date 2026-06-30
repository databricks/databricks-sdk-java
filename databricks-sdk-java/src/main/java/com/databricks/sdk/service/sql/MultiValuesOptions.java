// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class MultiValuesOptions {
  /** Character that prefixes each selected parameter value. */
  @JsonProperty("prefix")
  private String prefix;

  /** Character that separates each selected parameter value. Defaults to a comma. */
  @JsonProperty("separator")
  private String separator;

  /** Character that suffixes each selected parameter value. */
  @JsonProperty("suffix")
  private String suffix;

  public MultiValuesOptions setPrefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  public String getPrefix() {
    return prefix;
  }

  public MultiValuesOptions setSeparator(String separator) {
    this.separator = separator;
    return this;
  }

  public String getSeparator() {
    return separator;
  }

  public MultiValuesOptions setSuffix(String suffix) {
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
    MultiValuesOptions that = (MultiValuesOptions) o;
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
    return new ToStringer(MultiValuesOptions.class)
        .add("prefix", prefix)
        .add("separator", separator)
        .add("suffix", suffix)
        .toString();
  }
}
