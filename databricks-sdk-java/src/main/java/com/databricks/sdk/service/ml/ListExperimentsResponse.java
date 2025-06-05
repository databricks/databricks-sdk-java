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
@JsonSerialize(using = ListExperimentsResponse.ListExperimentsResponseSerializer.class)
@JsonDeserialize(using = ListExperimentsResponse.ListExperimentsResponseDeserializer.class)
public class ListExperimentsResponse {
  /** Paginated Experiments beginning with the first item on the requested page. */
  private Collection<Experiment> experiments;

  /**
   * Token that can be used to retrieve the next page of experiments. Empty token means no more
   * experiment is available for retrieval.
   */
  private String nextPageToken;

  public ListExperimentsResponse setExperiments(Collection<Experiment> experiments) {
    this.experiments = experiments;
    return this;
  }

  public Collection<Experiment> getExperiments() {
    return experiments;
  }

  public ListExperimentsResponse setNextPageToken(String nextPageToken) {
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
    ListExperimentsResponse that = (ListExperimentsResponse) o;
    return Objects.equals(experiments, that.experiments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experiments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExperimentsResponse.class)
        .add("experiments", experiments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListExperimentsResponsePb toPb() {
    ListExperimentsResponsePb pb = new ListExperimentsResponsePb();
    pb.setExperiments(experiments);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListExperimentsResponse fromPb(ListExperimentsResponsePb pb) {
    ListExperimentsResponse model = new ListExperimentsResponse();
    model.setExperiments(pb.getExperiments());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListExperimentsResponseSerializer
      extends JsonSerializer<ListExperimentsResponse> {
    @Override
    public void serialize(
        ListExperimentsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListExperimentsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListExperimentsResponseDeserializer
      extends JsonDeserializer<ListExperimentsResponse> {
    @Override
    public ListExperimentsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListExperimentsResponsePb pb = mapper.readValue(p, ListExperimentsResponsePb.class);
      return ListExperimentsResponse.fromPb(pb);
    }
  }
}
