(defproject q "0.1.0-SNAPSHOT"
  :description "Spy gadgets for Clojure testing"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:dependencies [[speclj "2.7.2"]]
                   :plugins [[speclj "2.7.2"]]
                   :test-paths ["spec/"]}})