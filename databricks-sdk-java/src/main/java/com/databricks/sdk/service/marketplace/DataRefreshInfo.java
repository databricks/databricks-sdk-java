// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = DataRefreshInfo.DataRefreshInfoSerializer.class)
@JsonDeserialize(using = DataRefreshInfo.DataRefreshInfoDeserializer.class)
public class DataRefreshInfo {
  /** */
  private Long interval;

  /** */
  private DataRefresh unit;

  public DataRefreshInfo setInterval(Long interval) {
    this.interval = interval;
    return this;
  }

  public Long getInterval() {
    return interval;
  }

  public DataRefreshInfo setUnit(DataRefresh unit) {
    this.unit = unit;
    return this;
  }

  public DataRefresh getUnit() {
    return unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataRefreshInfo that = (DataRefreshInfo) o;
    return Objects.equals(interval, that.interval) && Objects.equals(unit, that.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, unit);
  }

  @Override
  public String toString() {
    return new ToStringer(DataRefreshInfo.class)
        .add("interval", interval)
        .add("unit", unit)
        .toString();
  }

  DataRefreshInfoPb toPb() {
    DataRefreshInfoPb pb = new DataRefreshInfoPb();
    pb.setInterval(interval);
    pb.setUnit(unit);

    return pb;
  }

  static DataRefreshInfo fromPb(DataRefreshInfoPb pb) {
    DataRefreshInfo model = new DataRefreshInfo();
    model.setInterval(pb.getInterval());
    model.setUnit(pb.getUnit());

    return model;
  }

  public static class DataRefreshInfoSerializer extends JsonSerializer<DataRefreshInfo> {
    @Override
    public void serialize(DataRefreshInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DataRefreshInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DataRefreshInfoDeserializer extends JsonDeserializer<DataRefreshInfo> {
    @Override
    public DataRefreshInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DataRefreshInfoPb pb = mapper.readValue(p, DataRefreshInfoPb.class);
      return DataRefreshInfo.fromPb(pb);
    }
  }
}
