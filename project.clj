(defproject cljs-sauce "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojurescript "0.0-2197"]
                 [om "0.5.3"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :cljsbuild {
    :builds [{:source-paths ["src"]
              :compiler {
                :output-to "main.js"
                :optimizations :whitespace}}]})