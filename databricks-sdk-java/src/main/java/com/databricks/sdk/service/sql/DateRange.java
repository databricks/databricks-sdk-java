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
@JsonSerialize(using = DateRange.DateRangeSerializer.class)
@JsonDeserialize(using = DateRange.DateRangeDeserializer.class)
public class DateRange {
  /** */
  private String end;

  /** */
  private String start;

  public DateRange setEnd(String end) {
    this.end = end;
    return this;
  }

  public String getEnd() {
    return end;
  }

  public DateRange setStart(String start) {
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
    DateRange that = (DateRange) o;
    return Objects.equals(end, that.end) && Objects.equals(start, that.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  @Override
  public String toString() {
    return new ToStringer(DateRange.class).add("end", end).add("start", start).toString();
  }

  DateRangePb toPb() {
    DateRangePb pb = new DateRangePb();
    pb.setEnd(end);
    pb.setStart(start);

    return pb;
  }

  static DateRange fromPb(DateRangePb pb) {
    DateRange model = new DateRange();
    model.setEnd(pb.getEnd());
    model.setStart(pb.getStart());

    return model;
  }

  public static class DateRangeSerializer extends JsonSerializer<DateRange> {
    @Override
    public void serialize(DateRange value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DateRangePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DateRangeDeserializer extends JsonDeserializer<DateRange> {
    @Override
    public DateRange deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DateRangePb pb = mapper.readValue(p, DateRangePb.class);
      return DateRange.fromPb(pb);
    }
  }
}
