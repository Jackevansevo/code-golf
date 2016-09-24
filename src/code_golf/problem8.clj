(ns code-golf.problem8)

;; http://codegolf.stackexchange.com/questions/93933/substring-chainification

;; Given a non-empty string and a non-empty array only consisting of positive
;; integers (> 0), output the substring chain. You may assume that the sum of
;; all integers in the array does not exceed the length of the string.

(defn word-chain [word slices]
  (map (fn [x y] (take x (drop y word))) slices (map - (reductions + slices) slices)))

(defn -main [& args]
  (map (fn [n] (word-chain (first n) (last n))) args))

(-main
  '("abcdefghijk" [2 1 3])
  '("Code Golf" [4 1])
  '("lexicographically" [2 2 2 7 4]))
