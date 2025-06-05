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

@Generated
@JsonSerialize(using = UpdateShare.UpdateShareSerializer.class)
@JsonDeserialize(using = UpdateShare.UpdateShareDeserializer.class)
public class UpdateShare {
  /** User-provided free-form text description. */
  private String comment;

  /** The name of the share. */
  private String name;

  /** New name for the share. */
  private String newName;

  /** Username of current owner of share. */
  private String owner;

  /** Storage root URL for the share. */
  private String storageRoot;

  /** Array of shared data object updates. */
  private Collection<SharedDataObjectUpdate> updates;

  public UpdateShare setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateShare setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateShare setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateShare setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateShare setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  public UpdateShare setUpdates(Collection<SharedDataObjectUpdate> updates) {
    this.updates = updates;
    return this;
  }

  public Collection<SharedDataObjectUpdate> getUpdates() {
    return updates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateShare that = (UpdateShare) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner)
        && Objects.equals(storageRoot, that.storageRoot)
        && Objects.equals(updates, that.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, newName, owner, storageRoot, updates);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateShare.class)
        .add("comment", comment)
        .add("name", name)
        .add("newName", newName)
        .add("owner", owner)
        .add("storageRoot", storageRoot)
        .add("updates", updates)
        .toString();
  }

  UpdateSharePb toPb() {
    UpdateSharePb pb = new UpdateSharePb();
    pb.setComment(comment);
    pb.setName(name);
    pb.setNewName(newName);
    pb.setOwner(owner);
    pb.setStorageRoot(storageRoot);
    pb.setUpdates(updates);

    return pb;
  }

  static UpdateShare fromPb(UpdateSharePb pb) {
    UpdateShare model = new UpdateShare();
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setNewName(pb.getNewName());
    model.setOwner(pb.getOwner());
    model.setStorageRoot(pb.getStorageRoot());
    model.setUpdates(pb.getUpdates());

    return model;
  }

  public static class UpdateShareSerializer extends JsonSerializer<UpdateShare> {
    @Override
    public void serialize(UpdateShare value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateSharePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateShareDeserializer extends JsonDeserializer<UpdateShare> {
    @Override
    public UpdateShare deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateSharePb pb = mapper.readValue(p, UpdateSharePb.class);
      return UpdateShare.fromPb(pb);
    }
  }
}
