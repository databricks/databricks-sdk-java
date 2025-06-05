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

@Generated
@JsonSerialize(using = LocalFileInfo.LocalFileInfoSerializer.class)
@JsonDeserialize(using = LocalFileInfo.LocalFileInfoDeserializer.class)
public class LocalFileInfo {
  /** local file destination, e.g. `file:/my/local/file.sh` */
  private String destination;

  public LocalFileInfo setDestination(String destination) {
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
    LocalFileInfo that = (LocalFileInfo) o;
    return Objects.equals(destination, that.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }

  @Override
  public String toString() {
    return new ToStringer(LocalFileInfo.class).add("destination", destination).toString();
  }

  LocalFileInfoPb toPb() {
    LocalFileInfoPb pb = new LocalFileInfoPb();
    pb.setDestination(destination);

    return pb;
  }

  static LocalFileInfo fromPb(LocalFileInfoPb pb) {
    LocalFileInfo model = new LocalFileInfo();
    model.setDestination(pb.getDestination());

    return model;
  }

  public static class LocalFileInfoSerializer extends JsonSerializer<LocalFileInfo> {
    @Override
    public void serialize(LocalFileInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LocalFileInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LocalFileInfoDeserializer extends JsonDeserializer<LocalFileInfo> {
    @Override
    public LocalFileInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LocalFileInfoPb pb = mapper.readValue(p, LocalFileInfoPb.class);
      return LocalFileInfo.fromPb(pb);
    }
  }
}
