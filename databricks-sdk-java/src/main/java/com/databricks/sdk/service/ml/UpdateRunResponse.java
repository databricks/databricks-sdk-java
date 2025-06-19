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

@Generated
@JsonSerialize(using = UpdateRunResponse.UpdateRunResponseSerializer.class)
@JsonDeserialize(using = UpdateRunResponse.UpdateRunResponseDeserializer.class)
public class UpdateRunResponse {
  /** Updated metadata of the run. */
  private RunInfo runInfo;

  public UpdateRunResponse setRunInfo(RunInfo runInfo) {
    this.runInfo = runInfo;
    return this;
  }

  public RunInfo getRunInfo() {
    return runInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRunResponse that = (UpdateRunResponse) o;
    return Objects.equals(runInfo, that.runInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRunResponse.class).add("runInfo", runInfo).toString();
  }

  UpdateRunResponsePb toPb() {
    UpdateRunResponsePb pb = new UpdateRunResponsePb();
    pb.setRunInfo(runInfo);

    return pb;
  }

  static UpdateRunResponse fromPb(UpdateRunResponsePb pb) {
    UpdateRunResponse model = new UpdateRunResponse();
    model.setRunInfo(pb.getRunInfo());

    return model;
  }

  public static class UpdateRunResponseSerializer extends JsonSerializer<UpdateRunResponse> {
    @Override
    public void serialize(UpdateRunResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateRunResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateRunResponseDeserializer extends JsonDeserializer<UpdateRunResponse> {
    @Override
    public UpdateRunResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateRunResponsePb pb = mapper.readValue(p, UpdateRunResponsePb.class);
      return UpdateRunResponse.fromPb(pb);
    }
  }
}
