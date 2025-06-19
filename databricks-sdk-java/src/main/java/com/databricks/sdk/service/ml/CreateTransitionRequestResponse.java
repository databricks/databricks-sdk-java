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
@JsonSerialize(
    using = CreateTransitionRequestResponse.CreateTransitionRequestResponseSerializer.class)
@JsonDeserialize(
    using = CreateTransitionRequestResponse.CreateTransitionRequestResponseDeserializer.class)
public class CreateTransitionRequestResponse {
  /** Transition request details. */
  private TransitionRequest request;

  public CreateTransitionRequestResponse setRequest(TransitionRequest request) {
    this.request = request;
    return this;
  }

  public TransitionRequest getRequest() {
    return request;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTransitionRequestResponse that = (CreateTransitionRequestResponse) o;
    return Objects.equals(request, that.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTransitionRequestResponse.class).add("request", request).toString();
  }

  CreateTransitionRequestResponsePb toPb() {
    CreateTransitionRequestResponsePb pb = new CreateTransitionRequestResponsePb();
    pb.setRequest(request);

    return pb;
  }

  static CreateTransitionRequestResponse fromPb(CreateTransitionRequestResponsePb pb) {
    CreateTransitionRequestResponse model = new CreateTransitionRequestResponse();
    model.setRequest(pb.getRequest());

    return model;
  }

  public static class CreateTransitionRequestResponseSerializer
      extends JsonSerializer<CreateTransitionRequestResponse> {
    @Override
    public void serialize(
        CreateTransitionRequestResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateTransitionRequestResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateTransitionRequestResponseDeserializer
      extends JsonDeserializer<CreateTransitionRequestResponse> {
    @Override
    public CreateTransitionRequestResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateTransitionRequestResponsePb pb =
          mapper.readValue(p, CreateTransitionRequestResponsePb.class);
      return CreateTransitionRequestResponse.fromPb(pb);
    }
  }
}
