(ns code-golf.problem4
  (require [clojure.string :as s]))

;; http://codegolf.stackexchange.com/questions/91182/this-isnt-rocket-science

;; Write a program or function that takes in a single-line string. You can
;; assume it only contains printable ASCII. Print or return a string of an
;; ASCII art rocket


(defn -main [& args]
  (map (fn [r] (map println
                    (concat ["  | " " /_\\"]
                            (map (fn [l] s/join (str " |"l"|")) (str r "_"))
                            ["/___\\" " VvV "]))) args))

(-main "" "a" "|0" "    " "SPACEY")
