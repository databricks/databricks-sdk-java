// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = SqlOutputError.SqlOutputErrorSerializer.class)
@JsonDeserialize(using = SqlOutputError.SqlOutputErrorDeserializer.class)
public class SqlOutputError {
  /** The error message when execution fails. */
  private String message;

  public SqlOutputError setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlOutputError that = (SqlOutputError) o;
    return Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlOutputError.class).add("message", message).toString();
  }

  SqlOutputErrorPb toPb() {
    SqlOutputErrorPb pb = new SqlOutputErrorPb();
    pb.setMessage(message);

    return pb;
  }

  static SqlOutputError fromPb(SqlOutputErrorPb pb) {
    SqlOutputError model = new SqlOutputError();
    model.setMessage(pb.getMessage());

    return model;
  }

  public static class SqlOutputErrorSerializer extends JsonSerializer<SqlOutputError> {
    @Override
    public void serialize(SqlOutputError value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlOutputErrorPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlOutputErrorDeserializer extends JsonDeserializer<SqlOutputError> {
    @Override
    public SqlOutputError deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlOutputErrorPb pb = mapper.readValue(p, SqlOutputErrorPb.class);
      return SqlOutputError.fromPb(pb);
    }
  }
}
