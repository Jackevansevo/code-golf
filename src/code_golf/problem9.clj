(ns code-golf.problem9)

(defn balanced? [x]
  (=
   (apply + (take (int (/ (count x) 2)) x))
   (apply + (take-last (int (/ (count x) 2)) x))))

(defn digits [n]
  (->> n str (map (comp read-string str))))

(defn -main [& args]
  (map (fn [n] (balanced? n)) (map digits args)))

(-main 1 6 11 141 1221 23281453796004414 10 12 110 15421 5234095123508321)
