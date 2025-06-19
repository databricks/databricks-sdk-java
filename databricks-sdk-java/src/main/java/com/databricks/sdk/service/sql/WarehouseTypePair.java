// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

@Generated
@JsonSerialize(using = WarehouseTypePair.WarehouseTypePairSerializer.class)
@JsonDeserialize(using = WarehouseTypePair.WarehouseTypePairDeserializer.class)
public class WarehouseTypePair {
  /**
   * If set to false the specific warehouse type will not be be allowed as a value for
   * warehouse_type in CreateWarehouse and EditWarehouse
   */
  private Boolean enabled;

  /** Warehouse type: `PRO` or `CLASSIC`. */
  private WarehouseTypePairWarehouseType warehouseType;

  public WarehouseTypePair setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public WarehouseTypePair setWarehouseType(WarehouseTypePairWarehouseType warehouseType) {
    this.warehouseType = warehouseType;
    return this;
  }

  public WarehouseTypePairWarehouseType getWarehouseType() {
    return warehouseType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WarehouseTypePair that = (WarehouseTypePair) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(warehouseType, that.warehouseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, warehouseType);
  }

  @Override
  public String toString() {
    return new ToStringer(WarehouseTypePair.class)
        .add("enabled", enabled)
        .add("warehouseType", warehouseType)
        .toString();
  }

  WarehouseTypePairPb toPb() {
    WarehouseTypePairPb pb = new WarehouseTypePairPb();
    pb.setEnabled(enabled);
    pb.setWarehouseType(warehouseType);

    return pb;
  }

  static WarehouseTypePair fromPb(WarehouseTypePairPb pb) {
    WarehouseTypePair model = new WarehouseTypePair();
    model.setEnabled(pb.getEnabled());
    model.setWarehouseType(pb.getWarehouseType());

    return model;
  }

  public static class WarehouseTypePairSerializer extends JsonSerializer<WarehouseTypePair> {
    @Override
    public void serialize(WarehouseTypePair value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WarehouseTypePairPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WarehouseTypePairDeserializer extends JsonDeserializer<WarehouseTypePair> {
    @Override
    public WarehouseTypePair deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WarehouseTypePairPb pb = mapper.readValue(p, WarehouseTypePairPb.class);
      return WarehouseTypePair.fromPb(pb);
    }
  }
}
