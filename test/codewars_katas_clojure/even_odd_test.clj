(ns codewars-katas-clojure.even-odd_test
    (:require [clojure.test :refer :all]
              [codewars-katas-clojure.even-odd-kata :refer :all]))

(deftest Even-or-odd
  (is (= (even-or-odd 2) "Even") )
  (is (= (even-or-odd 0) "Even") )
  (is (= (even-or-odd 7) "Odd") )
  (is (= (even-or-odd 1) "Odd") )
  )

(deftest Even-or-odd-with-ifs
  (is (= (even-or-odd-with-if 2) "Even") )
  (is (= (even-or-odd-with-if 0) "Even") )
  (is (= (even-or-odd-with-if 7) "Odd") )
  (is (= (even-or-odd-with-if 1) "Odd") )
  )

(deftest Even-or-odd-with-multi-method
  (is (= (even-or-odd-with-multi 2) "Even") )
  (is (= (even-or-odd-with-multi 0) "Even") )
  (is (= (even-or-odd-with-multi 7) "Odd") )
  (is (= (even-or-odd-with-multi 1) "Odd") )
  )