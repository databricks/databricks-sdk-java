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
@JsonSerialize(using = CommandStatusResponse.CommandStatusResponseSerializer.class)
@JsonDeserialize(using = CommandStatusResponse.CommandStatusResponseDeserializer.class)
public class CommandStatusResponse {
  /** */
  private String id;

  /** */
  private Results results;

  /** */
  private CommandStatus status;

  public CommandStatusResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CommandStatusResponse setResults(Results results) {
    this.results = results;
    return this;
  }

  public Results getResults() {
    return results;
  }

  public CommandStatusResponse setStatus(CommandStatus status) {
    this.status = status;
    return this;
  }

  public CommandStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommandStatusResponse that = (CommandStatusResponse) o;
    return Objects.equals(id, that.id)
        && Objects.equals(results, that.results)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, results, status);
  }

  @Override
  public String toString() {
    return new ToStringer(CommandStatusResponse.class)
        .add("id", id)
        .add("results", results)
        .add("status", status)
        .toString();
  }

  CommandStatusResponsePb toPb() {
    CommandStatusResponsePb pb = new CommandStatusResponsePb();
    pb.setId(id);
    pb.setResults(results);
    pb.setStatus(status);

    return pb;
  }

  static CommandStatusResponse fromPb(CommandStatusResponsePb pb) {
    CommandStatusResponse model = new CommandStatusResponse();
    model.setId(pb.getId());
    model.setResults(pb.getResults());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class CommandStatusResponseSerializer
      extends JsonSerializer<CommandStatusResponse> {
    @Override
    public void serialize(
        CommandStatusResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CommandStatusResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CommandStatusResponseDeserializer
      extends JsonDeserializer<CommandStatusResponse> {
    @Override
    public CommandStatusResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CommandStatusResponsePb pb = mapper.readValue(p, CommandStatusResponsePb.class);
      return CommandStatusResponse.fromPb(pb);
    }
  }
}
