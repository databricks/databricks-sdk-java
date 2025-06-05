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
@JsonSerialize(using = SearchLoggedModelsResponse.SearchLoggedModelsResponseSerializer.class)
@JsonDeserialize(using = SearchLoggedModelsResponse.SearchLoggedModelsResponseDeserializer.class)
public class SearchLoggedModelsResponse {
  /** Logged models that match the search criteria. */
  private Collection<LoggedModel> models;

  /** The token that can be used to retrieve the next page of logged models. */
  private String nextPageToken;

  public SearchLoggedModelsResponse setModels(Collection<LoggedModel> models) {
    this.models = models;
    return this;
  }

  public Collection<LoggedModel> getModels() {
    return models;
  }

  public SearchLoggedModelsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchLoggedModelsResponse that = (SearchLoggedModelsResponse) o;
    return Objects.equals(models, that.models) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchLoggedModelsResponse.class)
        .add("models", models)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  SearchLoggedModelsResponsePb toPb() {
    SearchLoggedModelsResponsePb pb = new SearchLoggedModelsResponsePb();
    pb.setModels(models);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static SearchLoggedModelsResponse fromPb(SearchLoggedModelsResponsePb pb) {
    SearchLoggedModelsResponse model = new SearchLoggedModelsResponse();
    model.setModels(pb.getModels());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class SearchLoggedModelsResponseSerializer
      extends JsonSerializer<SearchLoggedModelsResponse> {
    @Override
    public void serialize(
        SearchLoggedModelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchLoggedModelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchLoggedModelsResponseDeserializer
      extends JsonDeserializer<SearchLoggedModelsResponse> {
    @Override
    public SearchLoggedModelsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchLoggedModelsResponsePb pb = mapper.readValue(p, SearchLoggedModelsResponsePb.class);
      return SearchLoggedModelsResponse.fromPb(pb);
    }
  }
}
