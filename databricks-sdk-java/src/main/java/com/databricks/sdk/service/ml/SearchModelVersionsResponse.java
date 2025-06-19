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
@JsonSerialize(using = SearchModelVersionsResponse.SearchModelVersionsResponseSerializer.class)
@JsonDeserialize(using = SearchModelVersionsResponse.SearchModelVersionsResponseDeserializer.class)
public class SearchModelVersionsResponse {
  /** Models that match the search criteria */
  private Collection<ModelVersion> modelVersions;

  /** Pagination token to request next page of models for the same search query. */
  private String nextPageToken;

  public SearchModelVersionsResponse setModelVersions(Collection<ModelVersion> modelVersions) {
    this.modelVersions = modelVersions;
    return this;
  }

  public Collection<ModelVersion> getModelVersions() {
    return modelVersions;
  }

  public SearchModelVersionsResponse setNextPageToken(String nextPageToken) {
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
    SearchModelVersionsResponse that = (SearchModelVersionsResponse) o;
    return Objects.equals(modelVersions, that.modelVersions)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersions, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchModelVersionsResponse.class)
        .add("modelVersions", modelVersions)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  SearchModelVersionsResponsePb toPb() {
    SearchModelVersionsResponsePb pb = new SearchModelVersionsResponsePb();
    pb.setModelVersions(modelVersions);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static SearchModelVersionsResponse fromPb(SearchModelVersionsResponsePb pb) {
    SearchModelVersionsResponse model = new SearchModelVersionsResponse();
    model.setModelVersions(pb.getModelVersions());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class SearchModelVersionsResponseSerializer
      extends JsonSerializer<SearchModelVersionsResponse> {
    @Override
    public void serialize(
        SearchModelVersionsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchModelVersionsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchModelVersionsResponseDeserializer
      extends JsonDeserializer<SearchModelVersionsResponse> {
    @Override
    public SearchModelVersionsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchModelVersionsResponsePb pb = mapper.readValue(p, SearchModelVersionsResponsePb.class);
      return SearchModelVersionsResponse.fromPb(pb);
    }
  }
}
