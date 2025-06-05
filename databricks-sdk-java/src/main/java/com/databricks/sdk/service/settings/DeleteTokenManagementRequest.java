// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Delete a token */
@Generated
@JsonSerialize(using = DeleteTokenManagementRequest.DeleteTokenManagementRequestSerializer.class)
@JsonDeserialize(
    using = DeleteTokenManagementRequest.DeleteTokenManagementRequestDeserializer.class)
public class DeleteTokenManagementRequest {
  /** The ID of the token to revoke. */
  private String tokenId;

  public DeleteTokenManagementRequest setTokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  public String getTokenId() {
    return tokenId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteTokenManagementRequest that = (DeleteTokenManagementRequest) o;
    return Objects.equals(tokenId, that.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteTokenManagementRequest.class).add("tokenId", tokenId).toString();
  }

  DeleteTokenManagementRequestPb toPb() {
    DeleteTokenManagementRequestPb pb = new DeleteTokenManagementRequestPb();
    pb.setTokenId(tokenId);

    return pb;
  }

  static DeleteTokenManagementRequest fromPb(DeleteTokenManagementRequestPb pb) {
    DeleteTokenManagementRequest model = new DeleteTokenManagementRequest();
    model.setTokenId(pb.getTokenId());

    return model;
  }

  public static class DeleteTokenManagementRequestSerializer
      extends JsonSerializer<DeleteTokenManagementRequest> {
    @Override
    public void serialize(
        DeleteTokenManagementRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteTokenManagementRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteTokenManagementRequestDeserializer
      extends JsonDeserializer<DeleteTokenManagementRequest> {
    @Override
    public DeleteTokenManagementRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteTokenManagementRequestPb pb = mapper.readValue(p, DeleteTokenManagementRequestPb.class);
      return DeleteTokenManagementRequest.fromPb(pb);
    }
  }
}
