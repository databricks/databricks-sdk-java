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
@JsonSerialize(using = SqlTaskQuery.SqlTaskQuerySerializer.class)
@JsonDeserialize(using = SqlTaskQuery.SqlTaskQueryDeserializer.class)
public class SqlTaskQuery {
  /** The canonical identifier of the SQL query. */
  private String queryId;

  public SqlTaskQuery setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskQuery that = (SqlTaskQuery) o;
    return Objects.equals(queryId, that.queryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskQuery.class).add("queryId", queryId).toString();
  }

  SqlTaskQueryPb toPb() {
    SqlTaskQueryPb pb = new SqlTaskQueryPb();
    pb.setQueryId(queryId);

    return pb;
  }

  static SqlTaskQuery fromPb(SqlTaskQueryPb pb) {
    SqlTaskQuery model = new SqlTaskQuery();
    model.setQueryId(pb.getQueryId());

    return model;
  }

  public static class SqlTaskQuerySerializer extends JsonSerializer<SqlTaskQuery> {
    @Override
    public void serialize(SqlTaskQuery value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlTaskQueryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlTaskQueryDeserializer extends JsonDeserializer<SqlTaskQuery> {
    @Override
    public SqlTaskQuery deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlTaskQueryPb pb = mapper.readValue(p, SqlTaskQueryPb.class);
      return SqlTaskQuery.fromPb(pb);
    }
  }
}
