(ns code-golf.problem10)

;; http://codegolf.stackexchange.com/questions/94348/prime-counting-function

;; Your program will take an integer x which you can assume to be positive, and
;; output a single integer equal to the amount of primes less than or equal to
;; x

(defn is-prime? [n]
  (or (= 2 n)
   (not-any? #(= 0 (mod n %)) (cons 2 (range 3 (inc (Math/sqrt n)) 2)))))


(defn -main [& args]
  (map (fn [n] (count (filter is-prime? (range n)))) args))


(-main 1 2 5)
