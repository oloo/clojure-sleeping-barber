(ns concur.core-test
  (:require [clojure.test :refer :all]
            [concur.core :refer :all]))

(deftest test-sleeping-barber-cutting-hair
  (testing "Barber cuts a customer's hair if there are customers"
    (set-up-barber-shop 1)
    (is (= 1 (number-of-customers)))
    (cut-hair)
    (is (= 0 (number-of-customers))))
  (testing "Barber does NOT cut hair if there are NO customers"
    (set-up-barber-shop 0)
    (cut-hair)
    (is (= 0 (number-of-customers))))
  (testing "Barber keeps picking cutomers until there are no cutomers left"
    (set-up-barber-shop 5)
    (cut-hair)
    (is (= 0 (number-of-customers)))))

(deftest test-new-customer
  (testing "New customer sits down if the waiting room is not full"
    (set-up-barber-shop 3)
    (add-customer)
    (is (= 4 (number-of-customers))))
  (testing "New customer leaves if the Barber shop is full"
    (set-up-barber-shop 5)
    (add-customer)
    (is (= 5 (number-of-customers)))))
