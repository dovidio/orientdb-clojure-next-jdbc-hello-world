(defproject orientdb-clojure-jdbc-playground "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [com.github.seancorfield/next.jdbc "1.2.737"]
                 [com.orientechnologies/orientdb-jdbc "3.1.14"]]
  :repl-options {:init-ns orientdb-clojure-jdbc-playground.core})
