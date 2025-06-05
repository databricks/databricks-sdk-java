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

/** A storage location in Google Cloud Platform's GCS */
@Generated
@JsonSerialize(using = GcsStorageInfo.GcsStorageInfoSerializer.class)
@JsonDeserialize(using = GcsStorageInfo.GcsStorageInfoDeserializer.class)
public class GcsStorageInfo {
  /** GCS destination/URI, e.g. `gs://my-bucket/some-prefix` */
  private String destination;

  public GcsStorageInfo setDestination(String destination) {
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
    GcsStorageInfo that = (GcsStorageInfo) o;
    return Objects.equals(destination, that.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }

  @Override
  public String toString() {
    return new ToStringer(GcsStorageInfo.class).add("destination", destination).toString();
  }

  GcsStorageInfoPb toPb() {
    GcsStorageInfoPb pb = new GcsStorageInfoPb();
    pb.setDestination(destination);

    return pb;
  }

  static GcsStorageInfo fromPb(GcsStorageInfoPb pb) {
    GcsStorageInfo model = new GcsStorageInfo();
    model.setDestination(pb.getDestination());

    return model;
  }

  public static class GcsStorageInfoSerializer extends JsonSerializer<GcsStorageInfo> {
    @Override
    public void serialize(GcsStorageInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GcsStorageInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GcsStorageInfoDeserializer extends JsonDeserializer<GcsStorageInfo> {
    @Override
    public GcsStorageInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GcsStorageInfoPb pb = mapper.readValue(p, GcsStorageInfoPb.class);
      return GcsStorageInfo.fromPb(pb);
    }
  }
}
