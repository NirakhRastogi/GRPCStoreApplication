package service;

import com.google.protobuf.Empty;
import com.grpc.store.Aisle;
import com.grpc.store.Store;
import com.grpc.store.StoreCall;
import com.grpc.store.StoreServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class StoreServiceImpl extends StoreServiceGrpc.StoreServiceImplBase {

    List<Store> stores = new ArrayList<>();

    @Override
    public void addStore(Store request, StreamObserver<Empty> responseObserver) {
        stores.add(request);
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void changeStoreStatus(StoreCall request, StreamObserver<Store> responseObserver) {

        Store _store = null;

        for (Store store : stores) {
            if (store.getId().equals(request.getId())) {
                _store = store.toBuilder().setStatus(request.getStatus()).build();
                stores.remove(store);
                stores.add(_store);
                break;
            }
        }
        responseObserver.onNext(_store);
        responseObserver.onCompleted();
    }

    @Override
    public void addBay(StoreCall request, StreamObserver<Store> responseObserver) {

        Store _store = null;
        for (Store store : stores) {
            if (store.getId().equals(request.getId())) {
                int index = -1;
                for (Aisle aisle : store.getAislesList()) {
                    if (aisle.getId().equals(request.getAisle().getId())) {
                        index++;
                        break;
                    }
                }
                if (index != -1) {
                    Aisle _aisle = store.toBuilder().getAisles(index).toBuilder().addBays(request.getBay()).build();
                    store.toBuilder().removeAisles(index);
                    _store = store.toBuilder().addAisles(_aisle).build();
                    stores.remove(store);
                    stores.add(_store);
                }
            }
        }


        responseObserver.onNext(_store);
        responseObserver.onCompleted();
    }

    @Override
    public void addAisle(StoreCall request, StreamObserver<Store> responseObserver) {
        Store _store = null;
        for (Store store : stores) {
            if (store.getId().equals(request.getId())) {
                _store = store.toBuilder().addAisles(request.getAisle()).build();
                stores.remove(store);
                stores.add(_store);
                break;
            }
        }

        responseObserver.onNext(_store);
        responseObserver.onCompleted();
    }

    @Override
    public void changeTiming(StoreCall request, StreamObserver<Store> responseObserver) {

        Store _store = null;

        for (Store store : stores) {
            if (store.getId().equals(request.getId())) {
                _store = store.toBuilder().setTiming(request.getTiming()).build();
                stores.remove(store);
                stores.add(_store);
                break;
            }
        }

        responseObserver.onNext(_store);
        responseObserver.onCompleted();
    }

    @Override
    public void changeContact(StoreCall request, StreamObserver<Store> responseObserver) {
        Store _store = null;
        for (Store store : stores) {
            if (store.getId().equals(request.getId())) {
                _store = store.toBuilder().setContact(request.getContact()).build();
                stores.remove(store);
                stores.add(_store);
                break;
            }
        }

        responseObserver.onNext(_store);
        responseObserver.onCompleted();
    }
}
