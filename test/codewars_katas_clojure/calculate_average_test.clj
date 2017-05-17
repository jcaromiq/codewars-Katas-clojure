(ns codewars-katas-clojure.calculate-average_test
    (:require [midje.sweet :refer :all]
      [codewars-katas-clojure.calculate-average-kata :refer :all]))

(facts
  "about find-average"
  (fact
    "find average with decimal result"
    (find-average [1 2 3 4]) => 2.5
    (find-average [6 7]) => 6.5
  )
  (fact
    "find average without decimal result"
    (find-average [1 1 1]) => 1.0
    (find-average [1 2 3]) => 2.0
    (find-average [0 5 10]) => 5.0
    (find-average [1 3 5]) => 3.0

    )
  )
