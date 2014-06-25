(ns cpg-analysis.core
   (:require [clojure.java.jdbc :as jdbc]))

(def db {:classname "oracle.jdbc.OracleDriver"
         :subprotocol "oracle"
         :subname "thin:@preslsdb.cfaogwijsjn3.us-east-1.rds.amazonaws.com:1521/PRESLSDB"
         :user "AGS_DEMO_APP_8012"
         :password "AGS_DEMO_APP_8012"
               })
(defn -main
  ""
  [& args]
  (jdbc/query db 
    ["select * from pcm_physical_contract_main where rownum < 10"]
    :result-set-fn println))
