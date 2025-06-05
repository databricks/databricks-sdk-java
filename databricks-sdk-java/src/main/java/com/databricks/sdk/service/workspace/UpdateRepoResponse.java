// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = UpdateRepoResponse.UpdateRepoResponseSerializer.class)
@JsonDeserialize(using = UpdateRepoResponse.UpdateRepoResponseDeserializer.class)
public class UpdateRepoResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRepoResponse.class).toString();
  }

  UpdateRepoResponsePb toPb() {
    UpdateRepoResponsePb pb = new UpdateRepoResponsePb();

    return pb;
  }

  static UpdateRepoResponse fromPb(UpdateRepoResponsePb pb) {
    UpdateRepoResponse model = new UpdateRepoResponse();

    return model;
  }

  public static class UpdateRepoResponseSerializer extends JsonSerializer<UpdateRepoResponse> {
    @Override
    public void serialize(UpdateRepoResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateRepoResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateRepoResponseDeserializer extends JsonDeserializer<UpdateRepoResponse> {
    @Override
    public UpdateRepoResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateRepoResponsePb pb = mapper.readValue(p, UpdateRepoResponsePb.class);
      return UpdateRepoResponse.fromPb(pb);
    }
  }
}
