// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = ListVectorIndexesResponse.ListVectorIndexesResponseSerializer.class)
@JsonDeserialize(using = ListVectorIndexesResponse.ListVectorIndexesResponseDeserializer.class)
public class ListVectorIndexesResponse {
  /**
   * A token that can be used to get the next page of results. If not present, there are no more
   * results to show.
   */
  private String nextPageToken;

  /** */
  private Collection<MiniVectorIndex> vectorIndexes;

  public ListVectorIndexesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListVectorIndexesResponse setVectorIndexes(Collection<MiniVectorIndex> vectorIndexes) {
    this.vectorIndexes = vectorIndexes;
    return this;
  }

  public Collection<MiniVectorIndex> getVectorIndexes() {
    return vectorIndexes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListVectorIndexesResponse that = (ListVectorIndexesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(vectorIndexes, that.vectorIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, vectorIndexes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVectorIndexesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("vectorIndexes", vectorIndexes)
        .toString();
  }

  ListVectorIndexesResponsePb toPb() {
    ListVectorIndexesResponsePb pb = new ListVectorIndexesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setVectorIndexes(vectorIndexes);

    return pb;
  }

  static ListVectorIndexesResponse fromPb(ListVectorIndexesResponsePb pb) {
    ListVectorIndexesResponse model = new ListVectorIndexesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setVectorIndexes(pb.getVectorIndexes());

    return model;
  }

  public static class ListVectorIndexesResponseSerializer
      extends JsonSerializer<ListVectorIndexesResponse> {
    @Override
    public void serialize(
        ListVectorIndexesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListVectorIndexesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListVectorIndexesResponseDeserializer
      extends JsonDeserializer<ListVectorIndexesResponse> {
    @Override
    public ListVectorIndexesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListVectorIndexesResponsePb pb = mapper.readValue(p, ListVectorIndexesResponsePb.class);
      return ListVectorIndexesResponse.fromPb(pb);
    }
  }
}
