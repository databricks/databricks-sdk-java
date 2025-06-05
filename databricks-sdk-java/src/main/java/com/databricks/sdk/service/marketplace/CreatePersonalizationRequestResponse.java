// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
    using =
        CreatePersonalizationRequestResponse.CreatePersonalizationRequestResponseSerializer.class)
@JsonDeserialize(
    using =
        CreatePersonalizationRequestResponse.CreatePersonalizationRequestResponseDeserializer.class)
public class CreatePersonalizationRequestResponse {
  /** */
  private String id;

  public CreatePersonalizationRequestResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePersonalizationRequestResponse that = (CreatePersonalizationRequestResponse) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePersonalizationRequestResponse.class).add("id", id).toString();
  }

  CreatePersonalizationRequestResponsePb toPb() {
    CreatePersonalizationRequestResponsePb pb = new CreatePersonalizationRequestResponsePb();
    pb.setId(id);

    return pb;
  }

  static CreatePersonalizationRequestResponse fromPb(CreatePersonalizationRequestResponsePb pb) {
    CreatePersonalizationRequestResponse model = new CreatePersonalizationRequestResponse();
    model.setId(pb.getId());

    return model;
  }

  public static class CreatePersonalizationRequestResponseSerializer
      extends JsonSerializer<CreatePersonalizationRequestResponse> {
    @Override
    public void serialize(
        CreatePersonalizationRequestResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreatePersonalizationRequestResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreatePersonalizationRequestResponseDeserializer
      extends JsonDeserializer<CreatePersonalizationRequestResponse> {
    @Override
    public CreatePersonalizationRequestResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreatePersonalizationRequestResponsePb pb =
          mapper.readValue(p, CreatePersonalizationRequestResponsePb.class);
      return CreatePersonalizationRequestResponse.fromPb(pb);
    }
  }
}
