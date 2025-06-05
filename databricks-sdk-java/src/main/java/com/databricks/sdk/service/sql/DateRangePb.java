// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DateRangePb {
  @JsonProperty("end")
  private String end;

  @JsonProperty("start")
  private String start;

  public DateRangePb setEnd(String end) {
    this.end = end;
    return this;
  }

  public String getEnd() {
    return end;
  }

  public DateRangePb setStart(String start) {
    this.start = start;
    return this;
  }

  public String getStart() {
    return start;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DateRangePb that = (DateRangePb) o;
    return Objects.equals(end, that.end) && Objects.equals(start, that.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  @Override
  public String toString() {
    return new ToStringer(DateRangePb.class).add("end", end).add("start", start).toString();
  }
}
