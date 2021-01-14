// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package com.grpc.store;

/**
 * Protobuf type {@code com.grpc.store.Timing}
 */
public final class Timing extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.store.Timing)
    TimingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Timing.newBuilder() to construct.
  private Timing(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Timing() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Timing();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Timing(
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
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (openAt_ != null) {
              subBuilder = openAt_.toBuilder();
            }
            openAt_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(openAt_);
              openAt_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (closeAt_ != null) {
              subBuilder = closeAt_.toBuilder();
            }
            closeAt_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(closeAt_);
              closeAt_ = subBuilder.buildPartial();
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
    return com.grpc.store.StoreCover.internal_static_com_grpc_store_Timing_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.store.StoreCover.internal_static_com_grpc_store_Timing_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.store.Timing.class, com.grpc.store.Timing.Builder.class);
  }

  public static final int OPENAT_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp openAt_;
  /**
   * <code>.google.protobuf.Timestamp openAt = 1;</code>
   * @return Whether the openAt field is set.
   */
  @java.lang.Override
  public boolean hasOpenAt() {
    return openAt_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp openAt = 1;</code>
   * @return The openAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getOpenAt() {
    return openAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : openAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp openAt = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getOpenAtOrBuilder() {
    return getOpenAt();
  }

  public static final int CLOSEAT_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp closeAt_;
  /**
   * <code>.google.protobuf.Timestamp closeAt = 2;</code>
   * @return Whether the closeAt field is set.
   */
  @java.lang.Override
  public boolean hasCloseAt() {
    return closeAt_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp closeAt = 2;</code>
   * @return The closeAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCloseAt() {
    return closeAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : closeAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp closeAt = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCloseAtOrBuilder() {
    return getCloseAt();
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
    if (openAt_ != null) {
      output.writeMessage(1, getOpenAt());
    }
    if (closeAt_ != null) {
      output.writeMessage(2, getCloseAt());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (openAt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOpenAt());
    }
    if (closeAt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCloseAt());
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
    if (!(obj instanceof com.grpc.store.Timing)) {
      return super.equals(obj);
    }
    com.grpc.store.Timing other = (com.grpc.store.Timing) obj;

    if (hasOpenAt() != other.hasOpenAt()) return false;
    if (hasOpenAt()) {
      if (!getOpenAt()
          .equals(other.getOpenAt())) return false;
    }
    if (hasCloseAt() != other.hasCloseAt()) return false;
    if (hasCloseAt()) {
      if (!getCloseAt()
          .equals(other.getCloseAt())) return false;
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
    if (hasOpenAt()) {
      hash = (37 * hash) + OPENAT_FIELD_NUMBER;
      hash = (53 * hash) + getOpenAt().hashCode();
    }
    if (hasCloseAt()) {
      hash = (37 * hash) + CLOSEAT_FIELD_NUMBER;
      hash = (53 * hash) + getCloseAt().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.store.Timing parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.store.Timing parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.store.Timing parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.store.Timing parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.store.Timing parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.store.Timing parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.store.Timing parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.store.Timing parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.store.Timing parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.store.Timing parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.store.Timing parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.store.Timing parseFrom(
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
  public static Builder newBuilder(com.grpc.store.Timing prototype) {
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
   * Protobuf type {@code com.grpc.store.Timing}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.store.Timing)
      com.grpc.store.TimingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.store.StoreCover.internal_static_com_grpc_store_Timing_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.store.StoreCover.internal_static_com_grpc_store_Timing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.store.Timing.class, com.grpc.store.Timing.Builder.class);
    }

    // Construct using com.grpc.store.Timing.newBuilder()
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
      if (openAtBuilder_ == null) {
        openAt_ = null;
      } else {
        openAt_ = null;
        openAtBuilder_ = null;
      }
      if (closeAtBuilder_ == null) {
        closeAt_ = null;
      } else {
        closeAt_ = null;
        closeAtBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.store.StoreCover.internal_static_com_grpc_store_Timing_descriptor;
    }

    @java.lang.Override
    public com.grpc.store.Timing getDefaultInstanceForType() {
      return com.grpc.store.Timing.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.store.Timing build() {
      com.grpc.store.Timing result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.store.Timing buildPartial() {
      com.grpc.store.Timing result = new com.grpc.store.Timing(this);
      if (openAtBuilder_ == null) {
        result.openAt_ = openAt_;
      } else {
        result.openAt_ = openAtBuilder_.build();
      }
      if (closeAtBuilder_ == null) {
        result.closeAt_ = closeAt_;
      } else {
        result.closeAt_ = closeAtBuilder_.build();
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
      if (other instanceof com.grpc.store.Timing) {
        return mergeFrom((com.grpc.store.Timing)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.store.Timing other) {
      if (other == com.grpc.store.Timing.getDefaultInstance()) return this;
      if (other.hasOpenAt()) {
        mergeOpenAt(other.getOpenAt());
      }
      if (other.hasCloseAt()) {
        mergeCloseAt(other.getCloseAt());
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
      com.grpc.store.Timing parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.store.Timing) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp openAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> openAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp openAt = 1;</code>
     * @return Whether the openAt field is set.
     */
    public boolean hasOpenAt() {
      return openAtBuilder_ != null || openAt_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp openAt = 1;</code>
     * @return The openAt.
     */
    public com.google.protobuf.Timestamp getOpenAt() {
      if (openAtBuilder_ == null) {
        return openAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : openAt_;
      } else {
        return openAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp openAt = 1;</code>
     */
    public Builder setOpenAt(com.google.protobuf.Timestamp value) {
      if (openAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        openAt_ = value;
        onChanged();
      } else {
        openAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp openAt = 1;</code>
     */
    public Builder setOpenAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (openAtBuilder_ == null) {
        openAt_ = builderForValue.build();
        onChanged();
      } else {
        openAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp openAt = 1;</code>
     */
    public Builder mergeOpenAt(com.google.protobuf.Timestamp value) {
      if (openAtBuilder_ == null) {
        if (openAt_ != null) {
          openAt_ =
            com.google.protobuf.Timestamp.newBuilder(openAt_).mergeFrom(value).buildPartial();
        } else {
          openAt_ = value;
        }
        onChanged();
      } else {
        openAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp openAt = 1;</code>
     */
    public Builder clearOpenAt() {
      if (openAtBuilder_ == null) {
        openAt_ = null;
        onChanged();
      } else {
        openAt_ = null;
        openAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp openAt = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getOpenAtBuilder() {
      
      onChanged();
      return getOpenAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp openAt = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getOpenAtOrBuilder() {
      if (openAtBuilder_ != null) {
        return openAtBuilder_.getMessageOrBuilder();
      } else {
        return openAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : openAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp openAt = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getOpenAtFieldBuilder() {
      if (openAtBuilder_ == null) {
        openAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getOpenAt(),
                getParentForChildren(),
                isClean());
        openAt_ = null;
      }
      return openAtBuilder_;
    }

    private com.google.protobuf.Timestamp closeAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> closeAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp closeAt = 2;</code>
     * @return Whether the closeAt field is set.
     */
    public boolean hasCloseAt() {
      return closeAtBuilder_ != null || closeAt_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp closeAt = 2;</code>
     * @return The closeAt.
     */
    public com.google.protobuf.Timestamp getCloseAt() {
      if (closeAtBuilder_ == null) {
        return closeAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : closeAt_;
      } else {
        return closeAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp closeAt = 2;</code>
     */
    public Builder setCloseAt(com.google.protobuf.Timestamp value) {
      if (closeAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        closeAt_ = value;
        onChanged();
      } else {
        closeAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp closeAt = 2;</code>
     */
    public Builder setCloseAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (closeAtBuilder_ == null) {
        closeAt_ = builderForValue.build();
        onChanged();
      } else {
        closeAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp closeAt = 2;</code>
     */
    public Builder mergeCloseAt(com.google.protobuf.Timestamp value) {
      if (closeAtBuilder_ == null) {
        if (closeAt_ != null) {
          closeAt_ =
            com.google.protobuf.Timestamp.newBuilder(closeAt_).mergeFrom(value).buildPartial();
        } else {
          closeAt_ = value;
        }
        onChanged();
      } else {
        closeAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp closeAt = 2;</code>
     */
    public Builder clearCloseAt() {
      if (closeAtBuilder_ == null) {
        closeAt_ = null;
        onChanged();
      } else {
        closeAt_ = null;
        closeAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp closeAt = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCloseAtBuilder() {
      
      onChanged();
      return getCloseAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp closeAt = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCloseAtOrBuilder() {
      if (closeAtBuilder_ != null) {
        return closeAtBuilder_.getMessageOrBuilder();
      } else {
        return closeAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : closeAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp closeAt = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCloseAtFieldBuilder() {
      if (closeAtBuilder_ == null) {
        closeAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCloseAt(),
                getParentForChildren(),
                isClean());
        closeAt_ = null;
      }
      return closeAtBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.store.Timing)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.store.Timing)
  private static final com.grpc.store.Timing DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.store.Timing();
  }

  public static com.grpc.store.Timing getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Timing>
      PARSER = new com.google.protobuf.AbstractParser<Timing>() {
    @java.lang.Override
    public Timing parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Timing(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Timing> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Timing> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.store.Timing getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
