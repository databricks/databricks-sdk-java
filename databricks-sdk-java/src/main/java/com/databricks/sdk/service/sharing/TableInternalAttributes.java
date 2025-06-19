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

/** Internal information for D2D sharing that should not be disclosed to external users. */
@Generated
@JsonSerialize(using = TableInternalAttributes.TableInternalAttributesSerializer.class)
@JsonDeserialize(using = TableInternalAttributes.TableInternalAttributesDeserializer.class)
public class TableInternalAttributes {
  /**
   * Will be populated in the reconciliation response for VIEW and FOREIGN_TABLE, with the value of
   * the parent UC entity's storage_location, following the same logic as getManagedEntityPath in
   * CreateStagingTableHandler, which is used to store the materialized table for a shared
   * VIEW/FOREIGN_TABLE for D2O queries. The value will be used on the recipient side to be
   * whitelisted when SEG is enabled on the workspace of the recipient, to allow the recipient users
   * to query this shared VIEW/FOREIGN_TABLE.
   */
  private String parentStorageLocation;

  /** The cloud storage location of a shard table with DIRECTORY_BASED_TABLE type. */
  private String storageLocation;

  /** The type of the shared table. */
  private TableInternalAttributesSharedTableType typeValue;

  /** The view definition of a shared view. DEPRECATED. */
  private String viewDefinition;

  public TableInternalAttributes setParentStorageLocation(String parentStorageLocation) {
    this.parentStorageLocation = parentStorageLocation;
    return this;
  }

  public String getParentStorageLocation() {
    return parentStorageLocation;
  }

  public TableInternalAttributes setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public TableInternalAttributes setType(TableInternalAttributesSharedTableType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public TableInternalAttributesSharedTableType getType() {
    return typeValue;
  }

  public TableInternalAttributes setViewDefinition(String viewDefinition) {
    this.viewDefinition = viewDefinition;
    return this;
  }

  public String getViewDefinition() {
    return viewDefinition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableInternalAttributes that = (TableInternalAttributes) o;
    return Objects.equals(parentStorageLocation, that.parentStorageLocation)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(viewDefinition, that.viewDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentStorageLocation, storageLocation, typeValue, viewDefinition);
  }

  @Override
  public String toString() {
    return new ToStringer(TableInternalAttributes.class)
        .add("parentStorageLocation", parentStorageLocation)
        .add("storageLocation", storageLocation)
        .add("typeValue", typeValue)
        .add("viewDefinition", viewDefinition)
        .toString();
  }

  TableInternalAttributesPb toPb() {
    TableInternalAttributesPb pb = new TableInternalAttributesPb();
    pb.setParentStorageLocation(parentStorageLocation);
    pb.setStorageLocation(storageLocation);
    pb.setType(typeValue);
    pb.setViewDefinition(viewDefinition);

    return pb;
  }

  static TableInternalAttributes fromPb(TableInternalAttributesPb pb) {
    TableInternalAttributes model = new TableInternalAttributes();
    model.setParentStorageLocation(pb.getParentStorageLocation());
    model.setStorageLocation(pb.getStorageLocation());
    model.setType(pb.getType());
    model.setViewDefinition(pb.getViewDefinition());

    return model;
  }

  public static class TableInternalAttributesSerializer
      extends JsonSerializer<TableInternalAttributes> {
    @Override
    public void serialize(
        TableInternalAttributes value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TableInternalAttributesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TableInternalAttributesDeserializer
      extends JsonDeserializer<TableInternalAttributes> {
    @Override
    public TableInternalAttributes deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TableInternalAttributesPb pb = mapper.readValue(p, TableInternalAttributesPb.class);
      return TableInternalAttributes.fromPb(pb);
    }
  }
}
