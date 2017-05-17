(ns codewars-katas-clojure.even-odd_test
    (:require [midje.sweet :refer :all]
              [codewars-katas-clojure.even-odd-kata :refer :all]))

(facts
  "about even-or-odd"
  (fact
    "evens"
    (even-or-odd 2) => "Even"
    (even-or-odd 0) => "Even"
    (even-or-odd 20) => "Even"
    (even-or-odd 32) => "Even"
    )
  (fact
    "odds"
    (even-or-odd 7) => "Odd"
    (even-or-odd 1) => "Odd"
    (even-or-odd 71) => "Odd"
    (even-or-odd 11) => "Odd"
    )
  )
(facts
  "about even-or-odd with if approach"
  (fact
    "evens"
    (even-or-odd-with-if 2) => "Even"
    (even-or-odd-with-if 0) => "Even"
    (even-or-odd-with-if 20) => "Even"
    (even-or-odd-with-if 32) => "Even"
    )
  (fact
    "odds"
    (even-or-odd-with-if 7) => "Odd"
    (even-or-odd-with-if 1) => "Odd"
    (even-or-odd-with-if 71) => "Odd"
    (even-or-odd-with-if 11) => "Odd"
    )
  )

(facts
  "about even-or-odd with multimethod approach"
  (fact
    "evens"
    (even-or-odd-with-multi 2) => "Even"
    (even-or-odd-with-multi 0) => "Even"
    (even-or-odd-with-multi 20) => "Even"
    (even-or-odd-with-multi 32) => "Even"
    )
  (fact
    "odds"
    (even-or-odd-with-multi 7) => "Odd"
    (even-or-odd-with-multi 1) => "Odd"
    (even-or-odd-with-multi 71) => "Odd"
    (even-or-odd-with-multi 11) => "Odd"
    )
  )
