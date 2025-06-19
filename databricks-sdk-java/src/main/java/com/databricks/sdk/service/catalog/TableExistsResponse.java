// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = TableExistsResponse.TableExistsResponseSerializer.class)
@JsonDeserialize(using = TableExistsResponse.TableExistsResponseDeserializer.class)
public class TableExistsResponse {
  /** Whether the table exists or not. */
  private Boolean tableExists;

  public TableExistsResponse setTableExists(Boolean tableExists) {
    this.tableExists = tableExists;
    return this;
  }

  public Boolean getTableExists() {
    return tableExists;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableExistsResponse that = (TableExistsResponse) o;
    return Objects.equals(tableExists, that.tableExists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableExists);
  }

  @Override
  public String toString() {
    return new ToStringer(TableExistsResponse.class).add("tableExists", tableExists).toString();
  }

  TableExistsResponsePb toPb() {
    TableExistsResponsePb pb = new TableExistsResponsePb();
    pb.setTableExists(tableExists);

    return pb;
  }

  static TableExistsResponse fromPb(TableExistsResponsePb pb) {
    TableExistsResponse model = new TableExistsResponse();
    model.setTableExists(pb.getTableExists());

    return model;
  }

  public static class TableExistsResponseSerializer extends JsonSerializer<TableExistsResponse> {
    @Override
    public void serialize(TableExistsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TableExistsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TableExistsResponseDeserializer
      extends JsonDeserializer<TableExistsResponse> {
    @Override
    public TableExistsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TableExistsResponsePb pb = mapper.readValue(p, TableExistsResponsePb.class);
      return TableExistsResponse.fromPb(pb);
    }
  }
}
