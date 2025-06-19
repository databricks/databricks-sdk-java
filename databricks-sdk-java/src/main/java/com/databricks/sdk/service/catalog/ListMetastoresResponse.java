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
@JsonSerialize(using = ListMetastoresResponse.ListMetastoresResponseSerializer.class)
@JsonDeserialize(using = ListMetastoresResponse.ListMetastoresResponseDeserializer.class)
public class ListMetastoresResponse {
  /** An array of metastore information objects. */
  private Collection<MetastoreInfo> metastores;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  public ListMetastoresResponse setMetastores(Collection<MetastoreInfo> metastores) {
    this.metastores = metastores;
    return this;
  }

  public Collection<MetastoreInfo> getMetastores() {
    return metastores;
  }

  public ListMetastoresResponse setNextPageToken(String nextPageToken) {
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
    ListMetastoresResponse that = (ListMetastoresResponse) o;
    return Objects.equals(metastores, that.metastores)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastores, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMetastoresResponse.class)
        .add("metastores", metastores)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListMetastoresResponsePb toPb() {
    ListMetastoresResponsePb pb = new ListMetastoresResponsePb();
    pb.setMetastores(metastores);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListMetastoresResponse fromPb(ListMetastoresResponsePb pb) {
    ListMetastoresResponse model = new ListMetastoresResponse();
    model.setMetastores(pb.getMetastores());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListMetastoresResponseSerializer
      extends JsonSerializer<ListMetastoresResponse> {
    @Override
    public void serialize(
        ListMetastoresResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListMetastoresResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListMetastoresResponseDeserializer
      extends JsonDeserializer<ListMetastoresResponse> {
    @Override
    public ListMetastoresResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListMetastoresResponsePb pb = mapper.readValue(p, ListMetastoresResponsePb.class);
      return ListMetastoresResponse.fromPb(pb);
    }
  }
}
