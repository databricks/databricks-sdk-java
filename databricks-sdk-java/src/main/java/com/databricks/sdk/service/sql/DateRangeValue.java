// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = DateRangeValue.DateRangeValueSerializer.class)
@JsonDeserialize(using = DateRangeValue.DateRangeValueDeserializer.class)
public class DateRangeValue {
  /** Manually specified date-time range value. */
  private DateRange dateRangeValue;

  /** Dynamic date-time range value based on current date-time. */
  private DateRangeValueDynamicDateRange dynamicDateRangeValue;

  /**
   * Date-time precision to format the value into when the query is run. Defaults to DAY_PRECISION
   * (YYYY-MM-DD).
   */
  private DatePrecision precision;

  /** */
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

  DateRangeValuePb toPb() {
    DateRangeValuePb pb = new DateRangeValuePb();
    pb.setDateRangeValue(dateRangeValue);
    pb.setDynamicDateRangeValue(dynamicDateRangeValue);
    pb.setPrecision(precision);
    pb.setStartDayOfWeek(startDayOfWeek);

    return pb;
  }

  static DateRangeValue fromPb(DateRangeValuePb pb) {
    DateRangeValue model = new DateRangeValue();
    model.setDateRangeValue(pb.getDateRangeValue());
    model.setDynamicDateRangeValue(pb.getDynamicDateRangeValue());
    model.setPrecision(pb.getPrecision());
    model.setStartDayOfWeek(pb.getStartDayOfWeek());

    return model;
  }

  public static class DateRangeValueSerializer extends JsonSerializer<DateRangeValue> {
    @Override
    public void serialize(DateRangeValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DateRangeValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DateRangeValueDeserializer extends JsonDeserializer<DateRangeValue> {
    @Override
    public DateRangeValue deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DateRangeValuePb pb = mapper.readValue(p, DateRangeValuePb.class);
      return DateRangeValue.fromPb(pb);
    }
  }
}
