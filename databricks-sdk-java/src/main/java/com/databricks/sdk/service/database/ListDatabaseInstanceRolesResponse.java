// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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
    using = ListDatabaseInstanceRolesResponse.ListDatabaseInstanceRolesResponseSerializer.class)
@JsonDeserialize(
    using = ListDatabaseInstanceRolesResponse.ListDatabaseInstanceRolesResponseDeserializer.class)
public class ListDatabaseInstanceRolesResponse {
  /** List of database instance roles. */
  private Collection<DatabaseInstanceRole> databaseInstanceRoles;

  /** Pagination token to request the next page of instances. */
  private String nextPageToken;

  public ListDatabaseInstanceRolesResponse setDatabaseInstanceRoles(
      Collection<DatabaseInstanceRole> databaseInstanceRoles) {
    this.databaseInstanceRoles = databaseInstanceRoles;
    return this;
  }

  public Collection<DatabaseInstanceRole> getDatabaseInstanceRoles() {
    return databaseInstanceRoles;
  }

  public ListDatabaseInstanceRolesResponse setNextPageToken(String nextPageToken) {
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
    ListDatabaseInstanceRolesResponse that = (ListDatabaseInstanceRolesResponse) o;
    return Objects.equals(databaseInstanceRoles, that.databaseInstanceRoles)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstanceRoles, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseInstanceRolesResponse.class)
        .add("databaseInstanceRoles", databaseInstanceRoles)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListDatabaseInstanceRolesResponsePb toPb() {
    ListDatabaseInstanceRolesResponsePb pb = new ListDatabaseInstanceRolesResponsePb();
    pb.setDatabaseInstanceRoles(databaseInstanceRoles);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListDatabaseInstanceRolesResponse fromPb(ListDatabaseInstanceRolesResponsePb pb) {
    ListDatabaseInstanceRolesResponse model = new ListDatabaseInstanceRolesResponse();
    model.setDatabaseInstanceRoles(pb.getDatabaseInstanceRoles());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListDatabaseInstanceRolesResponseSerializer
      extends JsonSerializer<ListDatabaseInstanceRolesResponse> {
    @Override
    public void serialize(
        ListDatabaseInstanceRolesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListDatabaseInstanceRolesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListDatabaseInstanceRolesResponseDeserializer
      extends JsonDeserializer<ListDatabaseInstanceRolesResponse> {
    @Override
    public ListDatabaseInstanceRolesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListDatabaseInstanceRolesResponsePb pb =
          mapper.readValue(p, ListDatabaseInstanceRolesResponsePb.class);
      return ListDatabaseInstanceRolesResponse.fromPb(pb);
    }
  }
}
