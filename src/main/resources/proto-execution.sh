#Store Proto
protoc --plugin=protoc-gen-grpc-java=D:\Softwares\GRPC-Java\protoc-gen-grpc-java-1.34.1-windows-x86_64.exe -I=. --java_out=../java --grpc-java_out=../java ./store.proto
