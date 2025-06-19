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

/** Get experiment permission levels */
@Generated
@JsonSerialize(
    using =
        GetExperimentPermissionLevelsRequest.GetExperimentPermissionLevelsRequestSerializer.class)
@JsonDeserialize(
    using =
        GetExperimentPermissionLevelsRequest.GetExperimentPermissionLevelsRequestDeserializer.class)
public class GetExperimentPermissionLevelsRequest {
  /** The experiment for which to get or manage permissions. */
  private String experimentId;

  public GetExperimentPermissionLevelsRequest setExperimentId(String experimentId) {
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
    GetExperimentPermissionLevelsRequest that = (GetExperimentPermissionLevelsRequest) o;
    return Objects.equals(experimentId, that.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExperimentPermissionLevelsRequest.class)
        .add("experimentId", experimentId)
        .toString();
  }

  GetExperimentPermissionLevelsRequestPb toPb() {
    GetExperimentPermissionLevelsRequestPb pb = new GetExperimentPermissionLevelsRequestPb();
    pb.setExperimentId(experimentId);

    return pb;
  }

  static GetExperimentPermissionLevelsRequest fromPb(GetExperimentPermissionLevelsRequestPb pb) {
    GetExperimentPermissionLevelsRequest model = new GetExperimentPermissionLevelsRequest();
    model.setExperimentId(pb.getExperimentId());

    return model;
  }

  public static class GetExperimentPermissionLevelsRequestSerializer
      extends JsonSerializer<GetExperimentPermissionLevelsRequest> {
    @Override
    public void serialize(
        GetExperimentPermissionLevelsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetExperimentPermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetExperimentPermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetExperimentPermissionLevelsRequest> {
    @Override
    public GetExperimentPermissionLevelsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetExperimentPermissionLevelsRequestPb pb =
          mapper.readValue(p, GetExperimentPermissionLevelsRequestPb.class);
      return GetExperimentPermissionLevelsRequest.fromPb(pb);
    }
  }
}
