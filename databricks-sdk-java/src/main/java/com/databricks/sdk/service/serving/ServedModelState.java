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
@JsonSerialize(using = ServedModelState.ServedModelStateSerializer.class)
@JsonDeserialize(using = ServedModelState.ServedModelStateDeserializer.class)
public class ServedModelState {
  /** */
  private ServedModelStateDeployment deployment;

  /** */
  private String deploymentStateMessage;

  public ServedModelState setDeployment(ServedModelStateDeployment deployment) {
    this.deployment = deployment;
    return this;
  }

  public ServedModelStateDeployment getDeployment() {
    return deployment;
  }

  public ServedModelState setDeploymentStateMessage(String deploymentStateMessage) {
    this.deploymentStateMessage = deploymentStateMessage;
    return this;
  }

  public String getDeploymentStateMessage() {
    return deploymentStateMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServedModelState that = (ServedModelState) o;
    return Objects.equals(deployment, that.deployment)
        && Objects.equals(deploymentStateMessage, that.deploymentStateMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployment, deploymentStateMessage);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedModelState.class)
        .add("deployment", deployment)
        .add("deploymentStateMessage", deploymentStateMessage)
        .toString();
  }

  ServedModelStatePb toPb() {
    ServedModelStatePb pb = new ServedModelStatePb();
    pb.setDeployment(deployment);
    pb.setDeploymentStateMessage(deploymentStateMessage);

    return pb;
  }

  static ServedModelState fromPb(ServedModelStatePb pb) {
    ServedModelState model = new ServedModelState();
    model.setDeployment(pb.getDeployment());
    model.setDeploymentStateMessage(pb.getDeploymentStateMessage());

    return model;
  }

  public static class ServedModelStateSerializer extends JsonSerializer<ServedModelState> {
    @Override
    public void serialize(ServedModelState value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServedModelStatePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServedModelStateDeserializer extends JsonDeserializer<ServedModelState> {
    @Override
    public ServedModelState deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServedModelStatePb pb = mapper.readValue(p, ServedModelStatePb.class);
      return ServedModelState.fromPb(pb);
    }
  }
}
