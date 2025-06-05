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
@JsonSerialize(using = ListClustersFilterBy.ListClustersFilterBySerializer.class)
@JsonDeserialize(using = ListClustersFilterBy.ListClustersFilterByDeserializer.class)
public class ListClustersFilterBy {
  /** The source of cluster creation. */
  private Collection<ClusterSource> clusterSources;

  /** The current state of the clusters. */
  private Collection<State> clusterStates;

  /** Whether the clusters are pinned or not. */
  private Boolean isPinned;

  /** The ID of the cluster policy used to create the cluster if applicable. */
  private String policyId;

  public ListClustersFilterBy setClusterSources(Collection<ClusterSource> clusterSources) {
    this.clusterSources = clusterSources;
    return this;
  }

  public Collection<ClusterSource> getClusterSources() {
    return clusterSources;
  }

  public ListClustersFilterBy setClusterStates(Collection<State> clusterStates) {
    this.clusterStates = clusterStates;
    return this;
  }

  public Collection<State> getClusterStates() {
    return clusterStates;
  }

  public ListClustersFilterBy setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  public Boolean getIsPinned() {
    return isPinned;
  }

  public ListClustersFilterBy setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersFilterBy that = (ListClustersFilterBy) o;
    return Objects.equals(clusterSources, that.clusterSources)
        && Objects.equals(clusterStates, that.clusterStates)
        && Objects.equals(isPinned, that.isPinned)
        && Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterSources, clusterStates, isPinned, policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClustersFilterBy.class)
        .add("clusterSources", clusterSources)
        .add("clusterStates", clusterStates)
        .add("isPinned", isPinned)
        .add("policyId", policyId)
        .toString();
  }

  ListClustersFilterByPb toPb() {
    ListClustersFilterByPb pb = new ListClustersFilterByPb();
    pb.setClusterSources(clusterSources);
    pb.setClusterStates(clusterStates);
    pb.setIsPinned(isPinned);
    pb.setPolicyId(policyId);

    return pb;
  }

  static ListClustersFilterBy fromPb(ListClustersFilterByPb pb) {
    ListClustersFilterBy model = new ListClustersFilterBy();
    model.setClusterSources(pb.getClusterSources());
    model.setClusterStates(pb.getClusterStates());
    model.setIsPinned(pb.getIsPinned());
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class ListClustersFilterBySerializer extends JsonSerializer<ListClustersFilterBy> {
    @Override
    public void serialize(
        ListClustersFilterBy value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListClustersFilterByPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListClustersFilterByDeserializer
      extends JsonDeserializer<ListClustersFilterBy> {
    @Override
    public ListClustersFilterBy deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListClustersFilterByPb pb = mapper.readValue(p, ListClustersFilterByPb.class);
      return ListClustersFilterBy.fromPb(pb);
    }
  }
}
