// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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

/** Comment details. */
@Generated
@JsonSerialize(using = CommentObject.CommentObjectSerializer.class)
@JsonDeserialize(using = CommentObject.CommentObjectDeserializer.class)
public class CommentObject {
  /** Array of actions on the activity allowed for the current viewer. */
  private Collection<CommentActivityAction> availableActions;

  /** User-provided comment on the action. */
  private String comment;

  /** Creation time of the object, as a Unix timestamp in milliseconds. */
  private Long creationTimestamp;

  /** Comment ID */
  private String id;

  /** Time of the object at last update, as a Unix timestamp in milliseconds. */
  private Long lastUpdatedTimestamp;

  /** The username of the user that created the object. */
  private String userId;

  public CommentObject setAvailableActions(Collection<CommentActivityAction> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  public Collection<CommentActivityAction> getAvailableActions() {
    return availableActions;
  }

  public CommentObject setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CommentObject setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public CommentObject setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CommentObject setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public CommentObject setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentObject that = (CommentObject) o;
    return Objects.equals(availableActions, that.availableActions)
        && Objects.equals(comment, that.comment)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        availableActions, comment, creationTimestamp, id, lastUpdatedTimestamp, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(CommentObject.class)
        .add("availableActions", availableActions)
        .add("comment", comment)
        .add("creationTimestamp", creationTimestamp)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("userId", userId)
        .toString();
  }

  CommentObjectPb toPb() {
    CommentObjectPb pb = new CommentObjectPb();
    pb.setAvailableActions(availableActions);
    pb.setComment(comment);
    pb.setCreationTimestamp(creationTimestamp);
    pb.setId(id);
    pb.setLastUpdatedTimestamp(lastUpdatedTimestamp);
    pb.setUserId(userId);

    return pb;
  }

  static CommentObject fromPb(CommentObjectPb pb) {
    CommentObject model = new CommentObject();
    model.setAvailableActions(pb.getAvailableActions());
    model.setComment(pb.getComment());
    model.setCreationTimestamp(pb.getCreationTimestamp());
    model.setId(pb.getId());
    model.setLastUpdatedTimestamp(pb.getLastUpdatedTimestamp());
    model.setUserId(pb.getUserId());

    return model;
  }

  public static class CommentObjectSerializer extends JsonSerializer<CommentObject> {
    @Override
    public void serialize(CommentObject value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CommentObjectPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CommentObjectDeserializer extends JsonDeserializer<CommentObject> {
    @Override
    public CommentObject deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CommentObjectPb pb = mapper.readValue(p, CommentObjectPb.class);
      return CommentObject.fromPb(pb);
    }
  }
}
