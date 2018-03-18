(defproject clojure.org.realworld/user "0.1"
  :description "A user component"
  :dependencies [[clj-jwt "0.1.1"]
                 [clojure.org.realworld/interfaces "1.0"]
                 [crypto-password "0.2.0"]
                 [environ "1.1.0"]
                 [java-jdbc/dsl "0.1.3"]
                 [org.clojure/clojure "1.9.0"]
                 [org.clojure/java.jdbc "0.3.7"]
                 [org.clojure/test.check "0.9.0"]
                 [org.xerial/sqlite-jdbc "3.7.2"]]
  :aot :all)
