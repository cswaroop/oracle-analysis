(defproject cpg-analysis "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.3.2"]
                 ]
  :resource-paths ["lib/ojdbc6.jar"]
  :main ^:skip-aot cpg-analysis.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})


;TODO in ./lib
;mvn install:install-file -Dfile=/Users/admin/Downloads/ojdbc6.jar -DgroupId=local -DartifactId=ojdbc6 -Dversion=11.2.0.4 -Dpackaging=jar -DgeneratePom=true

