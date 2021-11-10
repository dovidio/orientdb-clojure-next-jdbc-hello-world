# orientdb-clojure-jdbc-playground

Minimal scaffolding to get started with OrientDB and Clojure using the [https://github.com/seancorfield/next-jdbc](next.jdbc driver).

## Usage

First, install and run OrientDB.

```bash
wget https://s3.us-east-2.amazonaws.com/orientdb3/releases/$ORIENTDBVERSION/orientdb-$ORIENTDBVERSION.tar.gz
tar -xzf orient*.tar.gz
rm orient*.tar.gz
mv orient* orientdb
sudo mv orientdb /opt/orientdb
cd /opt/orientdb/bin
./server.sh
```

Next run `lein repl` and from there just run the functions provided in `core.clj`.