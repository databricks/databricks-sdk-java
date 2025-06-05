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
@JsonSerialize(using = ListDatabaseInstancesResponse.ListDatabaseInstancesResponseSerializer.class)
@JsonDeserialize(
    using = ListDatabaseInstancesResponse.ListDatabaseInstancesResponseDeserializer.class)
public class ListDatabaseInstancesResponse {
  /** List of instances. */
  private Collection<DatabaseInstance> databaseInstances;

  /** Pagination token to request the next page of instances. */
  private String nextPageToken;

  public ListDatabaseInstancesResponse setDatabaseInstances(
      Collection<DatabaseInstance> databaseInstances) {
    this.databaseInstances = databaseInstances;
    return this;
  }

  public Collection<DatabaseInstance> getDatabaseInstances() {
    return databaseInstances;
  }

  public ListDatabaseInstancesResponse setNextPageToken(String nextPageToken) {
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
    ListDatabaseInstancesResponse that = (ListDatabaseInstancesResponse) o;
    return Objects.equals(databaseInstances, that.databaseInstances)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstances, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseInstancesResponse.class)
        .add("databaseInstances", databaseInstances)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListDatabaseInstancesResponsePb toPb() {
    ListDatabaseInstancesResponsePb pb = new ListDatabaseInstancesResponsePb();
    pb.setDatabaseInstances(databaseInstances);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListDatabaseInstancesResponse fromPb(ListDatabaseInstancesResponsePb pb) {
    ListDatabaseInstancesResponse model = new ListDatabaseInstancesResponse();
    model.setDatabaseInstances(pb.getDatabaseInstances());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListDatabaseInstancesResponseSerializer
      extends JsonSerializer<ListDatabaseInstancesResponse> {
    @Override
    public void serialize(
        ListDatabaseInstancesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListDatabaseInstancesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListDatabaseInstancesResponseDeserializer
      extends JsonDeserializer<ListDatabaseInstancesResponse> {
    @Override
    public ListDatabaseInstancesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListDatabaseInstancesResponsePb pb =
          mapper.readValue(p, ListDatabaseInstancesResponsePb.class);
      return ListDatabaseInstancesResponse.fromPb(pb);
    }
  }
}
