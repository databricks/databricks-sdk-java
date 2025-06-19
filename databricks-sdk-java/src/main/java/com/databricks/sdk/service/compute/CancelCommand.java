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

@Generated
@JsonSerialize(using = CancelCommand.CancelCommandSerializer.class)
@JsonDeserialize(using = CancelCommand.CancelCommandDeserializer.class)
public class CancelCommand {
  /** */
  private String clusterId;

  /** */
  private String commandId;

  /** */
  private String contextId;

  public CancelCommand setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public CancelCommand setCommandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

  public String getCommandId() {
    return commandId;
  }

  public CancelCommand setContextId(String contextId) {
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
    CancelCommand that = (CancelCommand) o;
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
    return new ToStringer(CancelCommand.class)
        .add("clusterId", clusterId)
        .add("commandId", commandId)
        .add("contextId", contextId)
        .toString();
  }

  CancelCommandPb toPb() {
    CancelCommandPb pb = new CancelCommandPb();
    pb.setClusterId(clusterId);
    pb.setCommandId(commandId);
    pb.setContextId(contextId);

    return pb;
  }

  static CancelCommand fromPb(CancelCommandPb pb) {
    CancelCommand model = new CancelCommand();
    model.setClusterId(pb.getClusterId());
    model.setCommandId(pb.getCommandId());
    model.setContextId(pb.getContextId());

    return model;
  }

  public static class CancelCommandSerializer extends JsonSerializer<CancelCommand> {
    @Override
    public void serialize(CancelCommand value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelCommandPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelCommandDeserializer extends JsonDeserializer<CancelCommand> {
    @Override
    public CancelCommand deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelCommandPb pb = mapper.readValue(p, CancelCommandPb.class);
      return CancelCommand.fromPb(pb);
    }
  }
}
