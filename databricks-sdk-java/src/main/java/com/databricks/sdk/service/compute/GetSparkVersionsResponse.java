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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = GetSparkVersionsResponse.GetSparkVersionsResponseSerializer.class)
@JsonDeserialize(using = GetSparkVersionsResponse.GetSparkVersionsResponseDeserializer.class)
public class GetSparkVersionsResponse {
  /** All the available Spark versions. */
  private Collection<SparkVersion> versions;

  public GetSparkVersionsResponse setVersions(Collection<SparkVersion> versions) {
    this.versions = versions;
    return this;
  }

  public Collection<SparkVersion> getVersions() {
    return versions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSparkVersionsResponse that = (GetSparkVersionsResponse) o;
    return Objects.equals(versions, that.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versions);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSparkVersionsResponse.class).add("versions", versions).toString();
  }

  GetSparkVersionsResponsePb toPb() {
    GetSparkVersionsResponsePb pb = new GetSparkVersionsResponsePb();
    pb.setVersions(versions);

    return pb;
  }

  static GetSparkVersionsResponse fromPb(GetSparkVersionsResponsePb pb) {
    GetSparkVersionsResponse model = new GetSparkVersionsResponse();
    model.setVersions(pb.getVersions());

    return model;
  }

  public static class GetSparkVersionsResponseSerializer
      extends JsonSerializer<GetSparkVersionsResponse> {
    @Override
    public void serialize(
        GetSparkVersionsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetSparkVersionsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetSparkVersionsResponseDeserializer
      extends JsonDeserializer<GetSparkVersionsResponse> {
    @Override
    public GetSparkVersionsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetSparkVersionsResponsePb pb = mapper.readValue(p, GetSparkVersionsResponsePb.class);
      return GetSparkVersionsResponse.fromPb(pb);
    }
  }
}
