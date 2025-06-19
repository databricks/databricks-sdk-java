// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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

/**
 * represents an identity trying to access a resource - user or a service principal group can be a
 * principal of a permission set assignment but an actor is always a user or a service principal
 */
@Generated
@JsonSerialize(using = Actor.ActorSerializer.class)
@JsonDeserialize(using = Actor.ActorDeserializer.class)
public class Actor {
  /** */
  private Long actorId;

  public Actor setActorId(Long actorId) {
    this.actorId = actorId;
    return this;
  }

  public Long getActorId() {
    return actorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Actor that = (Actor) o;
    return Objects.equals(actorId, that.actorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorId);
  }

  @Override
  public String toString() {
    return new ToStringer(Actor.class).add("actorId", actorId).toString();
  }

  ActorPb toPb() {
    ActorPb pb = new ActorPb();
    pb.setActorId(actorId);

    return pb;
  }

  static Actor fromPb(ActorPb pb) {
    Actor model = new Actor();
    model.setActorId(pb.getActorId());

    return model;
  }

  public static class ActorSerializer extends JsonSerializer<Actor> {
    @Override
    public void serialize(Actor value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ActorPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ActorDeserializer extends JsonDeserializer<Actor> {
    @Override
    public Actor deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ActorPb pb = mapper.readValue(p, ActorPb.class);
      return Actor.fromPb(pb);
    }
  }
}
