(ns code-golf.problem7)

;; Take a vector / list of integers as input, and output the largest number
;; that's adjacent to a zero.

(defn in? [coll elm]
  (some #(= elm %) coll))

(defn -main [& args]
  (map
    (fn [n] (apply max (flatten (filter #(in? % 0) (partition 2 1 n))))) args))

(-main [1 4 3 6 0 3 7 0] [9 4 9 0 9 0 9 15 -2] [-11 0 0 0 0 0 -12 10])
