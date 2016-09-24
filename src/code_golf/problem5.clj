(ns code-golf.problem5)

;; http://codegolf.stackexchange.com/questions/93399/output-the-largest-number-with-the-fewest-digits

;; Given a nonempty list of positive decimal integers, output the largest number
;; from the set of numbers with the fewest digits.

(defn len [n]
  (count (str n)))

(defn -main [& args]
  (map
    (fn [n]
      (apply max (filter #(<= (len %) (len (apply min-key len n))) n))) args))

(-main [1] [9] [1729] [1, 1] [34, 3] [38, 39] [409, 12, 13] [11, 11, 11, 1]
       [11, 11, 11, 11] [78, 99, 620, 1] [78, 99, 620, 10] [78, 99, 620, 100]
       [1, 5, 9, 12, 63, 102] [3451, 29820, 2983, 1223, 1337]
       [738, 2383, 281, 938, 212, 1010])
