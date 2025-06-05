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
@JsonSerialize(using = ClusterLibraryStatuses.ClusterLibraryStatusesSerializer.class)
@JsonDeserialize(using = ClusterLibraryStatuses.ClusterLibraryStatusesDeserializer.class)
public class ClusterLibraryStatuses {
  /** Unique identifier for the cluster. */
  private String clusterId;

  /** Status of all libraries on the cluster. */
  private Collection<LibraryFullStatus> libraryStatuses;

  public ClusterLibraryStatuses setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterLibraryStatuses setLibraryStatuses(Collection<LibraryFullStatus> libraryStatuses) {
    this.libraryStatuses = libraryStatuses;
    return this;
  }

  public Collection<LibraryFullStatus> getLibraryStatuses() {
    return libraryStatuses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterLibraryStatuses that = (ClusterLibraryStatuses) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(libraryStatuses, that.libraryStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, libraryStatuses);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterLibraryStatuses.class)
        .add("clusterId", clusterId)
        .add("libraryStatuses", libraryStatuses)
        .toString();
  }

  ClusterLibraryStatusesPb toPb() {
    ClusterLibraryStatusesPb pb = new ClusterLibraryStatusesPb();
    pb.setClusterId(clusterId);
    pb.setLibraryStatuses(libraryStatuses);

    return pb;
  }

  static ClusterLibraryStatuses fromPb(ClusterLibraryStatusesPb pb) {
    ClusterLibraryStatuses model = new ClusterLibraryStatuses();
    model.setClusterId(pb.getClusterId());
    model.setLibraryStatuses(pb.getLibraryStatuses());

    return model;
  }

  public static class ClusterLibraryStatusesSerializer
      extends JsonSerializer<ClusterLibraryStatuses> {
    @Override
    public void serialize(
        ClusterLibraryStatuses value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterLibraryStatusesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterLibraryStatusesDeserializer
      extends JsonDeserializer<ClusterLibraryStatuses> {
    @Override
    public ClusterLibraryStatuses deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterLibraryStatusesPb pb = mapper.readValue(p, ClusterLibraryStatusesPb.class);
      return ClusterLibraryStatuses.fromPb(pb);
    }
  }
}
