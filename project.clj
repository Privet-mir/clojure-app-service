(defproject clojure-rest-api "0.0.1"
  :description "Clojure API"
  :url "http://0.0.0.0:8080"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.logging "0.5.0"]
                 [http-kit "2.3.0"]
                 [compojure "1.6.1"]
                 [ring/ring-core "1.7.1"]
                 [ring/ring-json "0.4.0"]
                 [javax.servlet/servlet-api "2.5"]]
  :main ^:skip-aot clojure-rest-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-cloverage "1.1.1"]
                             [com.jakemccrary/lein-test-refresh "0.24.1"]]}})
