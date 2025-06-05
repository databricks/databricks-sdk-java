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
    using =
        ListAllClusterLibraryStatusesResponse.ListAllClusterLibraryStatusesResponseSerializer.class)
@JsonDeserialize(
    using =
        ListAllClusterLibraryStatusesResponse.ListAllClusterLibraryStatusesResponseDeserializer
            .class)
public class ListAllClusterLibraryStatusesResponse {
  /** A list of cluster statuses. */
  private Collection<ClusterLibraryStatuses> statuses;

  public ListAllClusterLibraryStatusesResponse setStatuses(
      Collection<ClusterLibraryStatuses> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Collection<ClusterLibraryStatuses> getStatuses() {
    return statuses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAllClusterLibraryStatusesResponse that = (ListAllClusterLibraryStatusesResponse) o;
    return Objects.equals(statuses, that.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAllClusterLibraryStatusesResponse.class)
        .add("statuses", statuses)
        .toString();
  }

  ListAllClusterLibraryStatusesResponsePb toPb() {
    ListAllClusterLibraryStatusesResponsePb pb = new ListAllClusterLibraryStatusesResponsePb();
    pb.setStatuses(statuses);

    return pb;
  }

  static ListAllClusterLibraryStatusesResponse fromPb(ListAllClusterLibraryStatusesResponsePb pb) {
    ListAllClusterLibraryStatusesResponse model = new ListAllClusterLibraryStatusesResponse();
    model.setStatuses(pb.getStatuses());

    return model;
  }

  public static class ListAllClusterLibraryStatusesResponseSerializer
      extends JsonSerializer<ListAllClusterLibraryStatusesResponse> {
    @Override
    public void serialize(
        ListAllClusterLibraryStatusesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAllClusterLibraryStatusesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAllClusterLibraryStatusesResponseDeserializer
      extends JsonDeserializer<ListAllClusterLibraryStatusesResponse> {
    @Override
    public ListAllClusterLibraryStatusesResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAllClusterLibraryStatusesResponsePb pb =
          mapper.readValue(p, ListAllClusterLibraryStatusesResponsePb.class);
      return ListAllClusterLibraryStatusesResponse.fromPb(pb);
    }
  }
}
