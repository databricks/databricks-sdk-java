// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * represents an identity trying to access a resource - user or a service principal group can be a
 * principal of a permission set assignment but an actor is always a user or a service principal
 */
@Generated
class ActorPb {
  @JsonProperty("actor_id")
  @QueryParam("actor_id")
  private Long actorId;

  public ActorPb setActorId(Long actorId) {
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
    ActorPb that = (ActorPb) o;
    return Objects.equals(actorId, that.actorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorId);
  }

  @Override
  public String toString() {
    return new ToStringer(ActorPb.class).add("actorId", actorId).toString();
  }
}
