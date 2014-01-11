(ns cpg-analysis.core
   (:require [clojure.java.jdbc :as jdbc]))

(def db {:classname "oracle.jdbc.OracleDriver"
         :subprotocol "oracle"
         :subname "thin:@192.168.1.51:1521/AGS8XQA"
         :user "GRAINCORP_APP_7072"
         :password "GRAINCORP_APP_7072"
               })
(defn -main
  ""
  [& args]
  (jdbc/query db 
    ["select * from pcm_physical_contract_main where rownum < 10"]
    :result-set-fn println))
