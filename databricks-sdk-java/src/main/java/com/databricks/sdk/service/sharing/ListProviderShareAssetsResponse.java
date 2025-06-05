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
import java.util.Collection;
import java.util.Objects;

/** Response to ListProviderShareAssets, which contains the list of assets of a share. */
@Generated
@JsonSerialize(
    using = ListProviderShareAssetsResponse.ListProviderShareAssetsResponseSerializer.class)
@JsonDeserialize(
    using = ListProviderShareAssetsResponse.ListProviderShareAssetsResponseDeserializer.class)
public class ListProviderShareAssetsResponse {
  /** The list of functions in the share. */
  private Collection<DeltaSharingFunction> functions;

  /** The list of notebooks in the share. */
  private Collection<NotebookFile> notebooks;

  /** The list of tables in the share. */
  private Collection<Table> tables;

  /** The list of volumes in the share. */
  private Collection<Volume> volumes;

  public ListProviderShareAssetsResponse setFunctions(Collection<DeltaSharingFunction> functions) {
    this.functions = functions;
    return this;
  }

  public Collection<DeltaSharingFunction> getFunctions() {
    return functions;
  }

  public ListProviderShareAssetsResponse setNotebooks(Collection<NotebookFile> notebooks) {
    this.notebooks = notebooks;
    return this;
  }

  public Collection<NotebookFile> getNotebooks() {
    return notebooks;
  }

  public ListProviderShareAssetsResponse setTables(Collection<Table> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<Table> getTables() {
    return tables;
  }

  public ListProviderShareAssetsResponse setVolumes(Collection<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public Collection<Volume> getVolumes() {
    return volumes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProviderShareAssetsResponse that = (ListProviderShareAssetsResponse) o;
    return Objects.equals(functions, that.functions)
        && Objects.equals(notebooks, that.notebooks)
        && Objects.equals(tables, that.tables)
        && Objects.equals(volumes, that.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functions, notebooks, tables, volumes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProviderShareAssetsResponse.class)
        .add("functions", functions)
        .add("notebooks", notebooks)
        .add("tables", tables)
        .add("volumes", volumes)
        .toString();
  }

  ListProviderShareAssetsResponsePb toPb() {
    ListProviderShareAssetsResponsePb pb = new ListProviderShareAssetsResponsePb();
    pb.setFunctions(functions);
    pb.setNotebooks(notebooks);
    pb.setTables(tables);
    pb.setVolumes(volumes);

    return pb;
  }

  static ListProviderShareAssetsResponse fromPb(ListProviderShareAssetsResponsePb pb) {
    ListProviderShareAssetsResponse model = new ListProviderShareAssetsResponse();
    model.setFunctions(pb.getFunctions());
    model.setNotebooks(pb.getNotebooks());
    model.setTables(pb.getTables());
    model.setVolumes(pb.getVolumes());

    return model;
  }

  public static class ListProviderShareAssetsResponseSerializer
      extends JsonSerializer<ListProviderShareAssetsResponse> {
    @Override
    public void serialize(
        ListProviderShareAssetsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListProviderShareAssetsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListProviderShareAssetsResponseDeserializer
      extends JsonDeserializer<ListProviderShareAssetsResponse> {
    @Override
    public ListProviderShareAssetsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListProviderShareAssetsResponsePb pb =
          mapper.readValue(p, ListProviderShareAssetsResponsePb.class);
      return ListProviderShareAssetsResponse.fromPb(pb);
    }
  }
}
