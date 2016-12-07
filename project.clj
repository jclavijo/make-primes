(defproject make-primes "0.1.0-SNAPSHOT"
  :description "makes a list of primes"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :pluggins [[lein-gorilla "0.3.6"]
             [lein-midje    "3.2"]
             [lein-midje-doc "0.0.24"]
             [cider/cider-nrepl "0.14.0"]]
  :main ^:skip-aot make-primes.core
  :target-path "target/%s"
 )
