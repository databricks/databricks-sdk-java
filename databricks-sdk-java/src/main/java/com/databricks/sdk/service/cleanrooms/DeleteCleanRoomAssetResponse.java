// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

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

/**
 * Response for delete clean room request. Using an empty message since the generic Empty proto does
 * not externd UnshadedMessageMarker.
 */
@Generated
@JsonSerialize(using = DeleteCleanRoomAssetResponse.DeleteCleanRoomAssetResponseSerializer.class)
@JsonDeserialize(
    using = DeleteCleanRoomAssetResponse.DeleteCleanRoomAssetResponseDeserializer.class)
public class DeleteCleanRoomAssetResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCleanRoomAssetResponse.class).toString();
  }

  DeleteCleanRoomAssetResponsePb toPb() {
    DeleteCleanRoomAssetResponsePb pb = new DeleteCleanRoomAssetResponsePb();

    return pb;
  }

  static DeleteCleanRoomAssetResponse fromPb(DeleteCleanRoomAssetResponsePb pb) {
    DeleteCleanRoomAssetResponse model = new DeleteCleanRoomAssetResponse();

    return model;
  }

  public static class DeleteCleanRoomAssetResponseSerializer
      extends JsonSerializer<DeleteCleanRoomAssetResponse> {
    @Override
    public void serialize(
        DeleteCleanRoomAssetResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCleanRoomAssetResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCleanRoomAssetResponseDeserializer
      extends JsonDeserializer<DeleteCleanRoomAssetResponse> {
    @Override
    public DeleteCleanRoomAssetResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCleanRoomAssetResponsePb pb = mapper.readValue(p, DeleteCleanRoomAssetResponsePb.class);
      return DeleteCleanRoomAssetResponse.fromPb(pb);
    }
  }
}
