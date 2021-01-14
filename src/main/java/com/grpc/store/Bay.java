// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package com.grpc.store;

/**
 * Protobuf type {@code com.grpc.store.Bay}
 */
public final class Bay extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.store.Bay)
    BayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Bay.newBuilder() to construct.
  private Bay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Bay() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Bay();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Bay(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.grpc.store.UUID.Builder subBuilder = null;
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(com.grpc.store.UUID.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            count_ = input.readInt32();
            break;
          }
          case 26: {
            com.grpc.store.Dimension.Builder subBuilder = null;
            if (dimension_ != null) {
              subBuilder = dimension_.toBuilder();
            }
            dimension_ = input.readMessage(com.grpc.store.Dimension.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dimension_);
              dimension_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.store.StoreCover.internal_static_com_grpc_store_Bay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.store.StoreCover.internal_static_com_grpc_store_Bay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.store.Bay.class, com.grpc.store.Bay.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.grpc.store.UUID id_;
  /**
   * <code>.com.grpc.store.UUID id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <code>.com.grpc.store.UUID id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public com.grpc.store.UUID getId() {
    return id_ == null ? com.grpc.store.UUID.getDefaultInstance() : id_;
  }
  /**
   * <code>.com.grpc.store.UUID id = 1;</code>
   */
  @java.lang.Override
  public com.grpc.store.UUIDOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <code>int32 count = 2;</code>
   * @return The count.
   */
  @java.lang.Override
  public int getCount() {
    return count_;
  }

  public static final int DIMENSION_FIELD_NUMBER = 3;
  private com.grpc.store.Dimension dimension_;
  /**
   * <code>.com.grpc.store.Dimension dimension = 3;</code>
   * @return Whether the dimension field is set.
   */
  @java.lang.Override
  public boolean hasDimension() {
    return dimension_ != null;
  }
  /**
   * <code>.com.grpc.store.Dimension dimension = 3;</code>
   * @return The dimension.
   */
  @java.lang.Override
  public com.grpc.store.Dimension getDimension() {
    return dimension_ == null ? com.grpc.store.Dimension.getDefaultInstance() : dimension_;
  }
  /**
   * <code>.com.grpc.store.Dimension dimension = 3;</code>
   */
  @java.lang.Override
  public com.grpc.store.DimensionOrBuilder getDimensionOrBuilder() {
    return getDimension();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    if (dimension_ != null) {
      output.writeMessage(3, getDimension());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    if (dimension_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDimension());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.store.Bay)) {
      return super.equals(obj);
    }
    com.grpc.store.Bay other = (com.grpc.store.Bay) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (getCount()
        != other.getCount()) return false;
    if (hasDimension() != other.hasDimension()) return false;
    if (hasDimension()) {
      if (!getDimension()
          .equals(other.getDimension())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    if (hasDimension()) {
      hash = (37 * hash) + DIMENSION_FIELD_NUMBER;
      hash = (53 * hash) + getDimension().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.store.Bay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.store.Bay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.store.Bay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.store.Bay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.store.Bay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.store.Bay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.store.Bay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.store.Bay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.store.Bay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.store.Bay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.store.Bay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.store.Bay parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.store.Bay prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.grpc.store.Bay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.store.Bay)
      com.grpc.store.BayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.store.StoreCover.internal_static_com_grpc_store_Bay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.store.StoreCover.internal_static_com_grpc_store_Bay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.store.Bay.class, com.grpc.store.Bay.Builder.class);
    }

    // Construct using com.grpc.store.Bay.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      count_ = 0;

      if (dimensionBuilder_ == null) {
        dimension_ = null;
      } else {
        dimension_ = null;
        dimensionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.store.StoreCover.internal_static_com_grpc_store_Bay_descriptor;
    }

    @java.lang.Override
    public com.grpc.store.Bay getDefaultInstanceForType() {
      return com.grpc.store.Bay.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.store.Bay build() {
      com.grpc.store.Bay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.store.Bay buildPartial() {
      com.grpc.store.Bay result = new com.grpc.store.Bay(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      result.count_ = count_;
      if (dimensionBuilder_ == null) {
        result.dimension_ = dimension_;
      } else {
        result.dimension_ = dimensionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.store.Bay) {
        return mergeFrom((com.grpc.store.Bay)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.store.Bay other) {
      if (other == com.grpc.store.Bay.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.hasDimension()) {
        mergeDimension(other.getDimension());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.grpc.store.Bay parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.store.Bay) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.grpc.store.UUID id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.store.UUID, com.grpc.store.UUID.Builder, com.grpc.store.UUIDOrBuilder> idBuilder_;
    /**
     * <code>.com.grpc.store.UUID id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <code>.com.grpc.store.UUID id = 1;</code>
     * @return The id.
     */
    public com.grpc.store.UUID getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.grpc.store.UUID.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.grpc.store.UUID id = 1;</code>
     */
    public Builder setId(com.grpc.store.UUID value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.store.UUID id = 1;</code>
     */
    public Builder setId(
        com.grpc.store.UUID.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.grpc.store.UUID id = 1;</code>
     */
    public Builder mergeId(com.grpc.store.UUID value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            com.grpc.store.UUID.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.store.UUID id = 1;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.grpc.store.UUID id = 1;</code>
     */
    public com.grpc.store.UUID.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.grpc.store.UUID id = 1;</code>
     */
    public com.grpc.store.UUIDOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            com.grpc.store.UUID.getDefaultInstance() : id_;
      }
    }
    /**
     * <code>.com.grpc.store.UUID id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.store.UUID, com.grpc.store.UUID.Builder, com.grpc.store.UUIDOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpc.store.UUID, com.grpc.store.UUID.Builder, com.grpc.store.UUIDOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private int count_ ;
    /**
     * <code>int32 count = 2;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 2;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private com.grpc.store.Dimension dimension_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.store.Dimension, com.grpc.store.Dimension.Builder, com.grpc.store.DimensionOrBuilder> dimensionBuilder_;
    /**
     * <code>.com.grpc.store.Dimension dimension = 3;</code>
     * @return Whether the dimension field is set.
     */
    public boolean hasDimension() {
      return dimensionBuilder_ != null || dimension_ != null;
    }
    /**
     * <code>.com.grpc.store.Dimension dimension = 3;</code>
     * @return The dimension.
     */
    public com.grpc.store.Dimension getDimension() {
      if (dimensionBuilder_ == null) {
        return dimension_ == null ? com.grpc.store.Dimension.getDefaultInstance() : dimension_;
      } else {
        return dimensionBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.grpc.store.Dimension dimension = 3;</code>
     */
    public Builder setDimension(com.grpc.store.Dimension value) {
      if (dimensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dimension_ = value;
        onChanged();
      } else {
        dimensionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.store.Dimension dimension = 3;</code>
     */
    public Builder setDimension(
        com.grpc.store.Dimension.Builder builderForValue) {
      if (dimensionBuilder_ == null) {
        dimension_ = builderForValue.build();
        onChanged();
      } else {
        dimensionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.grpc.store.Dimension dimension = 3;</code>
     */
    public Builder mergeDimension(com.grpc.store.Dimension value) {
      if (dimensionBuilder_ == null) {
        if (dimension_ != null) {
          dimension_ =
            com.grpc.store.Dimension.newBuilder(dimension_).mergeFrom(value).buildPartial();
        } else {
          dimension_ = value;
        }
        onChanged();
      } else {
        dimensionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.store.Dimension dimension = 3;</code>
     */
    public Builder clearDimension() {
      if (dimensionBuilder_ == null) {
        dimension_ = null;
        onChanged();
      } else {
        dimension_ = null;
        dimensionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.grpc.store.Dimension dimension = 3;</code>
     */
    public com.grpc.store.Dimension.Builder getDimensionBuilder() {
      
      onChanged();
      return getDimensionFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.grpc.store.Dimension dimension = 3;</code>
     */
    public com.grpc.store.DimensionOrBuilder getDimensionOrBuilder() {
      if (dimensionBuilder_ != null) {
        return dimensionBuilder_.getMessageOrBuilder();
      } else {
        return dimension_ == null ?
            com.grpc.store.Dimension.getDefaultInstance() : dimension_;
      }
    }
    /**
     * <code>.com.grpc.store.Dimension dimension = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.store.Dimension, com.grpc.store.Dimension.Builder, com.grpc.store.DimensionOrBuilder> 
        getDimensionFieldBuilder() {
      if (dimensionBuilder_ == null) {
        dimensionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpc.store.Dimension, com.grpc.store.Dimension.Builder, com.grpc.store.DimensionOrBuilder>(
                getDimension(),
                getParentForChildren(),
                isClean());
        dimension_ = null;
      }
      return dimensionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.grpc.store.Bay)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.store.Bay)
  private static final com.grpc.store.Bay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.store.Bay();
  }

  public static com.grpc.store.Bay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Bay>
      PARSER = new com.google.protobuf.AbstractParser<Bay>() {
    @java.lang.Override
    public Bay parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Bay(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Bay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Bay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.store.Bay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
