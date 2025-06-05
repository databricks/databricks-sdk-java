// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** Get command info */
@Generated
@JsonSerialize(using = CommandStatusRequest.CommandStatusRequestSerializer.class)
@JsonDeserialize(using = CommandStatusRequest.CommandStatusRequestDeserializer.class)
public class CommandStatusRequest {
  /** */
  private String clusterId;

  /** */
  private String commandId;

  /** */
  private String contextId;

  public CommandStatusRequest setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public CommandStatusRequest setCommandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

  public String getCommandId() {
    return commandId;
  }

  public CommandStatusRequest setContextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  public String getContextId() {
    return contextId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommandStatusRequest that = (CommandStatusRequest) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(commandId, that.commandId)
        && Objects.equals(contextId, that.contextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, commandId, contextId);
  }

  @Override
  public String toString() {
    return new ToStringer(CommandStatusRequest.class)
        .add("clusterId", clusterId)
        .add("commandId", commandId)
        .add("contextId", contextId)
        .toString();
  }

  CommandStatusRequestPb toPb() {
    CommandStatusRequestPb pb = new CommandStatusRequestPb();
    pb.setClusterId(clusterId);
    pb.setCommandId(commandId);
    pb.setContextId(contextId);

    return pb;
  }

  static CommandStatusRequest fromPb(CommandStatusRequestPb pb) {
    CommandStatusRequest model = new CommandStatusRequest();
    model.setClusterId(pb.getClusterId());
    model.setCommandId(pb.getCommandId());
    model.setContextId(pb.getContextId());

    return model;
  }

  public static class CommandStatusRequestSerializer extends JsonSerializer<CommandStatusRequest> {
    @Override
    public void serialize(
        CommandStatusRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CommandStatusRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CommandStatusRequestDeserializer
      extends JsonDeserializer<CommandStatusRequest> {
    @Override
    public CommandStatusRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CommandStatusRequestPb pb = mapper.readValue(p, CommandStatusRequestPb.class);
      return CommandStatusRequest.fromPb(pb);
    }
  }
}
