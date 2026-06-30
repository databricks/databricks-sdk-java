// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DateRangeValue {
  /** Manually specified date-time range value. */
  @JsonProperty("date_range_value")
  private DateRange dateRangeValue;

  /** Dynamic date-time range value based on current date-time. */
  @JsonProperty("dynamic_date_range_value")
  private DateRangeValueDynamicDateRange dynamicDateRangeValue;

  /**
   * Date-time precision to format the value into when the query is run. Defaults to DAY_PRECISION
   * (YYYY-MM-DD).
   */
  @JsonProperty("precision")
  private DatePrecision precision;

  /** */
  @JsonProperty("start_day_of_week")
  private Long startDayOfWeek;

  public DateRangeValue setDateRangeValue(DateRange dateRangeValue) {
    this.dateRangeValue = dateRangeValue;
    return this;
  }

  public DateRange getDateRangeValue() {
    return dateRangeValue;
  }

  public DateRangeValue setDynamicDateRangeValue(
      DateRangeValueDynamicDateRange dynamicDateRangeValue) {
    this.dynamicDateRangeValue = dynamicDateRangeValue;
    return this;
  }

  public DateRangeValueDynamicDateRange getDynamicDateRangeValue() {
    return dynamicDateRangeValue;
  }

  public DateRangeValue setPrecision(DatePrecision precision) {
    this.precision = precision;
    return this;
  }

  public DatePrecision getPrecision() {
    return precision;
  }

  public DateRangeValue setStartDayOfWeek(Long startDayOfWeek) {
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
    DateRangeValue that = (DateRangeValue) o;
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
    return new ToStringer(DateRangeValue.class)
        .add("dateRangeValue", dateRangeValue)
        .add("dynamicDateRangeValue", dynamicDateRangeValue)
        .add("precision", precision)
        .add("startDayOfWeek", startDayOfWeek)
        .toString();
  }
}
