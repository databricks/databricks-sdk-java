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
@JsonSerialize(using = VolumeInternalAttributes.VolumeInternalAttributesSerializer.class)
@JsonDeserialize(using = VolumeInternalAttributes.VolumeInternalAttributesDeserializer.class)
public class VolumeInternalAttributes {
  /** The cloud storage location of the volume */
  private String storageLocation;

  /** The type of the shared volume. */
  private String typeValue;

  public VolumeInternalAttributes setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public VolumeInternalAttributes setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VolumeInternalAttributes that = (VolumeInternalAttributes) o;
    return Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageLocation, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(VolumeInternalAttributes.class)
        .add("storageLocation", storageLocation)
        .add("typeValue", typeValue)
        .toString();
  }

  VolumeInternalAttributesPb toPb() {
    VolumeInternalAttributesPb pb = new VolumeInternalAttributesPb();
    pb.setStorageLocation(storageLocation);
    pb.setType(typeValue);

    return pb;
  }

  static VolumeInternalAttributes fromPb(VolumeInternalAttributesPb pb) {
    VolumeInternalAttributes model = new VolumeInternalAttributes();
    model.setStorageLocation(pb.getStorageLocation());
    model.setType(pb.getType());

    return model;
  }

  public static class VolumeInternalAttributesSerializer
      extends JsonSerializer<VolumeInternalAttributes> {
    @Override
    public void serialize(
        VolumeInternalAttributes value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      VolumeInternalAttributesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class VolumeInternalAttributesDeserializer
      extends JsonDeserializer<VolumeInternalAttributes> {
    @Override
    public VolumeInternalAttributes deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      VolumeInternalAttributesPb pb = mapper.readValue(p, VolumeInternalAttributesPb.class);
      return VolumeInternalAttributes.fromPb(pb);
    }
  }
}
