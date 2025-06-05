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

/** Get an artifact allowlist */
@Generated
@JsonSerialize(using = GetArtifactAllowlistRequest.GetArtifactAllowlistRequestSerializer.class)
@JsonDeserialize(using = GetArtifactAllowlistRequest.GetArtifactAllowlistRequestDeserializer.class)
public class GetArtifactAllowlistRequest {
  /** The artifact type of the allowlist. */
  private ArtifactType artifactType;

  public GetArtifactAllowlistRequest setArtifactType(ArtifactType artifactType) {
    this.artifactType = artifactType;
    return this;
  }

  public ArtifactType getArtifactType() {
    return artifactType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetArtifactAllowlistRequest that = (GetArtifactAllowlistRequest) o;
    return Objects.equals(artifactType, that.artifactType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetArtifactAllowlistRequest.class)
        .add("artifactType", artifactType)
        .toString();
  }

  GetArtifactAllowlistRequestPb toPb() {
    GetArtifactAllowlistRequestPb pb = new GetArtifactAllowlistRequestPb();
    pb.setArtifactType(artifactType);

    return pb;
  }

  static GetArtifactAllowlistRequest fromPb(GetArtifactAllowlistRequestPb pb) {
    GetArtifactAllowlistRequest model = new GetArtifactAllowlistRequest();
    model.setArtifactType(pb.getArtifactType());

    return model;
  }

  public static class GetArtifactAllowlistRequestSerializer
      extends JsonSerializer<GetArtifactAllowlistRequest> {
    @Override
    public void serialize(
        GetArtifactAllowlistRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetArtifactAllowlistRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetArtifactAllowlistRequestDeserializer
      extends JsonDeserializer<GetArtifactAllowlistRequest> {
    @Override
    public GetArtifactAllowlistRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetArtifactAllowlistRequestPb pb = mapper.readValue(p, GetArtifactAllowlistRequestPb.class);
      return GetArtifactAllowlistRequest.fromPb(pb);
    }
  }
}
