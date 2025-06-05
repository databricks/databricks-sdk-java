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
@JsonSerialize(using = GetRunResponse.GetRunResponseSerializer.class)
@JsonDeserialize(using = GetRunResponse.GetRunResponseDeserializer.class)
public class GetRunResponse {
  /** Run metadata (name, start time, etc) and data (metrics, params, and tags). */
  private Run run;

  public GetRunResponse setRun(Run run) {
    this.run = run;
    return this;
  }

  public Run getRun() {
    return run;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRunResponse that = (GetRunResponse) o;
    return Objects.equals(run, that.run);
  }

  @Override
  public int hashCode() {
    return Objects.hash(run);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRunResponse.class).add("run", run).toString();
  }

  GetRunResponsePb toPb() {
    GetRunResponsePb pb = new GetRunResponsePb();
    pb.setRun(run);

    return pb;
  }

  static GetRunResponse fromPb(GetRunResponsePb pb) {
    GetRunResponse model = new GetRunResponse();
    model.setRun(pb.getRun());

    return model;
  }

  public static class GetRunResponseSerializer extends JsonSerializer<GetRunResponse> {
    @Override
    public void serialize(GetRunResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRunResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRunResponseDeserializer extends JsonDeserializer<GetRunResponse> {
    @Override
    public GetRunResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRunResponsePb pb = mapper.readValue(p, GetRunResponsePb.class);
      return GetRunResponse.fromPb(pb);
    }
  }
}
