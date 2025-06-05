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
@JsonSerialize(using = Command.CommandSerializer.class)
@JsonDeserialize(using = Command.CommandDeserializer.class)
public class Command {
  /** Running cluster id */
  private String clusterId;

  /** Executable code */
  private String command;

  /** Running context id */
  private String contextId;

  /** */
  private Language language;

  public Command setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public Command setCommand(String command) {
    this.command = command;
    return this;
  }

  public String getCommand() {
    return command;
  }

  public Command setContextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  public String getContextId() {
    return contextId;
  }

  public Command setLanguage(Language language) {
    this.language = language;
    return this;
  }

  public Language getLanguage() {
    return language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Command that = (Command) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(command, that.command)
        && Objects.equals(contextId, that.contextId)
        && Objects.equals(language, that.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, command, contextId, language);
  }

  @Override
  public String toString() {
    return new ToStringer(Command.class)
        .add("clusterId", clusterId)
        .add("command", command)
        .add("contextId", contextId)
        .add("language", language)
        .toString();
  }

  CommandPb toPb() {
    CommandPb pb = new CommandPb();
    pb.setClusterId(clusterId);
    pb.setCommand(command);
    pb.setContextId(contextId);
    pb.setLanguage(language);

    return pb;
  }

  static Command fromPb(CommandPb pb) {
    Command model = new Command();
    model.setClusterId(pb.getClusterId());
    model.setCommand(pb.getCommand());
    model.setContextId(pb.getContextId());
    model.setLanguage(pb.getLanguage());

    return model;
  }

  public static class CommandSerializer extends JsonSerializer<Command> {
    @Override
    public void serialize(Command value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CommandPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CommandDeserializer extends JsonDeserializer<Command> {
    @Override
    public Command deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CommandPb pb = mapper.readValue(p, CommandPb.class);
      return Command.fromPb(pb);
    }
  }
}
