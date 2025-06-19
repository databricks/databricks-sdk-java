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
@JsonSerialize(using = ListUpdatesResponse.ListUpdatesResponseSerializer.class)
@JsonDeserialize(using = ListUpdatesResponse.ListUpdatesResponseDeserializer.class)
public class ListUpdatesResponse {
  /**
   * If present, then there are more results, and this a token to be used in a subsequent request to
   * fetch the next page.
   */
  private String nextPageToken;

  /** If present, then this token can be used in a subsequent request to fetch the previous page. */
  private String prevPageToken;

  /** */
  private Collection<UpdateInfo> updates;

  public ListUpdatesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListUpdatesResponse setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  public ListUpdatesResponse setUpdates(Collection<UpdateInfo> updates) {
    this.updates = updates;
    return this;
  }

  public Collection<UpdateInfo> getUpdates() {
    return updates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListUpdatesResponse that = (ListUpdatesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken)
        && Objects.equals(updates, that.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, prevPageToken, updates);
  }

  @Override
  public String toString() {
    return new ToStringer(ListUpdatesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .add("updates", updates)
        .toString();
  }

  ListUpdatesResponsePb toPb() {
    ListUpdatesResponsePb pb = new ListUpdatesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setPrevPageToken(prevPageToken);
    pb.setUpdates(updates);

    return pb;
  }

  static ListUpdatesResponse fromPb(ListUpdatesResponsePb pb) {
    ListUpdatesResponse model = new ListUpdatesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setPrevPageToken(pb.getPrevPageToken());
    model.setUpdates(pb.getUpdates());

    return model;
  }

  public static class ListUpdatesResponseSerializer extends JsonSerializer<ListUpdatesResponse> {
    @Override
    public void serialize(ListUpdatesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListUpdatesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListUpdatesResponseDeserializer
      extends JsonDeserializer<ListUpdatesResponse> {
    @Override
    public ListUpdatesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListUpdatesResponsePb pb = mapper.readValue(p, ListUpdatesResponsePb.class);
      return ListUpdatesResponse.fromPb(pb);
    }
  }
}
