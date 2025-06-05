// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = EndpointInfo.EndpointInfoSerializer.class)
@JsonDeserialize(using = EndpointInfo.EndpointInfoDeserializer.class)
public class EndpointInfo {
  /** Timestamp of endpoint creation */
  private Long creationTimestamp;

  /** Creator of the endpoint */
  private String creator;

  /** The custom tags assigned to the endpoint */
  private Collection<CustomTag> customTags;

  /** The budget policy id applied to the endpoint */
  private String effectiveBudgetPolicyId;

  /** Current status of the endpoint */
  private EndpointStatus endpointStatus;

  /** Type of endpoint */
  private EndpointType endpointType;

  /** Unique identifier of the endpoint */
  private String id;

  /** Timestamp of last update to the endpoint */
  private Long lastUpdatedTimestamp;

  /** User who last updated the endpoint */
  private String lastUpdatedUser;

  /** Name of the vector search endpoint */
  private String name;

  /** Number of indexes on the endpoint */
  private Long numIndexes;

  public EndpointInfo setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public EndpointInfo setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public EndpointInfo setCustomTags(Collection<CustomTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<CustomTag> getCustomTags() {
    return customTags;
  }

  public EndpointInfo setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public EndpointInfo setEndpointStatus(EndpointStatus endpointStatus) {
    this.endpointStatus = endpointStatus;
    return this;
  }

  public EndpointStatus getEndpointStatus() {
    return endpointStatus;
  }

  public EndpointInfo setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  public EndpointType getEndpointType() {
    return endpointType;
  }

  public EndpointInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public EndpointInfo setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public EndpointInfo setLastUpdatedUser(String lastUpdatedUser) {
    this.lastUpdatedUser = lastUpdatedUser;
    return this;
  }

  public String getLastUpdatedUser() {
    return lastUpdatedUser;
  }

  public EndpointInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EndpointInfo setNumIndexes(Long numIndexes) {
    this.numIndexes = numIndexes;
    return this;
  }

  public Long getNumIndexes() {
    return numIndexes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointInfo that = (EndpointInfo) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(endpointStatus, that.endpointStatus)
        && Objects.equals(endpointType, that.endpointType)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(lastUpdatedUser, that.lastUpdatedUser)
        && Objects.equals(name, that.name)
        && Objects.equals(numIndexes, that.numIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        creator,
        customTags,
        effectiveBudgetPolicyId,
        endpointStatus,
        endpointType,
        id,
        lastUpdatedTimestamp,
        lastUpdatedUser,
        name,
        numIndexes);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointInfo.class)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("customTags", customTags)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("endpointStatus", endpointStatus)
        .add("endpointType", endpointType)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("lastUpdatedUser", lastUpdatedUser)
        .add("name", name)
        .add("numIndexes", numIndexes)
        .toString();
  }

  EndpointInfoPb toPb() {
    EndpointInfoPb pb = new EndpointInfoPb();
    pb.setCreationTimestamp(creationTimestamp);
    pb.setCreator(creator);
    pb.setCustomTags(customTags);
    pb.setEffectiveBudgetPolicyId(effectiveBudgetPolicyId);
    pb.setEndpointStatus(endpointStatus);
    pb.setEndpointType(endpointType);
    pb.setId(id);
    pb.setLastUpdatedTimestamp(lastUpdatedTimestamp);
    pb.setLastUpdatedUser(lastUpdatedUser);
    pb.setName(name);
    pb.setNumIndexes(numIndexes);

    return pb;
  }

  static EndpointInfo fromPb(EndpointInfoPb pb) {
    EndpointInfo model = new EndpointInfo();
    model.setCreationTimestamp(pb.getCreationTimestamp());
    model.setCreator(pb.getCreator());
    model.setCustomTags(pb.getCustomTags());
    model.setEffectiveBudgetPolicyId(pb.getEffectiveBudgetPolicyId());
    model.setEndpointStatus(pb.getEndpointStatus());
    model.setEndpointType(pb.getEndpointType());
    model.setId(pb.getId());
    model.setLastUpdatedTimestamp(pb.getLastUpdatedTimestamp());
    model.setLastUpdatedUser(pb.getLastUpdatedUser());
    model.setName(pb.getName());
    model.setNumIndexes(pb.getNumIndexes());

    return model;
  }

  public static class EndpointInfoSerializer extends JsonSerializer<EndpointInfo> {
    @Override
    public void serialize(EndpointInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EndpointInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EndpointInfoDeserializer extends JsonDeserializer<EndpointInfo> {
    @Override
    public EndpointInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EndpointInfoPb pb = mapper.readValue(p, EndpointInfoPb.class);
      return EndpointInfo.fromPb(pb);
    }
  }
}
