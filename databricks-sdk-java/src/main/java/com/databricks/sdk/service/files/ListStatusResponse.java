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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListStatusResponse.ListStatusResponseSerializer.class)
@JsonDeserialize(using = ListStatusResponse.ListStatusResponseDeserializer.class)
public class ListStatusResponse {
  /** A list of FileInfo's that describe contents of directory or file. See example above. */
  private Collection<FileInfo> files;

  public ListStatusResponse setFiles(Collection<FileInfo> files) {
    this.files = files;
    return this;
  }

  public Collection<FileInfo> getFiles() {
    return files;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListStatusResponse that = (ListStatusResponse) o;
    return Objects.equals(files, that.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files);
  }

  @Override
  public String toString() {
    return new ToStringer(ListStatusResponse.class).add("files", files).toString();
  }

  ListStatusResponsePb toPb() {
    ListStatusResponsePb pb = new ListStatusResponsePb();
    pb.setFiles(files);

    return pb;
  }

  static ListStatusResponse fromPb(ListStatusResponsePb pb) {
    ListStatusResponse model = new ListStatusResponse();
    model.setFiles(pb.getFiles());

    return model;
  }

  public static class ListStatusResponseSerializer extends JsonSerializer<ListStatusResponse> {
    @Override
    public void serialize(ListStatusResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListStatusResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListStatusResponseDeserializer extends JsonDeserializer<ListStatusResponse> {
    @Override
    public ListStatusResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListStatusResponsePb pb = mapper.readValue(p, ListStatusResponsePb.class);
      return ListStatusResponse.fromPb(pb);
    }
  }
}
