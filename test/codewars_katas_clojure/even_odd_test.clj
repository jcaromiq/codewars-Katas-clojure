(ns codewars-katas-clojure.even-odd_test
    (:require [clojure.test :refer :all]
              [codewars-katas-clojure.even-odd-kata :refer :all]))

(deftest Examples...
         (is (= (even-or-odd 2) "Even") )
         (is (= (even-or-odd 0) "Even") )
         (is (= (even-or-odd 7) "Odd") )
         (is (= (even-or-odd 1) "Odd") )
         )