// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HeartBeat.proto

package com.game.qs.model.proto;

public final class HeartBeatModel {
  private HeartBeatModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HeartBeatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HeartBeat)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 hit = 1;</code>
     */
    int getHit();
  }
  /**
   * Protobuf type {@code HeartBeat}
   */
  public  static final class HeartBeat extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HeartBeat)
      HeartBeatOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HeartBeat.newBuilder() to construct.
    private HeartBeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HeartBeat() {
      hit_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HeartBeat(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 8: {

              hit_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return com.game.qs.model.proto.HeartBeatModel.internal_static_HeartBeat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.game.qs.model.proto.HeartBeatModel.internal_static_HeartBeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.game.qs.model.proto.HeartBeatModel.HeartBeat.class, com.game.qs.model.proto.HeartBeatModel.HeartBeat.Builder.class);
    }

    public static final int HIT_FIELD_NUMBER = 1;
    private int hit_;
    /**
     * <code>int32 hit = 1;</code>
     */
    public int getHit() {
      return hit_;
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
      if (hit_ != 0) {
        output.writeInt32(1, hit_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, hit_);
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
      if (!(obj instanceof com.game.qs.model.proto.HeartBeatModel.HeartBeat)) {
        return super.equals(obj);
      }
      com.game.qs.model.proto.HeartBeatModel.HeartBeat other = (com.game.qs.model.proto.HeartBeatModel.HeartBeat) obj;

      boolean result = true;
      result = result && (getHit()
          == other.getHit());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HIT_FIELD_NUMBER;
      hash = (53 * hash) + getHit();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat parseFrom(
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
    public static Builder newBuilder(com.game.qs.model.proto.HeartBeatModel.HeartBeat prototype) {
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
     * Protobuf type {@code HeartBeat}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HeartBeat)
        com.game.qs.model.proto.HeartBeatModel.HeartBeatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.game.qs.model.proto.HeartBeatModel.internal_static_HeartBeat_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.game.qs.model.proto.HeartBeatModel.internal_static_HeartBeat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.game.qs.model.proto.HeartBeatModel.HeartBeat.class, com.game.qs.model.proto.HeartBeatModel.HeartBeat.Builder.class);
      }

      // Construct using com.game.qs.model.proto.HeartBeatModel.HeartBeat.newBuilder()
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
        hit_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.game.qs.model.proto.HeartBeatModel.internal_static_HeartBeat_descriptor;
      }

      @java.lang.Override
      public com.game.qs.model.proto.HeartBeatModel.HeartBeat getDefaultInstanceForType() {
        return com.game.qs.model.proto.HeartBeatModel.HeartBeat.getDefaultInstance();
      }

      @java.lang.Override
      public com.game.qs.model.proto.HeartBeatModel.HeartBeat build() {
        com.game.qs.model.proto.HeartBeatModel.HeartBeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.game.qs.model.proto.HeartBeatModel.HeartBeat buildPartial() {
        com.game.qs.model.proto.HeartBeatModel.HeartBeat result = new com.game.qs.model.proto.HeartBeatModel.HeartBeat(this);
        result.hit_ = hit_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.game.qs.model.proto.HeartBeatModel.HeartBeat) {
          return mergeFrom((com.game.qs.model.proto.HeartBeatModel.HeartBeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.game.qs.model.proto.HeartBeatModel.HeartBeat other) {
        if (other == com.game.qs.model.proto.HeartBeatModel.HeartBeat.getDefaultInstance()) return this;
        if (other.getHit() != 0) {
          setHit(other.getHit());
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
        com.game.qs.model.proto.HeartBeatModel.HeartBeat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.game.qs.model.proto.HeartBeatModel.HeartBeat) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int hit_ ;
      /**
       * <code>int32 hit = 1;</code>
       */
      public int getHit() {
        return hit_;
      }
      /**
       * <code>int32 hit = 1;</code>
       */
      public Builder setHit(int value) {
        
        hit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 hit = 1;</code>
       */
      public Builder clearHit() {
        
        hit_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HeartBeat)
    }

    // @@protoc_insertion_point(class_scope:HeartBeat)
    private static final com.game.qs.model.proto.HeartBeatModel.HeartBeat DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.game.qs.model.proto.HeartBeatModel.HeartBeat();
    }

    public static com.game.qs.model.proto.HeartBeatModel.HeartBeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HeartBeat>
        PARSER = new com.google.protobuf.AbstractParser<HeartBeat>() {
      @java.lang.Override
      public HeartBeat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HeartBeat(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HeartBeat> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HeartBeat> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.game.qs.model.proto.HeartBeatModel.HeartBeat getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartBeat_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HeartBeat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017HeartBeat.proto\"\030\n\tHeartBeat\022\013\n\003hit\030\001 " +
      "\001(\005B)\n\027com.game.qs.model.protoB\016HeartBea" +
      "tModelb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_HeartBeat_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HeartBeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HeartBeat_descriptor,
        new java.lang.String[] { "Hit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}