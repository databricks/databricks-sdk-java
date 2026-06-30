// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EnumValue {
  /** List of valid query parameter values, newline delimited. */
  @JsonProperty("enum_options")
  private String enumOptions;

  /** If specified, allows multiple values to be selected for this parameter. */
  @JsonProperty("multi_values_options")
  private MultiValuesOptions multiValuesOptions;

  /** List of selected query parameter values. */
  @JsonProperty("values")
  private Collection<String> values;

  public EnumValue setEnumOptions(String enumOptions) {
    this.enumOptions = enumOptions;
    return this;
  }

  public String getEnumOptions() {
    return enumOptions;
  }

  public EnumValue setMultiValuesOptions(MultiValuesOptions multiValuesOptions) {
    this.multiValuesOptions = multiValuesOptions;
    return this;
  }

  public MultiValuesOptions getMultiValuesOptions() {
    return multiValuesOptions;
  }

  public EnumValue setValues(Collection<String> values) {
    this.values = values;
    return this;
  }

  public Collection<String> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnumValue that = (EnumValue) o;
    return Objects.equals(enumOptions, that.enumOptions)
        && Objects.equals(multiValuesOptions, that.multiValuesOptions)
        && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumOptions, multiValuesOptions, values);
  }

  @Override
  public String toString() {
    return new ToStringer(EnumValue.class)
        .add("enumOptions", enumOptions)
        .add("multiValuesOptions", multiValuesOptions)
        .add("values", values)
        .toString();
  }
}
