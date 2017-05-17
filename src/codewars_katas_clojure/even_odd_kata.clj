(ns codewars-katas-clojure.even-odd-kata)

(defn even-or-odd [number]
  (if (even? number)
    "Even"
    "Odd")
  )

(defn even-or-odd-with-if [number]
   (if (= (mod number 2) 0)
     "Even"
     "Odd")
   )

(defmulti even-or-odd-with-multi (fn [number] (even? number)))
(defmethod even-or-odd-with-multi true [_] "Even")
(defmethod even-or-odd-with-multi false [_] "Odd")