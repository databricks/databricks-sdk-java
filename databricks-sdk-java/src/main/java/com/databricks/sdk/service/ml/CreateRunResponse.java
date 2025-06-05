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
@JsonSerialize(using = CreateRunResponse.CreateRunResponseSerializer.class)
@JsonDeserialize(using = CreateRunResponse.CreateRunResponseDeserializer.class)
public class CreateRunResponse {
  /** The newly created run. */
  private Run run;

  public CreateRunResponse setRun(Run run) {
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
    CreateRunResponse that = (CreateRunResponse) o;
    return Objects.equals(run, that.run);
  }

  @Override
  public int hashCode() {
    return Objects.hash(run);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRunResponse.class).add("run", run).toString();
  }

  CreateRunResponsePb toPb() {
    CreateRunResponsePb pb = new CreateRunResponsePb();
    pb.setRun(run);

    return pb;
  }

  static CreateRunResponse fromPb(CreateRunResponsePb pb) {
    CreateRunResponse model = new CreateRunResponse();
    model.setRun(pb.getRun());

    return model;
  }

  public static class CreateRunResponseSerializer extends JsonSerializer<CreateRunResponse> {
    @Override
    public void serialize(CreateRunResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateRunResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateRunResponseDeserializer extends JsonDeserializer<CreateRunResponse> {
    @Override
    public CreateRunResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateRunResponsePb pb = mapper.readValue(p, CreateRunResponsePb.class);
      return CreateRunResponse.fromPb(pb);
    }
  }
}
