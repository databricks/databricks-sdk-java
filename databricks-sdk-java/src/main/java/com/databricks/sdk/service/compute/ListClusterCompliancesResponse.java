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
@JsonSerialize(
    using = ListClusterCompliancesResponse.ListClusterCompliancesResponseSerializer.class)
@JsonDeserialize(
    using = ListClusterCompliancesResponse.ListClusterCompliancesResponseDeserializer.class)
public class ListClusterCompliancesResponse {
  /** A list of clusters and their policy compliance statuses. */
  private Collection<ClusterCompliance> clusters;

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

  public ListClusterCompliancesResponse setClusters(Collection<ClusterCompliance> clusters) {
    this.clusters = clusters;
    return this;
  }

  public Collection<ClusterCompliance> getClusters() {
    return clusters;
  }

  public ListClusterCompliancesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListClusterCompliancesResponse setPrevPageToken(String prevPageToken) {
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
    ListClusterCompliancesResponse that = (ListClusterCompliancesResponse) o;
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
    return new ToStringer(ListClusterCompliancesResponse.class)
        .add("clusters", clusters)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .toString();
  }

  ListClusterCompliancesResponsePb toPb() {
    ListClusterCompliancesResponsePb pb = new ListClusterCompliancesResponsePb();
    pb.setClusters(clusters);
    pb.setNextPageToken(nextPageToken);
    pb.setPrevPageToken(prevPageToken);

    return pb;
  }

  static ListClusterCompliancesResponse fromPb(ListClusterCompliancesResponsePb pb) {
    ListClusterCompliancesResponse model = new ListClusterCompliancesResponse();
    model.setClusters(pb.getClusters());
    model.setNextPageToken(pb.getNextPageToken());
    model.setPrevPageToken(pb.getPrevPageToken());

    return model;
  }

  public static class ListClusterCompliancesResponseSerializer
      extends JsonSerializer<ListClusterCompliancesResponse> {
    @Override
    public void serialize(
        ListClusterCompliancesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListClusterCompliancesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListClusterCompliancesResponseDeserializer
      extends JsonDeserializer<ListClusterCompliancesResponse> {
    @Override
    public ListClusterCompliancesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListClusterCompliancesResponsePb pb =
          mapper.readValue(p, ListClusterCompliancesResponsePb.class);
      return ListClusterCompliancesResponse.fromPb(pb);
    }
  }
}
