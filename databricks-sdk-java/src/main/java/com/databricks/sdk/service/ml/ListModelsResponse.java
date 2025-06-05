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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListModelsResponse.ListModelsResponseSerializer.class)
@JsonDeserialize(using = ListModelsResponse.ListModelsResponseDeserializer.class)
public class ListModelsResponse {
  /** Pagination token to request next page of models for the same query. */
  private String nextPageToken;

  /** */
  private Collection<Model> registeredModels;

  public ListModelsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListModelsResponse setRegisteredModels(Collection<Model> registeredModels) {
    this.registeredModels = registeredModels;
    return this;
  }

  public Collection<Model> getRegisteredModels() {
    return registeredModels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListModelsResponse that = (ListModelsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(registeredModels, that.registeredModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, registeredModels);
  }

  @Override
  public String toString() {
    return new ToStringer(ListModelsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("registeredModels", registeredModels)
        .toString();
  }

  ListModelsResponsePb toPb() {
    ListModelsResponsePb pb = new ListModelsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setRegisteredModels(registeredModels);

    return pb;
  }

  static ListModelsResponse fromPb(ListModelsResponsePb pb) {
    ListModelsResponse model = new ListModelsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setRegisteredModels(pb.getRegisteredModels());

    return model;
  }

  public static class ListModelsResponseSerializer extends JsonSerializer<ListModelsResponse> {
    @Override
    public void serialize(ListModelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListModelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListModelsResponseDeserializer extends JsonDeserializer<ListModelsResponse> {
    @Override
    public ListModelsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListModelsResponsePb pb = mapper.readValue(p, ListModelsResponsePb.class);
      return ListModelsResponse.fromPb(pb);
    }
  }
}
