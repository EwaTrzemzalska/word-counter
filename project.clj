(defproject word-counter "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot word-counter.core
  :target-path "target/%s"
  :plugins [[lein-cljfmt "0.6.6"]]
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-binplus "0.6.5"]]}}
  :bin {:name "word-counter"})

