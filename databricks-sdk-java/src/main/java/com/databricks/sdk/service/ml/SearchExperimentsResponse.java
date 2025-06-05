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
@JsonSerialize(using = SearchExperimentsResponse.SearchExperimentsResponseSerializer.class)
@JsonDeserialize(using = SearchExperimentsResponse.SearchExperimentsResponseDeserializer.class)
public class SearchExperimentsResponse {
  /** Experiments that match the search criteria */
  private Collection<Experiment> experiments;

  /**
   * Token that can be used to retrieve the next page of experiments. An empty token means that no
   * more experiments are available for retrieval.
   */
  private String nextPageToken;

  public SearchExperimentsResponse setExperiments(Collection<Experiment> experiments) {
    this.experiments = experiments;
    return this;
  }

  public Collection<Experiment> getExperiments() {
    return experiments;
  }

  public SearchExperimentsResponse setNextPageToken(String nextPageToken) {
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
    SearchExperimentsResponse that = (SearchExperimentsResponse) o;
    return Objects.equals(experiments, that.experiments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experiments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchExperimentsResponse.class)
        .add("experiments", experiments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  SearchExperimentsResponsePb toPb() {
    SearchExperimentsResponsePb pb = new SearchExperimentsResponsePb();
    pb.setExperiments(experiments);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static SearchExperimentsResponse fromPb(SearchExperimentsResponsePb pb) {
    SearchExperimentsResponse model = new SearchExperimentsResponse();
    model.setExperiments(pb.getExperiments());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class SearchExperimentsResponseSerializer
      extends JsonSerializer<SearchExperimentsResponse> {
    @Override
    public void serialize(
        SearchExperimentsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchExperimentsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchExperimentsResponseDeserializer
      extends JsonDeserializer<SearchExperimentsResponse> {
    @Override
    public SearchExperimentsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchExperimentsResponsePb pb = mapper.readValue(p, SearchExperimentsResponsePb.class);
      return SearchExperimentsResponse.fromPb(pb);
    }
  }
}
