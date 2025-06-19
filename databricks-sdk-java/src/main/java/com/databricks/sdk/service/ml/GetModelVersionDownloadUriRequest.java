// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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

/** Get a model version URI */
@Generated
@JsonSerialize(
    using = GetModelVersionDownloadUriRequest.GetModelVersionDownloadUriRequestSerializer.class)
@JsonDeserialize(
    using = GetModelVersionDownloadUriRequest.GetModelVersionDownloadUriRequestDeserializer.class)
public class GetModelVersionDownloadUriRequest {
  /** Name of the registered model */
  private String name;

  /** Model version number */
  private String version;

  public GetModelVersionDownloadUriRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetModelVersionDownloadUriRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelVersionDownloadUriRequest that = (GetModelVersionDownloadUriRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelVersionDownloadUriRequest.class)
        .add("name", name)
        .add("version", version)
        .toString();
  }

  GetModelVersionDownloadUriRequestPb toPb() {
    GetModelVersionDownloadUriRequestPb pb = new GetModelVersionDownloadUriRequestPb();
    pb.setName(name);
    pb.setVersion(version);

    return pb;
  }

  static GetModelVersionDownloadUriRequest fromPb(GetModelVersionDownloadUriRequestPb pb) {
    GetModelVersionDownloadUriRequest model = new GetModelVersionDownloadUriRequest();
    model.setName(pb.getName());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class GetModelVersionDownloadUriRequestSerializer
      extends JsonSerializer<GetModelVersionDownloadUriRequest> {
    @Override
    public void serialize(
        GetModelVersionDownloadUriRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetModelVersionDownloadUriRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetModelVersionDownloadUriRequestDeserializer
      extends JsonDeserializer<GetModelVersionDownloadUriRequest> {
    @Override
    public GetModelVersionDownloadUriRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetModelVersionDownloadUriRequestPb pb =
          mapper.readValue(p, GetModelVersionDownloadUriRequestPb.class);
      return GetModelVersionDownloadUriRequest.fromPb(pb);
    }
  }
}
