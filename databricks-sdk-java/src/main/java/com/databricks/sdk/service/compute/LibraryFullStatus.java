// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** The status of the library on a specific cluster. */
@Generated
@JsonSerialize(using = LibraryFullStatus.LibraryFullStatusSerializer.class)
@JsonDeserialize(using = LibraryFullStatus.LibraryFullStatusDeserializer.class)
public class LibraryFullStatus {
  /** Whether the library was set to be installed on all clusters via the libraries UI. */
  private Boolean isLibraryForAllClusters;

  /** Unique identifier for the library. */
  private Library library;

  /** All the info and warning messages that have occurred so far for this library. */
  private Collection<String> messages;

  /** Status of installing the library on the cluster. */
  private LibraryInstallStatus status;

  public LibraryFullStatus setIsLibraryForAllClusters(Boolean isLibraryForAllClusters) {
    this.isLibraryForAllClusters = isLibraryForAllClusters;
    return this;
  }

  public Boolean getIsLibraryForAllClusters() {
    return isLibraryForAllClusters;
  }

  public LibraryFullStatus setLibrary(Library library) {
    this.library = library;
    return this;
  }

  public Library getLibrary() {
    return library;
  }

  public LibraryFullStatus setMessages(Collection<String> messages) {
    this.messages = messages;
    return this;
  }

  public Collection<String> getMessages() {
    return messages;
  }

  public LibraryFullStatus setStatus(LibraryInstallStatus status) {
    this.status = status;
    return this;
  }

  public LibraryInstallStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LibraryFullStatus that = (LibraryFullStatus) o;
    return Objects.equals(isLibraryForAllClusters, that.isLibraryForAllClusters)
        && Objects.equals(library, that.library)
        && Objects.equals(messages, that.messages)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLibraryForAllClusters, library, messages, status);
  }

  @Override
  public String toString() {
    return new ToStringer(LibraryFullStatus.class)
        .add("isLibraryForAllClusters", isLibraryForAllClusters)
        .add("library", library)
        .add("messages", messages)
        .add("status", status)
        .toString();
  }

  LibraryFullStatusPb toPb() {
    LibraryFullStatusPb pb = new LibraryFullStatusPb();
    pb.setIsLibraryForAllClusters(isLibraryForAllClusters);
    pb.setLibrary(library);
    pb.setMessages(messages);
    pb.setStatus(status);

    return pb;
  }

  static LibraryFullStatus fromPb(LibraryFullStatusPb pb) {
    LibraryFullStatus model = new LibraryFullStatus();
    model.setIsLibraryForAllClusters(pb.getIsLibraryForAllClusters());
    model.setLibrary(pb.getLibrary());
    model.setMessages(pb.getMessages());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class LibraryFullStatusSerializer extends JsonSerializer<LibraryFullStatus> {
    @Override
    public void serialize(LibraryFullStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LibraryFullStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LibraryFullStatusDeserializer extends JsonDeserializer<LibraryFullStatus> {
    @Override
    public LibraryFullStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LibraryFullStatusPb pb = mapper.readValue(p, LibraryFullStatusPb.class);
      return LibraryFullStatus.fromPb(pb);
    }
  }
}
