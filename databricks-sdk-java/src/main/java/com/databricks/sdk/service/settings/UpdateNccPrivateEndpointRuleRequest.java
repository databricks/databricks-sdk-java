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

/** Update a private endpoint rule */
@Generated
@JsonSerialize(
    using = UpdateNccPrivateEndpointRuleRequest.UpdateNccPrivateEndpointRuleRequestSerializer.class)
@JsonDeserialize(
    using =
        UpdateNccPrivateEndpointRuleRequest.UpdateNccPrivateEndpointRuleRequestDeserializer.class)
public class UpdateNccPrivateEndpointRuleRequest {
  /**
   * The ID of a network connectivity configuration, which is the parent resource of this private
   * endpoint rule object.
   */
  private String networkConnectivityConfigId;

  /**
   * Properties of the new private endpoint rule. Note that you must approve the endpoint in Azure
   * portal after initialization.
   */
  private UpdatePrivateEndpointRule privateEndpointRule;

  /** Your private endpoint rule ID. */
  private String privateEndpointRuleId;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   */
  private String updateMask;

  public UpdateNccPrivateEndpointRuleRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public UpdateNccPrivateEndpointRuleRequest setPrivateEndpointRule(
      UpdatePrivateEndpointRule privateEndpointRule) {
    this.privateEndpointRule = privateEndpointRule;
    return this;
  }

  public UpdatePrivateEndpointRule getPrivateEndpointRule() {
    return privateEndpointRule;
  }

  public UpdateNccPrivateEndpointRuleRequest setPrivateEndpointRuleId(
      String privateEndpointRuleId) {
    this.privateEndpointRuleId = privateEndpointRuleId;
    return this;
  }

  public String getPrivateEndpointRuleId() {
    return privateEndpointRuleId;
  }

  public UpdateNccPrivateEndpointRuleRequest setUpdateMask(String updateMask) {
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
    UpdateNccPrivateEndpointRuleRequest that = (UpdateNccPrivateEndpointRuleRequest) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(privateEndpointRule, that.privateEndpointRule)
        && Objects.equals(privateEndpointRuleId, that.privateEndpointRuleId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        networkConnectivityConfigId, privateEndpointRule, privateEndpointRuleId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateNccPrivateEndpointRuleRequest.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("privateEndpointRule", privateEndpointRule)
        .add("privateEndpointRuleId", privateEndpointRuleId)
        .add("updateMask", updateMask)
        .toString();
  }

  UpdateNccPrivateEndpointRuleRequestPb toPb() {
    UpdateNccPrivateEndpointRuleRequestPb pb = new UpdateNccPrivateEndpointRuleRequestPb();
    pb.setNetworkConnectivityConfigId(networkConnectivityConfigId);
    pb.setPrivateEndpointRule(privateEndpointRule);
    pb.setPrivateEndpointRuleId(privateEndpointRuleId);
    pb.setUpdateMask(updateMask);

    return pb;
  }

  static UpdateNccPrivateEndpointRuleRequest fromPb(UpdateNccPrivateEndpointRuleRequestPb pb) {
    UpdateNccPrivateEndpointRuleRequest model = new UpdateNccPrivateEndpointRuleRequest();
    model.setNetworkConnectivityConfigId(pb.getNetworkConnectivityConfigId());
    model.setPrivateEndpointRule(pb.getPrivateEndpointRule());
    model.setPrivateEndpointRuleId(pb.getPrivateEndpointRuleId());
    model.setUpdateMask(pb.getUpdateMask());

    return model;
  }

  public static class UpdateNccPrivateEndpointRuleRequestSerializer
      extends JsonSerializer<UpdateNccPrivateEndpointRuleRequest> {
    @Override
    public void serialize(
        UpdateNccPrivateEndpointRuleRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateNccPrivateEndpointRuleRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateNccPrivateEndpointRuleRequestDeserializer
      extends JsonDeserializer<UpdateNccPrivateEndpointRuleRequest> {
    @Override
    public UpdateNccPrivateEndpointRuleRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateNccPrivateEndpointRuleRequestPb pb =
          mapper.readValue(p, UpdateNccPrivateEndpointRuleRequestPb.class);
      return UpdateNccPrivateEndpointRuleRequest.fromPb(pb);
    }
  }
}
