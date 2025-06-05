// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = ViewItem.ViewItemSerializer.class)
@JsonDeserialize(using = ViewItem.ViewItemDeserializer.class)
public class ViewItem {
  /** Content of the view. */
  private String content;

  /**
   * Name of the view item. In the case of code view, it would be the notebook’s name. In the case
   * of dashboard view, it would be the dashboard’s name.
   */
  private String name;

  /** Type of the view item. */
  private ViewType typeValue;

  public ViewItem setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ViewItem setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ViewItem setType(ViewType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public ViewType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ViewItem that = (ViewItem) o;
    return Objects.equals(content, that.content)
        && Objects.equals(name, that.name)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, name, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(ViewItem.class)
        .add("content", content)
        .add("name", name)
        .add("typeValue", typeValue)
        .toString();
  }

  ViewItemPb toPb() {
    ViewItemPb pb = new ViewItemPb();
    pb.setContent(content);
    pb.setName(name);
    pb.setType(typeValue);

    return pb;
  }

  static ViewItem fromPb(ViewItemPb pb) {
    ViewItem model = new ViewItem();
    model.setContent(pb.getContent());
    model.setName(pb.getName());
    model.setType(pb.getType());

    return model;
  }

  public static class ViewItemSerializer extends JsonSerializer<ViewItem> {
    @Override
    public void serialize(ViewItem value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ViewItemPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ViewItemDeserializer extends JsonDeserializer<ViewItem> {
    @Override
    public ViewItem deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ViewItemPb pb = mapper.readValue(p, ViewItemPb.class);
      return ViewItem.fromPb(pb);
    }
  }
}
