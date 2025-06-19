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
@JsonSerialize(using = SearchModelsResponse.SearchModelsResponseSerializer.class)
@JsonDeserialize(using = SearchModelsResponse.SearchModelsResponseDeserializer.class)
public class SearchModelsResponse {
  /** Pagination token to request the next page of models. */
  private String nextPageToken;

  /** Registered Models that match the search criteria. */
  private Collection<Model> registeredModels;

  public SearchModelsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public SearchModelsResponse setRegisteredModels(Collection<Model> registeredModels) {
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
    SearchModelsResponse that = (SearchModelsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(registeredModels, that.registeredModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, registeredModels);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchModelsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("registeredModels", registeredModels)
        .toString();
  }

  SearchModelsResponsePb toPb() {
    SearchModelsResponsePb pb = new SearchModelsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setRegisteredModels(registeredModels);

    return pb;
  }

  static SearchModelsResponse fromPb(SearchModelsResponsePb pb) {
    SearchModelsResponse model = new SearchModelsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setRegisteredModels(pb.getRegisteredModels());

    return model;
  }

  public static class SearchModelsResponseSerializer extends JsonSerializer<SearchModelsResponse> {
    @Override
    public void serialize(
        SearchModelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchModelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchModelsResponseDeserializer
      extends JsonDeserializer<SearchModelsResponse> {
    @Override
    public SearchModelsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchModelsResponsePb pb = mapper.readValue(p, SearchModelsResponsePb.class);
      return SearchModelsResponse.fromPb(pb);
    }
  }
}
