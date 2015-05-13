(defproject com.seandoig/tools.namespace "0.2.11-SNAPSHOT"
  :description "Adds hard-coded support for :clj features in reader conditionals."
  :url "https://github.com/lorddoig/tools.namespace"
  :license  {:name "Eclipse Public License"
             :url  "http://www.eclipse.org/legal/epl-v10.html"
             :distribution :repo
             :comments "Same as Clojure"}
  :global-vars {*warn-on-reflection* true}
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :dependencies [[org.clojure/clojure "1.7.0-beta2"]])
