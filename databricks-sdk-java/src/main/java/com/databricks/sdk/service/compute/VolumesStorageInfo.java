// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** A storage location back by UC Volumes. */
@Generated
@JsonSerialize(using = VolumesStorageInfo.VolumesStorageInfoSerializer.class)
@JsonDeserialize(using = VolumesStorageInfo.VolumesStorageInfoDeserializer.class)
public class VolumesStorageInfo {
  /**
   * UC Volumes destination, e.g. `/Volumes/catalog/schema/vol1/init-scripts/setup-datadog.sh` or
   * `dbfs:/Volumes/catalog/schema/vol1/init-scripts/setup-datadog.sh`
   */
  private String destination;

  public VolumesStorageInfo setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VolumesStorageInfo that = (VolumesStorageInfo) o;
    return Objects.equals(destination, that.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }

  @Override
  public String toString() {
    return new ToStringer(VolumesStorageInfo.class).add("destination", destination).toString();
  }

  VolumesStorageInfoPb toPb() {
    VolumesStorageInfoPb pb = new VolumesStorageInfoPb();
    pb.setDestination(destination);

    return pb;
  }

  static VolumesStorageInfo fromPb(VolumesStorageInfoPb pb) {
    VolumesStorageInfo model = new VolumesStorageInfo();
    model.setDestination(pb.getDestination());

    return model;
  }

  public static class VolumesStorageInfoSerializer extends JsonSerializer<VolumesStorageInfo> {
    @Override
    public void serialize(VolumesStorageInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      VolumesStorageInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class VolumesStorageInfoDeserializer extends JsonDeserializer<VolumesStorageInfo> {
    @Override
    public VolumesStorageInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      VolumesStorageInfoPb pb = mapper.readValue(p, VolumesStorageInfoPb.class);
      return VolumesStorageInfo.fromPb(pb);
    }
  }
}
