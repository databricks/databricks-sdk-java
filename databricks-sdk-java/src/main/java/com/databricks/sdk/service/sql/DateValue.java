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
@JsonSerialize(using = DateValue.DateValueSerializer.class)
@JsonDeserialize(using = DateValue.DateValueDeserializer.class)
public class DateValue {
  /** Manually specified date-time value. */
  private String dateValue;

  /** Dynamic date-time value based on current date-time. */
  private DateValueDynamicDate dynamicDateValue;

  /**
   * Date-time precision to format the value into when the query is run. Defaults to DAY_PRECISION
   * (YYYY-MM-DD).
   */
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

  DateValuePb toPb() {
    DateValuePb pb = new DateValuePb();
    pb.setDateValue(dateValue);
    pb.setDynamicDateValue(dynamicDateValue);
    pb.setPrecision(precision);

    return pb;
  }

  static DateValue fromPb(DateValuePb pb) {
    DateValue model = new DateValue();
    model.setDateValue(pb.getDateValue());
    model.setDynamicDateValue(pb.getDynamicDateValue());
    model.setPrecision(pb.getPrecision());

    return model;
  }

  public static class DateValueSerializer extends JsonSerializer<DateValue> {
    @Override
    public void serialize(DateValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DateValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DateValueDeserializer extends JsonDeserializer<DateValue> {
    @Override
    public DateValue deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DateValuePb pb = mapper.readValue(p, DateValuePb.class);
      return DateValue.fromPb(pb);
    }
  }
}
