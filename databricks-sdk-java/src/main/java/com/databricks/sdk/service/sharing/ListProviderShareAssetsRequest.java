// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/** List assets by provider share */
@Generated
@JsonSerialize(
    using = ListProviderShareAssetsRequest.ListProviderShareAssetsRequestSerializer.class)
@JsonDeserialize(
    using = ListProviderShareAssetsRequest.ListProviderShareAssetsRequestDeserializer.class)
public class ListProviderShareAssetsRequest {
  /** Maximum number of functions to return. */
  private Long functionMaxResults;

  /** Maximum number of notebooks to return. */
  private Long notebookMaxResults;

  /** The name of the provider who owns the share. */
  private String providerName;

  /** The name of the share. */
  private String shareName;

  /** Maximum number of tables to return. */
  private Long tableMaxResults;

  /** Maximum number of volumes to return. */
  private Long volumeMaxResults;

  public ListProviderShareAssetsRequest setFunctionMaxResults(Long functionMaxResults) {
    this.functionMaxResults = functionMaxResults;
    return this;
  }

  public Long getFunctionMaxResults() {
    return functionMaxResults;
  }

  public ListProviderShareAssetsRequest setNotebookMaxResults(Long notebookMaxResults) {
    this.notebookMaxResults = notebookMaxResults;
    return this;
  }

  public Long getNotebookMaxResults() {
    return notebookMaxResults;
  }

  public ListProviderShareAssetsRequest setProviderName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  public String getProviderName() {
    return providerName;
  }

  public ListProviderShareAssetsRequest setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  public ListProviderShareAssetsRequest setTableMaxResults(Long tableMaxResults) {
    this.tableMaxResults = tableMaxResults;
    return this;
  }

  public Long getTableMaxResults() {
    return tableMaxResults;
  }

  public ListProviderShareAssetsRequest setVolumeMaxResults(Long volumeMaxResults) {
    this.volumeMaxResults = volumeMaxResults;
    return this;
  }

  public Long getVolumeMaxResults() {
    return volumeMaxResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProviderShareAssetsRequest that = (ListProviderShareAssetsRequest) o;
    return Objects.equals(functionMaxResults, that.functionMaxResults)
        && Objects.equals(notebookMaxResults, that.notebookMaxResults)
        && Objects.equals(providerName, that.providerName)
        && Objects.equals(shareName, that.shareName)
        && Objects.equals(tableMaxResults, that.tableMaxResults)
        && Objects.equals(volumeMaxResults, that.volumeMaxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        functionMaxResults,
        notebookMaxResults,
        providerName,
        shareName,
        tableMaxResults,
        volumeMaxResults);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProviderShareAssetsRequest.class)
        .add("functionMaxResults", functionMaxResults)
        .add("notebookMaxResults", notebookMaxResults)
        .add("providerName", providerName)
        .add("shareName", shareName)
        .add("tableMaxResults", tableMaxResults)
        .add("volumeMaxResults", volumeMaxResults)
        .toString();
  }

  ListProviderShareAssetsRequestPb toPb() {
    ListProviderShareAssetsRequestPb pb = new ListProviderShareAssetsRequestPb();
    pb.setFunctionMaxResults(functionMaxResults);
    pb.setNotebookMaxResults(notebookMaxResults);
    pb.setProviderName(providerName);
    pb.setShareName(shareName);
    pb.setTableMaxResults(tableMaxResults);
    pb.setVolumeMaxResults(volumeMaxResults);

    return pb;
  }

  static ListProviderShareAssetsRequest fromPb(ListProviderShareAssetsRequestPb pb) {
    ListProviderShareAssetsRequest model = new ListProviderShareAssetsRequest();
    model.setFunctionMaxResults(pb.getFunctionMaxResults());
    model.setNotebookMaxResults(pb.getNotebookMaxResults());
    model.setProviderName(pb.getProviderName());
    model.setShareName(pb.getShareName());
    model.setTableMaxResults(pb.getTableMaxResults());
    model.setVolumeMaxResults(pb.getVolumeMaxResults());

    return model;
  }

  public static class ListProviderShareAssetsRequestSerializer
      extends JsonSerializer<ListProviderShareAssetsRequest> {
    @Override
    public void serialize(
        ListProviderShareAssetsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListProviderShareAssetsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListProviderShareAssetsRequestDeserializer
      extends JsonDeserializer<ListProviderShareAssetsRequest> {
    @Override
    public ListProviderShareAssetsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListProviderShareAssetsRequestPb pb =
          mapper.readValue(p, ListProviderShareAssetsRequestPb.class);
      return ListProviderShareAssetsRequest.fromPb(pb);
    }
  }
}
