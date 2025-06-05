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
@JsonSerialize(using = CreateProviderResponse.CreateProviderResponseSerializer.class)
@JsonDeserialize(using = CreateProviderResponse.CreateProviderResponseDeserializer.class)
public class CreateProviderResponse {
  /** */
  private String id;

  public CreateProviderResponse setId(String id) {
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
    CreateProviderResponse that = (CreateProviderResponse) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateProviderResponse.class).add("id", id).toString();
  }

  CreateProviderResponsePb toPb() {
    CreateProviderResponsePb pb = new CreateProviderResponsePb();
    pb.setId(id);

    return pb;
  }

  static CreateProviderResponse fromPb(CreateProviderResponsePb pb) {
    CreateProviderResponse model = new CreateProviderResponse();
    model.setId(pb.getId());

    return model;
  }

  public static class CreateProviderResponseSerializer
      extends JsonSerializer<CreateProviderResponse> {
    @Override
    public void serialize(
        CreateProviderResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateProviderResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateProviderResponseDeserializer
      extends JsonDeserializer<CreateProviderResponse> {
    @Override
    public CreateProviderResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateProviderResponsePb pb = mapper.readValue(p, CreateProviderResponsePb.class);
      return CreateProviderResponse.fromPb(pb);
    }
  }
}
