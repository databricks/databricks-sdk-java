// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = GenieSpace.GenieSpaceSerializer.class)
@JsonDeserialize(using = GenieSpace.GenieSpaceDeserializer.class)
public class GenieSpace {
  /** Description of the Genie Space */
  private String description;

  /** Genie space ID */
  private String spaceId;

  /** Title of the Genie Space */
  private String title;

  public GenieSpace setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieSpace setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public GenieSpace setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieSpace that = (GenieSpace) o;
    return Objects.equals(description, that.description)
        && Objects.equals(spaceId, that.spaceId)
        && Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, spaceId, title);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieSpace.class)
        .add("description", description)
        .add("spaceId", spaceId)
        .add("title", title)
        .toString();
  }

  GenieSpacePb toPb() {
    GenieSpacePb pb = new GenieSpacePb();
    pb.setDescription(description);
    pb.setSpaceId(spaceId);
    pb.setTitle(title);

    return pb;
  }

  static GenieSpace fromPb(GenieSpacePb pb) {
    GenieSpace model = new GenieSpace();
    model.setDescription(pb.getDescription());
    model.setSpaceId(pb.getSpaceId());
    model.setTitle(pb.getTitle());

    return model;
  }

  public static class GenieSpaceSerializer extends JsonSerializer<GenieSpace> {
    @Override
    public void serialize(GenieSpace value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieSpacePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieSpaceDeserializer extends JsonDeserializer<GenieSpace> {
    @Override
    public GenieSpace deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieSpacePb pb = mapper.readValue(p, GenieSpacePb.class);
      return GenieSpace.fromPb(pb);
    }
  }
}
