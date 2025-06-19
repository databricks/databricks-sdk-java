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
import java.util.Objects;

/** List models */
@Generated
@JsonSerialize(using = ListModelsRequest.ListModelsRequestSerializer.class)
@JsonDeserialize(using = ListModelsRequest.ListModelsRequestDeserializer.class)
public class ListModelsRequest {
  /** Maximum number of registered models desired. Max threshold is 1000. */
  private Long maxResults;

  /** Pagination token to go to the next page based on a previous query. */
  private String pageToken;

  public ListModelsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListModelsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListModelsRequest that = (ListModelsRequest) o;
    return Objects.equals(maxResults, that.maxResults) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListModelsRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListModelsRequestPb toPb() {
    ListModelsRequestPb pb = new ListModelsRequestPb();
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListModelsRequest fromPb(ListModelsRequestPb pb) {
    ListModelsRequest model = new ListModelsRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListModelsRequestSerializer extends JsonSerializer<ListModelsRequest> {
    @Override
    public void serialize(ListModelsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListModelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListModelsRequestDeserializer extends JsonDeserializer<ListModelsRequest> {
    @Override
    public ListModelsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListModelsRequestPb pb = mapper.readValue(p, ListModelsRequestPb.class);
      return ListModelsRequest.fromPb(pb);
    }
  }
}
