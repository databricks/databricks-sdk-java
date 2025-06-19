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
@JsonSerialize(using = WidgetOptions.WidgetOptionsSerializer.class)
@JsonDeserialize(using = WidgetOptions.WidgetOptionsDeserializer.class)
public class WidgetOptions {
  /** Timestamp when this object was created */
  private String createdAt;

  /** Custom description of the widget */
  private String description;

  /** Whether this widget is hidden on the dashboard. */
  private Boolean isHidden;

  /**
   * How parameters used by the visualization in this widget relate to other widgets on the
   * dashboard. Databricks does not recommend modifying this definition in JSON.
   */
  private Object parameterMappings;

  /**
   * Coordinates of this widget on a dashboard. This portion of the API changes frequently and is
   * unsupported.
   */
  private WidgetPosition position;

  /** Custom title of the widget */
  private String title;

  /** Timestamp of the last time this object was updated. */
  private String updatedAt;

  public WidgetOptions setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public WidgetOptions setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public WidgetOptions setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  public Boolean getIsHidden() {
    return isHidden;
  }

  public WidgetOptions setParameterMappings(Object parameterMappings) {
    this.parameterMappings = parameterMappings;
    return this;
  }

  public Object getParameterMappings() {
    return parameterMappings;
  }

  public WidgetOptions setPosition(WidgetPosition position) {
    this.position = position;
    return this;
  }

  public WidgetPosition getPosition() {
    return position;
  }

  public WidgetOptions setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public WidgetOptions setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WidgetOptions that = (WidgetOptions) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(description, that.description)
        && Objects.equals(isHidden, that.isHidden)
        && Objects.equals(parameterMappings, that.parameterMappings)
        && Objects.equals(position, that.position)
        && Objects.equals(title, that.title)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, description, isHidden, parameterMappings, position, title, updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(WidgetOptions.class)
        .add("createdAt", createdAt)
        .add("description", description)
        .add("isHidden", isHidden)
        .add("parameterMappings", parameterMappings)
        .add("position", position)
        .add("title", title)
        .add("updatedAt", updatedAt)
        .toString();
  }

  WidgetOptionsPb toPb() {
    WidgetOptionsPb pb = new WidgetOptionsPb();
    pb.setCreatedAt(createdAt);
    pb.setDescription(description);
    pb.setIsHidden(isHidden);
    pb.setParameterMappings(parameterMappings);
    pb.setPosition(position);
    pb.setTitle(title);
    pb.setUpdatedAt(updatedAt);

    return pb;
  }

  static WidgetOptions fromPb(WidgetOptionsPb pb) {
    WidgetOptions model = new WidgetOptions();
    model.setCreatedAt(pb.getCreatedAt());
    model.setDescription(pb.getDescription());
    model.setIsHidden(pb.getIsHidden());
    model.setParameterMappings(pb.getParameterMappings());
    model.setPosition(pb.getPosition());
    model.setTitle(pb.getTitle());
    model.setUpdatedAt(pb.getUpdatedAt());

    return model;
  }

  public static class WidgetOptionsSerializer extends JsonSerializer<WidgetOptions> {
    @Override
    public void serialize(WidgetOptions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WidgetOptionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WidgetOptionsDeserializer extends JsonDeserializer<WidgetOptions> {
    @Override
    public WidgetOptions deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WidgetOptionsPb pb = mapper.readValue(p, WidgetOptionsPb.class);
      return WidgetOptions.fromPb(pb);
    }
  }
}
