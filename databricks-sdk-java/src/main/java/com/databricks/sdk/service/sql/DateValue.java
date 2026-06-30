// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DateValue {
  /** Manually specified date-time value. */
  @JsonProperty("date_value")
  private String dateValue;

  /** Dynamic date-time value based on current date-time. */
  @JsonProperty("dynamic_date_value")
  private DateValueDynamicDate dynamicDateValue;

  /**
   * Date-time precision to format the value into when the query is run. Defaults to DAY_PRECISION
   * (YYYY-MM-DD).
   */
  @JsonProperty("precision")
  private DatePrecision precision;

  public DateValue setDateValue(String dateValue) {
    this.dateValue = dateValue;
    return this;
  }

  public String getDateValue() {
    return dateValue;
  }

  public DateValue setDynamicDateValue(DateValueDynamicDate dynamicDateValue) {
    this.dynamicDateValue = dynamicDateValue;
    return this;
  }

  public DateValueDynamicDate getDynamicDateValue() {
    return dynamicDateValue;
  }

  public DateValue setPrecision(DatePrecision precision) {
    this.precision = precision;
    return this;
  }

  public DatePrecision getPrecision() {
    return precision;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DateValue that = (DateValue) o;
    return Objects.equals(dateValue, that.dateValue)
        && Objects.equals(dynamicDateValue, that.dynamicDateValue)
        && Objects.equals(precision, that.precision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateValue, dynamicDateValue, precision);
  }

  @Override
  public String toString() {
    return new ToStringer(DateValue.class)
        .add("dateValue", dateValue)
        .add("dynamicDateValue", dynamicDateValue)
        .add("precision", precision)
        .toString();
  }
}
