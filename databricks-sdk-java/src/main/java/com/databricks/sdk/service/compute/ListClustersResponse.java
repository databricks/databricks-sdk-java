// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = ListClustersResponse.ListClustersResponseSerializer.class)
@JsonDeserialize(using = ListClustersResponse.ListClustersResponseDeserializer.class)
public class ListClustersResponse {
  /** */
  private Collection<ClusterDetails> clusters;

  /**
   * This field represents the pagination token to retrieve the next page of results. If the value
   * is "", it means no further results for the request.
   */
  private String nextPageToken;

  /**
   * This field represents the pagination token to retrieve the previous page of results. If the
   * value is "", it means no further results for the request.
   */
  private String prevPageToken;

  public ListClustersResponse setClusters(Collection<ClusterDetails> clusters) {
    this.clusters = clusters;
    return this;
  }

  public Collection<ClusterDetails> getClusters() {
    return clusters;
  }

  public ListClustersResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListClustersResponse setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersResponse that = (ListClustersResponse) o;
    return Objects.equals(clusters, that.clusters)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters, nextPageToken, prevPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClustersResponse.class)
        .add("clusters", clusters)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .toString();
  }

  ListClustersResponsePb toPb() {
    ListClustersResponsePb pb = new ListClustersResponsePb();
    pb.setClusters(clusters);
    pb.setNextPageToken(nextPageToken);
    pb.setPrevPageToken(prevPageToken);

    return pb;
  }

  static ListClustersResponse fromPb(ListClustersResponsePb pb) {
    ListClustersResponse model = new ListClustersResponse();
    model.setClusters(pb.getClusters());
    model.setNextPageToken(pb.getNextPageToken());
    model.setPrevPageToken(pb.getPrevPageToken());

    return model;
  }

  public static class ListClustersResponseSerializer extends JsonSerializer<ListClustersResponse> {
    @Override
    public void serialize(
        ListClustersResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListClustersResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListClustersResponseDeserializer
      extends JsonDeserializer<ListClustersResponse> {
    @Override
    public ListClustersResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListClustersResponsePb pb = mapper.readValue(p, ListClustersResponsePb.class);
      return ListClustersResponse.fromPb(pb);
    }
  }
}
