// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

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
@JsonSerialize(using = Move.MoveSerializer.class)
@JsonDeserialize(using = Move.MoveDeserializer.class)
public class Move {
  /** The destination path of the file or directory. The path should be the absolute DBFS path. */
  private String destinationPath;

  /** The source path of the file or directory. The path should be the absolute DBFS path. */
  private String sourcePath;

  public Move setDestinationPath(String destinationPath) {
    this.destinationPath = destinationPath;
    return this;
  }

  public String getDestinationPath() {
    return destinationPath;
  }

  public Move setSourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

  public String getSourcePath() {
    return sourcePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Move that = (Move) o;
    return Objects.equals(destinationPath, that.destinationPath)
        && Objects.equals(sourcePath, that.sourcePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationPath, sourcePath);
  }

  @Override
  public String toString() {
    return new ToStringer(Move.class)
        .add("destinationPath", destinationPath)
        .add("sourcePath", sourcePath)
        .toString();
  }

  MovePb toPb() {
    MovePb pb = new MovePb();
    pb.setDestinationPath(destinationPath);
    pb.setSourcePath(sourcePath);

    return pb;
  }

  static Move fromPb(MovePb pb) {
    Move model = new Move();
    model.setDestinationPath(pb.getDestinationPath());
    model.setSourcePath(pb.getSourcePath());

    return model;
  }

  public static class MoveSerializer extends JsonSerializer<Move> {
    @Override
    public void serialize(Move value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MovePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MoveDeserializer extends JsonDeserializer<Move> {
    @Override
    public Move deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MovePb pb = mapper.readValue(p, MovePb.class);
      return Move.fromPb(pb);
    }
  }
}
