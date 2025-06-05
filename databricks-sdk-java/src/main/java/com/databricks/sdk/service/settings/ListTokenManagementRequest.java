// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
import java.util.Objects;

/** List all tokens */
@Generated
@JsonSerialize(using = ListTokenManagementRequest.ListTokenManagementRequestSerializer.class)
@JsonDeserialize(using = ListTokenManagementRequest.ListTokenManagementRequestDeserializer.class)
public class ListTokenManagementRequest {
  /** User ID of the user that created the token. */
  private Long createdById;

  /** Username of the user that created the token. */
  private String createdByUsername;

  public ListTokenManagementRequest setCreatedById(Long createdById) {
    this.createdById = createdById;
    return this;
  }

  public Long getCreatedById() {
    return createdById;
  }

  public ListTokenManagementRequest setCreatedByUsername(String createdByUsername) {
    this.createdByUsername = createdByUsername;
    return this;
  }

  public String getCreatedByUsername() {
    return createdByUsername;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTokenManagementRequest that = (ListTokenManagementRequest) o;
    return Objects.equals(createdById, that.createdById)
        && Objects.equals(createdByUsername, that.createdByUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdById, createdByUsername);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTokenManagementRequest.class)
        .add("createdById", createdById)
        .add("createdByUsername", createdByUsername)
        .toString();
  }

  ListTokenManagementRequestPb toPb() {
    ListTokenManagementRequestPb pb = new ListTokenManagementRequestPb();
    pb.setCreatedById(createdById);
    pb.setCreatedByUsername(createdByUsername);

    return pb;
  }

  static ListTokenManagementRequest fromPb(ListTokenManagementRequestPb pb) {
    ListTokenManagementRequest model = new ListTokenManagementRequest();
    model.setCreatedById(pb.getCreatedById());
    model.setCreatedByUsername(pb.getCreatedByUsername());

    return model;
  }

  public static class ListTokenManagementRequestSerializer
      extends JsonSerializer<ListTokenManagementRequest> {
    @Override
    public void serialize(
        ListTokenManagementRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListTokenManagementRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListTokenManagementRequestDeserializer
      extends JsonDeserializer<ListTokenManagementRequest> {
    @Override
    public ListTokenManagementRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListTokenManagementRequestPb pb = mapper.readValue(p, ListTokenManagementRequestPb.class);
      return ListTokenManagementRequest.fromPb(pb);
    }
  }
}
