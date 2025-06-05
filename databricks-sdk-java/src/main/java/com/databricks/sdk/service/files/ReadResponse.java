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
@JsonSerialize(using = ReadResponse.ReadResponseSerializer.class)
@JsonDeserialize(using = ReadResponse.ReadResponseDeserializer.class)
public class ReadResponse {
  /**
   * The number of bytes read (could be less than ``length`` if we hit end of file). This refers to
   * number of bytes read in unencoded version (response data is base64-encoded).
   */
  private Long bytesRead;

  /** The base64-encoded contents of the file read. */
  private String data;

  public ReadResponse setBytesRead(Long bytesRead) {
    this.bytesRead = bytesRead;
    return this;
  }

  public Long getBytesRead() {
    return bytesRead;
  }

  public ReadResponse setData(String data) {
    this.data = data;
    return this;
  }

  public String getData() {
    return data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReadResponse that = (ReadResponse) o;
    return Objects.equals(bytesRead, that.bytesRead) && Objects.equals(data, that.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesRead, data);
  }

  @Override
  public String toString() {
    return new ToStringer(ReadResponse.class)
        .add("bytesRead", bytesRead)
        .add("data", data)
        .toString();
  }

  ReadResponsePb toPb() {
    ReadResponsePb pb = new ReadResponsePb();
    pb.setBytesRead(bytesRead);
    pb.setData(data);

    return pb;
  }

  static ReadResponse fromPb(ReadResponsePb pb) {
    ReadResponse model = new ReadResponse();
    model.setBytesRead(pb.getBytesRead());
    model.setData(pb.getData());

    return model;
  }

  public static class ReadResponseSerializer extends JsonSerializer<ReadResponse> {
    @Override
    public void serialize(ReadResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ReadResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ReadResponseDeserializer extends JsonDeserializer<ReadResponse> {
    @Override
    public ReadResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ReadResponsePb pb = mapper.readValue(p, ReadResponsePb.class);
      return ReadResponse.fromPb(pb);
    }
  }
}
