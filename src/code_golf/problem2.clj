(ns code-golf.problem2
  (require [clojure.string :as s]))

;; http://codegolf.stackexchange.com/questions/90983/exploded-view-of-a-string

;; Write a program or function that
;;     inputs a string containing only printable ASCII characters;
;;     dissects the string into groups of non-space equal characters (the "pieces" of the string);
;;     outputs those groups in any convenient format, with some separator between groups.

(defn -main [& args]
  (map (fn [w] (map (fn [[k v]] (s/join(repeat v k)))
                    (sort (frequencies (s/replace w " " ""))))) args))

(-main "Ah, abracadabra!" "A man, a plan, a canal: Panama!")
