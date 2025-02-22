// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DeliveryActivityDetailInfo.proto

package emu.grasscutter.net.proto;

public final class DeliveryActivityDetailInfoOuterClass {
  private DeliveryActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DeliveryActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DeliveryActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_taken_reward = 3;</code>
     * @return The isTakenReward.
     */
    boolean getIsTakenReward();

    /**
     * <code>uint32 day_index = 5;</code>
     * @return The dayIndex.
     */
    int getDayIndex();

    /**
     * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
     * @return A list containing the finishedDeliveryQuestIndex.
     */
    java.util.List<java.lang.Integer> getFinishedDeliveryQuestIndexList();
    /**
     * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
     * @return The count of finishedDeliveryQuestIndex.
     */
    int getFinishedDeliveryQuestIndexCount();
    /**
     * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
     * @param index The index of the element to return.
     * @return The finishedDeliveryQuestIndex at the given index.
     */
    int getFinishedDeliveryQuestIndex(int index);
  }
  /**
   * <pre>
   * Name: KCLDPAAOLOE
   * </pre>
   *
   * Protobuf type {@code DeliveryActivityDetailInfo}
   */
  public static final class DeliveryActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DeliveryActivityDetailInfo)
      DeliveryActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DeliveryActivityDetailInfo.newBuilder() to construct.
    private DeliveryActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DeliveryActivityDetailInfo() {
      finishedDeliveryQuestIndex_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DeliveryActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DeliveryActivityDetailInfo(
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
            case 24: {

              isTakenReward_ = input.readBool();
              break;
            }
            case 40: {

              dayIndex_ = input.readUInt32();
              break;
            }
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                finishedDeliveryQuestIndex_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              finishedDeliveryQuestIndex_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                finishedDeliveryQuestIndex_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                finishedDeliveryQuestIndex_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          finishedDeliveryQuestIndex_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.internal_static_DeliveryActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.internal_static_DeliveryActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo.class, emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo.Builder.class);
    }

    public static final int IS_TAKEN_REWARD_FIELD_NUMBER = 3;
    private boolean isTakenReward_;
    /**
     * <code>bool is_taken_reward = 3;</code>
     * @return The isTakenReward.
     */
    @java.lang.Override
    public boolean getIsTakenReward() {
      return isTakenReward_;
    }

    public static final int DAY_INDEX_FIELD_NUMBER = 5;
    private int dayIndex_;
    /**
     * <code>uint32 day_index = 5;</code>
     * @return The dayIndex.
     */
    @java.lang.Override
    public int getDayIndex() {
      return dayIndex_;
    }

    public static final int FINISHED_DELIVERY_QUEST_INDEX_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList finishedDeliveryQuestIndex_;
    /**
     * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
     * @return A list containing the finishedDeliveryQuestIndex.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFinishedDeliveryQuestIndexList() {
      return finishedDeliveryQuestIndex_;
    }
    /**
     * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
     * @return The count of finishedDeliveryQuestIndex.
     */
    public int getFinishedDeliveryQuestIndexCount() {
      return finishedDeliveryQuestIndex_.size();
    }
    /**
     * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
     * @param index The index of the element to return.
     * @return The finishedDeliveryQuestIndex at the given index.
     */
    public int getFinishedDeliveryQuestIndex(int index) {
      return finishedDeliveryQuestIndex_.getInt(index);
    }
    private int finishedDeliveryQuestIndexMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (isTakenReward_ != false) {
        output.writeBool(3, isTakenReward_);
      }
      if (dayIndex_ != 0) {
        output.writeUInt32(5, dayIndex_);
      }
      if (getFinishedDeliveryQuestIndexList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(finishedDeliveryQuestIndexMemoizedSerializedSize);
      }
      for (int i = 0; i < finishedDeliveryQuestIndex_.size(); i++) {
        output.writeUInt32NoTag(finishedDeliveryQuestIndex_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isTakenReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isTakenReward_);
      }
      if (dayIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, dayIndex_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < finishedDeliveryQuestIndex_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(finishedDeliveryQuestIndex_.getInt(i));
        }
        size += dataSize;
        if (!getFinishedDeliveryQuestIndexList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        finishedDeliveryQuestIndexMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo other = (emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo) obj;

      if (getIsTakenReward()
          != other.getIsTakenReward()) return false;
      if (getDayIndex()
          != other.getDayIndex()) return false;
      if (!getFinishedDeliveryQuestIndexList()
          .equals(other.getFinishedDeliveryQuestIndexList())) return false;
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
      hash = (37 * hash) + IS_TAKEN_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTakenReward());
      hash = (37 * hash) + DAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDayIndex();
      if (getFinishedDeliveryQuestIndexCount() > 0) {
        hash = (37 * hash) + FINISHED_DELIVERY_QUEST_INDEX_FIELD_NUMBER;
        hash = (53 * hash) + getFinishedDeliveryQuestIndexList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo prototype) {
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
     * <pre>
     * Name: KCLDPAAOLOE
     * </pre>
     *
     * Protobuf type {@code DeliveryActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DeliveryActivityDetailInfo)
        emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.internal_static_DeliveryActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.internal_static_DeliveryActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo.class, emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo.newBuilder()
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
        isTakenReward_ = false;

        dayIndex_ = 0;

        finishedDeliveryQuestIndex_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.internal_static_DeliveryActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo build() {
        emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo buildPartial() {
        emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo result = new emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        result.isTakenReward_ = isTakenReward_;
        result.dayIndex_ = dayIndex_;
        if (((bitField0_ & 0x00000001) != 0)) {
          finishedDeliveryQuestIndex_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.finishedDeliveryQuestIndex_ = finishedDeliveryQuestIndex_;
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
        if (other instanceof emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo other) {
        if (other == emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo.getDefaultInstance()) return this;
        if (other.getIsTakenReward() != false) {
          setIsTakenReward(other.getIsTakenReward());
        }
        if (other.getDayIndex() != 0) {
          setDayIndex(other.getDayIndex());
        }
        if (!other.finishedDeliveryQuestIndex_.isEmpty()) {
          if (finishedDeliveryQuestIndex_.isEmpty()) {
            finishedDeliveryQuestIndex_ = other.finishedDeliveryQuestIndex_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFinishedDeliveryQuestIndexIsMutable();
            finishedDeliveryQuestIndex_.addAll(other.finishedDeliveryQuestIndex_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isTakenReward_ ;
      /**
       * <code>bool is_taken_reward = 3;</code>
       * @return The isTakenReward.
       */
      @java.lang.Override
      public boolean getIsTakenReward() {
        return isTakenReward_;
      }
      /**
       * <code>bool is_taken_reward = 3;</code>
       * @param value The isTakenReward to set.
       * @return This builder for chaining.
       */
      public Builder setIsTakenReward(boolean value) {
        
        isTakenReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_taken_reward = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTakenReward() {
        
        isTakenReward_ = false;
        onChanged();
        return this;
      }

      private int dayIndex_ ;
      /**
       * <code>uint32 day_index = 5;</code>
       * @return The dayIndex.
       */
      @java.lang.Override
      public int getDayIndex() {
        return dayIndex_;
      }
      /**
       * <code>uint32 day_index = 5;</code>
       * @param value The dayIndex to set.
       * @return This builder for chaining.
       */
      public Builder setDayIndex(int value) {
        
        dayIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 day_index = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDayIndex() {
        
        dayIndex_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList finishedDeliveryQuestIndex_ = emptyIntList();
      private void ensureFinishedDeliveryQuestIndexIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          finishedDeliveryQuestIndex_ = mutableCopy(finishedDeliveryQuestIndex_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
       * @return A list containing the finishedDeliveryQuestIndex.
       */
      public java.util.List<java.lang.Integer>
          getFinishedDeliveryQuestIndexList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(finishedDeliveryQuestIndex_) : finishedDeliveryQuestIndex_;
      }
      /**
       * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
       * @return The count of finishedDeliveryQuestIndex.
       */
      public int getFinishedDeliveryQuestIndexCount() {
        return finishedDeliveryQuestIndex_.size();
      }
      /**
       * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
       * @param index The index of the element to return.
       * @return The finishedDeliveryQuestIndex at the given index.
       */
      public int getFinishedDeliveryQuestIndex(int index) {
        return finishedDeliveryQuestIndex_.getInt(index);
      }
      /**
       * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
       * @param index The index to set the value at.
       * @param value The finishedDeliveryQuestIndex to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedDeliveryQuestIndex(
          int index, int value) {
        ensureFinishedDeliveryQuestIndexIsMutable();
        finishedDeliveryQuestIndex_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
       * @param value The finishedDeliveryQuestIndex to add.
       * @return This builder for chaining.
       */
      public Builder addFinishedDeliveryQuestIndex(int value) {
        ensureFinishedDeliveryQuestIndexIsMutable();
        finishedDeliveryQuestIndex_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
       * @param values The finishedDeliveryQuestIndex to add.
       * @return This builder for chaining.
       */
      public Builder addAllFinishedDeliveryQuestIndex(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFinishedDeliveryQuestIndexIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, finishedDeliveryQuestIndex_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_delivery_quest_index = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedDeliveryQuestIndex() {
        finishedDeliveryQuestIndex_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:DeliveryActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:DeliveryActivityDetailInfo)
    private static final emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo();
    }

    public static emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeliveryActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<DeliveryActivityDetailInfo>() {
      @java.lang.Override
      public DeliveryActivityDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeliveryActivityDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DeliveryActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DeliveryActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DeliveryActivityDetailInfoOuterClass.DeliveryActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeliveryActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeliveryActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n DeliveryActivityDetailInfo.proto\"o\n\032De" +
      "liveryActivityDetailInfo\022\027\n\017is_taken_rew" +
      "ard\030\003 \001(\010\022\021\n\tday_index\030\005 \001(\r\022%\n\035finished" +
      "_delivery_quest_index\030\016 \003(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DeliveryActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DeliveryActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeliveryActivityDetailInfo_descriptor,
        new java.lang.String[] { "IsTakenReward", "DayIndex", "FinishedDeliveryQuestIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
