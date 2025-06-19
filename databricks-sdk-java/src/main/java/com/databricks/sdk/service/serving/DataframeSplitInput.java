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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = DataframeSplitInput.DataframeSplitInputSerializer.class)
@JsonDeserialize(using = DataframeSplitInput.DataframeSplitInputDeserializer.class)
public class DataframeSplitInput {
  /** */
  private Collection<Object> columns;

  /** */
  private Collection<Object> data;

  /** */
  private Collection<Long> index;

  public DataframeSplitInput setColumns(Collection<Object> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<Object> getColumns() {
    return columns;
  }

  public DataframeSplitInput setData(Collection<Object> data) {
    this.data = data;
    return this;
  }

  public Collection<Object> getData() {
    return data;
  }

  public DataframeSplitInput setIndex(Collection<Long> index) {
    this.index = index;
    return this;
  }

  public Collection<Long> getIndex() {
    return index;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataframeSplitInput that = (DataframeSplitInput) o;
    return Objects.equals(columns, that.columns)
        && Objects.equals(data, that.data)
        && Objects.equals(index, that.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, data, index);
  }

  @Override
  public String toString() {
    return new ToStringer(DataframeSplitInput.class)
        .add("columns", columns)
        .add("data", data)
        .add("index", index)
        .toString();
  }

  DataframeSplitInputPb toPb() {
    DataframeSplitInputPb pb = new DataframeSplitInputPb();
    pb.setColumns(columns);
    pb.setData(data);
    pb.setIndex(index);

    return pb;
  }

  static DataframeSplitInput fromPb(DataframeSplitInputPb pb) {
    DataframeSplitInput model = new DataframeSplitInput();
    model.setColumns(pb.getColumns());
    model.setData(pb.getData());
    model.setIndex(pb.getIndex());

    return model;
  }

  public static class DataframeSplitInputSerializer extends JsonSerializer<DataframeSplitInput> {
    @Override
    public void serialize(DataframeSplitInput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DataframeSplitInputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DataframeSplitInputDeserializer
      extends JsonDeserializer<DataframeSplitInput> {
    @Override
    public DataframeSplitInput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DataframeSplitInputPb pb = mapper.readValue(p, DataframeSplitInputPb.class);
      return DataframeSplitInput.fromPb(pb);
    }
  }
}
