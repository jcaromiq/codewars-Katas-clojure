 (ns codewars-katas-clojure.even-odd-kata)
 (defn even-or-odd [number]
   (if (= (mod number 2) 0)
     "Even"
     "Odd")
   )