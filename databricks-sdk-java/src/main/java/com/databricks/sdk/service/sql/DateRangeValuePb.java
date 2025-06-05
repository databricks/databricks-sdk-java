// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DateRangeValuePb {
  @JsonProperty("date_range_value")
  private DateRange dateRangeValue;

  @JsonProperty("dynamic_date_range_value")
  private DateRangeValueDynamicDateRange dynamicDateRangeValue;

  @JsonProperty("precision")
  private DatePrecision precision;

  @JsonProperty("start_day_of_week")
  private Long startDayOfWeek;

  public DateRangeValuePb setDateRangeValue(DateRange dateRangeValue) {
    this.dateRangeValue = dateRangeValue;
    return this;
  }

  public DateRange getDateRangeValue() {
    return dateRangeValue;
  }

  public DateRangeValuePb setDynamicDateRangeValue(
      DateRangeValueDynamicDateRange dynamicDateRangeValue) {
    this.dynamicDateRangeValue = dynamicDateRangeValue;
    return this;
  }

  public DateRangeValueDynamicDateRange getDynamicDateRangeValue() {
    return dynamicDateRangeValue;
  }

  public DateRangeValuePb setPrecision(DatePrecision precision) {
    this.precision = precision;
    return this;
  }

  public DatePrecision getPrecision() {
    return precision;
  }

  public DateRangeValuePb setStartDayOfWeek(Long startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
    return this;
  }

  public Long getStartDayOfWeek() {
    return startDayOfWeek;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DateRangeValuePb that = (DateRangeValuePb) o;
    return Objects.equals(dateRangeValue, that.dateRangeValue)
        && Objects.equals(dynamicDateRangeValue, that.dynamicDateRangeValue)
        && Objects.equals(precision, that.precision)
        && Objects.equals(startDayOfWeek, that.startDayOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateRangeValue, dynamicDateRangeValue, precision, startDayOfWeek);
  }

  @Override
  public String toString() {
    return new ToStringer(DateRangeValuePb.class)
        .add("dateRangeValue", dateRangeValue)
        .add("dynamicDateRangeValue", dynamicDateRangeValue)
        .add("precision", precision)
        .add("startDayOfWeek", startDayOfWeek)
        .toString();
  }
}
