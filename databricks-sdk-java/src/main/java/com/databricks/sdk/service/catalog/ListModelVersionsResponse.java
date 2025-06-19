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
@JsonSerialize(using = ListModelVersionsResponse.ListModelVersionsResponseSerializer.class)
@JsonDeserialize(using = ListModelVersionsResponse.ListModelVersionsResponseDeserializer.class)
public class ListModelVersionsResponse {
  /** */
  private Collection<ModelVersionInfo> modelVersions;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  public ListModelVersionsResponse setModelVersions(Collection<ModelVersionInfo> modelVersions) {
    this.modelVersions = modelVersions;
    return this;
  }

  public Collection<ModelVersionInfo> getModelVersions() {
    return modelVersions;
  }

  public ListModelVersionsResponse setNextPageToken(String nextPageToken) {
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
    ListModelVersionsResponse that = (ListModelVersionsResponse) o;
    return Objects.equals(modelVersions, that.modelVersions)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersions, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListModelVersionsResponse.class)
        .add("modelVersions", modelVersions)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListModelVersionsResponsePb toPb() {
    ListModelVersionsResponsePb pb = new ListModelVersionsResponsePb();
    pb.setModelVersions(modelVersions);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListModelVersionsResponse fromPb(ListModelVersionsResponsePb pb) {
    ListModelVersionsResponse model = new ListModelVersionsResponse();
    model.setModelVersions(pb.getModelVersions());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListModelVersionsResponseSerializer
      extends JsonSerializer<ListModelVersionsResponse> {
    @Override
    public void serialize(
        ListModelVersionsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListModelVersionsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListModelVersionsResponseDeserializer
      extends JsonDeserializer<ListModelVersionsResponse> {
    @Override
    public ListModelVersionsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListModelVersionsResponsePb pb = mapper.readValue(p, ListModelVersionsResponsePb.class);
      return ListModelVersionsResponse.fromPb(pb);
    }
  }
}
