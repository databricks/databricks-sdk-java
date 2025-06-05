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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = GetPersonalizationRequestResponse.GetPersonalizationRequestResponseSerializer.class)
@JsonDeserialize(
    using = GetPersonalizationRequestResponse.GetPersonalizationRequestResponseDeserializer.class)
public class GetPersonalizationRequestResponse {
  /** */
  private Collection<PersonalizationRequest> personalizationRequests;

  public GetPersonalizationRequestResponse setPersonalizationRequests(
      Collection<PersonalizationRequest> personalizationRequests) {
    this.personalizationRequests = personalizationRequests;
    return this;
  }

  public Collection<PersonalizationRequest> getPersonalizationRequests() {
    return personalizationRequests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPersonalizationRequestResponse that = (GetPersonalizationRequestResponse) o;
    return Objects.equals(personalizationRequests, that.personalizationRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalizationRequests);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPersonalizationRequestResponse.class)
        .add("personalizationRequests", personalizationRequests)
        .toString();
  }

  GetPersonalizationRequestResponsePb toPb() {
    GetPersonalizationRequestResponsePb pb = new GetPersonalizationRequestResponsePb();
    pb.setPersonalizationRequests(personalizationRequests);

    return pb;
  }

  static GetPersonalizationRequestResponse fromPb(GetPersonalizationRequestResponsePb pb) {
    GetPersonalizationRequestResponse model = new GetPersonalizationRequestResponse();
    model.setPersonalizationRequests(pb.getPersonalizationRequests());

    return model;
  }

  public static class GetPersonalizationRequestResponseSerializer
      extends JsonSerializer<GetPersonalizationRequestResponse> {
    @Override
    public void serialize(
        GetPersonalizationRequestResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPersonalizationRequestResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPersonalizationRequestResponseDeserializer
      extends JsonDeserializer<GetPersonalizationRequestResponse> {
    @Override
    public GetPersonalizationRequestResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPersonalizationRequestResponsePb pb =
          mapper.readValue(p, GetPersonalizationRequestResponsePb.class);
      return GetPersonalizationRequestResponse.fromPb(pb);
    }
  }
}
