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
@JsonSerialize(using = AddBlock.AddBlockSerializer.class)
@JsonDeserialize(using = AddBlock.AddBlockDeserializer.class)
public class AddBlock {
  /** The base64-encoded data to append to the stream. This has a limit of 1 MB. */
  private String data;

  /** The handle on an open stream. */
  private Long handle;

  public AddBlock setData(String data) {
    this.data = data;
    return this;
  }

  public String getData() {
    return data;
  }

  public AddBlock setHandle(Long handle) {
    this.handle = handle;
    return this;
  }

  public Long getHandle() {
    return handle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddBlock that = (AddBlock) o;
    return Objects.equals(data, that.data) && Objects.equals(handle, that.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, handle);
  }

  @Override
  public String toString() {
    return new ToStringer(AddBlock.class).add("data", data).add("handle", handle).toString();
  }

  AddBlockPb toPb() {
    AddBlockPb pb = new AddBlockPb();
    pb.setData(data);
    pb.setHandle(handle);

    return pb;
  }

  static AddBlock fromPb(AddBlockPb pb) {
    AddBlock model = new AddBlock();
    model.setData(pb.getData());
    model.setHandle(pb.getHandle());

    return model;
  }

  public static class AddBlockSerializer extends JsonSerializer<AddBlock> {
    @Override
    public void serialize(AddBlock value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AddBlockPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AddBlockDeserializer extends JsonDeserializer<AddBlock> {
    @Override
    public AddBlock deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AddBlockPb pb = mapper.readValue(p, AddBlockPb.class);
      return AddBlock.fromPb(pb);
    }
  }
}
