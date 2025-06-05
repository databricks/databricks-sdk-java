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
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateResponse.CreateResponseSerializer.class)
@JsonDeserialize(using = CreateResponse.CreateResponseDeserializer.class)
public class CreateResponse {
  /** The global init script ID. */
  private String scriptId;

  public CreateResponse setScriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  public String getScriptId() {
    return scriptId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateResponse that = (CreateResponse) o;
    return Objects.equals(scriptId, that.scriptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateResponse.class).add("scriptId", scriptId).toString();
  }

  CreateResponsePb toPb() {
    CreateResponsePb pb = new CreateResponsePb();
    pb.setScriptId(scriptId);

    return pb;
  }

  static CreateResponse fromPb(CreateResponsePb pb) {
    CreateResponse model = new CreateResponse();
    model.setScriptId(pb.getScriptId());

    return model;
  }

  public static class CreateResponseSerializer extends JsonSerializer<CreateResponse> {
    @Override
    public void serialize(CreateResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateResponseDeserializer extends JsonDeserializer<CreateResponse> {
    @Override
    public CreateResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateResponsePb pb = mapper.readValue(p, CreateResponsePb.class);
      return CreateResponse.fromPb(pb);
    }
  }
}
