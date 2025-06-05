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
@JsonSerialize(using = GetLatestVersionsResponse.GetLatestVersionsResponseSerializer.class)
@JsonDeserialize(using = GetLatestVersionsResponse.GetLatestVersionsResponseDeserializer.class)
public class GetLatestVersionsResponse {
  /**
   * Latest version models for each requests stage. Only return models with current `READY` status.
   * If no `stages` provided, returns the latest version for each stage, including `"None"`.
   */
  private Collection<ModelVersion> modelVersions;

  public GetLatestVersionsResponse setModelVersions(Collection<ModelVersion> modelVersions) {
    this.modelVersions = modelVersions;
    return this;
  }

  public Collection<ModelVersion> getModelVersions() {
    return modelVersions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLatestVersionsResponse that = (GetLatestVersionsResponse) o;
    return Objects.equals(modelVersions, that.modelVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersions);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLatestVersionsResponse.class)
        .add("modelVersions", modelVersions)
        .toString();
  }

  GetLatestVersionsResponsePb toPb() {
    GetLatestVersionsResponsePb pb = new GetLatestVersionsResponsePb();
    pb.setModelVersions(modelVersions);

    return pb;
  }

  static GetLatestVersionsResponse fromPb(GetLatestVersionsResponsePb pb) {
    GetLatestVersionsResponse model = new GetLatestVersionsResponse();
    model.setModelVersions(pb.getModelVersions());

    return model;
  }

  public static class GetLatestVersionsResponseSerializer
      extends JsonSerializer<GetLatestVersionsResponse> {
    @Override
    public void serialize(
        GetLatestVersionsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetLatestVersionsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetLatestVersionsResponseDeserializer
      extends JsonDeserializer<GetLatestVersionsResponse> {
    @Override
    public GetLatestVersionsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetLatestVersionsResponsePb pb = mapper.readValue(p, GetLatestVersionsResponsePb.class);
      return GetLatestVersionsResponse.fromPb(pb);
    }
  }
}
