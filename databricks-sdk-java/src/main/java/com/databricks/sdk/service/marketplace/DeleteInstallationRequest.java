// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

/** Uninstall from a listing */
@Generated
@JsonSerialize(using = DeleteInstallationRequest.DeleteInstallationRequestSerializer.class)
@JsonDeserialize(using = DeleteInstallationRequest.DeleteInstallationRequestDeserializer.class)
public class DeleteInstallationRequest {
  /** */
  private String installationId;

  /** */
  private String listingId;

  public DeleteInstallationRequest setInstallationId(String installationId) {
    this.installationId = installationId;
    return this;
  }

  public String getInstallationId() {
    return installationId;
  }

  public DeleteInstallationRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteInstallationRequest that = (DeleteInstallationRequest) o;
    return Objects.equals(installationId, that.installationId)
        && Objects.equals(listingId, that.listingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installationId, listingId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteInstallationRequest.class)
        .add("installationId", installationId)
        .add("listingId", listingId)
        .toString();
  }

  DeleteInstallationRequestPb toPb() {
    DeleteInstallationRequestPb pb = new DeleteInstallationRequestPb();
    pb.setInstallationId(installationId);
    pb.setListingId(listingId);

    return pb;
  }

  static DeleteInstallationRequest fromPb(DeleteInstallationRequestPb pb) {
    DeleteInstallationRequest model = new DeleteInstallationRequest();
    model.setInstallationId(pb.getInstallationId());
    model.setListingId(pb.getListingId());

    return model;
  }

  public static class DeleteInstallationRequestSerializer
      extends JsonSerializer<DeleteInstallationRequest> {
    @Override
    public void serialize(
        DeleteInstallationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteInstallationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteInstallationRequestDeserializer
      extends JsonDeserializer<DeleteInstallationRequest> {
    @Override
    public DeleteInstallationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteInstallationRequestPb pb = mapper.readValue(p, DeleteInstallationRequestPb.class);
      return DeleteInstallationRequest.fromPb(pb);
    }
  }
}
