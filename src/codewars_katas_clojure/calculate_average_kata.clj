(ns codewars-katas-clojure.calculate-average-kata)

(defn find-average
      [numbers]
      (float (/ (apply + numbers) (count numbers)))
      )
