// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** Metadata for a sandbox filesystem entry, describing a final symlink itself. */
@Generated
public class SandboxFileInfo {
  /** */
  @JsonProperty("file_type")
  private SandboxFileType fileType;

  /** */
  @JsonProperty("group")
  private String group;

  /** */
  @JsonProperty("mode")
  private Long mode;

  /** Nanosecond precision is preserved on the wire. */
  @JsonProperty("modify_time")
  private Timestamp modifyTime;

  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("owner")
  private String owner;

  /** */
  @JsonProperty("path")
  private String path;

  /** */
  @JsonProperty("permissions")
  private String permissions;

  /** */
  @JsonProperty("size")
  private Long size;

  /** */
  @JsonProperty("symlink_target")
  private String symlinkTarget;

  public SandboxFileInfo setFileType(SandboxFileType fileType) {
    this.fileType = fileType;
    return this;
  }

  public SandboxFileType getFileType() {
    return fileType;
  }

  public SandboxFileInfo setGroup(String group) {
    this.group = group;
    return this;
  }

  public String getGroup() {
    return group;
  }

  public SandboxFileInfo setMode(Long mode) {
    this.mode = mode;
    return this;
  }

  public Long getMode() {
    return mode;
  }

  public SandboxFileInfo setModifyTime(Timestamp modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

  public Timestamp getModifyTime() {
    return modifyTime;
  }

  public SandboxFileInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SandboxFileInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public SandboxFileInfo setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public SandboxFileInfo setPermissions(String permissions) {
    this.permissions = permissions;
    return this;
  }

  public String getPermissions() {
    return permissions;
  }

  public SandboxFileInfo setSize(Long size) {
    this.size = size;
    return this;
  }

  public Long getSize() {
    return size;
  }

  public SandboxFileInfo setSymlinkTarget(String symlinkTarget) {
    this.symlinkTarget = symlinkTarget;
    return this;
  }

  public String getSymlinkTarget() {
    return symlinkTarget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SandboxFileInfo that = (SandboxFileInfo) o;
    return Objects.equals(fileType, that.fileType)
        && Objects.equals(group, that.group)
        && Objects.equals(mode, that.mode)
        && Objects.equals(modifyTime, that.modifyTime)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(path, that.path)
        && Objects.equals(permissions, that.permissions)
        && Objects.equals(size, that.size)
        && Objects.equals(symlinkTarget, that.symlinkTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fileType, group, mode, modifyTime, name, owner, path, permissions, size, symlinkTarget);
  }

  @Override
  public String toString() {
    return new ToStringer(SandboxFileInfo.class)
        .add("fileType", fileType)
        .add("group", group)
        .add("mode", mode)
        .add("modifyTime", modifyTime)
        .add("name", name)
        .add("owner", owner)
        .add("path", path)
        .add("permissions", permissions)
        .add("size", size)
        .add("symlinkTarget", symlinkTarget)
        .toString();
  }
}
