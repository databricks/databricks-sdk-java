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

/** Delete AI/BI dashboard embedding approved domains */
@Generated
@JsonSerialize(
    using =
        DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest
            .DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequestSerializer.class)
@JsonDeserialize(
    using =
        DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest
            .DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequestDeserializer.class)
public class DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest {
  /**
   * etag used for versioning. The response is at least as fresh as the eTag provided. This is used
   * for optimistic concurrency control as a way to help prevent simultaneous writes of a setting
   * overwriting each other. It is strongly suggested that systems make use of the etag in the read
   * -> delete pattern to perform setting deletions in order to avoid race conditions. That is, get
   * an etag from a GET request, and pass it with the DELETE request to identify the rule set
   * version you are deleting.
   */
  private String etag;

  public DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest that =
        (DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest) o;
    return Objects.equals(etag, that.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest.class)
        .add("etag", etag)
        .toString();
  }

  DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequestPb toPb() {
    DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequestPb pb =
        new DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequestPb();
    pb.setEtag(etag);

    return pb;
  }

  static DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest fromPb(
      DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequestPb pb) {
    DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest model =
        new DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest();
    model.setEtag(pb.getEtag());

    return model;
  }

  public static class DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequestSerializer
      extends JsonSerializer<DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest> {
    @Override
    public void serialize(
        DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequestDeserializer
      extends JsonDeserializer<DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest> {
    @Override
    public DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequestPb pb =
          mapper.readValue(p, DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequestPb.class);
      return DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest.fromPb(pb);
    }
  }
}
