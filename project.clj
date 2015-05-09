(defproject ordinance "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["array systems" {:url "http://corp.array.ca/nest-web/maven/"
                                   :checksum :ignore}]]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [uk.me.jstott/jcoord "1.0"]]
  :plugins [[cider/cider-nrepl "0.8.2"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.10"]]}})
