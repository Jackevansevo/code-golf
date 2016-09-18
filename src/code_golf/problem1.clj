(ns code-golf.problem1
  (require [clojure.string :as s]))

;; http://codegolf.stackexchange.com/questions/93261/stringgnirtsstringgnirtsstringgnirts
;; Given a string of length N, output the string forwards, then backwards, then
;; forwards, then backwards... etc. N times. For example, if your input was

(defn -main [& args]
  (map (fn [n] (s/join "" (take (count n) (cycle [n (s/reverse n)])))) args))

(-main "Hello!" "Goodbye" "abcd" "a" "OK!")
