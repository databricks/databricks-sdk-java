// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Online Table information. */
@Generated
@JsonSerialize(using = OnlineTable.OnlineTableSerializer.class)
@JsonDeserialize(using = OnlineTable.OnlineTableDeserializer.class)
public class OnlineTable {
  /** Full three-part (catalog, schema, table) name of the table. */
  private String name;

  /** Specification of the online table. */
  private OnlineTableSpec spec;

  /** Online Table data synchronization status */
  private OnlineTableStatus status;

  /** Data serving REST API URL for this table */
  private String tableServingUrl;

  /**
   * The provisioning state of the online table entity in Unity Catalog. This is distinct from the
   * state of the data synchronization pipeline (i.e. the table may be in "ACTIVE" but the pipeline
   * may be in "PROVISIONING" as it runs asynchronously).
   */
  private ProvisioningInfoState unityCatalogProvisioningState;

  public OnlineTable setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public OnlineTable setSpec(OnlineTableSpec spec) {
    this.spec = spec;
    return this;
  }

  public OnlineTableSpec getSpec() {
    return spec;
  }

  public OnlineTable setStatus(OnlineTableStatus status) {
    this.status = status;
    return this;
  }

  public OnlineTableStatus getStatus() {
    return status;
  }

  public OnlineTable setTableServingUrl(String tableServingUrl) {
    this.tableServingUrl = tableServingUrl;
    return this;
  }

  public String getTableServingUrl() {
    return tableServingUrl;
  }

  public OnlineTable setUnityCatalogProvisioningState(
      ProvisioningInfoState unityCatalogProvisioningState) {
    this.unityCatalogProvisioningState = unityCatalogProvisioningState;
    return this;
  }

  public ProvisioningInfoState getUnityCatalogProvisioningState() {
    return unityCatalogProvisioningState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineTable that = (OnlineTable) o;
    return Objects.equals(name, that.name)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(tableServingUrl, that.tableServingUrl)
        && Objects.equals(unityCatalogProvisioningState, that.unityCatalogProvisioningState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, spec, status, tableServingUrl, unityCatalogProvisioningState);
  }

  @Override
  public String toString() {
    return new ToStringer(OnlineTable.class)
        .add("name", name)
        .add("spec", spec)
        .add("status", status)
        .add("tableServingUrl", tableServingUrl)
        .add("unityCatalogProvisioningState", unityCatalogProvisioningState)
        .toString();
  }

  OnlineTablePb toPb() {
    OnlineTablePb pb = new OnlineTablePb();
    pb.setName(name);
    pb.setSpec(spec);
    pb.setStatus(status);
    pb.setTableServingUrl(tableServingUrl);
    pb.setUnityCatalogProvisioningState(unityCatalogProvisioningState);

    return pb;
  }

  static OnlineTable fromPb(OnlineTablePb pb) {
    OnlineTable model = new OnlineTable();
    model.setName(pb.getName());
    model.setSpec(pb.getSpec());
    model.setStatus(pb.getStatus());
    model.setTableServingUrl(pb.getTableServingUrl());
    model.setUnityCatalogProvisioningState(pb.getUnityCatalogProvisioningState());

    return model;
  }

  public static class OnlineTableSerializer extends JsonSerializer<OnlineTable> {
    @Override
    public void serialize(OnlineTable value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      OnlineTablePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class OnlineTableDeserializer extends JsonDeserializer<OnlineTable> {
    @Override
    public OnlineTable deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      OnlineTablePb pb = mapper.readValue(p, OnlineTablePb.class);
      return OnlineTable.fromPb(pb);
    }
  }
}
