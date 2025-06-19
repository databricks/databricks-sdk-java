// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = ListQueriesResponse.ListQueriesResponseSerializer.class)
@JsonDeserialize(using = ListQueriesResponse.ListQueriesResponseDeserializer.class)
public class ListQueriesResponse {
  /** Whether there is another page of results. */
  private Boolean hasNextPage;

  /** A token that can be used to get the next page of results. */
  private String nextPageToken;

  /** */
  private Collection<QueryInfo> res;

  public ListQueriesResponse setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }

  public Boolean getHasNextPage() {
    return hasNextPage;
  }

  public ListQueriesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListQueriesResponse setRes(Collection<QueryInfo> res) {
    this.res = res;
    return this;
  }

  public Collection<QueryInfo> getRes() {
    return res;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQueriesResponse that = (ListQueriesResponse) o;
    return Objects.equals(hasNextPage, that.hasNextPage)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(res, that.res);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasNextPage, nextPageToken, res);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQueriesResponse.class)
        .add("hasNextPage", hasNextPage)
        .add("nextPageToken", nextPageToken)
        .add("res", res)
        .toString();
  }

  ListQueriesResponsePb toPb() {
    ListQueriesResponsePb pb = new ListQueriesResponsePb();
    pb.setHasNextPage(hasNextPage);
    pb.setNextPageToken(nextPageToken);
    pb.setRes(res);

    return pb;
  }

  static ListQueriesResponse fromPb(ListQueriesResponsePb pb) {
    ListQueriesResponse model = new ListQueriesResponse();
    model.setHasNextPage(pb.getHasNextPage());
    model.setNextPageToken(pb.getNextPageToken());
    model.setRes(pb.getRes());

    return model;
  }

  public static class ListQueriesResponseSerializer extends JsonSerializer<ListQueriesResponse> {
    @Override
    public void serialize(ListQueriesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListQueriesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListQueriesResponseDeserializer
      extends JsonDeserializer<ListQueriesResponse> {
    @Override
    public ListQueriesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListQueriesResponsePb pb = mapper.readValue(p, ListQueriesResponsePb.class);
      return ListQueriesResponse.fromPb(pb);
    }
  }
}
