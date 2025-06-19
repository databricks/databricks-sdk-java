// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Get a Volume */
@Generated
@JsonSerialize(using = ReadVolumeRequest.ReadVolumeRequestSerializer.class)
@JsonDeserialize(using = ReadVolumeRequest.ReadVolumeRequestDeserializer.class)
public class ReadVolumeRequest {
  /**
   * Whether to include volumes in the response for which the principal can only access selective
   * metadata for
   */
  private Boolean includeBrowse;

  /** The three-level (fully qualified) name of the volume */
  private String name;

  public ReadVolumeRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ReadVolumeRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReadVolumeRequest that = (ReadVolumeRequest) o;
    return Objects.equals(includeBrowse, that.includeBrowse) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBrowse, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ReadVolumeRequest.class)
        .add("includeBrowse", includeBrowse)
        .add("name", name)
        .toString();
  }

  ReadVolumeRequestPb toPb() {
    ReadVolumeRequestPb pb = new ReadVolumeRequestPb();
    pb.setIncludeBrowse(includeBrowse);
    pb.setName(name);

    return pb;
  }

  static ReadVolumeRequest fromPb(ReadVolumeRequestPb pb) {
    ReadVolumeRequest model = new ReadVolumeRequest();
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setName(pb.getName());

    return model;
  }

  public static class ReadVolumeRequestSerializer extends JsonSerializer<ReadVolumeRequest> {
    @Override
    public void serialize(ReadVolumeRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ReadVolumeRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ReadVolumeRequestDeserializer extends JsonDeserializer<ReadVolumeRequest> {
    @Override
    public ReadVolumeRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ReadVolumeRequestPb pb = mapper.readValue(p, ReadVolumeRequestPb.class);
      return ReadVolumeRequest.fromPb(pb);
    }
  }
}
