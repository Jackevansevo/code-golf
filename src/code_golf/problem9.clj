(ns code-golf.problem9)

;; http://codegolf.stackexchange.com/questions/94291/is-it-a-balanced-number

;; Take a positive integer as input, and output a truthy value if it's balanced
;; and a falsy value if it's unbalanced.

;; A number is balanced if the sum of the digits on each half of the number is
;; equal

(defn balanced? [x]
  (=
   (apply + (take (int (/ (count x) 2)) x))
   (apply + (take-last (int (/ (count x) 2)) x))))

(defn digits [n]
  (->> n str (map (comp read-string str))))

(defn -main [& args]
  (map (fn [n] (balanced? n)) (map digits args)))

(-main 1 6 11 141 1221 23281453796004414 10 12 110 15421 5234095123508321)
