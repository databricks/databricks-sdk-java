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

/** Get experiment permissions */
@Generated
@JsonSerialize(
    using = GetExperimentPermissionsRequest.GetExperimentPermissionsRequestSerializer.class)
@JsonDeserialize(
    using = GetExperimentPermissionsRequest.GetExperimentPermissionsRequestDeserializer.class)
public class GetExperimentPermissionsRequest {
  /** The experiment for which to get or manage permissions. */
  private String experimentId;

  public GetExperimentPermissionsRequest setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetExperimentPermissionsRequest that = (GetExperimentPermissionsRequest) o;
    return Objects.equals(experimentId, that.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExperimentPermissionsRequest.class)
        .add("experimentId", experimentId)
        .toString();
  }

  GetExperimentPermissionsRequestPb toPb() {
    GetExperimentPermissionsRequestPb pb = new GetExperimentPermissionsRequestPb();
    pb.setExperimentId(experimentId);

    return pb;
  }

  static GetExperimentPermissionsRequest fromPb(GetExperimentPermissionsRequestPb pb) {
    GetExperimentPermissionsRequest model = new GetExperimentPermissionsRequest();
    model.setExperimentId(pb.getExperimentId());

    return model;
  }

  public static class GetExperimentPermissionsRequestSerializer
      extends JsonSerializer<GetExperimentPermissionsRequest> {
    @Override
    public void serialize(
        GetExperimentPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetExperimentPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetExperimentPermissionsRequestDeserializer
      extends JsonDeserializer<GetExperimentPermissionsRequest> {
    @Override
    public GetExperimentPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetExperimentPermissionsRequestPb pb =
          mapper.readValue(p, GetExperimentPermissionsRequestPb.class);
      return GetExperimentPermissionsRequest.fromPb(pb);
    }
  }
}
