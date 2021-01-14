package com.grpc.store;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: store.proto")
public final class StoreServiceGrpc {

  private StoreServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.store.StoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.store.Store,
      com.google.protobuf.Empty> getAddStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addStore",
      requestType = com.grpc.store.Store.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.store.Store,
      com.google.protobuf.Empty> getAddStoreMethod() {
    io.grpc.MethodDescriptor<com.grpc.store.Store, com.google.protobuf.Empty> getAddStoreMethod;
    if ((getAddStoreMethod = StoreServiceGrpc.getAddStoreMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getAddStoreMethod = StoreServiceGrpc.getAddStoreMethod) == null) {
          StoreServiceGrpc.getAddStoreMethod = getAddStoreMethod =
              io.grpc.MethodDescriptor.<com.grpc.store.Store, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addStore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.store.Store.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("addStore"))
              .build();
        }
      }
    }
    return getAddStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.store.StoreCall,
      com.grpc.store.Store> getChangeStoreStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeStoreStatus",
      requestType = com.grpc.store.StoreCall.class,
      responseType = com.grpc.store.Store.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.store.StoreCall,
      com.grpc.store.Store> getChangeStoreStatusMethod() {
    io.grpc.MethodDescriptor<com.grpc.store.StoreCall, com.grpc.store.Store> getChangeStoreStatusMethod;
    if ((getChangeStoreStatusMethod = StoreServiceGrpc.getChangeStoreStatusMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getChangeStoreStatusMethod = StoreServiceGrpc.getChangeStoreStatusMethod) == null) {
          StoreServiceGrpc.getChangeStoreStatusMethod = getChangeStoreStatusMethod =
              io.grpc.MethodDescriptor.<com.grpc.store.StoreCall, com.grpc.store.Store>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changeStoreStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.store.StoreCall.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.store.Store.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("changeStoreStatus"))
              .build();
        }
      }
    }
    return getChangeStoreStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.store.StoreCall,
      com.grpc.store.Store> getAddBayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addBay",
      requestType = com.grpc.store.StoreCall.class,
      responseType = com.grpc.store.Store.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.store.StoreCall,
      com.grpc.store.Store> getAddBayMethod() {
    io.grpc.MethodDescriptor<com.grpc.store.StoreCall, com.grpc.store.Store> getAddBayMethod;
    if ((getAddBayMethod = StoreServiceGrpc.getAddBayMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getAddBayMethod = StoreServiceGrpc.getAddBayMethod) == null) {
          StoreServiceGrpc.getAddBayMethod = getAddBayMethod =
              io.grpc.MethodDescriptor.<com.grpc.store.StoreCall, com.grpc.store.Store>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addBay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.store.StoreCall.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.store.Store.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("addBay"))
              .build();
        }
      }
    }
    return getAddBayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.store.StoreCall,
      com.grpc.store.Store> getAddAisleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addAisle",
      requestType = com.grpc.store.StoreCall.class,
      responseType = com.grpc.store.Store.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.store.StoreCall,
      com.grpc.store.Store> getAddAisleMethod() {
    io.grpc.MethodDescriptor<com.grpc.store.StoreCall, com.grpc.store.Store> getAddAisleMethod;
    if ((getAddAisleMethod = StoreServiceGrpc.getAddAisleMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getAddAisleMethod = StoreServiceGrpc.getAddAisleMethod) == null) {
          StoreServiceGrpc.getAddAisleMethod = getAddAisleMethod =
              io.grpc.MethodDescriptor.<com.grpc.store.StoreCall, com.grpc.store.Store>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addAisle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.store.StoreCall.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.store.Store.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("addAisle"))
              .build();
        }
      }
    }
    return getAddAisleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.store.StoreCall,
      com.grpc.store.Store> getChangeTimingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeTiming",
      requestType = com.grpc.store.StoreCall.class,
      responseType = com.grpc.store.Store.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.store.StoreCall,
      com.grpc.store.Store> getChangeTimingMethod() {
    io.grpc.MethodDescriptor<com.grpc.store.StoreCall, com.grpc.store.Store> getChangeTimingMethod;
    if ((getChangeTimingMethod = StoreServiceGrpc.getChangeTimingMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getChangeTimingMethod = StoreServiceGrpc.getChangeTimingMethod) == null) {
          StoreServiceGrpc.getChangeTimingMethod = getChangeTimingMethod =
              io.grpc.MethodDescriptor.<com.grpc.store.StoreCall, com.grpc.store.Store>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changeTiming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.store.StoreCall.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.store.Store.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("changeTiming"))
              .build();
        }
      }
    }
    return getChangeTimingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.store.StoreCall,
      com.grpc.store.Store> getChangeContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeContact",
      requestType = com.grpc.store.StoreCall.class,
      responseType = com.grpc.store.Store.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.store.StoreCall,
      com.grpc.store.Store> getChangeContactMethod() {
    io.grpc.MethodDescriptor<com.grpc.store.StoreCall, com.grpc.store.Store> getChangeContactMethod;
    if ((getChangeContactMethod = StoreServiceGrpc.getChangeContactMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getChangeContactMethod = StoreServiceGrpc.getChangeContactMethod) == null) {
          StoreServiceGrpc.getChangeContactMethod = getChangeContactMethod =
              io.grpc.MethodDescriptor.<com.grpc.store.StoreCall, com.grpc.store.Store>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changeContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.store.StoreCall.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.store.Store.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("changeContact"))
              .build();
        }
      }
    }
    return getChangeContactMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceStub>() {
        @java.lang.Override
        public StoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceStub(channel, callOptions);
        }
      };
    return StoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceBlockingStub>() {
        @java.lang.Override
        public StoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceBlockingStub(channel, callOptions);
        }
      };
    return StoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceFutureStub>() {
        @java.lang.Override
        public StoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceFutureStub(channel, callOptions);
        }
      };
    return StoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StoreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addStore(com.grpc.store.Store request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddStoreMethod(), responseObserver);
    }

    /**
     */
    public void changeStoreStatus(com.grpc.store.StoreCall request,
        io.grpc.stub.StreamObserver<com.grpc.store.Store> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeStoreStatusMethod(), responseObserver);
    }

    /**
     */
    public void addBay(com.grpc.store.StoreCall request,
        io.grpc.stub.StreamObserver<com.grpc.store.Store> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBayMethod(), responseObserver);
    }

    /**
     */
    public void addAisle(com.grpc.store.StoreCall request,
        io.grpc.stub.StreamObserver<com.grpc.store.Store> responseObserver) {
      asyncUnimplementedUnaryCall(getAddAisleMethod(), responseObserver);
    }

    /**
     */
    public void changeTiming(com.grpc.store.StoreCall request,
        io.grpc.stub.StreamObserver<com.grpc.store.Store> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeTimingMethod(), responseObserver);
    }

    /**
     */
    public void changeContact(com.grpc.store.StoreCall request,
        io.grpc.stub.StreamObserver<com.grpc.store.Store> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeContactMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddStoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.store.Store,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_STORE)))
          .addMethod(
            getChangeStoreStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.store.StoreCall,
                com.grpc.store.Store>(
                  this, METHODID_CHANGE_STORE_STATUS)))
          .addMethod(
            getAddBayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.store.StoreCall,
                com.grpc.store.Store>(
                  this, METHODID_ADD_BAY)))
          .addMethod(
            getAddAisleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.store.StoreCall,
                com.grpc.store.Store>(
                  this, METHODID_ADD_AISLE)))
          .addMethod(
            getChangeTimingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.store.StoreCall,
                com.grpc.store.Store>(
                  this, METHODID_CHANGE_TIMING)))
          .addMethod(
            getChangeContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.store.StoreCall,
                com.grpc.store.Store>(
                  this, METHODID_CHANGE_CONTACT)))
          .build();
    }
  }

  /**
   */
  public static final class StoreServiceStub extends io.grpc.stub.AbstractAsyncStub<StoreServiceStub> {
    private StoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void addStore(com.grpc.store.Store request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeStoreStatus(com.grpc.store.StoreCall request,
        io.grpc.stub.StreamObserver<com.grpc.store.Store> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeStoreStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addBay(com.grpc.store.StoreCall request,
        io.grpc.stub.StreamObserver<com.grpc.store.Store> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addAisle(com.grpc.store.StoreCall request,
        io.grpc.stub.StreamObserver<com.grpc.store.Store> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddAisleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeTiming(com.grpc.store.StoreCall request,
        io.grpc.stub.StreamObserver<com.grpc.store.Store> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeTimingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeContact(com.grpc.store.StoreCall request,
        io.grpc.stub.StreamObserver<com.grpc.store.Store> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeContactMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StoreServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StoreServiceBlockingStub> {
    private StoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty addStore(com.grpc.store.Store request) {
      return blockingUnaryCall(
          getChannel(), getAddStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.store.Store changeStoreStatus(com.grpc.store.StoreCall request) {
      return blockingUnaryCall(
          getChannel(), getChangeStoreStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.store.Store addBay(com.grpc.store.StoreCall request) {
      return blockingUnaryCall(
          getChannel(), getAddBayMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.store.Store addAisle(com.grpc.store.StoreCall request) {
      return blockingUnaryCall(
          getChannel(), getAddAisleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.store.Store changeTiming(com.grpc.store.StoreCall request) {
      return blockingUnaryCall(
          getChannel(), getChangeTimingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.store.Store changeContact(com.grpc.store.StoreCall request) {
      return blockingUnaryCall(
          getChannel(), getChangeContactMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StoreServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StoreServiceFutureStub> {
    private StoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addStore(
        com.grpc.store.Store request) {
      return futureUnaryCall(
          getChannel().newCall(getAddStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.store.Store> changeStoreStatus(
        com.grpc.store.StoreCall request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeStoreStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.store.Store> addBay(
        com.grpc.store.StoreCall request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.store.Store> addAisle(
        com.grpc.store.StoreCall request) {
      return futureUnaryCall(
          getChannel().newCall(getAddAisleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.store.Store> changeTiming(
        com.grpc.store.StoreCall request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeTimingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.store.Store> changeContact(
        com.grpc.store.StoreCall request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeContactMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_STORE = 0;
  private static final int METHODID_CHANGE_STORE_STATUS = 1;
  private static final int METHODID_ADD_BAY = 2;
  private static final int METHODID_ADD_AISLE = 3;
  private static final int METHODID_CHANGE_TIMING = 4;
  private static final int METHODID_CHANGE_CONTACT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_STORE:
          serviceImpl.addStore((com.grpc.store.Store) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CHANGE_STORE_STATUS:
          serviceImpl.changeStoreStatus((com.grpc.store.StoreCall) request,
              (io.grpc.stub.StreamObserver<com.grpc.store.Store>) responseObserver);
          break;
        case METHODID_ADD_BAY:
          serviceImpl.addBay((com.grpc.store.StoreCall) request,
              (io.grpc.stub.StreamObserver<com.grpc.store.Store>) responseObserver);
          break;
        case METHODID_ADD_AISLE:
          serviceImpl.addAisle((com.grpc.store.StoreCall) request,
              (io.grpc.stub.StreamObserver<com.grpc.store.Store>) responseObserver);
          break;
        case METHODID_CHANGE_TIMING:
          serviceImpl.changeTiming((com.grpc.store.StoreCall) request,
              (io.grpc.stub.StreamObserver<com.grpc.store.Store>) responseObserver);
          break;
        case METHODID_CHANGE_CONTACT:
          serviceImpl.changeContact((com.grpc.store.StoreCall) request,
              (io.grpc.stub.StreamObserver<com.grpc.store.Store>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.store.StoreCover.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StoreService");
    }
  }

  private static final class StoreServiceFileDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier {
    StoreServiceFileDescriptorSupplier() {}
  }

  private static final class StoreServiceMethodDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StoreServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreServiceFileDescriptorSupplier())
              .addMethod(getAddStoreMethod())
              .addMethod(getChangeStoreStatusMethod())
              .addMethod(getAddBayMethod())
              .addMethod(getAddAisleMethod())
              .addMethod(getChangeTimingMethod())
              .addMethod(getChangeContactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
