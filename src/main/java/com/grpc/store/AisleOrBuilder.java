// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package com.grpc.store;

public interface AisleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.grpc.store.Aisle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.grpc.store.UUID id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.com.grpc.store.UUID id = 1;</code>
   * @return The id.
   */
  com.grpc.store.UUID getId();
  /**
   * <code>.com.grpc.store.UUID id = 1;</code>
   */
  com.grpc.store.UUIDOrBuilder getIdOrBuilder();

  /**
   * <code>.com.grpc.store.Coordinate location = 2;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.com.grpc.store.Coordinate location = 2;</code>
   * @return The location.
   */
  com.grpc.store.Coordinate getLocation();
  /**
   * <code>.com.grpc.store.Coordinate location = 2;</code>
   */
  com.grpc.store.CoordinateOrBuilder getLocationOrBuilder();

  /**
   * <code>repeated .com.grpc.store.Bay bays = 3;</code>
   */
  java.util.List<com.grpc.store.Bay> 
      getBaysList();
  /**
   * <code>repeated .com.grpc.store.Bay bays = 3;</code>
   */
  com.grpc.store.Bay getBays(int index);
  /**
   * <code>repeated .com.grpc.store.Bay bays = 3;</code>
   */
  int getBaysCount();
  /**
   * <code>repeated .com.grpc.store.Bay bays = 3;</code>
   */
  java.util.List<? extends com.grpc.store.BayOrBuilder> 
      getBaysOrBuilderList();
  /**
   * <code>repeated .com.grpc.store.Bay bays = 3;</code>
   */
  com.grpc.store.BayOrBuilder getBaysOrBuilder(
      int index);
}