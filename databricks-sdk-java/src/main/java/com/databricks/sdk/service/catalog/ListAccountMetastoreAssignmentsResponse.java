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

/** The list of workspaces to which the given metastore is assigned. */
@Generated
@JsonSerialize(
    using =
        ListAccountMetastoreAssignmentsResponse.ListAccountMetastoreAssignmentsResponseSerializer
            .class)
@JsonDeserialize(
    using =
        ListAccountMetastoreAssignmentsResponse.ListAccountMetastoreAssignmentsResponseDeserializer
            .class)
public class ListAccountMetastoreAssignmentsResponse {
  /** */
  private Collection<Long> workspaceIds;

  public ListAccountMetastoreAssignmentsResponse setWorkspaceIds(Collection<Long> workspaceIds) {
    this.workspaceIds = workspaceIds;
    return this;
  }

  public Collection<Long> getWorkspaceIds() {
    return workspaceIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAccountMetastoreAssignmentsResponse that = (ListAccountMetastoreAssignmentsResponse) o;
    return Objects.equals(workspaceIds, that.workspaceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceIds);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAccountMetastoreAssignmentsResponse.class)
        .add("workspaceIds", workspaceIds)
        .toString();
  }

  ListAccountMetastoreAssignmentsResponsePb toPb() {
    ListAccountMetastoreAssignmentsResponsePb pb = new ListAccountMetastoreAssignmentsResponsePb();
    pb.setWorkspaceIds(workspaceIds);

    return pb;
  }

  static ListAccountMetastoreAssignmentsResponse fromPb(
      ListAccountMetastoreAssignmentsResponsePb pb) {
    ListAccountMetastoreAssignmentsResponse model = new ListAccountMetastoreAssignmentsResponse();
    model.setWorkspaceIds(pb.getWorkspaceIds());

    return model;
  }

  public static class ListAccountMetastoreAssignmentsResponseSerializer
      extends JsonSerializer<ListAccountMetastoreAssignmentsResponse> {
    @Override
    public void serialize(
        ListAccountMetastoreAssignmentsResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      ListAccountMetastoreAssignmentsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAccountMetastoreAssignmentsResponseDeserializer
      extends JsonDeserializer<ListAccountMetastoreAssignmentsResponse> {
    @Override
    public ListAccountMetastoreAssignmentsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAccountMetastoreAssignmentsResponsePb pb =
          mapper.readValue(p, ListAccountMetastoreAssignmentsResponsePb.class);
      return ListAccountMetastoreAssignmentsResponse.fromPb(pb);
    }
  }
}
