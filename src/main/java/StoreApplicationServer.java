import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.StoreServiceImpl;

import java.io.IOException;

public class StoreApplicationServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder.forPort(8080).addService(new StoreServiceImpl()).build();
        server.start();
        server.awaitTermination();
    }
}
