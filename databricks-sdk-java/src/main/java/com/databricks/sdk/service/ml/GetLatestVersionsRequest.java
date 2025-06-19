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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = GetLatestVersionsRequest.GetLatestVersionsRequestSerializer.class)
@JsonDeserialize(using = GetLatestVersionsRequest.GetLatestVersionsRequestDeserializer.class)
public class GetLatestVersionsRequest {
  /** Registered model unique name identifier. */
  private String name;

  /** List of stages. */
  private Collection<String> stages;

  public GetLatestVersionsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetLatestVersionsRequest setStages(Collection<String> stages) {
    this.stages = stages;
    return this;
  }

  public Collection<String> getStages() {
    return stages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLatestVersionsRequest that = (GetLatestVersionsRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(stages, that.stages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, stages);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLatestVersionsRequest.class)
        .add("name", name)
        .add("stages", stages)
        .toString();
  }

  GetLatestVersionsRequestPb toPb() {
    GetLatestVersionsRequestPb pb = new GetLatestVersionsRequestPb();
    pb.setName(name);
    pb.setStages(stages);

    return pb;
  }

  static GetLatestVersionsRequest fromPb(GetLatestVersionsRequestPb pb) {
    GetLatestVersionsRequest model = new GetLatestVersionsRequest();
    model.setName(pb.getName());
    model.setStages(pb.getStages());

    return model;
  }

  public static class GetLatestVersionsRequestSerializer
      extends JsonSerializer<GetLatestVersionsRequest> {
    @Override
    public void serialize(
        GetLatestVersionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetLatestVersionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetLatestVersionsRequestDeserializer
      extends JsonDeserializer<GetLatestVersionsRequest> {
    @Override
    public GetLatestVersionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetLatestVersionsRequestPb pb = mapper.readValue(p, GetLatestVersionsRequestPb.class);
      return GetLatestVersionsRequest.fromPb(pb);
    }
  }
}
