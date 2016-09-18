(ns code-golf.problem3
  (require [clojure.string :as s]))

;; http://codegolf.stackexchange.com/questions/93310/invert-a-boolean-array

;; Invert a boolean array

(defn -main [& args]
  (map (fn [n] (map not n)) args))

(-main [false, false, true, false, false], [true, false])
