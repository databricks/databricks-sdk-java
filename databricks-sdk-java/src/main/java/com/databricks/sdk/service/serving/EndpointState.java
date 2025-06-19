// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = EndpointState.EndpointStateSerializer.class)
@JsonDeserialize(using = EndpointState.EndpointStateDeserializer.class)
public class EndpointState {
  /**
   * The state of an endpoint's config update. This informs the user if the pending_config is in
   * progress, if the update failed, or if there is no update in progress. Note that if the
   * endpoint's config_update state value is IN_PROGRESS, another update can not be made until the
   * update completes or fails.
   */
  private EndpointStateConfigUpdate configUpdate;

  /**
   * The state of an endpoint, indicating whether or not the endpoint is queryable. An endpoint is
   * READY if all of the served entities in its active configuration are ready. If any of the
   * actively served entities are in a non-ready state, the endpoint state will be NOT_READY.
   */
  private EndpointStateReady ready;

  public EndpointState setConfigUpdate(EndpointStateConfigUpdate configUpdate) {
    this.configUpdate = configUpdate;
    return this;
  }

  public EndpointStateConfigUpdate getConfigUpdate() {
    return configUpdate;
  }

  public EndpointState setReady(EndpointStateReady ready) {
    this.ready = ready;
    return this;
  }

  public EndpointStateReady getReady() {
    return ready;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointState that = (EndpointState) o;
    return Objects.equals(configUpdate, that.configUpdate) && Objects.equals(ready, that.ready);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configUpdate, ready);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointState.class)
        .add("configUpdate", configUpdate)
        .add("ready", ready)
        .toString();
  }

  EndpointStatePb toPb() {
    EndpointStatePb pb = new EndpointStatePb();
    pb.setConfigUpdate(configUpdate);
    pb.setReady(ready);

    return pb;
  }

  static EndpointState fromPb(EndpointStatePb pb) {
    EndpointState model = new EndpointState();
    model.setConfigUpdate(pb.getConfigUpdate());
    model.setReady(pb.getReady());

    return model;
  }

  public static class EndpointStateSerializer extends JsonSerializer<EndpointState> {
    @Override
    public void serialize(EndpointState value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EndpointStatePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EndpointStateDeserializer extends JsonDeserializer<EndpointState> {
    @Override
    public EndpointState deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EndpointStatePb pb = mapper.readValue(p, EndpointStatePb.class);
      return EndpointState.fromPb(pb);
    }
  }
}
