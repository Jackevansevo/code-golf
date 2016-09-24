(ns code-golf.problem6
  (require [clojure.string :as s]))

;; http://codegolf.stackexchange.com/questions/93906/is-it-an-odd-word

;; Given a single word as input, determine if the word is odd or even.

(defn -main [& args]
  (map (fn [n]
         (if (even? (mod (count (filter (set "aeiou") n)) 2)) "even" "odd"))
       (map s/lower-case args)))

(-main "trees" "brush" "CAts" "Savoie" "rhythm")
