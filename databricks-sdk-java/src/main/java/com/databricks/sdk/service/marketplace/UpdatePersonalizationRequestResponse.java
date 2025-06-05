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
        UpdatePersonalizationRequestResponse.UpdatePersonalizationRequestResponseSerializer.class)
@JsonDeserialize(
    using =
        UpdatePersonalizationRequestResponse.UpdatePersonalizationRequestResponseDeserializer.class)
public class UpdatePersonalizationRequestResponse {
  /** */
  private PersonalizationRequest request;

  public UpdatePersonalizationRequestResponse setRequest(PersonalizationRequest request) {
    this.request = request;
    return this;
  }

  public PersonalizationRequest getRequest() {
    return request;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePersonalizationRequestResponse that = (UpdatePersonalizationRequestResponse) o;
    return Objects.equals(request, that.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePersonalizationRequestResponse.class)
        .add("request", request)
        .toString();
  }

  UpdatePersonalizationRequestResponsePb toPb() {
    UpdatePersonalizationRequestResponsePb pb = new UpdatePersonalizationRequestResponsePb();
    pb.setRequest(request);

    return pb;
  }

  static UpdatePersonalizationRequestResponse fromPb(UpdatePersonalizationRequestResponsePb pb) {
    UpdatePersonalizationRequestResponse model = new UpdatePersonalizationRequestResponse();
    model.setRequest(pb.getRequest());

    return model;
  }

  public static class UpdatePersonalizationRequestResponseSerializer
      extends JsonSerializer<UpdatePersonalizationRequestResponse> {
    @Override
    public void serialize(
        UpdatePersonalizationRequestResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdatePersonalizationRequestResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdatePersonalizationRequestResponseDeserializer
      extends JsonDeserializer<UpdatePersonalizationRequestResponse> {
    @Override
    public UpdatePersonalizationRequestResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdatePersonalizationRequestResponsePb pb =
          mapper.readValue(p, UpdatePersonalizationRequestResponsePb.class);
      return UpdatePersonalizationRequestResponse.fromPb(pb);
    }
  }
}
