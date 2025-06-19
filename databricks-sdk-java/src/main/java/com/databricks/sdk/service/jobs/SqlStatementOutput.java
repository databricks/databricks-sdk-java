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
@JsonSerialize(using = SqlStatementOutput.SqlStatementOutputSerializer.class)
@JsonDeserialize(using = SqlStatementOutput.SqlStatementOutputDeserializer.class)
public class SqlStatementOutput {
  /** A key that can be used to look up query details. */
  private String lookupKey;

  public SqlStatementOutput setLookupKey(String lookupKey) {
    this.lookupKey = lookupKey;
    return this;
  }

  public String getLookupKey() {
    return lookupKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlStatementOutput that = (SqlStatementOutput) o;
    return Objects.equals(lookupKey, that.lookupKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookupKey);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlStatementOutput.class).add("lookupKey", lookupKey).toString();
  }

  SqlStatementOutputPb toPb() {
    SqlStatementOutputPb pb = new SqlStatementOutputPb();
    pb.setLookupKey(lookupKey);

    return pb;
  }

  static SqlStatementOutput fromPb(SqlStatementOutputPb pb) {
    SqlStatementOutput model = new SqlStatementOutput();
    model.setLookupKey(pb.getLookupKey());

    return model;
  }

  public static class SqlStatementOutputSerializer extends JsonSerializer<SqlStatementOutput> {
    @Override
    public void serialize(SqlStatementOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlStatementOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlStatementOutputDeserializer extends JsonDeserializer<SqlStatementOutput> {
    @Override
    public SqlStatementOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlStatementOutputPb pb = mapper.readValue(p, SqlStatementOutputPb.class);
      return SqlStatementOutput.fromPb(pb);
    }
  }
}
