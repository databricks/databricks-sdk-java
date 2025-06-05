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

/** Delete the AI/BI dashboard embedding access policy */
@Generated
@JsonSerialize(
    using =
        DeleteAibiDashboardEmbeddingAccessPolicySettingRequest
            .DeleteAibiDashboardEmbeddingAccessPolicySettingRequestSerializer.class)
@JsonDeserialize(
    using =
        DeleteAibiDashboardEmbeddingAccessPolicySettingRequest
            .DeleteAibiDashboardEmbeddingAccessPolicySettingRequestDeserializer.class)
public class DeleteAibiDashboardEmbeddingAccessPolicySettingRequest {
  /**
   * etag used for versioning. The response is at least as fresh as the eTag provided. This is used
   * for optimistic concurrency control as a way to help prevent simultaneous writes of a setting
   * overwriting each other. It is strongly suggested that systems make use of the etag in the read
   * -> delete pattern to perform setting deletions in order to avoid race conditions. That is, get
   * an etag from a GET request, and pass it with the DELETE request to identify the rule set
   * version you are deleting.
   */
  private String etag;

  public DeleteAibiDashboardEmbeddingAccessPolicySettingRequest setEtag(String etag) {
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
    DeleteAibiDashboardEmbeddingAccessPolicySettingRequest that =
        (DeleteAibiDashboardEmbeddingAccessPolicySettingRequest) o;
    return Objects.equals(etag, that.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAibiDashboardEmbeddingAccessPolicySettingRequest.class)
        .add("etag", etag)
        .toString();
  }

  DeleteAibiDashboardEmbeddingAccessPolicySettingRequestPb toPb() {
    DeleteAibiDashboardEmbeddingAccessPolicySettingRequestPb pb =
        new DeleteAibiDashboardEmbeddingAccessPolicySettingRequestPb();
    pb.setEtag(etag);

    return pb;
  }

  static DeleteAibiDashboardEmbeddingAccessPolicySettingRequest fromPb(
      DeleteAibiDashboardEmbeddingAccessPolicySettingRequestPb pb) {
    DeleteAibiDashboardEmbeddingAccessPolicySettingRequest model =
        new DeleteAibiDashboardEmbeddingAccessPolicySettingRequest();
    model.setEtag(pb.getEtag());

    return model;
  }

  public static class DeleteAibiDashboardEmbeddingAccessPolicySettingRequestSerializer
      extends JsonSerializer<DeleteAibiDashboardEmbeddingAccessPolicySettingRequest> {
    @Override
    public void serialize(
        DeleteAibiDashboardEmbeddingAccessPolicySettingRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      DeleteAibiDashboardEmbeddingAccessPolicySettingRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAibiDashboardEmbeddingAccessPolicySettingRequestDeserializer
      extends JsonDeserializer<DeleteAibiDashboardEmbeddingAccessPolicySettingRequest> {
    @Override
    public DeleteAibiDashboardEmbeddingAccessPolicySettingRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAibiDashboardEmbeddingAccessPolicySettingRequestPb pb =
          mapper.readValue(p, DeleteAibiDashboardEmbeddingAccessPolicySettingRequestPb.class);
      return DeleteAibiDashboardEmbeddingAccessPolicySettingRequest.fromPb(pb);
    }
  }
}
