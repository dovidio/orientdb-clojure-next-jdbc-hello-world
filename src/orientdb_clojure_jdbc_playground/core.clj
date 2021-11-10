(ns orientdb-clojure-jdbc-playground.core
  (:require [next.jdbc :as jdbc]
            [next.jdbc.sql :as sql]
            ))

(def db
  {:jdbcUrl "jdbc:orient:remote:localhost/demodb"
   :user     "admin"
   :password "admin"})

(defn create-table!
  []
  (let [ds (jdbc/get-datasource db)]
    (with-open [connection (jdbc/get-connection ds)]
      (jdbc/execute! connection ["Create class Account if not exists"])
      (jdbc/execute! connection ["Create property Account.id if not exists Long (NOTNULL)"])
      (jdbc/execute! connection ["Create index Account.id if not exists UNIQUE"])
      (jdbc/execute! connection ["Create property Account.balance if not exists Long (NOTNULL)"]))))


(defn insert-n!
  [n]
  (let [ds (jdbc/get-datasource db)]
    (with-open [connection (jdbc/get-connection ds)]
      (dotimes [i n]
        (sql/insert! connection :Account
                             {:id i :balance (rand-int 1000000000)})))))
  
(defn query-all
  []
  (let [ds (jdbc/get-datasource db)]
    (with-open [connection (jdbc/get-connection ds)]
      (sql/query connection ["select * from Account order by balance asc"]))))

(defn drop-table!
  []
  (let [ds (jdbc/get-datasource db)]
    (with-open [connection (jdbc/get-connection ds)]
      (jdbc/execute! connection ["Drop class Account"]))))