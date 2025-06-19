// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

@Generated
@JsonSerialize(using = UpdateQueryRequest.UpdateQueryRequestSerializer.class)
@JsonDeserialize(using = UpdateQueryRequest.UpdateQueryRequestDeserializer.class)
public class UpdateQueryRequest {
  /**
   * If true, automatically resolve alert display name conflicts. Otherwise, fail the request if the
   * alert's display name conflicts with an existing alert's display name.
   */
  private Boolean autoResolveDisplayName;

  /** */
  private String id;

  /** */
  private UpdateQueryRequestQuery query;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  private String updateMask;

  public UpdateQueryRequest setAutoResolveDisplayName(Boolean autoResolveDisplayName) {
    this.autoResolveDisplayName = autoResolveDisplayName;
    return this;
  }

  public Boolean getAutoResolveDisplayName() {
    return autoResolveDisplayName;
  }

  public UpdateQueryRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateQueryRequest setQuery(UpdateQueryRequestQuery query) {
    this.query = query;
    return this;
  }

  public UpdateQueryRequestQuery getQuery() {
    return query;
  }

  public UpdateQueryRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateQueryRequest that = (UpdateQueryRequest) o;
    return Objects.equals(autoResolveDisplayName, that.autoResolveDisplayName)
        && Objects.equals(id, that.id)
        && Objects.equals(query, that.query)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoResolveDisplayName, id, query, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateQueryRequest.class)
        .add("autoResolveDisplayName", autoResolveDisplayName)
        .add("id", id)
        .add("query", query)
        .add("updateMask", updateMask)
        .toString();
  }

  UpdateQueryRequestPb toPb() {
    UpdateQueryRequestPb pb = new UpdateQueryRequestPb();
    pb.setAutoResolveDisplayName(autoResolveDisplayName);
    pb.setId(id);
    pb.setQuery(query);
    pb.setUpdateMask(updateMask);

    return pb;
  }

  static UpdateQueryRequest fromPb(UpdateQueryRequestPb pb) {
    UpdateQueryRequest model = new UpdateQueryRequest();
    model.setAutoResolveDisplayName(pb.getAutoResolveDisplayName());
    model.setId(pb.getId());
    model.setQuery(pb.getQuery());
    model.setUpdateMask(pb.getUpdateMask());

    return model;
  }

  public static class UpdateQueryRequestSerializer extends JsonSerializer<UpdateQueryRequest> {
    @Override
    public void serialize(UpdateQueryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateQueryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateQueryRequestDeserializer extends JsonDeserializer<UpdateQueryRequest> {
    @Override
    public UpdateQueryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateQueryRequestPb pb = mapper.readValue(p, UpdateQueryRequestPb.class);
      return UpdateQueryRequest.fromPb(pb);
    }
  }
}
