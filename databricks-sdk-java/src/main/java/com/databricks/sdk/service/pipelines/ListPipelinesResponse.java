// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = ListPipelinesResponse.ListPipelinesResponseSerializer.class)
@JsonDeserialize(using = ListPipelinesResponse.ListPipelinesResponseDeserializer.class)
public class ListPipelinesResponse {
  /** If present, a token to fetch the next page of events. */
  private String nextPageToken;

  /** The list of events matching the request criteria. */
  private Collection<PipelineStateInfo> statuses;

  public ListPipelinesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListPipelinesResponse setStatuses(Collection<PipelineStateInfo> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Collection<PipelineStateInfo> getStatuses() {
    return statuses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPipelinesResponse that = (ListPipelinesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(statuses, that.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, statuses);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPipelinesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("statuses", statuses)
        .toString();
  }

  ListPipelinesResponsePb toPb() {
    ListPipelinesResponsePb pb = new ListPipelinesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setStatuses(statuses);

    return pb;
  }

  static ListPipelinesResponse fromPb(ListPipelinesResponsePb pb) {
    ListPipelinesResponse model = new ListPipelinesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setStatuses(pb.getStatuses());

    return model;
  }

  public static class ListPipelinesResponseSerializer
      extends JsonSerializer<ListPipelinesResponse> {
    @Override
    public void serialize(
        ListPipelinesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListPipelinesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListPipelinesResponseDeserializer
      extends JsonDeserializer<ListPipelinesResponse> {
    @Override
    public ListPipelinesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListPipelinesResponsePb pb = mapper.readValue(p, ListPipelinesResponsePb.class);
      return ListPipelinesResponse.fromPb(pb);
    }
  }
}
