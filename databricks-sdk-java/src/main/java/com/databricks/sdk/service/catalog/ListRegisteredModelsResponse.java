// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = ListRegisteredModelsResponse.ListRegisteredModelsResponseSerializer.class)
@JsonDeserialize(
    using = ListRegisteredModelsResponse.ListRegisteredModelsResponseDeserializer.class)
public class ListRegisteredModelsResponse {
  /**
   * Opaque token for pagination. Omitted if there are no more results. page_token should be set to
   * this value for fetching the next page.
   */
  private String nextPageToken;

  /** */
  private Collection<RegisteredModelInfo> registeredModels;

  public ListRegisteredModelsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRegisteredModelsResponse setRegisteredModels(
      Collection<RegisteredModelInfo> registeredModels) {
    this.registeredModels = registeredModels;
    return this;
  }

  public Collection<RegisteredModelInfo> getRegisteredModels() {
    return registeredModels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRegisteredModelsResponse that = (ListRegisteredModelsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(registeredModels, that.registeredModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, registeredModels);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRegisteredModelsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("registeredModels", registeredModels)
        .toString();
  }

  ListRegisteredModelsResponsePb toPb() {
    ListRegisteredModelsResponsePb pb = new ListRegisteredModelsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setRegisteredModels(registeredModels);

    return pb;
  }

  static ListRegisteredModelsResponse fromPb(ListRegisteredModelsResponsePb pb) {
    ListRegisteredModelsResponse model = new ListRegisteredModelsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setRegisteredModels(pb.getRegisteredModels());

    return model;
  }

  public static class ListRegisteredModelsResponseSerializer
      extends JsonSerializer<ListRegisteredModelsResponse> {
    @Override
    public void serialize(
        ListRegisteredModelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListRegisteredModelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListRegisteredModelsResponseDeserializer
      extends JsonDeserializer<ListRegisteredModelsResponse> {
    @Override
    public ListRegisteredModelsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListRegisteredModelsResponsePb pb = mapper.readValue(p, ListRegisteredModelsResponsePb.class);
      return ListRegisteredModelsResponse.fromPb(pb);
    }
  }
}
